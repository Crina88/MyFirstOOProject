public class Person {

    int varsta;
    String sex;
    String nume;
    String prenume;

    public Person(int varsta, String sex, String nume, String prenume) {
        this.varsta = varsta;
        this.sex = sex;
        this.nume = nume;
        this.prenume = prenume;
    }
    public void caracteristici(){
        System.out.println("are varsta "+varsta+" sexul "+sex+" o cheama "+nume+prenume);
    }

    public Person(int varsta, String prenume) {
        this.varsta = varsta;
        this.prenume = prenume;
    }
}

