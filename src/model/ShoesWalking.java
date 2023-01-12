package model;

import java.util.ArrayList;
import entity.ShoesWalkingEntity;

public class ShoesWalking {
    
    private static ArrayList<ShoesWalkingEntity> DB_ShWalking=new ArrayList<>();

    public static void initialData()
    {
        DB_ShWalking.add(new ShoesWalkingEntity("vans", "40", 500000, 101,"low"));
        DB_ShWalking.add(new ShoesWalkingEntity("converse", "40", 600000, 102,"hihgh"));
    }

    public static void create(ShoesWalkingEntity dataShoes)
    {
        DB_ShWalking.add(dataShoes);
    }

    public static void updateByKode(int index,ShoesWalkingEntity data)
    {
        DB_ShWalking.set(index, data);
    }

    public static void delete(ShoesWalkingEntity delete)
    {
        DB_ShWalking.remove(delete);
    }

    public static ArrayList<ShoesWalkingEntity> all()
    {
        return DB_ShWalking;
    }
}
