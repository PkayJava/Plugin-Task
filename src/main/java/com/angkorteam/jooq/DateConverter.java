package com.angkorteam.jooq;

import org.jooq.impl.AbstractConverter;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by socheat on 2/20/16.
 */
public class DateConverter extends AbstractConverter<java.sql.Date, Date> {

    public DateConverter() {
        super(java.sql.Date.class, Date.class);
    }

    @Override
    public Date from(java.sql.Date databaseObject) {
        if (databaseObject != null) {
            return databaseObject;
        }
        return null;
    }

    @Override
    public java.sql.Date to(Date userObject) {
        if (userObject != null) {
            return new java.sql.Date(userObject.getTime());
        }
        return null;
    }

}
