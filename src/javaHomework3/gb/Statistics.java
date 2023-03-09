package javaHomework3.gb;

import java.util.*;

//  2. Задан целочисленный список ArrayList.
//  Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Statistics {
    public static void main(String[] args) {
        int n;
        IntSummaryStatistics obj = new IntSummaryStatistics();
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner( System.in );
        System.out.println( "How many integers you want to add? " );
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println( "Enter " + (i + 1) + " element." );
            list.add( sc.nextInt() );
        }
        sc.close();
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            obj.accept( iterator.next() );
        }
        System.out.println( obj.toString() );
    }
}
