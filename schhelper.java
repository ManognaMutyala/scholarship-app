package com.cmrit.samket.scholarshipappprototype.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry;

/**
 * Created by m.manoghna on 10/14/2016.
 */

public class schhelper extends SQLiteOpenHelper{
    private static final String database_name="dataentry.db";
    private static final int DATABASE_VERSION=1;
    public schhelper(Context context){
        super(context,database_name,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_SCHOLARSHIP_TABLE="CREATE TABLE"+dataentry.TABLE_NAME+"("+dataentry.COLUMN_NAME+" TEXT NOT NULL,"
+dataentry.COLUMN_AGE+" INTEGER NOT NULL,"+dataentry.COLUMN_RELIGION+" TEXT NOT NULL,"
            +dataentry.COLUMN_GENDER+" TEXT NOT NULL"+dataentry.SPORTS_QUOTA+" TEXT NOT NULL"+dataentry.COLUMN_CASTE+" TEXT NOT NULL,"
+dataentry.COLUMN_handicapped+" TEXT NOT NULL;)";
        db.execSQL(SQL_CREATE_SCHOLARSHIP_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
    public void putInformation(schhelper dop,String name,int age,int dob,String religion,String gender,String sports,String caste,String handicapped)
    {
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(dataentry.COLUMN_NAME,name);
        cv.put(dataentry.COLUMN_AGE,age);

        cv.put(dataentry.COLUMN_RELIGION,religion);
        cv.put(dataentry.COLUMN_GENDER,gender);
        cv.put(dataentry.SPORTS_QUOTA,sports);
        cv.put(dataentry.COLUMN_CASTE,caste);
        cv.put(dataentry.COLUMN_handicapped,handicapped);
        long k=SQ.insert(dataentry.TABLE_NAME,null,cv);
        Log.d("schhelper","One row inserted");
    }
}
