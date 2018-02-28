package hitro.a5x5assistant;

/**
 * Created by rohit on 1/3/2017.
 */

public class HistoryA {

    private double squat, bench, row;
    private String date, workout;
    private boolean squatDone, benchDone, rowDone;

    public HistoryA() {  }

    public HistoryA(String date, double squat, double bench, double row, boolean squatDone,
                   boolean benchDone, boolean rowDone) {

        this.date = date;
        this.workout = "A";
        this.squat = squat;
        this.bench = bench;
        this.row = row;
        this.squatDone = squatDone;
        this.benchDone = benchDone;
        this.rowDone = rowDone;
    }

    /* getters */
    public String getDate() {
        return date;
    }
    public double getSquat() {
        return squat;
    }
    public double getBench() {
        return bench;
    }
    public double getRow() {
        return row;
    }
    public boolean getSquatDone() {
        return squatDone;
    }
    public boolean getBenchDone() {
        return benchDone;
    }
    public boolean getRowDone() { return rowDone; }



}