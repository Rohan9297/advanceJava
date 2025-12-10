package DataStrucure.queuse;

import java.util.ArrayList;
import java.util.List;

public class TimeNeddedToBuyTickets {
    public static void main(String[] args) {
        int[] arr={84,49,5,24,70,77,87,8};

        int result=timeRequiredToBuy(arr,3);
        System.out.println(result);
    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int result=0;

        while(tickets[k]!=0) {
            for (int i = 0; i < tickets.length; i++) {

                if ((tickets[i] == 0)) {
                    continue;
                } else {
                    tickets[i] = tickets[i] - 1;
                    result++;
                }
                if (i==k && tickets[k] == 0) {
                    return  result;
                }
            }
        }

        return result;
    }
}
