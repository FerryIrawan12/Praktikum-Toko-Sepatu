package model;

import java.util.ArrayList;
import entity.ShoesHikingEntity;


public class ShoesHiking {
    
    private static ArrayList<ShoesHikingEntity> DB_ShoesHiking=new ArrayList<>();

    public static void create(Object data)
    {
        DB_ShoesHiking.add((ShoesHikingEntity)data);
    }

    public static void update(int index,Object data){
        DB_ShoesHiking.set(index, (ShoesHikingEntity)data);
    }

    public static void delete(int index){
        DB_ShoesHiking.remove(index);
    }

    public static void getIndexDB_ShoesWalking(int index)
    {
        DB_ShoesHiking.get(index);
    }

    public static ArrayList<ShoesHikingEntity> read()
    {
        return DB_ShoesHiking;
    }
}
