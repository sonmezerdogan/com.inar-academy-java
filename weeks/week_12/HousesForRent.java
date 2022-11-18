package weeks.week_12;

public class HousesForRent {

    public static int houseCounter;
    private int room;
    private int bathRoom;
    private int netArea;
    private String houseFace;
    private int monthlyRent;
    private int whichFloor;
    private String whichDistrict;
    private boolean isFurnished;
    private boolean isEmpty;
    private boolean hasGarage;

    public HousesForRent() {


    }
    public HousesForRent(int room, int bathRoom, int netArea, String houseFace, int monthlyRent, int whichFloor,
                         String whichDistrict, boolean isEmpty, boolean isFurnished, boolean hasGarage) {
        this.room = room;
        this.bathRoom = bathRoom;
        this.netArea = netArea;
        this.houseFace = houseFace;
        this.monthlyRent = monthlyRent;
        this.whichFloor = whichFloor;
        this.whichDistrict = whichDistrict;
        this.isEmpty = isEmpty;
        this.isFurnished = isFurnished;
        this.hasGarage = hasGarage;
        houseCounter++;
    }
    public int getRoom() {
        return this.room;
    }
    public void setRoom() {
        this.room = room;
    }
    public int getBathRoom() {
        return bathRoom;
    }
    public void setBathRoom() {
        this.bathRoom = bathRoom;
    }
    public int getNetArea() {
        return this.netArea;
    }
    public String getHouseFace() {
        return this.houseFace;
    }
    public int getMonthlyRent() {
        return this.monthlyRent;
    }
    public int getWhichFloor() {
        return this.whichFloor;
    }
    public String getWhichDistrict() {
        return this.whichDistrict;
    }
    public void houseHasHirer() {
        isEmpty = false;
    }
    public void houseHasFurnished() {
        isFurnished = false;
    }
    public int rentForYear() {
        return monthlyRent *12;
    }
    public void print() {
        System.out.printf("Room:%d\nBathRoom:%s\nNetArea:%d\nHouseFace:%s\nMonthlyRent:%d\nWhichFloor:%d\n" +
                "WhichDistrict:%s\nIsEmpty:%s\nısFurnished:%s\nhasGarage:%s\n",this.room, this.bathRoom, this.netArea, this.houseFace,
                this.monthlyRent, this.whichFloor, this.whichDistrict, this.isEmpty, this.isFurnished, this.hasGarage);
        System.out.println("----------------------");
    }
    public static int getHouseCounter() {
        return houseCounter;
    }
}
