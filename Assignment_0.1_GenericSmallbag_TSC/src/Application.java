
public class Application {
	public static void main(String[] args) {
		Item<String> stringItem = new Item<String>("Tyler");
		Item<Integer> integerItem = new Item<Integer>(1351513);
		
		SmallBag<Item<?>> bag = new SmallBag<Item<?>>();
		
		bag.setItem(stringItem);
		System.out.println("My Name: " + bag.getItem().getE());
		
		bag.setItem(integerItem);
		System.out.println("My Number: " + bag.getItem().getE());

	}
}
