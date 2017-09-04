public class Vehiculo
{
    private String placa;
    private int hora;
    private int minutos;
    
    public Vehiculo(String placaIngreso, int horaIngreso, int minutosIngreso)
    {
        placa=placaIngreso;
        hora=horaIngreso;
        minutos=minutosIngreso;
    }
    
    public String dimePlaca()
    {
        return placa;
    }
    
    public String dimeHora()
    {
        String cad="";
        cad+=hora;
        cad+=":";
        cad+=minutos;
        return cad;
    }
}
