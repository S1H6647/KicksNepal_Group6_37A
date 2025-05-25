
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

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getPrizePool() {
        return prizePool;
    }

    public void setPrizePool(String prizePool) {
        this.prizePool = prizePool;
    }

    public String getTotalStats() {
        return totalStats;
    }

    public void setTotalStats(String totalStats) {
        this.totalStats = totalStats;
    }

    public String getTournamentVenue() {
        return tournamentVenue;
    }

    public void setTournamentVenue(String tournamentVenue) {
        this.tournamentVenue = tournamentVenue;
    }

    public String getTournamentDate() {
        return tournamentDate;
    }

    public void setTournamentDate(String tournamentDate) {
        this.tournamentDate = tournamentDate;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }
    
    
}
