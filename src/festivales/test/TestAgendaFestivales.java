package festivales.test;

import festivales.modelo.Mes;

import java.util.HashSet;

public class TestAgendaFestivales {
    
    /**
     * C�digo para probar la clase festivales.modelo.AgendaFestivales
     *
     */
    public static void main(String[] args) {
        AgendaFestivales agenda = new AgendaFestivales();
        
        testCargarAgenda(agenda);
        testFestivalesEnMes(agenda);
        testFestivalesPorEstilo(agenda);
        testCancelarFestivales(agenda);
        
        
    }
    
    
    private static void testCargarAgenda(AgendaFestivales agenda) {
        // festivales.io.FestivalesIO.cargarFestivales(agenda);
        // System.out.println(agenda);
        // System.out.println();
    }
    
    
    private static void testFestivalesEnMes(AgendaFestivales agenda) {
        // System.out.println("Meses y n� festivales en ese mes\n");
        // festivales.modelo.Mes[] meses = {festivales.modelo.Mes.FEBRERO, festivales.modelo.Mes.ABRIL, festivales.modelo.Mes.MAYO, festivales.modelo.Mes.JUNIO,
                // festivales.modelo.Mes.SEPTIEMBRE, festivales.modelo.Mes.OCTUBRE};
        // for (festivales.modelo.Mes mes : meses) {
            // System.out.println(mes + ": " + agenda.festivalesEnMes(mes));
            
        // }
        // System.out.println();
    }
    
    
    private static void testFestivalesPorEstilo(AgendaFestivales agenda) {
        // System.out.println("Nombres de festivales agrupados por estilos\n");
        // for (Map.Entry<festivales.modelo.Estilo, TreeSet<String>> entrada :
                // agenda.festivalesPorEstilo().entrySet()) {
            // System.out.println(entrada.getKey() + " - " + entrada.getValue());
            
        // }
        // System.out.println();
    }
    
    private static void testCancelarFestivales(AgendaFestivales agenda) {
   
        // HashSet<String> lugares = new HashSet<>(Arrays.asList("VITORIA",
                // "BILBAO", "ZARAGOZA"));
        // testCancelarFestivales(agenda, festivales.modelo.Mes.JUNIO, lugares);
 
        // lugares = new HashSet<>(Arrays.asList("SEVILLA"));
        // testCancelarFestivales(agenda, festivales.modelo.Mes.MARZO, lugares);
    
        // lugares = new HashSet<>(Arrays.asList("MALLORCA"));
        // testCancelarFestivales(agenda, festivales.modelo.Mes.DICIEMBRE, lugares);
        
    }

    private static void testCancelarFestivales(AgendaFestivales agenda,
                                               Mes mes,
                                               HashSet<String> lugares) {
        // System.out.println(lugares + " cancela/n su/s festival/es de " + mes +
                // "\n\n");
        // int borrados = agenda.cancelarFestivales(lugares, mes);
        // if (borrados == -1) {
            // System.out.println("No hay programados festivales en " + mes);
        // } else {
            // System.out.println("Cancelados " + borrados + " festival/es");
        // }
        // System.out.println("Despu�s de borrar ....");
        // System.out.println(agenda);
    }
}
