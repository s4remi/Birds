public interface BirdsInterface {
    public void setNme(String name);
    public void setExtint(boolean extint);
    public void setTypeName(BirdsType typeName);
    public void setWingsNumber(int wingsNumber);
    public void setDescription(String description);
    public void setCategory(Category category);
    public String getName();
    public int getWingsNumber();
    public boolean isExtint();
    public BirdsType getTypeName();
    public Category getCategory();
    public String getDescription();
    public String printBird();
}
