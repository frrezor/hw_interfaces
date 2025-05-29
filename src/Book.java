public class Book implements MediaItem,Rentable {
    private String title;
    private String author;
    private int  publicationYear;
    private boolean AvailabilityStatus;
    private String ISBN;

    public Book ( String title,String author,int publicationYear,String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
    }

    @Override
     public boolean rent () {
       if (AvailabilityStatus) {
           AvailabilityStatus = false;
           return true;
       }
       else {

           return false;
       }
    }
     public void returnItem() {
        AvailabilityStatus = true;
     }
     public boolean isAvailable() {
        return AvailabilityStatus;
     }
     public String getTitle() {
        return title;
     }
     public int getYear() {
        return publicationYear;
     }
     public String getFormattedDisplay () {
        return ISBN;
    }

    public String   getDisplayString () {
        return title;
    }

}
