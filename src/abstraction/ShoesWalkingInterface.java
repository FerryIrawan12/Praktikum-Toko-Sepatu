package abstraction;

import java.security.PublicKey;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import entity.ShoesWalkingEntity;

public abstract class ShoesWalkingInterface {
    public abstract ArrayList<ShoesWalkingEntity> read();
    public abstract void create(String shoesName, String shoesSize, int priceShoes ,String shoesWeight);
    public abstract void update(int index,String shoesName, String shoesSize, int priceShoes ,String shoesType);
    public abstract void delete(int index);
    public abstract ShoesWalkingEntity getIndexDB_ShoesWalking(int index);
}
