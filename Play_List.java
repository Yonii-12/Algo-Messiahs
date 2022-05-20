/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author LENOVO
 */

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
        
        
    public boolean addSong(String title, int durationInSec){
        if(findSong(title)==null){
            Song song=new Song(title, durationInSec);
            this.songs.add(song);
            return true;
        }
        return false;
    }
    
    
    public boolean addSongToPlaylist(int trackNumber, LinkedList playlist){
        int index=trackNumber -1;
        if((index>=0) && (index<=this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("Track Number :" + index+" invalid");
        return false;
    }
    
    
    public boolean addSongToPlaylist(String title, LinkedList playlist){
     Song checkedSong=findSong(title);
        if(checkedSong !=null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This "+ title+ " does not exis!");
        return false;
    }
}

   
 