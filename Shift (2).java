
package edu.jsu.mcis.cs310.tas_sp21;

import java.sql.Time;


public class Shift {
       
        public int shiftId;

        public Time start;

        public Time stop;
        
        public int lunchduration;

        public Time lunchstart;

        public Time lunchstop;

  
    

        public Shift(int shiftId, Time Start, Time Stop,int Lunchduration, Time Lunchstart, Time Lunchstop){



            this.shiftId = shiftId;

            this.start = Start;

            this.stop = Stop;

            this.lunchduration =Lunchduration;
            
            this.lunchstart = Lunchstart;

            this.lunchstop = Lunchstop;

        }

        
}

