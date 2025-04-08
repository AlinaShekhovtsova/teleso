public class Jehlan /*implements IDefinice*/{
    double hranaDP;
    double vyskaJehlan;
    /*int obsahCtverce = hranaDP*hranaDP;
    int obsahPlast =  (hranaDP*vyskaJehlan)/2;*/

    public Jehlan(double hranaDP, double vyskaJehlan) {
        this.hranaDP = hranaDP;
        this.vyskaJehlan = vyskaJehlan;

    }



        /*public double povrch(){
            double povrchJehlan = obsahCtverce + obsahPlast;
            return povrchJehlan;
        }
        public int objem(){
            int objemJehlan = (obsahCtverce/3)*vyskaJehlan;
            return objemJehlan;
        }

        public String informace() {
            System.out.println("Povrch jehlanu je " + povrch() + " a objem jehlanu je " + objem());
            return informace();
        }*/
}
