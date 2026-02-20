package com.ua.rush.module1.lesson13;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public void save(UserDto userDto) {
        if (userDto.getPassword().length() < 10) {
            //throw new RuntimeException("Password is too short");
            return;
        }

        UserEntity user = new UserEntity();

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());


        userRepository.save(user);
    }

//    public UserDto findFullName(String username) {
//        UserEntity user = userRepository.findByUsername(username);
//        UserDto userDto = new UserDtt();
//        userDtt.setFullName(UserUtil.concatFullName(user));
//
//        return userDtt;
//    }

}
