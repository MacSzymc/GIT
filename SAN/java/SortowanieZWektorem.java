/*
Maciej Szymczak 113805
Algorytm sortowania z wykorzystaniem wektora pomocniczego ( w zasadzie dwóch ). W trakcie działania programu, każdy element
ma przypisane 1 w wektorze pomocniczym. Kolejnym etapem, jest sprawdzanie czy dana liczba jest mniejsza od pierwszej
z przypisaną 1 w wektorze początkowym. Po sprawdzeniu dla całego wektora pierwotnego, liczba która pozostała jako najmniejsza
jest przepisywana do wektora końcowego.
*/

package sortowaniezwektorem;

public class SortowanieZWektorem {

    public static void main(String[] args) {
        
        int[] pierwotny = {2, 5, 1, 20, 13, 200, 184, 159, 0, 11, 22, 100, 44, 39, 99}; //deklaracja wektora do posortowania
        int a = pierwotny.length;   
        int[] pomocniczy = new int[a];  // wektor do zapisu 1 jeśli jeszcze nie przepisany i 0 jeśli już przepisany
        int[] koncowy = new int[a]; // wektor z wynikiem sortowania
        int b = 0;
        int c = 0;
        System.out.println("zapis 1 w pomocniczej");
        for(int i = 0; i < a; i++){ //przydzielenie 1 do wektora pomocniczego o dopasowanej wielkości
            pomocniczy[i] = 1;

           
        }//koniec for
       
        for(int i = 0; i < a; i++){ // pętla wpisująca wynik do wektora końcowego
            
            int k = 0;
            while(pomocniczy[k] == 0){  // wyszukanie pierwszej liczby która do tej pory nie była przepisana
                k++;
            }   // koniec while
            b = pierwotny[k]; // przypisanie do zmiennej b pierwszej liczby wcześniej nie przepisanej
            
            
            for(int j = 0; j < a; j++){ // for do przejścia po wektorze początkowym w poszukiwaniu najmniejszej dostępnej wartości
                if(pierwotny[j]<=b){ // kontrola czy b jest mniejsze od kolejnego elementu
                    if(pomocniczy[j] != 0){ // kontrola czy element był wcześniej użyty
                        b = pierwotny[j];
                        c = j;

                    }// koniec if
                    
                } //koniec if
                
            } //koniec for
            koncowy[i] = b;
            pomocniczy[c] = 0;
        } // koniec for
        
        for(int i = 0; i < a; i++){ // wypisanie wyniku
            System.out.println(koncowy[i]);
        }// koniec for
        
    }// koniec main
    
} // koniec class
