package com.dom.demo.Controller;

import com.dom.demo.ErorrHandler.NotFound;
import com.dom.demo.Models.Orders;
import com.dom.demo.Repository.RepositoryOrders;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class ControllerOrders {
    
    @Autowired
    RepositoryOrders ordersRepository;

    @GetMapping("/Orders")
    public List<Orders> getAll(){
        return ordersRepository.findAll();
    }

    @PostMapping("/Orders")
    public Orders insertOrders(@Validated @RequestBody Orders orders){
        return ordersRepository.save(orders);
    }

    @GetMapping("/Orders/{id}")
    public Orders getOrders(@PathVariable(value="id") int id){
        return ordersRepository.findById(id).orElseThrow(()-> new NotFound("Orders", "id", id));
    }

    @PutMapping("/Orders/{id}")
    public Orders updateOrders(@PathVariable(value="id") int id, @Validated @RequestBody Orders detail){
        Orders orders = ordersRepository.findById(id).orElseThrow(()-> new NotFound("Orders", "id", id));
        orders.setId(detail.getId());
        orders.setBuyer(detail.getBuyer());
        orders.setNote(detail.getNote());
        orders.setTotal(detail.getTotal());
        orders.setDiscount(detail.getDiscount());
        orders.setIs_paid(detail.getIs_paid());
        Orders updateOrders = ordersRepository.save(orders);
        return updateOrders;
    }

    @DeleteMapping("/Orders/{id}")
    public ResponseEntity<?> deleteOrders(@PathVariable(value="id") int id){
        Orders orders = ordersRepository.findById(id).orElseThrow(()-> new NotFound("Orders", "id", id));
        ordersRepository.delete(orders);
        return ResponseEntity.ok().build();
    }

}
