import java.util.ArrayList;
import java.util.Map;

public class Birds implements BirdsInterface{
    private String name;
    private int wingsNumber;
    private BirdsType typeName;
    private String description;
    private boolean isExtint;
    private Category category;
    private Food food;

    public Birds(String name, Category category, BirdsType typeName,boolean isExtint,int wingsNumber,String description,Food food){
        this.name=name;
        this.category=category;
        this.typeName=typeName;
        this.isExtint=isExtint;
        this.wingsNumber=wingsNumber;
        this.description=description;
        this.food=food;

    }
    public String printBird(){
        return "name is: "+name +" the birds category is "+ category+" the type is:"+typeName+" the existance of the birds is"
                +isExtint+" the number of its wings are: "+wingsNumber+" the description is "+ description+" they eat: "+food;
    };
    public void setNme(String name){
        this.name=name;
    }
    public void setExtint(boolean extint) {
        isExtint = extint;
    }

    public void setTypeName(BirdsType typeName) {
        this.typeName = typeName;
    }

    public void setWingsNumber(int wingsNumber) {
        this.wingsNumber = wingsNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public String getName(){
        return name;
    }

    public int getWingsNumber() {
        return wingsNumber;
    }

    public boolean isExtint() {
        return isExtint;
    }

    public BirdsType getTypeName() {
        return typeName;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Food getFood() {
        return food;
    }
}
