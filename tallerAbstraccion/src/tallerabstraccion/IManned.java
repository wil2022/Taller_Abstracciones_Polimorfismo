/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccion;

/**
 * Interfaz para definir metodos para la clase MannedSpacecraft.
 *
 * @author Wilson Pachon
 */
public interface IManned {

    /**
     * Establecer la capacidad de personas de la nave.
     *
     * @param capacity numero de personas.
     * @return capacidad
     */
    public String setPeopleCapacity(int capacity);

    /**
     * Establecer la distancia a la que orbita la nave.
     *
     * @param distance distancia en kms.
     * @return distancia
     */
    public String setOrbitDistance(float distance);

}
