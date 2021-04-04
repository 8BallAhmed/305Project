/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Ahmed
 */
public class Appointment {

    private LocalDateTime dates[];
    private Vaccine v;
    private boolean booked;
    private int appointmentID;
    private int appointmentPriority;
    private Appointee appointee;

    public Appointment(int appointmentID, Vaccine v, LocalDateTime firstVDate) {
        appointee = null;
        this.appointmentID = appointmentID;
        this.v = v;
        int DurationBetweenShots = v.getDurationBetweenShots();
        int cumulativeDuration = 0;
        dates = new LocalDateTime[v.getNumOfShots()];
        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDateTime.of(firstVDate.getYear(), (firstVDate.getMonth().getValue() + cumulativeDuration), firstVDate.getDayOfMonth(), firstVDate.getHour(), firstVDate.getMinute());
            cumulativeDuration += DurationBetweenShots;
        }

    }

    public boolean isBooked() {
        return booked;
    }

    public boolean bookAppointment(Appointee appointee) {
        if (appointee.getPriority() >= appointmentPriority) {
            setAppointee(appointee);
            booked = true;
            return true;
        } else {
            return false;
        }
    }

    public void cancelAppointment() {
        setAppointee(null);
        booked = false;
    }

    public LocalDateTime[] getDates() {
        return dates;
    }

    public void setDates(LocalDateTime[] dates) {
        this.dates = dates;
    }

    public Vaccine getV() {
        return v;
    }

    public void setV(Vaccine v) {
        this.v = v;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Appointee getAppointee() {
        return appointee;
    }

    public void setAppointee(Appointee appointee) {
        this.appointee = appointee;
    }

    public int getAppointmentPriority() {
        return appointmentPriority;
    }

    public void setAppointmentPriority(int appointmentPriority) {
        this.appointmentPriority = appointmentPriority;
    }

}
