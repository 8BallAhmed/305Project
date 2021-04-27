/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class VaccineCenter implements Serializable {

    private static int appointmentID;
    private String name;

    public static int getAppointmentID() {
        return appointmentID;
    }

    public static void setAppointmentID(int aAppointmentID) {
        appointmentID = aAppointmentID;
    }

    private Vaccine vaccine;
    private ArrayList<Appointment> appointments = new ArrayList();

    public VaccineCenter(String name, Vaccine vaccine) throws FileNotFoundException, IOException {
        this.vaccine = vaccine;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
