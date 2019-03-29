package com.example.app_component.data.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.app_component.data.local.db.dao.PlaceDao;
import com.example.app_component.data.model.db.City;
import com.example.app_component.data.model.db.County;
import com.example.app_component.data.model.db.Province;

/**
 * dec:
 *
 * @author hanpeidong on 2019/3/7.
 */
@Database(entities = {Province.class, County.class, City.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public abstract PlaceDao placeDao();

    public abstract WeatherDao weatherDao();
}
