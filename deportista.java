/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author stealingcrack
 */
public class deportista {
    class Deportista(Persona):
    def __init__(self, nombre, edad, deporte):
        super().__init__(nombre, edad)
        self.deporte = deporte

    def obtener_informacion_personal(self):
        super().obtener_informacion_personal()
        print("Deporte: ", self.deporte)    
    

}



