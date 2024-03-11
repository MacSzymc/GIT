package com.mycompany.scalanie;
/* 
Maciej Szymczak 113805

Algorytm scalający dwa posortowane wektory. Na początek następuje kontrola wielkości wektora po scaleniu - czy nie będzie
większy niż zadeklarowany. Następnie kolejno sprawdzane są poszczególne wartości wektora pierwszego w stosunku do wartości drugiego
i wstawiane od najmniejszego do wektora wynikowego.
*/

public class Scalanie {

    public static void main(String[] args) {
    int[] wek1 = {13,57,89,95,100,200};
    int[] wek = {25,56,58,67,69,70,76,102,110}; 
    int[] scal = new int[100];
    int lengthwek = wek.length;
    int lengthwek1 = wek1.length;
    int lengthscal = scal.length;
    int weki = 0;
    int wek1i = 0;
    int wartwek = wek[0];
    int wartwek1 = wek1[0];
    
    if ((lengthwek + lengthwek1) <= lengthscal){                                //warunek1
        for(int i = 0; i<(lengthwek + lengthwek1); i++){                        //pętla for1
            if(wartwek <= wartwek1){                                            //warunek2
                if(wartwek != 0){                                               //warunek3
                    scal[i] = wartwek;                                          
                        if(weki < lengthwek-1){                                 //warunek4
                            wartwek = wek[weki + 1];                            
                            weki++;
                        }                                                       //koniec warunek4
                        else{                                                   //else4
                            wartwek = 0;
                        }                                                       //koniec else4
                }                                                               //koniec warunek3
                else{                                                           //else3
                    scal[i] = wartwek1;
                    if(wek1i < lengthwek1-1){                                   //warunek5
                        wartwek1 = wek1[wek1i + 1];
                        wek1i++;
                    }                                                           //koniec warunek5
                    else{                                                       //else5
                        wartwek1 = 0;
                    }                                                           //koniec else5
                }                                                               //koniec else3
            }                                                                   //koniec warunek2
            else if(wartwek1 < wartwek){                                        //elseif do warunek2
                scal[i] = wartwek1;
                    if(wartwek1 !=0){                                           //warunek6    
                        if(wek1i < lengthwek1-1){                               //warunek7
                            wartwek1 = wek1[wek1i + 1];
                            wek1i++;
                        }                                                       //koniec warunek7
                        else{                                                   //else6
                            wartwek1 = 0;
                        }                                                       //koniec else6
                    }                                                           //koniec warunek6
                    else{                                                       //else7                                          
                        scal[i] = wartwek;
                        if(weki < lengthwek-1){                                 //warunek8
                            wartwek = wek[weki + 1];
                            weki++;
                        }                                                       //koniec warunek8
                        else{                                                   //else8
                            wartwek = 0;
                        }                                                       //koniec else8
                    }                                                           //koniec else7
            }                                                                   //koniec elseif
            else{                                                               //else do warunek2
                scal[i] = 0;
            }                                                                   //koniec else do warunek2
       
        }                                                                       //koniec pętli for
        for(int j = 0; j < lengthwek + lengthwek1; j++){                        //pętla do wypisania wyniku
            System.out.println(scal[j]);
        }                                                                       //koniec pętli do wypisania wyniku
    }                                                                           //koniec warunek1
    else{                                                                       //else do warunek1
        System.out.print("za duże wektory");
    }                                                                           //koniec else do warunek1
    }                                                                           //koniec main
}                                                                               //koniec class scalanie
