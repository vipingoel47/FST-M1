package fst_b17;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double age_seconds = 1000000000;
		double earth_orb_period = 31557600;
		double mercury_orb_period = 0.2408467*earth_orb_period;
		double venus_orb_period = 0.61519726*earth_orb_period;
		double mars_orb_period = 1.8808158*earth_orb_period;
		double jupiter_orb_period = 11.862615*earth_orb_period;
		double saturn_orb_period = 29.447498*earth_orb_period;
		double uranus_orb_period = 84.016846*earth_orb_period;
		double neptune_orb_period = 164.79132*earth_orb_period;
		
		System.out.println("Age on Earth is " + age_seconds/earth_orb_period);
		System.out.println("Age on Mercury is " + age_seconds/mercury_orb_period);
		System.out.println("Age on Venus is " + age_seconds/venus_orb_period);
		System.out.println("Age on Mars is " + age_seconds/mars_orb_period);
		System.out.println("Age on Jupiter is " + age_seconds/jupiter_orb_period);
		System.out.println("Age on Saturn is " + age_seconds/saturn_orb_period);
		System.out.println("Age on Uranus is " + age_seconds/uranus_orb_period);
		System.out.println("Age on Neptune is " + age_seconds/neptune_orb_period);
		
	}

}
