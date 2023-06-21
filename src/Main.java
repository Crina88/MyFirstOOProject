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
        Inotator inotator1 = new Inotator();
        Maratonist maratonist1 = new Maratonist();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();

        System.out.println("--------");

        Animal catel = new Animal("Azorel");
        Animal pisica = new Animal("Cat","alba",false);

        catel.mananca();
        pisica.doarme();
        System.out.println(pisica.afiseaza());



    }
}