package com.pet.springcrud.service;

import com.pet.springcrud.dto.UsersDto;
import com.pet.springcrud.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        UsersDto usersDto = new UsersDto();
        usersDto.setId(users.getId());
        usersDto.setEmail(users.getEmail());
        usersDto.setName(users.getName());
        usersDto.setLogin(users.getLogin());
        return usersDto;
    }
}
