package uz.pdp.userservice.service;

import uz.pdp.userservice.model.User;

public interface UserService extends CRUDService<User> {

    Long getUserByPhoneNumber(String phoneNumber);
}
