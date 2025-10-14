package content.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public  class AudioBook extends DigitalContent {

    private String narrator;
    private int duration;
    private String language;

    public AudioBook(int id, String title, String author, double basePrize, double currentDiscount) {
        super(id, title, author, basePrize, currentDiscount);
    }

    public LocalTime getFormattedDuration() {
        LocalTime time = LocalTime.of(duration, duration);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:MM");
        String formattedDate = time.format(myFormatObj);
        return LocalTime.parse(formattedDate, myFormatObj);
    }
    public  double calculatePrice(){
        double rturn = super.calculatePrice();
        int limit = 480;
        LocalTime time2 = LocalTime.of(limit, limit);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:MM");
        String formattedDate = time2.format(myFormatObj);
        LocalTime limitTime = LocalTime.parse(formattedDate, myFormatObj);

        if (getFormattedDuration().isAfter(limitTime)) {
            rturn = super.calculatePrice() + super.calculatePrice() * 0.20;
        }
        return rturn;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
