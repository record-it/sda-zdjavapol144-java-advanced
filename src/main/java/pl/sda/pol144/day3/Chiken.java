package pl.sda.pol144.day3;

public class Chiken {
    private String dna;

    private int counter;
    public class Egg{
        public Egg() {
            counter++; // możemy odwołać się do pola instancyjnego klasy zewnętrznej!!!
            dna = Chiken.this.dna;
        }

        private String dna;
    }

    public Egg makeEgg(){
        // counter++; to już jest niepotrzebne, bo robi to w konstruktorze Egg
        // egg.dna = dna;
        Egg egg = new Egg();
        return egg;
    }

}
