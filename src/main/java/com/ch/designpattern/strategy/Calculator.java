package com.ch.designpattern.strategy;

public class Calculator {

    private int now = 0 ;

    private IStrategy strategy ;

    public int execute(int a , int b){
        return strategy.caculate(a,b);
    }

    public void reset(){
        this.now = 0 ;
    }

//    簡單工廠模式
    public void setStrategy(DoType doType) {
        switch (doType){
            case ADD:
                this.strategy = new Add();
                break;
            case MINUS:
               this.strategy = new Minuss();
                break;
            case DIVIDE:
                this.strategy = new Divide();
                break;
            case MULTYPLY:
               this.strategy = new Multyply();
                break;
        }
    }

    enum DoType{
        ADD , MINUS , DIVIDE , MULTYPLY
    }

}