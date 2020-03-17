package parrot;

public class VelocityEuropean implements VelocityCalculator {
	
	@Override
	public double calculateVelocity(Parrot parrot) {
		// TODO Auto-generated method stub
		return parrot.getBaseSpeed();
	}
}
