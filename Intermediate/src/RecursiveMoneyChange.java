public class RecursiveMoneyChange
{
    static void makeChange(int money)
    {
        int[] coins = {1,2,5,10,20,50,100,200,500,1000};
        //base case
        if(money == 0)
            return;

        int i;
        for(i=coins.length-1;i>=0;i--)
        {
            if(coins[i]<=money)
            {
                break;
            }
        }
        System.out.println("Pick change " + coins[i]);
        int remainMoney = money - coins[i];
        makeChange(remainMoney);
    }

    public static void main(String[] args) {
        int moneyChange = 244;
        makeChange(moneyChange);
    }
}
