/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test400;

import java.io.Serializable;
/**
 *
 * @author kageyu
 */
public class Test400Beans implements Serializable{
    //問題出力用
    private int ans;
    private int x;
    private int y;
    private int nextX;
    private int nextY;
    //出題範囲指定用
    private int QXMin;
    private int QXMax;
    private int QYMin;
    private int QYMax;
    //正答数カウント用
    private int sumOfCorrect;
    private int sumOfQuestion;
    
    
    public Test400Beans(){
        ans = 0;
        x   = 0;
        y   = 0;
        nextX   = 0;
        nextY   = 0;
        
        QXMin = 1;
        QXMax = 20;
        QYMin = 1;
        QYMax = 20;
    
        sumOfCorrect = 0;
        sumOfQuestion = 0;
    }
    
    //基本的なsetter
    public void setAns  (int ans)  {        this.ans = ans;    }
    public void setX    (int x)    {        this.x = x;    }
    public void setY    (int y)    {        this.y = y;    }
    public void setNextX(int nextX){        this.nextX = nextX;    }
    public void setNextY(int nextY){        this.nextY = nextY;    }
    public void setQXMin(int QXMin){        this.QXMin = QXMin;    }
    public void setQXMax(int QXMax){        this.QXMax = QXMax;    }
    public void setQYMin(int QYMin){        this.QYMin = QYMin;    }
    public void setQYMax(int QYMax){        this.QYMax = QYMax;    }
    public void setSOC  (int SOC)  {        this.sumOfCorrect = SOC;    }
    public void setSOQ  (int SOQ)  {        this.sumOfQuestion = SOQ;    }
    //基本的なgetter
    public int get(){        return ans;    }
    public int getX(){        return x;    }
    public int getY(){        return y;    }
    public int getNextX(){        return nextX;    }
    public int getNextY(){        return nextY;    }
    public int getQXMin(){        return QXMin;    }
    public int getQXMax(){        return QXMax;    }
    public int getQYMin(){        return QYMin;    }
    public int getQYMax(){        return QYMax;    }
    public int getSOC(){        return sumOfCorrect;    }
    public int getSOQ(){        return sumOfQuestion;    }
    //計算して値を返すgetter
    public boolean getTF(){        
        return x * y == ans;
    }
    
}
