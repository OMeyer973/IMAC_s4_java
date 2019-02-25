// javac Main.java && java Main

public class Main {
	//3
	// public static void main(String[] args) {
	// 	var book = new Book();
	// 	System.out.println(book.title + ' ' + book.author);
 	// }

	// Main.java:7: error: title has private access in Book
	// 		System.out.println(book.title + ' ' + book.author);
	// 		                       ^
	// Main.java:7: error: author has private access in Book
	// 		System.out.println(book.title + ' ' + book.author);
	// 		                                          ^
	// 2 errors

 	// -> Les membres sont privés -> faire des getter et setter 
 	// (ou les passer en public mais on fait aps ça)

 	//4
 	// visibilités en java : public, protected, default (hérité), private
	// pour respecter le principe d'encapsulation de la POO

	//5
	// un getter qui retourne une variable privée
	// get author, get title

	//6 
	// on la rend immutable (private + final, pas de setter ...) et on le note dans la doc
	// ça évite des problèmes, respecte la cohérence et philosophie du code

	//8
	public static void main(String[] args) {
		var book = new Book("titrage", "hauteur");
		System.out.println(book.getTitle() + ' ' + book.getAuthor());
		var book2 = new Book("titreuh");
		System.out.println(book2.getTitle() + ' ' + book2.getAuthor());
 	}
}
