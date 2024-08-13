ALGORITHME InsertionSort
VAR
    arr : TABLEAU ENTIERS;
    n, i, j, mot : ENTIER;
DEBUT
    Lire(arr);
    n := longueur(arr);  // La taille du tableau
    
    POUR i DE 1 A n-1 FAIRE
        mot := arr[i];
        j := i - 1;
        
        
        TANT QUE (j >= 0 ET arr[j] > mot) FAIRE
            arr[j + 1] := arr[j];
            j := j - 1;
        FIN_TANT_QUE
        arr[j + 1] := mot;
    FIN_POUR
    Ecrire(arr);
FIN
