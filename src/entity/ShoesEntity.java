package entity;

public abstract class ShoesEntity
{
    private String ShoesName;
    private String ShoesSize;
    private int PriceShoes;

    public ShoesEntity(String shoesName, String shoesSize, int priceShoes) {
        ShoesName = shoesName;
        ShoesSize = shoesSize;
        PriceShoes = priceShoes;
    }

    public ShoesEntity()
    {

    }
    public String getShoesName() {
        return ShoesName;
    }

    public String getShoesSize() {
        return ShoesSize;
    }

    public int getPriceShoes() {
        return PriceShoes;
    }

    public void setShoesName(String shoesName) {
        this.ShoesName = shoesName;
    }

    public void setShoesSize(String shoesSize) {
        this.ShoesSize = shoesSize;
    }

    public void setPriceShoes(int priceShoes) {
        this.PriceShoes = priceShoes;
    }



}