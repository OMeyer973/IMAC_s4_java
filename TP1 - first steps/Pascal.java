// javac Pascal.java && time java Pascal

public class Pascal {
    public static void main(String[] args) {
    System.out.println(" Cn, p = " + pascal (30000, 250));

    }

    public static int pascal (int nBut, int pBut){
        int[] tab = new int[nBut+1];
        int n, i;

        tab[0] = 1;

        for(n=1; n<=nBut; n++){
            tab[n] = 1;

            for(i=n-1; i>0; i--)
                tab[i] = tab[i-1] + tab[i];
        }

        return tab[pBut];
    }
}

/*
$ time java Pascal
 Cn, p = -1742193024

real    0m0,272s
user    0m0,287s
sys 0m0,017s

$ time ./pascal
 Cn, p = -1742193024

real    0m1,044s
user    0m1,042s
sys 0m0,000s

différence de vitesse liée au système de 
machine virtuelle multi plateforme sur lequel java est basé.
le langage C est plus proche de la machine.
*/

