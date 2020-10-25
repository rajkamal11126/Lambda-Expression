import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayList {
	public static void main(String[] args) {
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			myList.add(i);

		// Method 1: traversing using iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::" + i);
		}

		// Method 2:Traversing with Consumer interface implementation
		class MyConsumer implements Consumer<Integer> {
			public void accept(Integer t) {
				System.out.println("Mth2: Consumer impl Value::" + t);
			}
		}
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

		// Method 3: Traversing with Anonymous Consumer
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Mth3: forEach anonymous class Value::" + t);
			}
		});

		// Method 4: Explicit Lambda Function
		Consumer<Integer> myListAction = n -> {
			System.out.println("Mth4: forEach Lambda impl Value::" + n);
		};
		myList.forEach(myListAction);

		// Method 5: Implicit Lambda Function
		myList.forEach(n -> {
			System.out.println("Mth5: forEach Lambda impl Value::" + n);
		});

	}
}
