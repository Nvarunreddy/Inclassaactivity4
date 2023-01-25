import java.util.ArrayList;
import java.util.Random;

public class SheepManager {

	public static ArrayList<Sheep> arrayList = new ArrayList<>();

	public int AddSheep(Sheep sheepToAdd) {
		arrayList.add(sheepToAdd);
		System.out.println("Added a sheep " + sheepToAdd.SheepName);
		return arrayList.size();
	}

	public static void generateSheep(int numberOfSheep) {
		Random random = new Random();
		for (int i = 0; i < numberOfSheep; i++) {
			String name = "Sheep" + i;
			String color = "Color" + random.nextInt(10);
			int weight = random.nextInt(200);
			int height = random.nextInt(100);
			Sheep sheep = new Sheep(name, color, weight, height);
			arrayList.add(sheep);
			System.out.println("Sheep entry: " + sheep.toString());
		}
	}


	public static void main(String[] args) {
		SheepManager sheepManager = new SheepManager();
		generateSheep(1000000);
		System.out.println("Number of sheep: " + arrayList.size());
	}
}
