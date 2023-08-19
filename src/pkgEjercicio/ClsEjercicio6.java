package pkgEjercicio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {

    private String nombre;

    private double sueldo_base; //3500

    private double descuentos; //500

    private double sueldo_liquido; //la resta entre sb y descuentos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    //ingresos y calculos

    public void {ejercicio() {
        ClsEjercicio6 ej = new ClsEjercicio6();
        List<ClsEjercicio6> lista = new ArrayList<>();
        ej.setNombre("Juan ");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        lista.add(ej);

        ej.setNombre("Carlos");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        lista.add(ej);

        ej.setNombre("Mariano");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        lista.add(ej);

        for (ClsEjercicio6 e: lista){
            
        }
    }



}
