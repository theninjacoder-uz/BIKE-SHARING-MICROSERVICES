package uz.pdp.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.userservice.model.User;
import uz.pdp.userservice.persistence.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Long add(User user) {

        Optional<User> userOptional =
                userRepository.findByPhoneNumber(user.getPhoneNumber());
        if (userOptional.isPresent())
            return userOptional.get().getId();

        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public int delete(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if (optionalUser.isPresent() && optionalUser.get().equals(user)){
            userRepository.delete(optionalUser.get());
            return 1;
        }
        return 0;
    }

    @Override
    public Long getUserByPhoneNumber(String phoneNumber) {
        return add(new User(phoneNumber));
    }
}
