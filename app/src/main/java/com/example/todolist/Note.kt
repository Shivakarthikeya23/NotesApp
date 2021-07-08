package com.example.todolist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note(@ColumnInfo() val text:String) {
    @PrimaryKey(autoGenerate = true) var id = 0;

}