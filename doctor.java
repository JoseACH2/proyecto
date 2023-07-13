/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author stealingcrack
 */
public class doctor {
    class Doctor(Persona):
    def __init__(self, nombre, edad, especialidad):
        super().__init__(nombre, edad)
        self.especialidad = especialidad

    def obtener_informacion_personal(self):
        super().obtener_informacion_personal()
        print("Especialidad: ", self.especialidad)
}
