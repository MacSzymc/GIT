package com.mycompany.wstawianie;

/*
    Maciej Szymczak 113805
    Algorytm wstawia wybraną w zmiennej liczba_dopisywana liczbę, do tablicy wek. Sprawdza czy liczba nie będzie ostatnią, pierwszą,
    oraz czy liczby nie powtarzają się jedna po drógiej. Aby umieścić dopisywaną liczbę w odpowiednim miejscu, w przejściu od końca, 
    zamienia liczbę przedostatnią sprawdzaną, na obecną a w miejsce obecnej wstawia liczbę dodawaną. 
*/
public class Wstawianie {

public static void main (String Args[]) {
int ilw = 15; //długość wektora -ta deklaracja jest niekonieczna - długość wektora jest określana przez ilość elementów podstawianych
int ilwyk = 10; //tu pamiętamy jaka część wektora jest na poczatku wykorzystana - ile mamy danych
int[] wek = {6,8,11,14,14,18,46,59,88,97,0,0,0,0,0};
int liczba_dopisywana = 12; //tu testujemy różne liczby
int i = ilw - 1; //zmienna pomocnicza

while(((liczba_dopisywana < wek[i]) || (wek[i] == 0))){ //warunki pętli while
    if(wek[i] == 0 && wek[i-1] != 0){                   //przypadek liczba_dopisywana największa w zbiorze
        wek[i] = liczba_dopisywana;
        i--;
    }   //if
    else if(i == 0){                                    //przypadek liczb_dopisywana najmniejsza w zbiorze
        wek[1] = wek[0];
        wek[0] = liczba_dopisywana;
    }   //else
    else{                                               
        if(i > (ilwyk - 1)){
            i--;
        }   //if
        else{
            wek[i+1] = wek[i];
            wek[i] = liczba_dopisywana;
            i--;
        }   //else
    }   //else
    
}
for (int j = 0; j < ilw; j++){                          //Wyświetlenie tablicy po zmianach
    System.out.println("wek["+j+"] = "+wek[j]);
}  //for
}  //main	
}  //wstawianie
