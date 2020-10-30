
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Масксим Усков
 */


public class Main {
    public static void main(String[] args) {
        /**
         *@param k Количество вызовов
         *@param c Создание класса
         *@param A ArrayList
         *@param L LinkedList
        */
        long k=1000000;// 1kk 
        Comparison c=new Comparison();
        List A=new ArrayList();
        List L=new LinkedList();
        
        /* Заполнение списков*/
        for(int i=0; i<1000;i++){
            A.add(Math.random());
            L.add(Math.random());
        }
        
        /* Вывод Таблицы */
        System.out.print("Функция\t\t" + "Количество\t" + "ArrayList\t" + "LinkedList\t\n");
        System.out.print("add\t\t"+ k + "\t\t" + c.AddTime(k, A) + "\t\t" + c.AddTime(k, L)+ "\n");
        System.out.print("GetBegin\t"+ k+ "\t\t"+ c.GetBeginTime(k,A)+ "\t\t"+ c.GetBeginTime(k,L)+"\n");
        System.out.print("GetMiddle\t"+ 10+ "\t\t"+ c.GetMiddleTime(10,A)+ "\t\t"+ c.GetMiddleTime(10,L)+ "\t"+"\n");
        System.out.print("GetEnd\t\t"+ k+ "\t\t"+ c.GetEndTime(k,A)+ "\t\t"+ c.GetEndTime(k,L)+ "\t"+"\n");
        k=1000;
        System.out.print("DeleteBegin\t"+ k+ "\t\t"+ c.DeleteBeginTime(k,A)+ "\t\t"+ c.DeleteBeginTime(k,L)+ "\n");
        System.out.print("DeleteMiddle\t"+ k+ "\t\t"+ c.DeleteMiddleTime(k,A)+ "\t\t"+ c.DeleteMiddleTime(k,L)+ "\n");
        System.out.print("DeleteEnd\t"+ k+ "\t\t"+ c.DeleteEndTime(k,A)+ "\t\t"+ c.DeleteEndTime(k,L));

    }
}
