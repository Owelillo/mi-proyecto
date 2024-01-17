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
        int limitePantallaAno = 100;
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

    public void avanzarMinuto(){ 
        minutos.incrementaValorAlmacenado();

        if (minutos.getValorAlmacenado() == 0){
            hora.incrementaValorAlmacenado();
        }
        minutos.incrementaValorAlmacenado();

        if (minutos.getValorAlmacenado() == 0) {

            hora.incrementaValorAlmacenado();
        }
        if (hora.getValorAlmacenado() == 0) {
            dia.incrementaValorAlmacenado();
        }
        if (dia.getValorAlmacenado() > 30) {
            dia.setValorAlmacenado(1);
            mes.incrementaValorAlmacenado();
        }
        if (mes.getValorAlmacenado() > 12) {
            mes.setValorAlmacenado(1);
            ano.incrementaValorAlmacenado();
        }
        if (ano.getValorAlmacenado() > 99) {
            ano.setValorAlmacenado(1);
        }
    }
    
    public void fijarFechaYHora(int hora, int minutos, int dia, int mes, int ano){
        this.hora.setValorAlmacenado(hora);
        this.minutos.setValorAlmacenado(minutos);
        this.dia.setValorAlmacenado(dia);
        this.mes.setValorAlmacenado(mes);
        this.ano.setValorAlmacenado(ano);
    }
}

