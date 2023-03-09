package javaHomework3.gb;

//  1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int n = 20;
        int i = 1;
        System.out.print( "Список нечетных целых чисел: " );
        while (i <= n) {
            if (i % 2 == 1) {
                System.out.print( i + "  " );
            }
            i++;
        }
        System.out.println();
    }

}