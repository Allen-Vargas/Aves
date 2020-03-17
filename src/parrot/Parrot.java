package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	VelocityCalculator velocityCalculator = null;
    	
        switch(type) {
            case EUROPEAN:
            	VelocityEuropean velocity =  new VelocityEuropean();
            	return velocity.calculateVelocity(this);
            case AFRICAN:
            	VelocityAfrican velocity2 =  new VelocityAfrican();
                return velocity2.calculateVelocity(this);
            case NORWEGIAN_BLUE:
            	VelocityNorwegianBlue velocity3 =  new VelocityNorwegianBlue();
                return velocity3.calculateVelocity(this);
        }
        throw new RuntimeException("Should be unreachable");
    }

    public double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    public double getLoadFactor() {
        return 9.0;
    }

    public double getBaseSpeed() {
        return 12.0;
    }
    
    public int getNumberOfCoconuts() {
    	return numberOfCoconuts;
    }

    public double getVoltage() {
    	return voltage;
    }
    
    public boolean getisNailed() {
    	return isNailed;
    }
}
