package composicao_post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("That's awesome!");
		
		Post post = new Post(dateFormat.parse("05/04/2024 16:19:00"), "Traveling to new Zealand", "I´m going...", 12);
		post.addComment(c1);
		post.addComment(c2);
		System.out.println(post);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		Post post2 = new Post(dateFormat.parse("08/04/2024 16:19:00"), "Good night", "See you tomorrow", 5);
		post2.addComment(c3);
		post2.addComment(c4);
		System.out.println(post2);
	}
}
