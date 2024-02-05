import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Homework12Program {

    public static  final int ticketsLength = 7;
    public static void main(String[] args) {
        Random random = new Random();

        int[] pcLotteryTicket = initializeTicket(ticketsLength);
        int[] playerLotteryTicket = initializeTicket(ticketsLength);

        Arrays.sort(pcLotteryTicket);
        Arrays.sort(playerLotteryTicket);

        System.out.println(Arrays.toString(pcLotteryTicket));
        System.out.println(Arrays.toString(playerLotteryTicket));

        int count = 0;

        for (int i = 0; i < ticketsLength; i++) {
            if(pcLotteryTicket[i] == playerLotteryTicket[i]){
                count++;
            }
        }

        System.out.println("Number of matches = " + count);
    }

    public static int[] initializeTicket(int ticketsLength){
        Random random = new Random();
        int[] ticket = new int[ticketsLength];
        for (int i = 0; i < ticketsLength; i++) {
            ticket[i] = random.nextInt(10);
        }
        return ticket;
    }
}
