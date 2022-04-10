/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccion;

/**
 * Representa las Naves no tripuladas.
 *
 * @author Wilson Pachon
 */
public class UnmannedSpacecraft extends Spacescraft {

    /**
     * crea una instancia de la clase UnmannedSpacecraft.
     *
     * @param name nombre de la nave
     * @param speed velocidad de la nave
     * @param push empuje de la nave
     * @param fuel combustible usado por la nave
     * @param weight peso de la nave
     * @param engines motores que posee la nave
     */
    public UnmannedSpacecraft(String name, float speed, float push, String fuel, float weight, int engines) {
        super(name, speed, push, fuel, weight, engines);
    }

    /**
     * Objetivo de la mision
     *
     * @param objective objetivo definido para la mision.
     * @return Mision.
     */
    @Override
    public String setMissionObjective(String objective) {
        return "\nMision establecida: " + objective;
    }

    /**
     * Lugar de lanzamiento
     *
     * @param site lugar donde se va realizar el lanzamiento
     * @return lugar definido en el parametro del metodo.
     */
    @Override
    public String LaunchSite(String site) {
        return "\n" + site + " elegido para el lanzamiento";
    }

    /**
     * sobreescritura del metodo toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "tipo de nave: No tripulada\n" + super.toString();
    }

}
