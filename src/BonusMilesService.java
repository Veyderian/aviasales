public class BonusMilesService {
    public int calculate(int price) {
        int BonusMiles = 20;
        int miles = price / BonusMiles;

        return miles;
    }
}
