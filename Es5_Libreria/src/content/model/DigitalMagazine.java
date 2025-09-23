package content.model;

import java.time.LocalDate;
import java.time.Period;

public class DigitalMagazine extends DigitalContent {
    private int issueNumber;
    private LocalDate publicationDate;
    private String category;

    public DigitalMagazine(int id, String title, String author, double basePrize, double currentDiscount, int issueNumber, LocalDate publicationDate) {
        super(id, title, author, basePrize, currentDiscount);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.category = category;
    }
    public void isRecentIssue(){
        Period period = Period.between(publicationDate, LocalDate.now());
        if(period.getDays() <= 30){
            double price = getBasePrize() + getBasePrize() * 0.1;
            setBasePrize(price);
        }
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
