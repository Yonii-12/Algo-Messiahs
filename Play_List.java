package player;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.LinkedList;


class Play_List {
    
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    
    
    public Play_List(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }
    
    
        private Song findSong(String title){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
        
        
    
