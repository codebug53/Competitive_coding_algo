/*Acitivity selection: Greedy Algorithm
Select the maximum number of non overlapping activities.
Example input:
Activites  start time  Finish Time
a1          5            9
a2          1            2
a3          3            4
a4          0            6  
a5          5            7
a6          8            9

Approach 1: First come first serve(fcfs)
Appraoch 2: Sort on the basis of start times
Approach 3: Sort on the baiss of finishing times

note: among three approachees the third is the preffered approach as after sorting we still go for fcfs if there is a activity which takes the whole day and then fcfs is gonna priortize that and leave the rest
if we sort by start time still we ignore the window of that activity by ignoring the finish time hence if the start time of a comparitively big activity is comes first in sorting it will priortize that activity and leave the rest
so if we go for the third approach we will consider the finish times which just means that we are prioritizing the activity which is the smallest and hence the activity which has smallest activity selected first can avail us with more window to select the activity.
*/
import java.util.*;

public class ActivitySelection {

    private static void printOrderOfSelection(String[] activities, int[] startTime, int[] finishTime, int n) {
        if (n == 0) {
            System.out.println("No activities to select.");
            return;
        }

        int i = 0;
        System.out.print(activities[i] + " ");

        for (int j = 1; j < n; j++) {
            if (startTime[j] >= finishTime[i]) {
                System.out.print(activities[j] + " ");
                i = j;
            }
        }
        System.out.println();
    }

    private static void sortOnFinishTime(String[] activities, int[] startTime, int[] finishTime, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (finishTime[j] > finishTime[j + 1]) {
                    finishTime[j] = finishTime[j] ^ finishTime[j + 1];
                    finishTime[j + 1] = finishTime[j] ^ finishTime[j + 1];
                    finishTime[j] = finishTime[j] ^ finishTime[j + 1];

                    startTime[j] = startTime[j] ^ startTime[j + 1];
                    startTime[j + 1] = startTime[j] ^ startTime[j + 1];
                    startTime[j] = startTime[j] ^ startTime[j + 1];

                    String temp = activities[j];
                    activities[j] = activities[j + 1];
                    activities[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        String[] activities = {"A1", "A2", "A3", "A4", "A5", "A6"};
        int[] startTime = {1, 3, 0, 5, 8, 5};
        int[] finishTime = {2, 4, 6, 7, 9, 9};

        System.out.println("--- Activity Selection Problem ---");
        System.out.println("Initial Activities: " + Arrays.toString(activities));
        System.out.println("Start Times: " + Arrays.toString(startTime));
        System.out.println("Finish Times: " + Arrays.toString(finishTime));
        System.out.println("----------------------------------");

        sortOnFinishTime(activities, startTime, finishTime, n);
        
        System.out.println("\nActivities Sorted by Finish Time:");
        System.out.println("Activities: " + Arrays.toString(activities));
        System.out.println("Finish Times: " + Arrays.toString(finishTime));
        System.out.println("----------------------------------");

        System.out.print("\nOrder of Selected Activities: ");
        printOrderOfSelection(activities, startTime, finishTime, n);
    }
}
