/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccion;

/**
 * Representa los Vehiculos Lanzadera.
 *
 * @author Wilson Pachon
 */
public class ShuttleVehicles extends Spacescraft {

    private int useful_load;

    /**
     * crea una instancia de la clase ShuttleVehicles.
     *
     * @param name nombre de la nave
     * @param speed velocidad de la nave
     * @param push empuje de la nave
     * @param fuel combustible usado por la nave
     * @param weight peso de la nave
     * @param engines motores que posee la nave
     * @param load carga util de la nave.
     */
    public ShuttleVehicles(String name, float speed, float push, String fuel, float weight, int engines, int load) {
        super(name, speed, push, fuel, weight, engines);
        this.useful_load = load;
    }

    /**
     *
     * @return valor almacenado en la variable useful_load
     */
    public int getUseful_load() {
        return useful_load;
    }

    /**
     * establece la carga util de la nave.
     *
     * @param load cantidad de carga util.
     */
    public void setUseful_load(int load) {
        this.useful_load = load;
    }

    /**
     * Objetivo de la mision
     *
     * @param objective objetivo definido para la mision.
     * @return Mision.
     */

    @Override
    public String setMissionObjective(String objective) {
        return "el objetivo de la mision es: " + objective;
    }

    /**
     * Lugar de lanzamiento
     *
     * @param site lugar donde se va realizar el lanzamiento
     * @return lugar definido en el parametro del metodo.
     */
    @Override
    public String LaunchSite(String site) {
        return "lugar de lanzamiento: " + site;
    }

    /**
     * sobreescritura del metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "tipo de nave: lanzadera\n" + super.toString() + "\ncarga util: " + useful_load + " toneladas";
    }

}
