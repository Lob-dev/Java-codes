package notesix;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {

    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "NewYork"}));
        System.out.println(solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    public static int solution(int cacheSize, String[] cities) {
        final int CACHE_HIT = 1;
        final int CACHE_MISS = 5;
        if (cacheSize == 0) {
            return (cities.length) * CACHE_MISS;
        }
        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for (String city : cities) {
            city = city.toLowerCase();
            if (!queue.contains(city)) {
                if (queue.size() == cacheSize) {
                    queue.poll();
                }
                queue.offer(city);
                answer += CACHE_MISS;
            } else {
                queue.remove(city);
                queue.offer(city);
                answer += CACHE_HIT;
            }
        }
        return answer;
    }
}
