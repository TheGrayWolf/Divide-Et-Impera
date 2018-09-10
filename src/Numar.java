import javax.swing.JOptionPane;


class Ghiceste {
    static int contor = 0;

    public static void main(String[] args){

        int numar, MAX;

        do{
            String interval = JOptionPane.showInputDialog("Numarul maxim din interval(1 - 100000): ");
            MAX = Integer.parseInt(interval);
        }while(MAX < 1 || MAX > 100000);

        do{
            String input = JOptionPane.showInputDialog("Numarul este: ");
            numar = Integer.parseInt(input);
        }while(numar < 0 || numar > MAX);

        Cauta(0, MAX, numar);
    }

    static void Cauta(int p, int u, int x){
        contor++;
        if(p <= u){
            if((p+u)/2 < x){
                System.out.println(contor + ". Numarul tau este mai mare.");
                Cauta((p+u)/2, u, x);
            }
            else if((p+u)/2 > x){
                System.out.println(contor + ". Numarul tau este mai mic.");
                Cauta(p, (p+u)/2, x);
            }
            else if((p+u)/2 == x){
                String mesaj = "Numarul tau a fost gasit din "+ contor + " cautari.";
                JOptionPane.showMessageDialog(null, mesaj);
            }
        }
    }
}
