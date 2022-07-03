package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/skill-tracker/api/v1/")
public class TestController {
    private final UserService userService;
    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }
@Autowired
    UserRepository userRepository;

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @PostMapping(value = "engineer/add-profile")
    public Optional<User> addUser(@Valid @RequestBody User user){
        return userService.addUser(user);

    }

    @PutMapping(value="engineer/update-profile/{userId}")
    public User modifyUser(@PathVariable Integer userId,@Valid@RequestBody User user){
        return userService.modifyUser(userId,user);
    }

    @GetMapping(value="admin/{criteria}/{criteriaValue}")
    public List<User> retrieveUsers(@PathVariable("criteria") String criteria, @PathVariable("criteriaValue") String criteriaValue){
        switch(criteria){
            case "name":return userRepository.findByName(criteriaValue);
            case "associateId":return userRepository.findByAssociateId(criteriaValue);
          /*  case "skill":return
                break;

           */
        }
        return null;
    }
}
