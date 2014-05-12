package com.example.Household_account_boo.module.infrastructure.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by katsumi_takahashi on 2014/05/13.
 */
public class DBOpenHelper extends SQLiteOpenHelper {
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS Test ( _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , caption TEXT )"
        );
    }

    public DBOpenHelper( Context context )
    {
        // バージョンを 2 にする
        super( context, "test", null, 2 );
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if( oldVersion == 1 )
        {
            // アップグレードコード
            db.execSQL( "ALTER TABLE Test add add_text TEXT" );
        }
    }
}
