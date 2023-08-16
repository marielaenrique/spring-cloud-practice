package com.dh.playlistservice.feign;

import com.dh.playlistservice.model.Music;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "music-service")
public interface IMusicClient {

    @GetMapping("/{genre}")
    ResponseEntity<List<Music>> getMusicByGenre(@PathVariable String genre);

}