public class EEAlgorithmus {

    int hauptzahl;
    int modulo;

    public EEAlgorithmus(int hauptzahl, int modulo) {
        this.hauptzahl = hauptzahl;
        this.modulo = modulo;
    }

    public int ggTBestimmung(){
        int divident = this.hauptzahl;
        int divisor = this.modulo;
        int rest = divident % divisor;

        while ((divident % divisor) != 0){
                rest = divident % divisor;
                divident = divisor;
                divisor = rest;
        }
        return rest;
    }

    public void printGGT(){
        System.out.println("ggT(" + this.hauptzahl + ", " + this.modulo + ") = " + this.ggTBestimmung());
    }

}
