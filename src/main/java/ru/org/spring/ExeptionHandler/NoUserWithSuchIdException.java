package ru.org.spring.ExeptionHandler;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class NoUserWithSuchIdException extends UsernameNotFoundException {

    public NoUserWithSuchIdException(String msg) {
        super(msg);
    }
}
