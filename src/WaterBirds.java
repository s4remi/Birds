public class WaterBirds extends Birds {
    private BodyOfWater bodyOfWater;

    public WaterBirds(String name, Category category, BirdsType typeName,boolean isExtint,int wingsNumber,String description,Food food,BodyOfWater bodyOfWater){
        super(name, category, typeName,isExtint,wingsNumber,description,food);
        this.bodyOfWater=bodyOfWater;
    }

    public void setBodyOfWater(BodyOfWater bodyOfWater) {
        this.bodyOfWater = bodyOfWater;
    }

    public BodyOfWater getBodyOfWater() {
        return bodyOfWater;
    }
}
