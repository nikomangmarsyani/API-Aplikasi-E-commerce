package com.dom.demo.Controller;

import com.dom.demo.ErorrHandler.NotFound;
import com.dom.demo.Models.Users;
import com.dom.demo.Repository.RepositoryUsers;
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
public class ControllerUsers {
    
    @Autowired
    RepositoryUsers usersRepository;


    @GetMapping("/Users")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

    @PostMapping("/Users")
    public Users insertUsers(@Validated @RequestBody Users users){
        return usersRepository.save(users);
    }

    @GetMapping("/Users/{id}")
    public Users getUsers(@PathVariable(value="id") int id){
        return usersRepository.findById(id).orElseThrow(()-> new NotFound("Users", "id", id));
    }

    @PutMapping("/Users/{id}")
    public Users updatUsers(@PathVariable(value="id") int id, @Validated @RequestBody Users detail){
        Users users = usersRepository.findById(id).orElseThrow(()-> new NotFound("Users", "id", id));
        users.setId(detail.getId());
        users.setFirst_name(detail.getFirst_name());
        users.setLast_name(detail.getLast_name());
        users.setEmail(detail.getEmail());
        users.setPhone_number(detail.getPhone_number());
        users.setType(detail.getType());
        Users updateUsers = usersRepository.save(users);
        return updateUsers;
    }

    @DeleteMapping("/Users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value="id") int id){
        Users users = usersRepository.findById(id).orElseThrow(()-> new NotFound("Users", "id", id));
        usersRepository.delete(users);
        return ResponseEntity.ok().build();
    }

}
