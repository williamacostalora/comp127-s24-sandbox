package Lec21_Defensive_Programming;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;

/*
 * Example from the assigned reading, Item 50: Make defensive copies when needed by
 * Joshua Bloch.
 * 
 * Notes
 * - Date is mutable
 * - Date is obsolete and should no longer be used
 * - Instant, LocalDateTime, ZonedDateTime, and other java.time classes are immutable
 */
public final class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if(start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }

        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public static void main(String[] args) {
        Period p = new Period(new DateTime(), new Date(2024, 3, 10));
        System.out.println(p.getStart());
    }
}