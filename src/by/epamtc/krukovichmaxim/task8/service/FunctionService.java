package by.epamtc.krukovichmaxim.task8.service;

public class FunctionService {

    public double calculateFunction(double x){
        if (x >= 3){
            return calculateFirstWay(x);
        } else {
            return calculateSecondWay(x);
        }
    }

    private double calculateFirstWay(double x){
        return (double) Math.pow(-x, 2) + 3 * x + 9;
    }

    private double calculateSecondWay(double x){
       return (double) 1/(Math.pow(x, 3) - 6);
    }
}
