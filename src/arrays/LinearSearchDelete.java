package arrays;

public class LinearSearchDelete {

	private long a[];

	private int nItems;

	public LinearSearchDelete(int size) {

		a = new long[size];
		nItems = 0;
	}

	public void insertItem(int item) {
		a[nItems] = item;
		nItems++;
	}

	public boolean searchItem(long item) {

		int i;
		for (i = 0; i < nItems; i++) {
			if (item == a[i])
				break;
		}

		if (i == nItems)
			return false;
		else
			return true;
	}

	public boolean deleteItem(long item) {

		int i;
		for (i = 0; i < nItems; i++)
			if (item == a[i])
				break;
		if (i == nItems) {

			return false;
		} else {

			for (int k = i; k < nItems-1; k++)
				a[k] = a[k + 1];
	 
			nItems--;
			return true;
		}
	}

	public void display() {
		for (int i = 0; i < nItems; i++)
			System.out.print(a[i] + " ");
		System.out.println("");

	}

	public static void main(String[] args) {
		LinearSearchDelete items = new LinearSearchDelete(5);
		items.insertItem(5);
		items.insertItem(6);
		items.insertItem(7);
		items.insertItem(1);
		items.insertItem(8);

		items.display();
		System.out.println("is 7 present? " + items.searchItem(7));
		System.out.println("is 51 present? " + items.searchItem(51));
		items.deleteItem(6);
		System.out.println("Items after deleting 6");
		items.display();

	}

}
