package com.example.gymx;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Users.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract UsersDao usersDao();


    private static MyDatabase INSTANCE;

    public static MyDatabase getInstance(Context context) {
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context,MyDatabase.class,"my_database").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}
