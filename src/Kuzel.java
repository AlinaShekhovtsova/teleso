public class Kuzel /*implements IDefinice*/ {

     double podstava;
     double vyska;
     double polomerKuzel;
     double vyskaKuzel;

    public Kuzel(double podstava, double vyska, double polomerKuzel, double vyskaKuzel) {
        this.podstava = podstava;
        this.vyska = vyska;
        this.polomerKuzel = polomerKuzel;
        this.vyskaKuzel = vyskaKuzel;
    }

       /* public double povrch(){
            double povrchKuzele = Math.sqrt((polomerKuzel * polomerKuzel) + vyska * vyska);
            return povrchKuzele;
        }
        public int objem(){
            int mocninaR = podstava*podstava;
            int objemKuzele = (int) ((3.14*(podstava*podstava)*vyskaKuzel)/3);
            return objemKuzele;
        }

        public String informace() {
            System.out.println("Povrch kužele je " + povrch() + " a objem kužele je " + objem());
            return informace();
        }*/

}
