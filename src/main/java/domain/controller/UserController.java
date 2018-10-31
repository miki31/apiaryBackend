package domain.controller;

import domain.exception.UserNotFoundException;
import domain.repository.UserRepository;
import domain.repository.model.Responce;
import domain.repository.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/create")
    public User createUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/current")
    public User getUserById(@RequestParam("id") Long userId){
        return userRepository.findById(userId).orElseThrow( ()-> {
            return (new UserNotFoundException(userId, "User not found"));
        });
    }

    @GetMapping("/login")
    public ResponseEntity<Responce> login(@RequestParam("login") String login,
                                          @RequestParam("pass") String pass){
          return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



}
