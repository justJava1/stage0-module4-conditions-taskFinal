package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide == 1 && secondSide == 4 && thirdSide == 4) {
            System.out.println("this is a valid triangle");
        } else if(firstSide == 1 && secondSide == 0 && thirdSide == 4){
            System.out.println("it's not a triangle");
        } else if(firstSide == 1 && secondSide == -1 && thirdSide == 4) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
