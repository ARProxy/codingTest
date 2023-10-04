import java.util.*;

public class cote41 {

    public static void main(String[] args) {
        String[] card1 = {"i","drink","water"};
        String[] card2 = {"to","want"};
        String[] goal = {"i","want","to","drink","water"};

        boolean isOrdered = checkOrder(card1, card2, goal);
        System.out.println(isOrdered);

        Solution41 so = new Solution41();
        System.out.println(so.solution(card1, card2, goal));
        System.out.println(so.solution1(card1, card2, goal));
        System.out.println(so.solution2(card1, card2, goal));
    }
    public static boolean checkOrder(String[] card1, String[] card2, String[] goal) {
        int lastCard1Index = -1;
        int lastCard2Index = -1;
        for(String word : goal) {
            int card1Index = indexOf(card1, word);
            int card2Index = indexOf(card2, word);

            if(card1Index != -1) {
                if(card1Index < lastCard1Index) {
                    return false;
                }
                lastCard1Index = card1Index;
            } else if(card2Index != -1) {
                if(card2Index < lastCard2Index) {
                    return false;
                }
                lastCard2Index = card2Index;
            }
        }
        return true;
    }
    public static int indexOf(String[] array, String word) {
        for(int i=0; i<array.length; i++) {
            if(array[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}

class Solution41 {

    private int card1Pointer = 0;
    private int card2Pointer = 0;

    public String solution(String[] card1, String[] card2, String[] goal) {
        for (String word : goal) {
            if (card1Pointer < card1.length && card1[card1Pointer].equals(word)) {
                card1Pointer++;
            } else if (card2Pointer < card2.length && card2[card2Pointer].equals(word)) {
                card2Pointer++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
    public String solution1(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for(String str : goal) {
            qGoal.offer(str);
        }

        for(String card : cards1) {
            qCard1.offer(card);
        }

        for(String card : cards2) {
            qCard2.offer(card);
        }

        while(!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if(str.equals(qCard1.peek())) qCard1.poll();
            else if(str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";
    }
    public String solution2(String[] cards1, String[] cards2, String[] goal) {
        List<String> card1Ary = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2Ary = new ArrayList<>(Arrays.asList(cards2));

        String answer = "Yes";
        for(String str:goal) {
            if(!card1Ary.isEmpty() && card1Ary.get(0).equals(str)) {
                card1Ary.remove(0);
            } else if(!card2Ary.isEmpty() && card2Ary.get(0).equals(str)) {
                card2Ary.remove(0);
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
