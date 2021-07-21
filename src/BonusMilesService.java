public class BonusMilesService {
    public int calculate(int price) {

        int bonusCost = 20;
        int miles = (price / bonusCost);
        return miles;

    }

}
