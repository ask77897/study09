package project09;

public class class42_Movie {
    String title;
	int duration;
	
	class42_Movie(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}
	
	void playMovie() {
		System.out.println("영화 \"" + title +"\"을 재생합니다. 총 " + duration+"분의 상영 시간입니다.");
	}
	
//	void displayGenre() {
//		System.out.println("장르 : 알 수 없음.");
//	}
}
