/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.Vezba13.service;

import com.metropolitan.Vezba13.model.User;

/**
 *
 * @author Vladimir Milicevic
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
