package com.ramos.picpay.dtos;

import com.ramos.picpay.model.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType){
}
