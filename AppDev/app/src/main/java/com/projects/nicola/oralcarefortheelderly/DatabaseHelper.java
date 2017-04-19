package com.projects.nicola.oralcarefortheelderly;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aaron on 19/04/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "clients.db";
    private static final String TABLE_NAME = "contacts";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_UNAME = "uname";
    private static final String COLUMN_PASS = "pass";
    private static final String TABLE_CREATE = "CREATE TABLE contacts (id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,"+
            "name text not null, email text not null, uname text not null, pass text not null); ";
    SQLiteDatabase db;

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db=db;
    }

    public void insertContact(Contact entry)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, entry.getName());
        values.put(COLUMN_EMAIL, entry.getEmail());
        values.put(COLUMN_UNAME,entry.getUname());
        values.put(COLUMN_PASS, entry.getPass());

        db.insert(TABLE_NAME,null,values);

    }

    public String searchPass( String uname)
    {
        db=this.getReadableDatabase();
        String query = "select uname, pass from"+TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);

        String username, password;

        password = "Not Found!";

        if(cursor.moveToFirst())
        {
            do {
                username = cursor.getString(0);
                if (username.equals(uname))
                {
                    password=cursor.getString(1);
                    break;
                }
            }while (cursor.moveToNext());
        }
        return password;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
