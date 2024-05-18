package ru.pogodaev.leetcode.n120;

/**
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station.
 * You begin the journey with an empty tank at one of the gas stations.
 * <p>
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction,
 * otherwise return -1. If there exists a solution, it is guaranteed to be unique
 */
public class GasStation {
    //Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
    //Output: 3
    //Explanation:
    //Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
    //Travel to station 4. Your tank = 4 - 1 + 5 = 8
    //Travel to station 0. Your tank = 8 - 2 + 1 = 7
    //Travel to station 1. Your tank = 7 - 3 + 2 = 6
    //Travel to station 2. Your tank = 6 - 4 + 3 = 5
    //Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
    //Therefore, return 3 as the starting index.
    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }

        int len = gas.length;
        int sum = 0;
        int total = 0;
        int index = 0;

        for (int i = 0; i < len; i++) {
            sum += gas[i] - cost[i];
            System.out.println("sum " + sum);
            if (sum < 0) {
                System.out.println("in negative sum total " + total);
                total += sum;
                sum = 0;
                index = i + 1;
                System.out.println("index " + index);
            }
        }
        System.out.println("\n total " + total + "\n sum " + sum);
        total += sum;
        return (total >= 0) ? index : -1;
    }
}
