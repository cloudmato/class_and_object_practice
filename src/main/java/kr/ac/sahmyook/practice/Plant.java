package kr.ac.sahmyook.practice;

public class Plant {
    private String species = "";
    private String name = "";
    int nutritionGage = 50;
    int growthGage = 0;
    boolean ableHarvest;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies(){
        return this.species;
    }

    public String getName(){
        return this.name;
    }

}
