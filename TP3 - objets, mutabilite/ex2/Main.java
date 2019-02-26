import java.util.ArrayList;

// javac *.java && java Main

public class Main {
	//1
	// public static void main(String[] args) {
	// 	var b1 = new Book("Da Java Code", "Duke Brown");
	// 	var b2 = b1;
	// 	var b3 = new Book("Da Java Code", "Duke Brown");

	// 	System.out.println(b1 == b2);
	// 	System.out.println(b1 == b3);
 	// }

 	// prints
 	// true
 	// false

 	// b2 est une référence vers le m^eme objet que b1
 	// b3 est une référence vers objet avec le m^eme contenu que celui référé par b1 
 	// mais l'objet en lui m^eme est différent

	//2
	// public static void main(String[] args) {
	// 	var b1 = new Book("Da Java Code", "Duke Brown");
	// 	var b2 = b1;
	// 	var b3 = new Book("Da Java Code", "Duke Brown");

	// 	System.out.println(b1.isSameAs(b3));
 	// }

 	//3
 	// The indexOf() method of ArrayList returns the index of 
 	// the first occurrence of the specified element in this list, 
 	// or -1 if this list does not contain the element.

	//4
	// public static void main(String[] args) {
	// 	var b1 = new Book("Da Java Code", "Duke Brown");
	// 	var b2 = b1;
	// 	var b3 = new Book("Da Java Code", "Duke Brown");

	// 	var list = new ArrayList();
	// 	list.add(b1);
	// 	System.out.println(list.indexOf(b2));
	// 	System.out.println(list.indexOf(b3));
 //    }

    // prints
    // 0
    // -1

    // problème au niveau de la comparaison.
    // b3 a le m^eme contenu que ArrayList[0] (b1), 
    // mais la comparaison est faite en utilisant le == de base
    // et pas notre méthode custom qui marche bien

    //5
    // il faut redéfinir la méthode equals de Object (dont tous les objets java héritent)

	//9
	public static void main(String[] args) {
		var aBook = new Book(null, null);
		var anotherBook = new Book(null, null);
		var list = new ArrayList();
		list.add(aBook);
		System.out.println(list.indexOf(anotherBook));
	}
	//prints
	// Note: Main.java uses unchecked or unsafe operations.
	// Note: Recompile with -Xlint:unchecked for details.
	// Exception in thread "main" java.lang.NullPointerException
	// at Book.equals(Book.java:39)
	// at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:330)
	// at java.base/java.util.ArrayList.indexOf(ArrayList.java:317)
	// at Main.main(Main.java:68)

	// problème :
	// la methode .equals n'existe pas pour null.
	// le code doit arr^eter de fonctionner si il est mal utiliser pour éviter des erreurs
	// il faut modifier les setters de book pour prendre en compte le cas null, ie lancer une erreur

	//10
	// quand on a des nulls là ou on veut pas, on lance des erreurs. règle générale : 
	// - on initialise toujours les variables locales
	// - pas de null dans les membres
	// - pas de null renvoyé par des méthodes
	// si on n'a pas le choix de faire autrement : le préciser dans la doc et en commentaire dans le code

	//11
	// Objects.requireNonNull renvoie l'objet si il n'st pas null et lance une erreur si il l'est.

}
