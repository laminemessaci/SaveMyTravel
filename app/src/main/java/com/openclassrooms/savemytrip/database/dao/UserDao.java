package com.openclassrooms.savemytrip.database.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.openclassrooms.savemytrip.models.User;

/**
 * Created by Lamine MESSACI on 08/04/2020.
 */
@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createUser(User user);

    @Query("SELECT * FROM User WHERE id = :userId")
    LiveData<User> getUser(long userId);
}
