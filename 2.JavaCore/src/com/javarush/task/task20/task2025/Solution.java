package com.javarush.task.task20.task2025;

import java.math.BigInteger;
import java.util.*;

/* 
Алгоритмы-числа
*/

public class Solution {
    public static byte con = 0;
    public static long[][] pow_matrix = new long[10][21];
    static {
        for (byte i = 0; i < 10; i++)
            for (byte j = 0; j < 21; j++)
                pow_matrix[i][j] = BigInteger.valueOf(i).pow(j).longValue();
    }
    public static Set<Long> armstrong = new TreeSet<>();

    public static int numSize(long N){
        int count = 0;
         while (N > 0 ){
             N /= 10;
             count++;
         }
         return count;
    }

    public static void numoGenerator(long N, long source) {
        int len = String.valueOf(N).length();  //numSize(N)
        int maxIndex = len - 1;
        byte[] digits = new byte[len];
        do {
            for (int i = 0; i < len; i++) {
                if (digits[i] == (i < maxIndex ? digits[i + 1] : 9)) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }
            long sum = 0;
            if ((sum = isArmstrongNum(digits)) != -1 && sum < source){
                armstrong.add(sum);
            }
        } while (digits[0] != 9);
    }

    public static long[] getNumbers(long N) {
        if (N < 1) return new long[0];

        for (long n = 1; n < N;){
            numoGenerator(n, N);
            n *= 10;
            if (n < 0) n = N;
        }

        long[] result = new long[armstrong.size()];
        int i = 0;
        for (long l : armstrong){
            result[i] = l;
            i++;
        }
        armstrong.clear();
        return result;
    }

    public static long isArmstrongNum(byte[] digs){

        long sum = 0;
        byte len = (byte) digs.length;

        for (byte b : digs){
            sum += pow_matrix[b][len];
        }

        byte[] x = decompose(sum);

        return compareNums(digs, x) ? sum : -1;

    }

    // 1 вариант сравнения цифр двух чисел через массивы
    public static boolean compareNums3(byte[] a, byte[] b){
        if (a.length == b.length){
            byte[] digs_a = new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            byte[] digs_b = new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            for (byte i = 0; i < 10; i++) {
                for (byte c1 : a) if (c1 == i ) digs_a[i]++;
                for (byte c2 : b) if (c2 == i ) digs_b[i]++;
            }
            for (byte i = 0; i < 10; i++){
                if (digs_a[i] != digs_b[i]) return false;
            }
            return true;
        }
        return false;

         /**
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b );**/

    }
    // 2 вариант сравнения цифр двух чисел через мапы. ключ - цифра, значение - частота цифры в числе
    public static boolean compareNums2(byte[] a, byte[] b){
        if(a.length == b.length){
            Map<Byte, Byte> freq_a = new HashMap<Byte, Byte>();
            Map<Byte, Byte> freq_b = new HashMap<Byte, Byte>();
            int len = a.length;

            for (int i = 0; i < len; i++){
                Byte freq1 = freq_a.get(a[i]);
                Byte freq2 = freq_b.get(b[i]);
                freq_a.put(a[i], (byte) (freq1 == null ? 1 : freq1 + 1));
                freq_b.put(b[i], (byte) (freq2 == null ? 1 : freq2 + 1));
            }
            return freq_a.equals(freq_b);
        }else return false;
    }
    // 3 вариант сравнения  - самый быстрый
    public static boolean compareNums(byte[] a, byte[] b){
        if(a.length == b.length){
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b );
        }
        return false;
    }

    // разбиваем число на массив цифр
    public static byte[] decompose(long num){

        //int count = (int) Math.ceil(Math.log10(num + 0.5));
        int count = numSize(num); //String.valueOf(num).length()
        byte[] digits = new byte[count];
        count--;
        byte i = 0;
        while (num > 0){
            digits[count - i] = (byte) (num % 10);
            num /= 10;
            i++;
        }
        return digits;
    }

    // сокращаем число проверок, отсеиваем числа, у которых предыдущая > последующей цифры за искл. 0
    public static boolean toCheck(byte[] digits){
        byte d = 0;
        for (byte b : digits){
            if (d <= b || b == 0) {
                d = b;
            }else return false;
        }
        return true;
    }



    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(99)));
        //System.out.println(Arrays.toString(decompose(12598763)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        armstrong.clear();
        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        //System.out.println(Arrays.toString(decompose(123)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
