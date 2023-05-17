import java.util.*;

public class Conservatory {
    private int numberAviaries;
    private int numberFood;
    //private ArrayList<Map<BirdsInterface.Food,Integer>> foodReserve;
    //private Map<String, Integer>position;
    //private Map<String, BirdsInterface> birdsInfo;
    //private Map<String,Parrots>parrotType;
    //private Map<String,BirdsNearWater> waterBirdsMap;
    private ArrayList<Aviary> aviaryList;
    private HashMap<Integer,Birds> birdsInAviary;


    public Conservatory(){
        aviaryList=new ArrayList<>();
        birdsInAviary=new HashMap<>();
    }

    public Conservatory(int numberAviaries){
        this.numberAviaries=numberAviaries;
    }
    public void addNewBirds(Birds birds){
        for(int j=0;j<aviaryList.size();j++){
            if(aviaryList.get(j).getSize()>=5){
                continue;
            }else{
                if(aviaryList.get(j).getAviaryListItem().get(0).getCategory()== Category.PREY){
                    Aviary aviary=aviaryList.get(j);
                    aviary.addAviary(birds);
                }else if(aviaryList.get(j).getAviaryListItem().get(0).getCategory()==Category.FLIGHTLESS){
                    Aviary aviary=aviaryList.get(j);
                    aviary.addAviary(birds);
                }else if(aviaryList.get(j).getAviaryListItem().get(0).getCategory()==Category.WATERFOWL){
                    Aviary aviary=aviaryList.get(j);
                    aviary.addAviary(birds);
                }else{
                    Aviary aviary=aviaryList.get(j);
                    aviary.addAviary(birds);
                }
            }
        }
        if(aviaryList.size()<20){
           Aviary aviary= new Aviary(new ArrayList<Birds>());
           aviaryList.add(aviary);
        }
    }
    public int foodcount(ArrayList<Birds> list){
        int count= list.size();
        return count;
    }
    public ArrayList<Birds> getAllBirds(){
        ArrayList<Birds> result= new ArrayList<>();
        for(Aviary aviary:aviaryList){
            if(! aviary.getAviaryListItem().isEmpty()){
                Iterator <Map.Entry<Integer,Birds>> iterator=aviary.getAviaryListItem().entrySet().iterator();
                while(iterator.hasNext()){
                    Map.Entry<Integer,Birds> entry=iterator.next();
                    result.add(entry.getValue());
                }
            }
        }
        Iterator<Map.Entry<Integer,Birds>> iterator=birdsInAviary.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Birds> entry= iterator.next();
            result.add(entry.getValue());
        }
        return result;
    }

    public HashMap<String, Integer> calculateFoods(){
        HashMap<String,Integer> foods= new HashMap<>();
        for(Aviary aviary:aviaryList){
            if( ! aviary.getFood().isEmpty()){
                Iterator<Map.Entry<String,Integer>> iterator= aviary.getFood().entrySet().interator();
                while(iterator.hasNext()){
                    Map.Entry<String,Integer> entry = iterator.next();
                    if(foods.containsKey(entry.getKey())){
                        foods.put(entry.getKey(),(foods.get(entry.getKey()))+1);
                    }else{
                        foods.put(entry.getKey(),entry.getValue());
                    }
                }
            }
        }
        return foods;
    }

    public BodyOfWater getAviary(Birds birds){
        return birdsInAviary.get(birds).getLocation();
    }



}






//
//
////
//    public int assignBirds(BirdsInterface aa){
//        return 3;
//    }
//    public Map<String, BirdsInterface>  getBirdsInfo(){
//        return
//    }
//    public int getNumberAviaries(){
//        return
//    }
//    public void setNumberAviaries(int numberAviaries){
//
//    }
//    public BirdsInterface.Category getBirdCategory(String aa){
//
//    }
//    public ArrayList<String> getCharacteristic(String aa){
//
//    }
//    public ArrayList<BirdsInterface.Food> getFoodList(String aa){
//
//    }
//    public String getFavoriteSaying(String aa){
//
//    }
//    public getFoodQuantity(){
//
//    }
//    public int getFoodQuantity(BirdsInterface.Food aa){
//        return
//    }
//    public int getNumberOfWords(String aa){
//
//    }
//    public ArrayList<String> getSign(int a){
//
//    }
//    public void printAviaryInfo(){
//
//    }
//    public void printBirdsInfo(){
//
//    }
//    public void setFoodQuantity(BirdsInterface.Food AA, int a, int aa){
//
//    }
//    public void setParrotType(String a, int aa, int String aaa){
//
//    }
//    public void setWaterSource(String a, BirdsInterface.BodyOfWater aa){
//
//    }
//    public BirdsInterface.BodyOfWater getWaterSource(){
//
//    }
//    public void updateFoodReserve(String a){
//
//    }
//    public ArrayList<Aviary> getAviaryList(){
//
//    }


