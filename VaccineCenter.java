/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class VaccineCenter {

    private static int appointmentID;

    public static int getAppointmentID() {
        return appointmentID;
    }

    public static void setAppointmentID(int aAppointmentID) {
        appointmentID = aAppointmentID;
    }

    private Vaccine vaccine;
    private ArrayList<Appointment> appointments = new ArrayList();

    public VaccineCenter(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public void removePassedDates() {
        for (Appointment appointment : appointments) {
            if (appointment.getDates()[0].isBefore(LocalDateTime.now())) {
                appointments.remove(appointment);
            }
        }
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public ArrayList<Appointment> getDates() {
        return appointments;
    }

    public void setDates(ArrayList<Appointment> dates) {
        this.appointments = dates;
    }

}
