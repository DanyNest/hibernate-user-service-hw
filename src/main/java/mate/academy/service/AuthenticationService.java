package mate.academy.service;

import javax.naming.AuthenticationException;
import mate.academy.exception.RegistrationException;
import mate.academy.model.User;

public interface AuthenticationService {

    User login(String email, String password) throws AuthenticationException;

    /**
     * We should register a new user. New user entity will contains the email and password
     * @param email - user email. should be unique for each user
     * @param password - user password
     * @return new user instance
     */
    User register(String email, String password) throws RegistrationException;
}
