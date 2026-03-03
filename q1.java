class PortfolioAnalyzer{

    public double[] calculateDailyProfitLoss(double[] openingPrices, double[] closingPrices){
        double[] profitLoss = new double[openingPrices.length];

        for(int i=0; i<openingPrices.length; i++){
            profitLoss[i] = closingPrices[i] - openingPrices[i];
        }

        return profitLoss;
    }
}

public class Main{
    public static void main(String[] args){
        double[] openingPrices = {10.0, 12.5, 8.0, 15.0};
        double[] closingPrices = {11.0, 13.0, 7.0, 16.0};

        PortfolioAnalyzer analyzer = new PortfolioAnalyzer();

        System.out.println("Daily Profit/Loss: ");

        for(int i=0; i<openingPrices.length; i++){
            System.out.println("Stock " + (i+1) + ": " + analyzer.calculateDailyProfitLoss(openingPrices, closingPrices)[i]);
        }


    }
}
