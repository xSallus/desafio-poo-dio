package com.saloma.tech;






import com.saloma.tech.bootcamp.*;

public class App {
  public static void main( String[] args ) {
		Bootcamp bootcamp = new Bootcamp("JavaI Tarde: Do zero ao reru.", "Comendo arroz com Java pra nao precisar comer pao com pao.");
		Content course0 = new Course("Salame","E muy bueno",160);
		Content course1 = new Course("Mixto","E pretty much good",240);
		Content mentoring = new Course("Salame", "E muy bueno", 160);

		bootcamp.getContents().add(course0);
		bootcamp.getContents().add(course1);
		bootcamp.getContents().add(mentoring);


		Dev saloma = new Dev("Saloma", "1995-08-18");
		Dev murim = new Dev("Murim", "2003-12-25");

		murim.enrolBootcamp(bootcamp);
		System.out.println(murim.getEnroledContents());

		murim.progressing();
		murim.progressing();
		murim.progressing();
		System.out.println(murim.getEnroledContents());
		System.out.println(murim.getFinishedContents());

		System.out.println("\n---------------------\n");

		saloma.enrolBootcamp(bootcamp);
		System.out.println(saloma.getEnroledContents());

		saloma.progressing();
		System.out.println(saloma.getEnroledContents());
		System.out.println(murim.getFinishedContents());


		System.out.println("murim: "+murim.calculateXP()+"xp");
		System.out.println("saloma: "+saloma.calculateXP()+"xp");
  }
}
