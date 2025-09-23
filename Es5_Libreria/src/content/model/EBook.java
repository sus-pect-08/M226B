package content.model;

import content.enums.Genre;

public class EBook extends DigitalContent{

    private Genre genre;
    private int pageCount;
    private boolean illustrated;

    public EBook(int id, String title, String author, double basePrize, double currentDiscount) {
        super(id, title, author, basePrize, currentDiscount);
    }

    public void getReadingTime(){

    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isIllustrated() {
        return illustrated;
    }

    public void setIllustrated(boolean illustrated) {
        this.illustrated = illustrated;
    }


}
