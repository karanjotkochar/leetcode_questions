// https://leetcode.com/problems/meeting-rooms/

// https://neetcode.io/problems/meeting-schedule

/*
Given an array of meeting time interval objects consisting of start and
end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i),
determine if a person could add all meetings to their schedule without any conflicts.

Input: intervals = [(0,30),(5,10),(15,20)]
Output: false

Input: intervals = [(5,8),(9,15)]
Output: true
 */

import java.util.*;

class Interval {
    public int start, end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class q_252_Meeting_Rooms {
    public static void main(String[] args) {

        // List<Interval> ls1 = Arrays.asList(new Interval(0,30), new Interval(5,10), new Interval(15,20));

        List<Interval> ls = new ArrayList<>();
        ls.add(new Interval(0,30));
        ls.add(new Interval(5,10));
        ls.add(new Interval(15,20));

        canAttendMeetings(ls);
        System.out.println(canAttendMeetings(ls));

        canAttendMeetings2(ls);
        System.out.println(canAttendMeetings2(ls));
    }

    public static boolean canAttendMeetings(List<Interval> intervals) {

        int n = intervals.size();

        for (int i=0; i<n; i++) {
            // get first element
            Interval A = intervals.get(i);

            for (int j= i+1; j<n; j++) {
                // get second element
                Interval B = intervals.get(j);

                // check if first element ends after first would have started--> thus false
                if (Math.min(A.end, B.end) > Math.max(A.start, B.start))
                    return false;
            }
        }

        return true;
    }

    public static boolean canAttendMeetings2(List<Interval> intervals) {

        // sort based on start time
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

        for (int i=1; i<intervals.size(); i++) {
            // to sort 1st and 2nd: get them: i and i-1
            // if i1 ends after i2 have started: cannot attend i.e., false
            Interval i1 = intervals.get(i-1);
            Interval i2 = intervals.get(i);

            if (i1.end > i2.start)
                return false;
        }

        return true;
    }
}
