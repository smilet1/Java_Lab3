/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Максим Усков
 */
import java.util.*;

public class Comparison {
/**
 * Рассчитывает время вызова функции add
 * @return Время выполнения функции add
 * @param k Количество вызовов
 * @param A Лист
*/
    public long AddTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (long i=0;i<k;i++){
            A.add(Math.random());
        }
        return System.currentTimeMillis()-startTime;
    }
/**
 * Рассчитывает время вызова функции get для первого элемента
 * @return Время выполнения функции get для первого элемента
 * @param k Количество вызовов
 * @param A Лист
*/
    public long GetBeginTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (int i=0;i<k;i++){
            A.get(0);
        }
        return System.currentTimeMillis()-startTime;
    }
/**
 * Рассчитывает время вызова функции get для среднего элемента
 * @return Время выполнения функции get для среднего элемента
 * @param k Количество вызовов
 * @param A Лист
*/
    public long GetMiddleTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (long i=0;i<k;i++){
            A.get((A.size()-1)/2);
        }
        return System.currentTimeMillis()-startTime;
    }
/**
 * Рассчитывает время вызова функции get для последнего элемента
 * @return Время выполнения функции get для последнего элемента
 * @param k Количество вызовов
 * @param A Лист
*/
    public long GetEndTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (long i=0;i<k;i++){
            A.get(A.size()-1);
        }
        return System.currentTimeMillis()-startTime;
    }
/**
 * Рассчитывает время вызова функции remove для первого элемента
 * @return Время выполнения функции remove для первого элемента
 * @param k Количество вызовов
 * @param A Лист
*/
    public long DeleteBeginTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (long i=0;i<k;i++){
            List A1=A;
            A1.remove(0);
        }
        return System.currentTimeMillis()-startTime;
    }
/**
 * Рассчитывает время вызова функции remove для среднего элемента
 * @return Время выполнения функции remove для среднего элемента
 * @param k Количество вызовов
 * @param A Лист
*/
    public long DeleteMiddleTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (long i=0;i<k;i++){
            List A1=A;
            A1.remove((A.size()-1)/2);
        }
        return System.currentTimeMillis()-startTime;
    }
/**
 * Рассчитывает время вызова функции remove для последнего элемента
 * @return Время выполнения функции remove для последнего элемента
 * @param k Количество вызовов
 * @param A Лист
*/
    public long DeleteEndTime(long k, List A){
        long startTime = System.currentTimeMillis();
        for (long i=0;i<k;i++){
            List A1=A;
            A1.remove(A.size()-1);
        }
        return System.currentTimeMillis()-startTime;
    }
}
