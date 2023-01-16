package abstraction;
import entity.ShoesHikingEntity;
import java.util.ArrayList;
public abstract class ShoesHikingInterface {
    public abstract ArrayList<ShoesHikingEntity> read();
    public abstract void create(String shoesName, String shoesSize, int priceShoes ,int shoesWeight);
    public abstract void update(int index,String shoesName, String shoesSize, int priceShoes ,int shoesWeight);
    public abstract void delete(int index);
    public abstract ShoesHikingEntity getIndexDB_ShoesHiking(int index);
}
