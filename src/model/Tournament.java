
package model;

/**
 *
 * @author regmi
 */
public class Tournament {
    private int tournamentId;
    private String tournamentName;
    private String prizePool;
    private String totalStats;
    private String tournamentVenue;
    private String tournamentDate;
    private String tournamentType;
    
   public Tournament (String tournamentName, String prizePool, String totalStats, String tournamentVenue, String tournamentDate, String tournamentType){
       this.tournamentName= tournamentName;
       this.prizePool= prizePool;
       this.totalStats= totalStats;
       this.tournamentVenue= tournamentVenue;
       this.tournamentDate= tournamentDate;
       this.tournamentType= tournamentType;
   }
    
  
    
}
