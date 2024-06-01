
public class CuentaSocio {
    int numeroCuenta, montoTotalPagado, cuotasCanceladas, cuotasPendientes;
    
    public CuentaSocio(){
    }

    public CuentaSocio(int numeroCuenta, int montoTotalPagado, int cuotasCanceladas, int cuotasPendientes) {
        this.numeroCuenta = numeroCuenta;
        this.montoTotalPagado = montoTotalPagado;
        this.cuotasCanceladas = cuotasCanceladas;
        this.cuotasPendientes = cuotasPendientes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getMontoTotalPagado() {
        return montoTotalPagado;
    }

    public void setMontoTotalPagado(int montoTotalPagado) {
        this.montoTotalPagado = montoTotalPagado;
    }

    public int getCuotasCanceladas() {
        return cuotasCanceladas;
    }

    public void setCuotasCanceladas(int cuotasCanceladas) {
        this.cuotasCanceladas = cuotasCanceladas;
    }

    public int getCuotasPendientes() {
        return cuotasPendientes;
    }

    public void setCuotasPendientes(int cuotasPendientes) {
        this.cuotasPendientes = cuotasPendientes;
    }

    @Override
    public String toString() {
        return "CuentaSocio{" + "numeroCuenta=" + numeroCuenta + ", montoTotalPagado=" + montoTotalPagado + ", cuotasCanceladas=" + cuotasCanceladas + ", cuotasPendientes=" + cuotasPendientes + '}';
    }
    
    public boolean validarNumeroCuenta(int numeroCuenta){
        if (numeroCuenta.length()>=9){
            return true;
        }else{
            return false;
        }
    }
}
