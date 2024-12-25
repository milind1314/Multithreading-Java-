package petrolpump_multithreading;

public class Car implements Runnable {

	public String name;
	public PetrolPump petrolPump;
	
	
	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}


	@Override
	public void run() {
		
		try {
			petrolPump.refillCar(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
