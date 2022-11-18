package weeks.week_12;

public class TestHousesForRent {

    public static void main(String[] args) {

        HousesForRent house1 = new HousesForRent(3, 1, 100, "north", 4000, 2,
                "Cankaya", true, false, false);
        house1.print();
        System.out.println("Rent for year: "+ house1.rentForYear());
        System.out.println("---------------------");

        HousesForRent house2 = new HousesForRent(4, 2, 140, "south", 7500, 6,
                "YeniMahalle", false, true, true);
        house2.print();
        System.out.println("Rent for year: "+ house2.rentForYear());
        System.out.println("---------------------");

        System.out.println("Number Of House : "+ HousesForRent.houseCounter);
    }
}
