package com.example.app_component.data.local.db;

import com.example.app_component.data.model.db.City;
import com.example.app_component.data.model.db.County;
import com.example.app_component.data.model.db.Province;
import io.reactivex.Observable;

import javax.inject.Singleton;

/**
 * dec:
 *
 * @author hanpeidong on 2019/3/7.
 */
@Singleton
public class AppDbHelper implements DbHelper{

    private final AppDatabase mAppDatabase;

    @Override
    public Observable<Province> getProvinceList() {
        return null;
    }

    @Override
    public Observable<City> getCityList() {
        return null;
    }

    @Override
    public Observable<County> getCountyList() {
        return null;
    }

    @Override
    public Observable<Boolean> saveProvinceList() {
        return null;
    }

    @Override
    public Observable<Boolean> saveCityList() {
        return null;
    }

    @Override
    public Observable<Boolean> saveCountyList() {
        return null;
    }
}
