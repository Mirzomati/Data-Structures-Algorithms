package dsa_01_ArraysAndAlgoAnalysis;

import java.util.ArrayList;

public class NumOfPeopleInBus {

    public static void main(String[] args) {


        ArrayList<int[]> busStops = new ArrayList<int[]>();
        busStops.add(new int[] {10,0});
        busStops.add(new int[] {3,5});
        busStops.add(new int[] {2,5});

        System.out.println(countPassengers(busStops));
        System.out.println(countPassengers2(busStops));
    }

    public static int countPassengers(ArrayList<int[]> stops) {

       int numOfPassengers=0;

        numOfPassengers =  stops.stream()
               .map(eachStop -> eachStop[0]-eachStop[1])
               .mapToInt(Integer::intValue)
               .sum();

       return numOfPassengers;

    }

    public static int countPassengers2(ArrayList<int[]> stops) {

        int numOfPeople=0;
        for (int i = 0; i < stops.size(); i++){
            numOfPeople = numOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }

        return numOfPeople;

    }
}
