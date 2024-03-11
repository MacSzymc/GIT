
    /*
        Maciej Szymczak (113805)
        Wyszukiwanie liniowe - program za pomocą pętli While, porównuje elementy tablicy wek do momentu odnalezienia pasującego elementu.
        W przypadku znalezienia pasującego elementu, kolejna pętla While, sprawdza kolejne elementy w celu ustalenia czy jest to jedyny element w tablicy o takiej wartości.
        Pętla jest ograniczona również warunkiem porównującym zmienną pomocniczą i do wielkości tablicy, aby uniknąć błędu związanego z porównywaniem liczby do nieistniejącego elementu

        W przypadku nie znalezienia pasującego elementu, użytkownik otrzymuje odpowiedni komunikat.
        W przypadku znalezienia większej ilości elementów, użytkownik otrzymuje odpowiedni komunikat.
     */

class szukanie_liniowe {

    public static void main (String Args[]){
        //ta deklaracja jest niekonieczna - długość wektora jest określana przez ilość elementów podstawianych
        int[] wek = {7,9,12,13,14,17,45,57,89,95};
        int i = 0;
        int j = 0;
        int liczba_szukana = 14;
        int ile_razy = 1;
            
        while((i <= 9) && (wek[i] != liczba_szukana)){              // Pętla while, porównująca szukaną liczbę z elementem tabeli, oraz sprawdzająca czy tabela ma jeszcze kolejny element
            i++;
        }  // zakończenie pętli while
        j = i;
        while(j < 9 && wek[j] == wek[j+1]){                         // Pętla while, sprawdzająca występowanie znalezionego elementu w kolejnych pozycjach tablicy
            j++;
            ile_razy++;     // zmienna w której zapisuję ilość odnalezionych pozycji szukanej liczby
        }   // zakończenie pętli while
        if (i < 10){    // instrukcja warunkowa, sprawdzająca czy szukany element został odnaleziony (w1)
            System.out.println("liczba " + liczba_szukana + " znajduje się na pozycji " + (i+1));
            if (ile_razy != 1){     // instrukcja warunkowa sprawdzająca czy element wystąpił więcej niż raz (w2)
                System.out.print("Ale uwagaaa, oprócz tego występuje jeszcze "+(ile_razy-1)+" razy na kolejnych pozycjach");
            }   // zakończenie (w2)
        }       // zakończenie (w1)
        else{                       // jeżeli warunek nie spełniony, to wyświetla się odpowiedni komunikat
            System.out.println("Nie ma liczby "+ liczba_szukana +" w przeszukiwanym zbiorze");
        }       // zakończenie instrukcji else
    }   // koniec main
}   // koniec szukanie_liniowe
