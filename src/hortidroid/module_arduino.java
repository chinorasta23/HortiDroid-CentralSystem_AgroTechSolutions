/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hortidroid;

/**
 *
 * @author dooha
 */

public class module_arduino {
     int tempFila1;
     int tempFila2;
     int tempFila3;
     int tempFila4;
    
     int phSueloFila1;
     int phSueloFila2;
     int phSueloFila3;
     int phSueloFila4;
    
     int humedadFila1;
     int humedadFila2;
     int humedadFila3;
     int humedadFila4;
    
     int promedioHumedad = (humedadFila1 + humedadFila2 + humedadFila3 + humedadFila4) / 4;
     int promedioTemperatura = (tempFila1 + tempFila2 + tempFila3 + tempFila4) / 4;
     int promedioPH = (phSueloFila1 + phSueloFila2 + phSueloFila3 + phSueloFila4) / 4;
    
     String F1Est = "Germinacion";
     String F2Est = "Germinacion";
     String F3Est = "Germinacion";
     String F4Est = "Germinacion";
    
    public module_arduino(int tempFila1, int tempFila2, int tempFila3, int tempFila4, int phSueloFila1, int phSueloFila2, int phSueloFila3, int phSueloFila4, int humedadFila1, int humedadFila2, int humedadFila3, int humedadFila4, int promedioHumedad, int promedioTemperatura, int promedioPH){
        this.tempFila1 = tempFila1;
        this.tempFila2 = tempFila2;
        this.tempFila3 = tempFila3;
        this.tempFila4 = tempFila4;
        
        this.phSueloFila1 = phSueloFila1;
        this.phSueloFila2 = phSueloFila2;
        this.phSueloFila3 = phSueloFila3;
        this.phSueloFila4 = phSueloFila4;
        
        this.humedadFila1 = humedadFila1;
        this.humedadFila2 = humedadFila2;
        this.humedadFila3 = humedadFila3;
        this.humedadFila4 = humedadFila4;
        
        this.promedioHumedad = promedioHumedad;
        this.promedioPH = promedioPH;
        this.promedioTemperatura = promedioTemperatura;
    }
    
    public int getHumedadFila1(){
        this.setHumedadFila1(humedadFila1);
        return humedadFila1;
    }

    /**
     * @return the tempFila1
     */
    public int getTempFila1() {
        return tempFila1;
    }

    /**
     * @param tempFila1 the tempFila1 to set
     */
    public void setTempFila1(int tempFila1) {
        this.tempFila1 = tempFila1;
    }

    /**
     * @return the tempFila2
     */
    public int getTempFila2() {
        return tempFila2;
    }

    /**
     * @param tempFila2 the tempFila2 to set
     */
    public void setTempFila2(int tempFila2) {
        this.tempFila2 = tempFila2;
    }

    /**
     * @return the tempFila3
     */
    public int getTempFila3() {
        return tempFila3;
    }

    /**
     * @param tempFila3 the tempFila3 to set
     */
    public void setTempFila3(int tempFila3) {
        this.tempFila3 = tempFila3;
    }

    /**
     * @return the tempFila4
     */
    public int getTempFila4() {
        return tempFila4;
    }

    /**
     * @param tempFila4 the tempFila4 to set
     */
    public void setTempFila4(int tempFila4) {
        this.tempFila4 = tempFila4;
    }

    /**
     * @return the phSueloFila1
     */
    public int getPhSueloFila1() {
        return phSueloFila1;
    }

    /**
     * @param phSueloFila1 the phSueloFila1 to set
     */
    public void setPhSueloFila1(int phSueloFila1) {
        this.phSueloFila1 = phSueloFila1;
    }

    /**
     * @return the phSueloFila2
     */
    public int getPhSueloFila2() {
        return phSueloFila2;
    }

    /**
     * @param phSueloFila2 the phSueloFila2 to set
     */
    public void setPhSueloFila2(int phSueloFila2) {
        this.phSueloFila2 = phSueloFila2;
    }

    /**
     * @return the phSueloFila3
     */
    public int getPhSueloFila3() {
        return phSueloFila3;
    }

    /**
     * @param phSueloFila3 the phSueloFila3 to set
     */
    public void setPhSueloFila3(int phSueloFila3) {
        this.phSueloFila3 = phSueloFila3;
    }

    /**
     * @return the phSueloFila4
     */
    public int getPhSueloFila4() {
        return phSueloFila4;
    }

    /**
     * @param phSueloFila4 the phSueloFila4 to set
     */
    public void setPhSueloFila4(int phSueloFila4) {
        this.phSueloFila4 = phSueloFila4;
    }

    /**
     * @param humedadFila1 the humedadFila1 to set
     */
    public void setHumedadFila1(int humedadFila1) {
        this.humedadFila1 = humedadFila1;
    }

    /**
     * @return the humedadFila2
     */
    public int getHumedadFila2() {
        return humedadFila2;
    }

    /**
     * @param humedadFila2 the humedadFila2 to set
     */
    public void setHumedadFila2(int humedadFila2) {
        this.humedadFila2 = humedadFila2;
    }

    /**
     * @return the humedadFila3
     */
    public int getHumedadFila3() {
        return humedadFila3;
    }

    /**
     * @param humedadFila3 the humedadFila3 to set
     */
    public void setHumedadFila3(int humedadFila3) {
        this.humedadFila3 = humedadFila3;
    }

    /**
     * @return the humedadFila4
     */
    public int getHumedadFila4() {
        return humedadFila4;
    }

    /**
     * @param humedadFila4 the humedadFila4 to set
     */
    public void setHumedadFila4(int humedadFila4) {
        this.humedadFila4 = humedadFila4;
    }

    /**
     * @return the promedioHumedad
     */
    public int getPromedioHumedad() {
        return promedioHumedad;
    }

    /**
     * @param promedioHumedad the promedioHumedad to set
     */
    public void setPromedioHumedad(int promedioHumedad) {
        this.promedioHumedad = promedioHumedad;
    }

    /**
     * @return the promedioTemperatura
     */
    public int getPromedioTemperatura() {
        return promedioTemperatura;
    }

    /**
     * @param promedioTemperatura the promedioTemperatura to set
     */
    public void setPromedioTemperatura(int promedioTemperatura) {
        this.promedioTemperatura = promedioTemperatura;
    }

    /**
     * @return the promedioPH
     */
    public int getPromedioPH() {
        return promedioPH;
    }

    /**
     * @param promedioPH the promedioPH to set
     */
    public void setPromedioPH(int promedioPH) {
        this.promedioPH = promedioPH;
    }
    
    
    
}

