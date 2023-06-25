public class Animal implements Vietate{
    String nume;
    String culoare;
    boolean vegetarian;

    public Animal() {
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;

    }

    //1 constructor cu un parametru
    public Animal(String nume) {
        this.nume = nume;
    }

    //constructor cu 3 parametri
    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    //getteri-3 ex4
    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
    //setteri-3

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    //ex 5
    public void mananca() {
        System.out.println(getNume() + " mananca");

    }

    public void doarme() {
        System.out.println(getNume() + " doarme");
    }

    //ex 6
    public String afiseaza() {
        String culoareAnimal = getNume() + " are culoarea " + getCuloare();
        return culoareAnimal;
    }

    //ex 9
    private int nrPicioare;
    private String undeTraieste;

    //ex 10
    //getter
    public int getNrPicioare() {
        return nrPicioare;
    }

    public String getUndeTraieste() {
        return undeTraieste;
    }
    //setteri

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    //constuctor
    public Animal(int nrPicioare, String undeTraieste) {
        this.nrPicioare = nrPicioare;
        this.undeTraieste = undeTraieste;

    }


    @Override
    public void metodaInterfata() {

    }
}

