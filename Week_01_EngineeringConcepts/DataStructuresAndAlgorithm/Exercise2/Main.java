public class Main {
	public static void main(String[] args) {
		Product[] products = { new Product(101, "Laptop", "Electronics"), new Product(102, "Shirt", "Apparel"),
				new Product(103, "Mobile", "Electronics"), new Product(104, "Watch", "Accessories"),
				new Product(105, "Shoes", "Footwear") };

		String searchKey = "Watch";

		// Linear Search
		int linearIndex = SearchAlgorithms.linearSearch(products, searchKey);
		System.out.println("Linear Search: " + (linearIndex != -1 ? products[linearIndex] : "Product not found"));

		// Binary Search
		int binaryIndex = SearchAlgorithms.binarySearch(products, searchKey);
		System.out.println("Binary Search: " + (binaryIndex != -1 ? products[binaryIndex] : "Product not found"));
	}
}
