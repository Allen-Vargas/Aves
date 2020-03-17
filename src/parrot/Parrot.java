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
        	velocityCalculator =  new VelocityEuropean();
        	return velocityCalculator.calculateVelocity(this);
        case AFRICAN:
        	velocityCalculator =  new VelocityAfrican();
            return velocityCalculator.calculateVelocity(this);
        case NORWEGIAN_BLUE:
        	velocityCalculator =  new VelocityNorwegianBlue();
            return velocityCalculator.calculateVelocity(this);
    	}
        throw new RuntimeException("Should be unreachable");
    }

    private VelocityCalculator createVelocityCalculator() {
    	VelocityCalculator velocityCalculator =null;
    	switch(type) {
        case EUROPEAN:
        	velocityCalculator =  new VelocityEuropean();
        case AFRICAN:
        	velocityCalculator =  new VelocityAfrican();
        case NORWEGIAN_BLUE:
        	velocityCalculator =  new VelocityNorwegianBlue();
    	}
		return velocityCalculator;
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
