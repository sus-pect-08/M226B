package content.model;

import content.enums.Difficulty;

public final class OnlineCourse extends DigitalContent{
    private String instructuor;
    private Difficulty difficulty;
    private int estimatedHours;

    public OnlineCourse(int id, String title, String author, double basePrize, double currentDiscount, String instructuor, Difficulty difficulty) {
        super(id, title, author, basePrize, currentDiscount);
        this.instructuor = instructuor;
        this.difficulty = difficulty;
        this.estimatedHours = estimatedHours;
    }

    public boolean getCertificationEligible(){
        boolean indice;
        if(this.estimatedHours > 10){
            indice = true;
        }
        else{
            indice = false;
        }
        return indice;
    }

    public String getInstructuor() {
        return instructuor;
    }

    public void setInstructuor(String instructuor) {
        this.instructuor = instructuor;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }
}
