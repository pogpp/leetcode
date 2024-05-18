package ru.pogodaev.leetcode.n380;

import java.util.*;

/**
 Implement the RandomizedSet class:

 RandomizedSet() Initializes the RandomizedSet object.
 bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 You must implement the functions of the class such that each function works in average O(1) time complexity.
 */

public class RandomizedSet {
    public static void main(String[] args) {
       var hop = new RandomizedSet();
       hop.insert(1);
       hop.remove(2);
       hop.insert(2);
       hop.getRandom();
       hop.remove(1);
        System.out.println(hop.insert(2));
       hop.getRandom();
       hop.getRandom();
       hop.getRandom();
       hop.getRandom();
       hop.getRandom();
       System.out.println(hop.getRandom());
    }
    private final Map<Integer, Integer> map;
    private final List<Integer> nums;
    private final Random random;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        this.map = new HashMap<>();
        this.nums = new ArrayList<>();
        this.random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        nums.add(val);
        map.put(val, nums.size() - 1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        if(index != nums.size() - 1){
            int last = nums.get(nums.size() - 1);
            nums.set(index, last);
            map.put(last, index);
        }
        nums.remove(nums.size() - 1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return this.nums.get(random.nextInt(nums.size()));
    }
}


