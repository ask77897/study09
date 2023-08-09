package project09;

public class class42 {

	public static void main(String[] args) {
		//1.학생 - 23학번, 22학번, 21학번, 20학번 <- 학번
		//23000001, 23000002, 23000003...
		//23123401, 23123402, 23123403...
//		class42_Student20 student1 = new class42_Student20();
//		class42_Student20 student2 = new class42_Student20();
//		class42_Student20 student3 = new class42_Student20();
//		class42_Student20 student4 = new class42_Student20();
//		class42_Student20 student5 = new class42_Student20();
//		class42_Student20 student6 = new class42_Student20();
//		class42_Student20 student7 = new class42_Student20();
//		class42_Student20 student8 = new class42_Student20();
//		class42_Student20 student9 = new class42_Student20();
//		class42_Student20 student10 = new class42_Student20();
//
//		class42_Student21 student11 = new class42_Student21();
//		class42_Student21 student21 = new class42_Student21();
//		class42_Student21 student31 = new class42_Student21();
//		class42_Student21 student41 = new class42_Student21();
//		class42_Student21 student51 = new class42_Student21();
//		class42_Student21 student61 = new class42_Student21();
//		class42_Student21 student71 = new class42_Student21();
//		class42_Student21 student81 = new class42_Student21();
//		class42_Student21 student91 = new class42_Student21();
//		class42_Student21 student110 = new class42_Student21();
//		
//		student1.printInfo();
//		student2.printInfo();
//		student3.printInfo();
//		student4.printInfo();
//		student5.printInfo();
//		student6.printInfo();
//		student7.printInfo();
//		student8.printInfo();
//		student9.printInfo();
//		student10.printInfo();
//		student11.printInfo();
//		student21.printInfo();
//		student31.printInfo();
//		student41.printInfo();
//		student51.printInfo();
//		student61.printInfo();
//		student71.printInfo();
//		student81.printInfo();
//		student91.printInfo();
//		student110.printInfo();
		
		Student student = new Student();
		System.out.println(student);
		
		//2.Movie -> SFmovie 장르 : SF static final 함께 적용해보기
		Movie movie = new Movie("기생충", 132);
		SFMovie sfMovie = new SFMovie("인터스텔라", 169);
		ComedyMovie comedyMovie = new ComedyMovie("써니", 124);
		
		movie.playMovie();
		//movie.displayGenre();
		sfMovie.playMovie();
		sfMovie.displayGenre();
		comedyMovie.playMovie();
		comedyMovie.displayGenre();




	}

}


