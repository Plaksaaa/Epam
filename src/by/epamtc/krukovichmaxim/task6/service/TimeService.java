package by.epamtc.krukovichmaxim.task6.service;

public class TimeService {

    public static int calculateMinutes(double seconds){
        return (int) seconds/1440;
    }

    public static int calculateHours(double seconds){
       return (int) seconds / 86400;
    }

    public static long getSeconds(double seconds){
        return (long) seconds;
    }
}
