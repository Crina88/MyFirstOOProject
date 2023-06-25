public class Fotbalist extends Sportiv implements InterfataA{
    Abilitate abilitate;   //ex fotbalistul are o abilitate
    public Fotbalist(String name, String tara) {
        super(name, tara);
    }

    @Override
    void seAntreneaza() {

    }
    public void seOdihneste(){
        super.seOdihneste();   //cu super se apeleaza casa parinte+copil

        System.out.println("dupa un meci dificil");
    }

    @Override
    public void metodaInterfataA() {
        System.out.println("InterfataA");
    }
}
