package com.adriandipaulo.petapp;

public class Mascotas {
    private String nombreMascota;
    private Integer  votoMascota;
    private Integer  fotoMascota;
    private Integer id_mascota;

    public Mascotas(String nombreMascota, Integer votoMascota, Integer fotoMascota,Integer id_mascota ) {
        this.nombreMascota = nombreMascota;
        this.votoMascota = votoMascota;
        this.fotoMascota = fotoMascota;
        this.id_mascota= id_mascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getVotoMascota() {
        return votoMascota;
    }

    public void setVotoMascota(Integer votoMascota) {
        this.votoMascota = votoMascota;
    }

    public Integer getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(Integer fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public Integer getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Integer id_mascota) {
        this.id_mascota = id_mascota;
    }
}
