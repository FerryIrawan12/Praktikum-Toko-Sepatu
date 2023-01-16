package entity;

public class ShoesWalkingEntity extends ShoesEntity
{
    private String ShoesType;

    public ShoesWalkingEntity()
    {
        
    }
    public ShoesWalkingEntity(String shoesName, String shoesSize, int priceShoes ,String shoesType) {
        super(shoesName, shoesSize, priceShoes);
        this.ShoesType = shoesType;
    }

    public String getShoesType() {
        return ShoesType;
    }

    public void setShoesType(String shoesType) {
        ShoesType = shoesType;
    }
}