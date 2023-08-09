package project09;

public class class42_SFMovie extends class42_Movie{
    private static final String genre = "SF";
	class42_SFMovie(String title, int duration) {
		super(title, duration);
	}
	
	static final void displayGenre() {
		System.out.println("장르 : " + genre);
	}
}
