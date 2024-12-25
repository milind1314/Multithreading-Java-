package petrolpump_multithreading;

public class PetrolPump {

	public synchronized void refillCar(String carName) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println(carName+" started refilling...");
		Thread.sleep(3000);
		System.out.println(carName+" completed refilling!");
		System.out.println();
		
	}
}
