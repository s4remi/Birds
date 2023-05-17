public class Parrots extends Birds {

    private String favoriteWord;
    private int numberOfVocab;


    public Parrots(String name, Category category, BirdsType typeName,boolean isExtint,int wingsNumber,String description,Food food,String favoriteWord,int numberOfVocab){
        super(name, category, typeName,isExtint,wingsNumber,description,food);
        this.favoriteWord=favoriteWord;
        this.numberOfVocab=numberOfVocab;
    }

    public int getNumberOfVocab() {
        return numberOfVocab;
    }

    public String getFavoriteWord() {
        return favoriteWord;
    }

    public void setNumberOfVocab(int numberOfVocab) {
        this.numberOfVocab = numberOfVocab;
    }

    public void setFavoriteWord(String favoriteWord) {
        this.favoriteWord = favoriteWord;
    }
}





