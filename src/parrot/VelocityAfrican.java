package parrot;

public class VelocityAfrican implements VelocityCalculator {

	@Override
	public double calculateVelocity(Parrot parrot) {
		// TODO Auto-generated method stub
		return Math.max(0, parrot.getBaseSpeed() - parrot.getLoadFactor() * parrot.getNumberOfCoconuts());
	}

}
