package edu.ups.practicadocker.rest;


import edu.ups.practicadocker.dao.userDao;
import edu.ups.practicadocker.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*",methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("users")
public class userRest {

    @Autowired
    private userDao userDao;

    @GetMapping
    public ResponseEntity<List<user>> getUser(){

        List<user> users =  userDao.findAll();
        return ResponseEntity.ok(users);

    }

    @PostMapping
    @CrossOrigin(origins = "*",methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE})
    public ResponseEntity<user> createUser(@RequestBody user user) {
        System.out.println("va a insertar");
        user newUser = userDao.save(user);
        return ResponseEntity.ok(newUser);
    }
}
