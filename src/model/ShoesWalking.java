package model;

import java.util.ArrayList;
import entity.ShoesWalkingEntity;

public class ShoesWalking {
    
    private static ArrayList<ShoesWalkingEntity> DB_ShoesWalking=new ArrayList<>();

    public static void create(Object data)
    {
        DB_ShoesWalking.add((ShoesWalkingEntity)data);
    }

    public static void update(int index,Object data){
        DB_ShoesWalking.set(index, (ShoesWalkingEntity)data);
    }

    public static void delete(int index){
        DB_ShoesWalking.remove(index);
    }

    public static void getIndexDB_ShoesWalking(int index)
    {
        DB_ShoesWalking.get(index);
    }

    public static ArrayList<ShoesWalkingEntity> read()
    {
        return DB_ShoesWalking;
    }

}
