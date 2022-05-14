package uz.pdp.userservice.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.userservice.model.User;
import uz.pdp.userservice.service.UserService;

@RestController
@RequestMapping("api/user/v1/")
@RequiredArgsConstructor
public class UserController {

    @Qualifier("userServiceImpl")
    private final UserService userService;

    @GetMapping("get")
    public ResponseEntity getUserByPhoneNumber(
            @RequestParam("phone-number") @NonNull String phoneNumber
    ){
        Long userId = userService.getUserByPhoneNumber(phoneNumber);
        return ResponseEntity.ok().body(userId);
    }

    @GetMapping("get/{id}")
    public ResponseEntity getUserById(
            @PathVariable("id") @NonNull long id
    ){
        User user = userService.get(id);
        if (user!=null)
        return ResponseEntity.ok().body(user);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


}
