package quizes.q2.luka_shamatava_1.geometry;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250;
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000;
        int totalExpenses;
        int otherExpenses = 7000 + 80 + 410 + 17100 + 2800;


        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println("Profit: " + profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        double totalRevenue = pricePerCoffee * numCoffeeSold;

        // Calculate total expenses
        int totalExpenses = totalCostOfBeans + otherExpenses;

        // Calculate profit
        double profitInLari = totalRevenue - totalExpenses;

        // Convert profit to Lari (if necessary)
        double profitInLAris = profitInLari / 100;


        return profitInLAris;
    }
}