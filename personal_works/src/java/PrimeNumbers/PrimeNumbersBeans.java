/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumbers;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kageyu
 */
public class PrimeNumbersBeans implements Serializable{
    
    private ArrayList<Integer> PNs;
    private ArrayList<Integer> roops;
    private int ans;
    
    public PrimeNumbersBeans(){
        this.PNs = new ArrayList<>();
        this.roops = new ArrayList<>();
        this.ans = 0;
    }
    
    /**
     *fadagadgadg
     * @param PNs
     */
    //aartetwerrwrhsjth
    public void setPNs(ArrayList<Integer> PNs){
        this.PNs = PNs;
    }
    
    public ArrayList<Integer> getPNs(){
        return this.PNs;
    }
    
    public void setRoops(ArrayList<Integer> roops){
        this.roops = roops;
    }
    
    public ArrayList<Integer> getRoops(){
        return this.roops;
    }
    
    public int getRoopsSum(){
        int sum = 0;
        for (int roop : roops) {
            sum += roop;
        }
        return sum;
    }
    
    public int getPN(int ans){
        if(ans == 0){
            return 0;
        }else{
            return PNs.get(ans - 1);
        }
    }
    
    public int getLastPN(){
        if(ans == 0){
            return 0;
        }else{
            return PNs.get((this.ans) - 1);
        }
    }
    
    public void setAns(int ans){
        this.ans = ans;
    }
    
    public int getAns(){
        return this.ans;
    }
}
