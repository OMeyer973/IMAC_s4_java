package fr.umlv.data;

public class Main {

	public static void main(String[] args) {
		
		Link a = new Link(2);
		Link b = new Link(546);

		System.out.println(a);
		System.out.println(b);
		
		//2.3
		// LinkedLink list = new LinkedLink();
		// list.add("a");
		// list.add("erer");
		// list.add("cc");
		
		// System.out.println(((String)list.get(1)).length());

		LinkedLink<Integer> list = new LinkedLink<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.contains(2));
		
		
		System.out.println("------------");
		
		LinkedLink<String> list2 = new LinkedLink<>();
		list2.add("a");
		list2.add("azazza");
		list2.add("erere");
		
		
		System.out.println(list2);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.contains("erere"));
	}
}


// 2.4
// on n'aime pas les cast pcq java est un langage fortement typé 
// et si on doit faire des cast pour des choses aussi simple
// c'est qu'on s'est planté quelque part (pcq c'est des sources de bugs)


// 3.1
// sinon, on peut faire des listes non typées et c'est moche