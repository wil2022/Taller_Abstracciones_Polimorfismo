/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccion;

/**
 * Clase de las naves tripuladas.
 *
 * @author Wilson Pachon
 */
public class MannedSpacecraft extends Spacescraft implements IManned {

    /**
     * crea una instancia de la clase MannedSpacecraft.
     *
     * @param name nombre de la nave
     * @param speed velocidad de la nave
     * @param push empuje de la nave
     * @param fuel combustible usado por la nave
     * @param weight peso de la nave
     * @param engines motores que posee la nave
     */

    public MannedSpacecraft(String name, float speed, float push, String fuel, float weight, int engines) {
        super(name, speed, push, fuel, weight, engines);
    }

    /**
     * capacidad de personas en la nave.
     *
     * @param capacity numero de personas
     * @return capacidad de personas que tiene la nave.
     */
    @Override
    public String setPeopleCapacity(int capacity) {
        return "\nCapacidad de personas: " + capacity;

    }

    /**
     * distancia a la cual orbita la nave.
     *
     * @param distance distancia en kms.
     * @return distancia orbital.
     */
    @Override
    public String setOrbitDistance(float distance) {
        return "\nla nave orbita a una distancia de " + distance + " kms.";

    }

    /**
     * Objetivo de la mision
     *
     * @param objective objetivo definido para la mision.
     * @return Mision.
     */
    @Override
    public String setMissionObjective(String objective) {
        return "\nMision: " + objective;
    }

    /**
     * Lugar de lanzamiento
     *
     * @param site lugar donde se va realizar el lanzamiento
     * @return lugar definido en el parametro del metodo.
     */
    @Override
    public String LaunchSite(String site) {
        return "\nlugar de lanzamiento establecido en " + site;
    }

    /**
     * Sobreescritura del metodo toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "tipo de nave: tripulada\n" + super.toString();
    }

}
