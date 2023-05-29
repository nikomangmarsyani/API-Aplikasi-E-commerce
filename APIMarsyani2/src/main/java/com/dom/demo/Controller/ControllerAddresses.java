package com.dom.demo.Controller;

import com.dom.demo.ErorrHandler.NotFound;
import com.dom.demo.Models.Addresses;
import com.dom.demo.Repository.RepositoryAddresses;
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
public class ControllerAddresses {
    
    @Autowired
    RepositoryAddresses addressesRepository;

    @GetMapping("/Addresses")
    public List<Addresses> getAll(){
        return addressesRepository.findAll();
    }

    @PostMapping("/Addresses")
    public Addresses insertAddresses(@Validated @RequestBody Addresses addresses){
        return addressesRepository.save(addresses);
    }

    @GetMapping("/Addresses/{users}")
    public Addresses getAddresses(@PathVariable(value="users") int id){
        return addressesRepository.findById(id).orElseThrow(()-> new NotFound("Addresses", "users", id));
    }

    @PutMapping("/Addresses/{users}")
    public Addresses updatAddresses(@PathVariable(value="users") int id, @Validated @RequestBody Addresses detail){
        Addresses addresses = addressesRepository.findById(id).orElseThrow(()-> new NotFound("Addresses", "users", id));
        addresses.setUsers(detail.getUsers());
        addresses.setType(detail.getType());
        addresses.setLine1(detail.getLine1());
        addresses.setLine2(detail.getLine2());
        addresses.setCity(detail.getCity());
        addresses.setProvince(detail.getProvince());
        addresses.setPostcode(detail.getPostcode());
        Addresses updateAddresses = addressesRepository.save(addresses);
        return updateAddresses;
    }

    @DeleteMapping("/Addresses/{users}")
    public ResponseEntity<?> deleteAddresses(@PathVariable(value="users") int id){
        Addresses addresses = addressesRepository.findById(id).orElseThrow(()-> new NotFound("Addresses", "users", id));
        addressesRepository.delete(addresses);
        return ResponseEntity.ok().build();
    }
}
