import java.util.ArrayList;
public class Aviary {
    private ArrayList<Birds> birdsArrayList;
    private int size;

    public Aviary(ArrayList<Birds> birdsArrayList) {
        this.birdsArrayList = birdsArrayList;
    }
    public void addAviary(Birds birds) throws IllegalArgumentException{
        if(! birds.isExtint()){
            birdsArrayList.add(birds);
        }else{
            throw new IllegalArgumentException("can't add this type of the bird");
        }
    }
    // public Birds(String name, Category category, BirdsType typeName,boolean isExtint,int wingsNumber,String description,Food food)
    public int getSize() {
        return birdsArrayList.size();
    }
    public ArrayList<Birds> getAviaryListItem(){
        return birdsArrayList;
    }
    public void printAviary(){
        for (int i=0;i<birdsArrayList.size();i++){
            System.out.println("name is: "+birdsArrayList.get(i).getName()+" the category is: "+birdsArrayList.get(i).getCategory()+" the birds type is "
            +birdsArrayList.get(i).getTypeName()+" the existance is "+birdsArrayList.get(i).isExtint()+" the number of wings are: "+birdsArrayList.get(i).getWingsNumber()+
                    " the description is: "+birdsArrayList.get(i).getDescription()+" the food they eat is: "+birdsArrayList.get(i).getFood());
        }
    }
}
