
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
Clase para editar, adelantar o mostrar la hora.
*/
public class ClockDisplay
{
    //Establece el número de las horas
    private int hour;
    //Establece el número de los minutos.
    private int minute;
    
    /*
     * Establecer los valores iniciales del reloj a 0.
    */
    public ClockDisplay(int hora,int minuto)
    {
        if((hora >= 0) & (hora < 24))
       {
           hour = hora;
       }
        if((minuto >= 0) & (minuto < 61))
       {
            
           minute = minuto;
       }
    }
    /*
     * Metodo para editar la hora.
    */
   public void setTime(int hora,int minuto)
   {
        if((hora >= 0) & (hora < 24))
       {
           hour = hora;
       }
        if((minuto >= 0) & (minuto < 60))
       {
            
           minute = minuto;
       }
   }
   /*
    * Adelantar un minuto.
   */
  public void timeTick()
  {
      minute++;
      if(minute == 60)
      {
          hour++;
          if(hour == 24)
          {
              hour = 0;
          }
          minute = 0;
      }
  }
   /*
    * Dar la hora
    */
   public String getTime()
   {
       String hora = Integer.toString(hour);
       String minuto = Integer.toString(minute);
       String time = "00:00";
       if(hour < 10)
       {
           hora = "0" + hora;
       }
        if(minute < 10)
       {
           minuto = "0" + minuto;
       }
       time = hora + ":" + minuto;
       return time;
   }
}