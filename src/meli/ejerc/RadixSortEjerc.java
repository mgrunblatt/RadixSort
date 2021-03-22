package meli.ejerc;

import meli.ejerc.StringUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc {
    public static void radixSort(int[] arr) {

        String cadena [] = StringUtil.toStringArray(arr);
        String auxStringArray [] = new String [cadena.length];
        ArrayList<String> cadenaArrayList = new ArrayList<>();

        int cantDigitos=StringUtil.maxLength(cadena);

        StringUtil.lNormalize(cadena, '0');

        int recorridos = cantDigitos;
        int contador=0;
        while(contador<recorridos) {
            for (int digitos = 0; digitos < 10; digitos++) {
                for (int i = 0; i < cadena.length; i++) {
                    if (cadena[i].charAt((cantDigitos - 1) - contador) == 48 + digitos) {
                        cadenaArrayList.add(cadena[i]);
                    }
                }
            }
            for (int i = 0; i < cadenaArrayList.size(); i++) {
                auxStringArray[i] = new String((cadenaArrayList.get(i)));
            }
            cadena = auxStringArray;
            cadenaArrayList.clear();
            contador++;
        }

        for (int i=0; i< auxStringArray.length;i++){
            System.out.println(auxStringArray[i] );
        }

        int intArratAux [] = StringUtil.toIntArray(auxStringArray);

        for (int i =0; i<intArratAux.length; i++){
            arr[i]= intArratAux[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8,10,1120};
        radixSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }
}
