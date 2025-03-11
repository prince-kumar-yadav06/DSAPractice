import java.util.*;

public class StockBuyandSell{

    public static void sol(int price[],int N){

        int Maxprofit=0;

        for(int i=0;i<N-1;i++){

           if(price[i] <price[i+1]){
           Maxprofit += price[i+1]-price[i];
        }
    }
    System.out.println(Maxprofit);
}
    public static void main(String args[]){
        int prices[] = {4, 2, 2, 2, 4};
        int N=prices.length;

        sol(prices, N);
    }
}
