package entity;

public class ShoesWalkingEntity extends ShoesEntity
{
    private String ShoesType;

    public ShoesWalkingEntity(String shoesName, String shoesSize, int priceShoes, int idShoes, String shoesType) {
        super(shoesName, shoesSize, priceShoes, idShoes);
        ShoesType = shoesType;
    }

    public String getShoesType() {
        return ShoesType;
    }

    public void setShoesType(String shoesType) {
        ShoesType = shoesType;
    }
}