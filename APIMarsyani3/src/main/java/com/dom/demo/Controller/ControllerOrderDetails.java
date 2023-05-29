package com.dom.demo.Controller;

import com.dom.demo.ErorrHandler.NotFound;
import com.dom.demo.Models.Orderdetail;
import com.dom.demo.Repository.RepositoryOrderdetails;
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
public class ControllerOrderDetails{
    
    @Autowired
    RepositoryOrderdetails orderdetailRepository;

    @GetMapping("/OrderDetail")
    public List<Orderdetail> getAll(){
        return orderdetailRepository.findAll();
    }

    @PostMapping("/OrderDetail")
    public Orderdetail insertOrderdetail(@Validated @RequestBody Orderdetail orderdetail){
        return orderdetailRepository.save(orderdetail);
    }

    @GetMapping("/OrderDetail/{Orders}")
    public Orderdetail getOrderdetail(@PathVariable(value="Orders") int id){
        return orderdetailRepository.findById(id).orElseThrow(()-> new NotFound("Orderdetail", "Orders", id));
    }

    @PutMapping("/OrderDetail/{Orders}")
    public Orderdetail updateOrderdetail(@PathVariable(value="Orders") int id, @Validated @RequestBody Orderdetail detail){
        Orderdetail orderdetail = orderdetailRepository.findById(id).orElseThrow(()-> new NotFound("Orderdetail", "Orders", id));
        orderdetail.setOrder(detail.getOrder());
        orderdetail.setProduct(detail.getProduct());
        orderdetail.setQuantity(detail.getQuantity());
        orderdetail.setPrice(detail.getPrice());
        Orderdetail updateOrderdetail = orderdetailRepository.save(orderdetail);
        return updateOrderdetail;
    }

    @DeleteMapping("/OrderDetail/{Orders}")
    public ResponseEntity<?> deleteOrderdetail(@PathVariable(value="Orders") int id){
        Orderdetail orderdeOrderdetail = orderdetailRepository.findById(id).orElseThrow(()-> new NotFound("Orderdetail", "Orders", id));
        orderdetailRepository.delete(orderdeOrderdetail);
        return ResponseEntity.ok().build();
    }
}
