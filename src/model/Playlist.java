/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author Reynald
 */
public class Playlist {
    private  String playlistName;
    private String playlistAuthor;
    private  ArrayList<Track> playlistTracks= new ArrayList<Track>();
    
    
    
    
    public Playlist(){
        this.playlistName= "New Playlist";
           this.playlistAuthor= "Unknown";
           this.playlistTracks= new ArrayList<Track>();
        
       }
      public Playlist(String playlistName,String playlistAuthor){
           this.playlistName= playlistName;
           this.playlistAuthor= playlistAuthor;
      }
      
       public Playlist(String playlistName,String playlistAuthor,ArrayList playlistTracks){
           this.playlistName= playlistName;
           this.playlistAuthor= playlistAuthor;
           this.playlistTracks= playlistTracks;
        
    }
       /// setter and getter for playlistName
       
       public void setPlaylistName(String playlistName){
            this.playlistName=playlistName;
       }
       public String getPlaylistName(){
           return this.playlistName;
       }
       /// setter and getter for playlistAuthor
       
       
       public void setPlaylistAuthor(String playlistAuthor){
            this.playlistAuthor=playlistAuthor;
       }
        public String getPlaylistAuthor(){
           return this.playlistAuthor;
       }
        // Setter and getter for playlistTrack
        
        public void setPlaylistTracks(ArrayList playlistTracks){
            this.playlistTracks=playlistTracks;
       }
         public ArrayList<Track> getPlaylistTracks(){
           return this.playlistTracks;
          
       }
        
         
         private String getNumberredTracks(){
             String numberedTracks= "\n";
             int number =1;
             for(Track track: this.playlistTracks){
                 numberedTracks += Integer.toString(number++) + ":" + track.toString() + "\n";
             }
             return numberedTracks;
         }
         
         @Override 
         public String toString(){
             
             return "\n Playlist Name      :" + this.getPlaylistName() +
                     "\n Playlist Author  :"        + this.getPlaylistAuthor()+
                     " \nnumber of tracks    :"        + this.getNumberredTracks();
                     
         }
         public void addTrackToPlaylist(Track track){
             this.playlistTracks.add(track);
         }
           
         public void removeTrackFromPlaylist(int trackId){
             Predicate<Track> trackPredicate= t->t.getTrackId()== trackId;
             this.playlistTracks.removeIf(trackPredicate);
             
         }
    
}
