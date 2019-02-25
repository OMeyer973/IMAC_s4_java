
// javac *.java && java Main 1 2 32 4 3 1 5 4

public class Main {

	public static void main(String[] args) {
		int[] myInts = stringsToInts(args);
		for (int i=0; i<myInts.length; i++) {
			System.out.println(myInts[i]);
		}

	}

	public static int[] stringsToInts (String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i=0; i<stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}

	public static void swap (int[] list, int i1, int i2) {
		assert (i1 < list.length() && i2 < list.length());
		int tmp = list[i1];
		list[i1] = list [i2];
		list[i2] = tmp;
	}
}
