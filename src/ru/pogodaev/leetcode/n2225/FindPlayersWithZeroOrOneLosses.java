package ru.pogodaev.leetcode.n2225;

import java.util.*;

/**
 * You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player
 * winneri defeated player loseri in a match.
 * Return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all players that have not lost any matches.
 * answer[1] is a list of all players that have lost exactly one match.
 * The values in the two lists should be returned in increasing order.
 * <p>
 * Note:
 * <p>
 * You should only consider the players that have played at least one match.
 * The testcases will be generated such that no two matches will have the same outcome.
 */

public class FindPlayersWithZeroOrOneLosses {

    public static void main(String[] args) {
        //[[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
        var input = new int[][]{{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        findWinners(input);
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>(), oneLoss = new HashSet<>(),
                moreLosses = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            // Add winner.
            if (!oneLoss.contains(winner) && !moreLosses.contains(winner)) {
                zeroLoss.add(winner);
            }
            // Add or move loser.
            if (zeroLoss.contains(loser)) {
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            } else if (oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLosses.add(loser);
            } else if (moreLosses.contains(loser)) {
                continue;
            } else {
                oneLoss.add(loser);
            }
        }

        List<List<Integer>> answer =
                Arrays.asList(new ArrayList<>(), new ArrayList<>());
        answer.get(0).addAll(zeroLoss);
        answer.get(1).addAll(oneLoss);
        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }
}
