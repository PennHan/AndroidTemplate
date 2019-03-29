package com.example.app_component.data.local.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

/**
 * dec:
 *
 * @author hanpeidong on 2019/3/7.
 */
@Dao
public interface PlaceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Option option);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Option> options);

    @Query("SELECT * FROM options")
    List<Option> loadAll();

    @Query("SELECT * FROM options WHERE question_id = :questionId")
    List<Option> loadAllByQuestionId(Long questionId);
}
