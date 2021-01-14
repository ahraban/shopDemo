package cz.ahraban.demoshop.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cz.ahraban.demoshop.entity.WatchEntity;
import cz.ahraban.demoshop.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchService{

    @Autowired
    WatchRepository watchRepository;

    public List<WatchEntity> list(){
        return watchRepository.findAll();
    }

    public void insertRecord(WatchEntity watchEntity){
        watchRepository.save(watchEntity);
    }

    public String getAllWatches() throws JsonProcessingException {
        List <WatchEntity> watchEntityList = watchRepository.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(watchEntityList);
    }
}
