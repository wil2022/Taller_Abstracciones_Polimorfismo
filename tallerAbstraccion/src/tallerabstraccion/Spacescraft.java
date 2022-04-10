/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccion;

/**
 * Representa atributos y metodos genericos para las naves espaciales.
 *
 * @author Wilson Pachon
 */
public abstract class Spacescraft {

    /**
     * Atributos definidos para la clase.
     */
    private String name;
    private float speed;
    private float push;
    private String fuel;
    private float weight;
    private int engines;

    /**
     * define parametros para la creacion de una instancia.
     *
     * @param name nombre de la nave
     * @param speed velocidad de la nave
     * @param push empuje de la nave
     * @param fuel combustible usado por la nave
     * @param weight peso de la nave
     * @param engines motores que posee la nave
     */
    public Spacescraft(String name, float speed, float push, String fuel, float weight, int engines) {
        this.name = name;
        this.speed = speed;
        this.push = push;
        this.fuel = fuel;
        this.weight = weight;
        this.engines = engines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getPush() {
        return push;
    }

    public void setPush(float push) {
        this.push = push;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    /**
     * sobreescritura del metodo toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "nombre: " + name + "\nvelocidad: " + speed + " kms/h " + "\nempuje: " + push + "\ncombustible: " + fuel + "\npeso: " + weight + "\nmotores: " + engines;
    }

    /**
     * Objetivo de la mision
     *
     * @param objective objetivo definido para la mision.
     * @return Mision.
     */
    public abstract String setMissionObjective(String objective);

    /**
     * Lugar de lanzamiento
     *
     * @param site lugar donde se va realizar el lanzamiento
     * @return lugar definido en el parametro del metodo.
     */
    public abstract String LaunchSite(String site);

}
