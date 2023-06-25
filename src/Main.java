public class Main {
    public static void staticMethod1() {
        System.out.println("static method is called");
    }
    public static String staticMethod2(){
       return "static method2 (whit return tipe) is called";
    }

    public static void main(String[] args) {
        //creeaza un obiect din clasa DemoClass
        DemoClass obiect1 = new DemoClass();
        DemoClass obiect2 = new DemoClass();
        System.out.println(obiect1.x);
        obiect1.x=6;
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.afiseazaText();
        obiect2.text = "something else";
        System.out.println(obiect2.text);
       // DemoClass.afiseazaTextStatic();
        System.out.println("------");

        Human cristina = new Human("test@test.com", "test"); //instantiem obiecte in clasa Human
        // cristina.email = "cristina@test.com"; //atribuim valori
        cristina.verify();
        cristina.sendEmail();
        //System.out.println(cristina.getEmail());
        Human jon = new Human("test@t.com","tst"); //adaugam un obiect nou
        // jon.address = "Test Steet 123";
        //System.out.println(jon.getAdress());
        //System.out.println(jon.getEmail());
       // cristina.planet = "Earth";
       // jon.planet = "Mars";
       // System.out.println("Cristina's planet is "+cristina.planet+"Jon's planet"+jon.planet);

       Book book1 = new Book();
        Book book2 = new Book();
        book1.author = "Mihai Eminescu";
        book2.title = "Poezii";
        //se apeleaza constructorul cu 3 argumente
        Book book3 = new Book(150.00, "Marile sperante", "Marc Twain");
        System.out.println(book1.afiseaza());


        Book carte2 = new Book();
       carte2.title = "Amintiri din copilarie";
        carte2.author = "Ion Creanga";
        System.out.println(carte2.title);
        System.out.println(carte2.author);
        System.out.println(carte2.afiseaza());
        System.out.println(carte2.nume());
        System.out.println("Cartea este Mihai Eminescu");
        System.out.println(book1.getPrice());
        System.out.println(book3.afiseaza());
        staticMethod1();
        System.out.println(staticMethod2());
       // System.out.println(jon.setEmail());


        //exemple clasa sportiv-Inotator
        Inotator inotator1 = new Inotator("Popescu","Ro");
        Maratonist maratonist1 = new Maratonist("Ion","It");
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();

        System.out.println("--------");
         // Ex1 pct 7
        Animal catel = new Animal("Dog");
        Animal pisica = new Animal("Cat","alba",false);
         //Ex 1 pct 8
        catel.mananca();
        pisica.doarme();
        System.out.println(pisica.afiseaza());


         Fotbalist fotbalist1 = new Fotbalist("Mbappe","Fr");
         fotbalist1.seOdihneste();

         Masina masina1 = new Masina();
         Masina masina2 = new Masina();
         masina2.marca = "Mercedes";
        System.out.println(masina1.marca);
        System.out.println(masina2.marca);
        masina2.anFabricatie = 2023;
        System.out.println(masina1.anFabricatie);
        System.out.println(masina2.anFabricatie);

        Person diana = new Person(2,"FM","Obancea","Maria");
        diana.caracteristici();
        Person A = new Person(20,"Adi");
        System.out.println(A);

        //ex 2 pct 3
        Patruped Azorel = new Patruped();
        System.out.println(Azorel.culoare);





    }
}