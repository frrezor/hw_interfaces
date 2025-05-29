import java.util.ArrayList;

public class Movie implements MediaItem,Rentable,Rateable {

    private String title;
    private String director;
    private int year;
    private int duration;
    private boolean AvailabilityStatus;
    private ArrayList<Integer> listOfRatings  = new ArrayList<>();
    public Movie(String title, String director, int year, int duration
                 ) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;

    }
    @Override
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getFormattedDisplay () {
        return "0";
    }
    public boolean isAvailable () {
        return AvailabilityStatus;
    }
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
    public void addRating (int stars) {
        if (stars>= 1 && stars <= 5) {
            listOfRatings.add(stars);
        }
        else if (stars==0) { System.out.println("You don't have any stars"); }

        else {
            System.out.println("You are out of range");
        }


        }

        public double  getAverageRating() {

        if (listOfRatings.size() == 0) {
            return 0;
        }

            int sum = 0;
            for (int rating : listOfRatings) {
                sum += rating;
            }

        return (double) sum/ listOfRatings.size();

    }

    public String getDisplayString() {
        return title;
    }






}
