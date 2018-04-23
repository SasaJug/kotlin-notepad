package com.udacity.notepad.data

import com.udacity.notepad.data.NotesContract.NoteTable.CREATED_AT
import com.udacity.notepad.data.NotesContract.NoteTable.ID
import com.udacity.notepad.data.NotesContract.NoteTable.IS_PINNED
import com.udacity.notepad.data.NotesContract.NoteTable.TABLE_NAME
import com.udacity.notepad.data.NotesContract.NoteTable.TEXT
import com.udacity.notepad.data.NotesContract.NoteTable.UPDATED_AT

object NotesContract {

    val SQL_CREATE_ENTRIES = """CREATE TABLE " +
            "$TABLE_NAME " + "(" +
            "$ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            "$TEXT TEXT, " +
            "$IS_PINNED INTEGER, " +
            "$CREATED_AT INTEGER, " +
            "$UPDATED_AT INTEGER" +
            ")"""

    val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"

    val SQL_QUERY_ALL = "SELECT * FROM $TABLE_NAME ORDER BY $CREATED_AT DESC"

    object NoteTable {
        val ID = "id"
        val TABLE_NAME = "notes"
        val TEXT = "text"
        val IS_PINNED = "is_pinned"
        val CREATED_AT = "created_at"
        val UPDATED_AT = "updated_at"
    }
}
