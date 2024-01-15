public class PantallaHoraYFecha
{
    private PantallaDosDigitos dia;
    private PantallaDosDigitos mes;
    private PantallaDosDigitos ano;
    private PantallaDosDigitos hora;
    private PantallaDosDigitos minutos;


    public PantallaHoraYFecha()
    {
        int valorInicial = 1;
        int limitePantallaDia = 32;
        int limitePantallaMes = 13;
        int limitePantallaAno = 2030;
        int limitePantallaHora = 24;
        int limitePantallaMinutos = 60;
        
        dia = new PantallaDosDigitos(valorInicial, limitePantallaDia);
        mes = new PantallaDosDigitos(valorInicial, limitePantallaMes);
        ano = new PantallaDosDigitos(valorInicial, limitePantallaAno);
        hora = new PantallaDosDigitos(valorInicial, limitePantallaHora);
        minutos = new PantallaDosDigitos(valorInicial, limitePantallaMinutos);
    }

    public String getFechaYHora()
    {
         return hora.getTextoDeLaPantalla() + minutos.getTextoDeLaPantalla() +  "  " + dia.getTextoDeLaPantalla() + "-" + mes.getTextoDeLaPantalla() + "-" + ano.getTextoDeLaPantalla(); 
    }
}
