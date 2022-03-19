/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul4;

/**
 *
 * @author dedyh
 */
public class SimpleDataBase {
     private data T ;
    public SimpleDataBase(String T) {
        this.T = new data(T);
    }
    
    public void printALLData(){
        System.out.printf("Data yang tersimpan adalah: %s",this.T.dat);
    }

    public static void main(String[] args) {
        SimpleDataBase storeDatax = new SimpleDataBase("Data 1 berisi: 13");
         SimpleDataBase inputDatesx = new SimpleDataBase("yang disimpan pada waktu UTC: 3/10/2022 5:32:01 AM");
        
        SimpleDataBase storeDatay = new SimpleDataBase("Data 2 berisi: 02");
         SimpleDataBase inputDatesy = new SimpleDataBase(" yang disimpan pada waktu UTC: 3/10/2022 5:32:02 AM");
        SimpleDataBase storeDataz = new SimpleDataBase("Data 3 berisi: 04");
         SimpleDataBase inputDatesz = new SimpleDataBase("yang disimpan pada waktu UTC: 3/10/2022 5:32:02 AM");
        storeDatax.printALLData();
         storeDatay.printALLData();
         storeDataz.printALLData();
    }
}
