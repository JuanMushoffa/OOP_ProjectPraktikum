/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.Overload_Override;

/**
 *
 * @author juann
 */
public class Manager extends Karyawan{
    
    public Manager(double gajiDasar) {
        super(gajiDasar);
    }
    @Override
    public double hitungTunjangan() {
        return gajiDasar * 0.2 + 400000;
    }
}
