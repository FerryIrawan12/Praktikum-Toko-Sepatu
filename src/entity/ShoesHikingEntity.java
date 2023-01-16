package entity;

public class ShoesHikingEntity extends ShoesEntity{
    
    private int shoesWeight;

    public ShoesHikingEntity()
    {
        
    }

    public ShoesHikingEntity(String shoesName, String shoesSize, int priceShoes, int shoesWeight) {
        super(shoesName, shoesSize, priceShoes);
        this.shoesWeight = shoesWeight;
    }

    public int getShoesWeight() {
        return shoesWeight;
    }

    public void setShoesWeight(int shoesWeight) {
        this.shoesWeight = shoesWeight;
    }
}
