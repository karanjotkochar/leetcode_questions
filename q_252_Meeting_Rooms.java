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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }

    public static boolean canAttendMeetings(List<Interval> intervals) {

        return false;
    }
}
