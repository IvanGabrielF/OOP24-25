package pckg_fst;

import java.util.ArrayList;
import java.util.List;

public class TEST {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new FlyingRobot("Flying robot 1"));
        robots.add(new FlyingRobot("Flying robot 2"));
        robots.add(new CleaningRobot("Cleaning robot 1"));
        robots.add(new CleaningRobot("Cleaning robot 2"));



    }
    public static void performAllTasks(List<Robot> robots){
        System.out.println("--------------------");
        for (Robot robot : robots){
            robot.performTask();
        }
    }
}
