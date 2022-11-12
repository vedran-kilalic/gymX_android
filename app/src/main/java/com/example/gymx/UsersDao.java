package com.example.gymx;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UsersDao {

    @Insert
    void addUser(Users user);

    @Query("SELECT * FROM users WHERE username=(:username) AND password=(:password)")
    Users login(String username, String password);
}
