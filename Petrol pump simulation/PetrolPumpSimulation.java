package petrolpump_multithreading;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException {
		PetrolPump pump = new PetrolPump();
		Car[] car = {
			new Car("BMW", pump),
			new Car("Mercedes", pump),
			new Car("TATA", pump),
			new Car("Mahindra", pump),
			new Car("Suzuki", pump)
		};
		
		Thread[] carThread = new Thread[car.length];
		for (int i = 0; i < car.length; i++) {
			carThread[i] = new Thread(car[i]);
			carThread[i].start();
		}
		
		for (int i = 0; i < car.length; i++) {
			carThread[i].join();
			Thread.sleep(1000);
		}
		
		System.out.println("All cars complete refilling.");

	}

}
