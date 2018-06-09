package bala.roomdatabase;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface  MyDao {

    @Insert
    public void addUser(User user);

    @Query("select *from users ORDER BY user_name ASC")
    public List<User> getUsers();

    @Delete
    public void deleteuser(User user);

    @Update
    public void updateuser(User user);
}
