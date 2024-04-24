//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int TotalEntreprise1 = 34;
        int TotalEntreprise2 = 0;
        int i=0;
        float[] tab = new float[TotalEntreprise1];
        int voyage=0;
        int carton=0;


        while (TotalEntreprise2<34) {
            //le dernier voyage et déchargement
            if (i>33) {
                voyage++;
                TotalEntreprise2+= carton;
                carton=0;
            }
            //chargement du camion et estimation du poids
            else if (carton<9) {
                carton++;
                i++;
                TotalEntreprise1--;
            } else {
                voyage++;
                TotalEntreprise2+= carton;
                carton=0;
            }
        }

        System.out.println(voyage);
        System.out.println(TotalEntreprise1);
        System.out.println(TotalEntreprise2);
    }
}