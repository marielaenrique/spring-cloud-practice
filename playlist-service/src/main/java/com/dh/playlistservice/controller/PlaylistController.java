package com.dh.playlistservice.controller;

import com.dh.playlistservice.feign.IMusicClient;
import com.dh.playlistservice.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PlaylistController {

    @Autowired
    private IMusicClient iMusicClient;

    @GetMapping("/playlist/{genre}")
    public ResponseEntity<List<Music>> getPlaylistByGenre(@PathVariable String genre) {
        return iMusicClient.getMusicByGenre(genre);
    }

}