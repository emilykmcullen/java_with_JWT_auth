package com.example.userManagement.service;

import com.example.userManagement.domain.User;
import com.example.userManagement.exception.domain.EmailExistException;
import com.example.userManagement.exception.domain.UserNotFoundException;
import com.example.userManagement.exception.domain.UsernameExistException;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String password, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String password, String email, String role,
                    boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newPassword, String newEmail, String role,
                    boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

    void deleteUser(long id);

    User resetPassword(String username, String currentPassword, String newPassword) throws UserNotFoundException;


    User updateProfileImage(String username, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;
}
