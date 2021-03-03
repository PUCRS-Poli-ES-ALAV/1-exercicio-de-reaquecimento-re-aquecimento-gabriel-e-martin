package br.pucrs.alav;

public class Recursion {

    public static void main(String args[]){
    }

    public static int MultiplicaNaturais(int x, int y){
        if (y <= 0) return 0;
        return x + MultiplicaNaturais(x,y-1);
    }

    public static int SomaNaturais(int x, int y){
        if(y <= 0) return x;
        return 1 + SomaNaturais(x,y-1);
    }

    public static double SomaFracoes(int x){
        if(x <= 1) return 1;
        return 1/x + SomaFracoes(int x-1);
    }


}
