package com.example.todoapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_todo")
data class ToDoModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "todo_id")
    var todo_id: Long = 0,
    @ColumnInfo(name = "user_id")
    var user_id: Long,
    var name: String,
    var priority: String,
    var date: Long = System.currentTimeMillis(),
    var time: Long,
    var completed: Boolean = false
)