package com.cmrit.samket.scholarshipappprototype.data;

import android.provider.BaseColumns;

/**
 * Created by m.manoghna on 10/14/2016.
 */

public final class schcontract {
    private schcontract(){}
    public static abstract class dataentry implements BaseColumns{
        public static final String TABLE_NAME="scholarship";
        public static final String COLUMN_NAME="name";
        public static final String COLUMN_DOB ="dob";
        public static final String COLUMN_AGE="age";
        public static final String COLUMN_GENDER="gender";
        public static final String COLUMN_RELIGION="religion";
        public static final String COLUMN_handicapped="physically_handicapped";
        public static final String COLUMN_CASTE="caste";
        public static final String SPORTS_QUOTA="sports_quota";




    }
}
