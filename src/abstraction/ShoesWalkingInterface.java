package abstraction;

import java.util.ArrayList;

import entity.ShoesWalkingEntity;

public abstract class ShoesWalkingInterface {
    public abstract ArrayList<ShoesWalkingEntity> read();
    public abstract boolean update(int index);
    public abstract boolean create(ShoesWalkingEntity data);
    public abstract boolean delete(int index);
}
