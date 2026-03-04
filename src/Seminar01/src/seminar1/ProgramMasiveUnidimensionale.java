package seminar1;

/**
 * Program Masive unidimensionale
 *
 * - citire parametri din linia de comandă
 * - utilizare funcții din clasa String
 * - utilizare funcții de conversie din clase wrapper
 * - lucrul cu masive unidimensionale
 */

public class ProgramMasiveUnidimensionale {
    static void afisare(String mesaj, int[] vector) {
        System.out.print(mesaj + ": ");
        for (int element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void incrementare(int[] vector) {
        for (int i=0;i<vector.length;i++){
            vector[i]=vector[i]+1;
        }
    }

    static int[] inserareInceput(int[] vector, int val) {
        var rezultat = new int[vector.length + 1];
        rezultat[0] = val;
        System.arraycopy(vector,0,rezultat,1,vector.length);
        return rezultat;
    }

    static int[] eliminareImpar(int[] vector) {
        int nrElemente = 0;
        for (int i : vector) {
            if(i % 2 == 0) {
                nrElemente++;
            }
        }
        var rezultat = new int[nrElemente];
        for (int i = 0, indexRezultat = 0; i<vector.length;i++){
            if (vector[i] % 2 == 0) {
                rezultat[indexRezultat] = vector[i];
                indexRezultat++;
            }
        }
        return rezultat;
    }


    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,6};
        afisare("Afisare primul vector", v1);
        incrementare(v1);
        afisare("Dupa incrementare",v1);
        v1 = inserareInceput(v1,23);
        afisare("Dupa inserare",v1);
        v1 = eliminareImpar(v1);
        afisare("Dupa eliminare nr impare",v1);
    }
}

