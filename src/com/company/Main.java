package com.company;

public class Main {

    public static void main(String[] args) {
                Model.x = 5;
                Model.y = 2;
                int resultSum=Controller.summ();
                int resultDifference=Controller.difference();
                int resultProduct=Controller.product();
                double resultDivision=Controller.division();
                View.displey(resultSum);
                View.displey(resultDifference);
                View.displey(resultProduct);
                View.displeyd(resultDivision);
    }
}
