/*
Maciej Szymczak 113805 informatyka niestacjonarne, sem 2, grupa 8.

Algorytm generujący losowe liczby z przedziału 1 - 200. Wylosowane liczby zapisywane są do tablicy uni. Przed zapisem następuje kontrola czy dana liczba została już wcześniej wprowadzona, jeżeli tak losowanie jest ponowione. 

*/

package losowanie;

import java.util.Random;    
public class Losowanie {

    public static void main(String[] args) {    //początek 
        Random rand = new Random(); //utworzenie obiektu Random klasy rand 
        
        int k;  //zmienna kontrolna do sprawdzenia czy dana wartość wystąpiła w zbiorze
        int[] uni = new int[100];   // tablica do przechowywania wylosowanych liczb
        int wylos = 0;  // zmienna pomocnicza do tymczasowego przechowywania wylosowanej liczby -> przed sprawdzeniem
        int ile = 15;   // ilość elementów które chcemy zapisać ( do 100 zgodnie z deklaracją tablicy uni )
        System.out.println("Losowanie");
        for(int i = 0; i < ile; i++){   // pętla for zapisująca wskazaną liczbę liczb do tablicy uni
            
            if (i == 0){    // dla pierwszego wyrazu nie trzeba sprawdzać obecności duplikatów
                uni[i] = rand.nextInt(199) + 1; // losowanie
                System.out.println((i+1) +" Wylosowano : "+ uni[i]);
            }   // koniec IF
            else{   // dla pozostałych wyrazów w tablicy
                do {    // losowanie i kontrola kolejnych wyrazów tablicy
                    k = 0;
                    wylos = rand.nextInt(199) + 1;
                    for(int j = 0; j < i; j++){ // przejście po wyrazach już zapisanych w tablicy uni
                        if(wylos == uni[j]){    // kontrola duplikatów
                            k++;
                        }   //koniec IF
                    }   // koniec FOR
                    
                }   // koniec DO WHILE, po uzyskaniu braku duplikatów
                while(k != 0);
                               
                uni[i] = wylos; // zapis wylosowanej liczby do tablicy uni
                System.out.println((i+1)+" Wylosowano : "+ uni[i]);
                System.out.println("");
            }   // koniec ELSE
        }   // koniec FOR
        System.out.println("Wylosowano : ");
        for(int i = 0; i < ile; i++){   // przejście po tablicy uni, wypisanie zapisanych liczb
            System.out.println((i+1) +" : "+ uni[i]);
        }   // koniec FOR
    }//koniec MAIN
    
}//Koniec CLASS
