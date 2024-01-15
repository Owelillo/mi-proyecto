public class PantallaHoraYFecha
{
    private int dia;
    private int mes;
    private int ano;
    private String hora;


    public PantallaHoraYFecha()
    {
        dia = 1;
        mes = 1;
        ano = 1;
        hora = "00:00";
        
    }

    public String getFechaYHora()
    {
         return hora + "  " + dia + "-" + mes + "-" + ano;
    }
}
