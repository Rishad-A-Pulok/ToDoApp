package com.example.todoapp.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todoapp.entities.ToDoModel

@Dao
interface ToDoDao {
    @Insert
    suspend fun insertToDo(toDoModel: ToDoModel)

    @Update
    suspend fun updateToDO(toDoModel: ToDoModel)

    @Delete
    suspend fun deleteToDo(toDoModel: ToDoModel)

    @Query("select * from tbl_todo where user_id = :userId")
    fun getToDosByUserID(userId: Long) : LiveData<List<ToDoModel>>
}