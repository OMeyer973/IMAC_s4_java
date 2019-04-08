import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		var list = List.of("hello", "world", "hello", "lambda");
		System.out.println(count(list, "hello"));  // 2	
		System.out.println(count2(list, "hello"));  // 2	
	}

	public static long count(List<String> list, String str) {
		long n = 0;
		for (String tmp : list) {
			if (tmp.equals(str))
				n++;
		}
		return n;
	}
	
	private static long count2(List<String> list, String str) {
		// stream à partir d'une list : list.stream()
		// filtrage : .filter()
		// comptage : .count()
		// T est un boolean
		// Pour écrire une lambda on utilise le prédicat : <variable itérée> -> <(boolean) expression>
		return list.stream()
				.filter(tmp -> str.equals(tmp))
				.count();
	}
	

	private static List<String> upperCase(List<String> list) {
		List<String> uppercases = new ArrayList<>();
		for(String str : list) {
			uppercases.add(str.toUpperCase());
		}
		return uppercases;
	}
	
	private static List<String> upperCase2(List<String> list) {
		List<String> uppercases = new ArrayList<>();
		list.stream()
			.map(str -> str.toUpperCase())
			.forEach(upper -> uppercases.add(upper));
		return uppercases;
	}
	

	
	
}
