package pckg_inner;

public class AppTest {
    public static void main(String[] args) {

        Building building = new Building("Sezam", 23, 3);
        building.provideBuildingInfo();
        Building.BuildingFloor floor = building.new BuildingFloor();
        floor.getFloorInfo();
        building.getSomeFloorInfo();
    }
}


// ovo je višestruka kompozicija (ne moze zgrada postojati bez katova)
