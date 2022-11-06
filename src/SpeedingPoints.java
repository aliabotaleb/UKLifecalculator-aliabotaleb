
public class SpeedingPoints {
    private double currentPoints;
    public SpeedingPoints () {
        currentPoints = 0;
    }


    // Getter
    public double getCurrentPoints() {
        return currentPoints;
    }

    // Setter
    public void setCurrentPoints(double newCurrentPoints) {
        this.currentPoints = newCurrentPoints;
    }
    public boolean checkTolerance(double speed, int limit) {
        double actualLimit=((limit * 1.1)+2);
        boolean isSpeeding = speed > actualLimit;
        return isSpeeding;
    }

    public void checkPoints(double speed, int limit) {
        double actualLimit=((limit * 1.1)+2);
        if (speed <= actualLimit){
            currentPoints=0;
            return;
        }
        switch(limit) {
            case 20:
                if (!checkTolerance( speed,  30)){
                    currentPoints=3;
                } else if (!checkTolerance( speed,  40)) {
                    currentPoints=4;
                }else if (!checkTolerance( speed,  40)) {
                    currentPoints=6;
                }
                break;
            case 30:
                if (!checkTolerance( speed,  40)){
                    currentPoints=3;
                } else if (!checkTolerance( speed,  50)) {
                    currentPoints=4;
                }else if (!checkTolerance( speed,  50)) {
                    currentPoints=6;
                }
                break;
            case 40:
                if (!checkTolerance( speed,  55)){
                    currentPoints=3;
                } else if (!checkTolerance( speed,  65)) {
                    currentPoints=4;
                }else if (!checkTolerance( speed,  65)) {
                    currentPoints=6;
                }
                break;
            case 50:
                if (!checkTolerance( speed,  65)){
                    currentPoints=3;
                } else if (!checkTolerance( speed,  75)) {
                    currentPoints=4;
                }else if (!checkTolerance( speed,  75)) {
                    currentPoints=6;
                }
                break;
            case 60:
                if (!checkTolerance( speed,  80)){
                    currentPoints=3;
                } else if (!checkTolerance( speed,  90)) {
                    currentPoints=4;
                }else if (!checkTolerance( speed,  90)) {
                    currentPoints=6;
                }
                break;
            case 70:
                if (!checkTolerance( speed,  90)){
                    currentPoints=3;
                } else if (!checkTolerance( speed,  100)) {
                    currentPoints=4;
                }else if (!checkTolerance( speed,  100)) {
                    currentPoints=6;
                }
                break;
            default:
                // this is an error
        }
    }

    public String getOutcomeStr(double speed, int speedLimit) {
        String message="Speed was "+speed + " limit was " + speedLimit + " number of points "+getCurrentPoints();
        return message;
    }

}
