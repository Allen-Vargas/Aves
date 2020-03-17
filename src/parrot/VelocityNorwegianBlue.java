package parrot;

public class VelocityNorwegianBlue implements VelocityCalculator {

	@Override
	public double calculateVelocity(Parrot parrot) {
		// TODO Auto-generated method stub
		return (parrot.getisNailed()) ? 0 : parrot.getBaseSpeed(parrot.getVoltage());
	}

}
