/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author A-14
 */
 public class Mobil implements Kendaraan {

    private String merek;
    private String model;

    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }
    
    
    @Override
    public void info() {
        System.out.println("Mobil: " + merek + " " + model);
    }
}

