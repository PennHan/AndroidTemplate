package com.example.app_component.data.model.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;

/**
 * dec:
 *
 * @author hanpeidong on 2019/3/7.
 */
@Entity(tableName = "counties")
public class County {

    @SerializedName("name")
    @ColumnInfo(name = "name")
    public String countyName;

    @PrimaryKey
    public int id;
}
