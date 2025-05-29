public interface Rentable {
    static final int MAX_RENTAL_DAYS = 14;

    static double calculateLateFee( int daysLate) {
     return 0.5 * daysLate;
    }
    boolean isAvailable();
    boolean rent();
    void returnItem();





}
