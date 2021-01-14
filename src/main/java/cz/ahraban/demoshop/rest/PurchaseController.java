package cz.ahraban.demoshop.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import cz.ahraban.demoshop.entity.WatchEntity;
import cz.ahraban.demoshop.service.WatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/api")
public class PurchaseController {

    static Logger logger = LoggerFactory.getLogger(PurchaseController.class.getName());

    @Autowired
    WatchService watchService;

    @RequestMapping(value = "/records", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> getRecords() throws JsonProcessingException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        //get all existing records
        String body = watchService.getAllWatches();

        return ResponseEntity.ok()
                .headers(httpHeaders)
                .body(body);

    }

    @PostMapping(value = "/purchase")//, consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> purchase(@Valid @RequestBody WatchEntity watchEntity) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.TEXT_PLAIN);

        //create record
        watchService.insertRecord(watchEntity);

        return new ResponseEntity<>("Purchase completed, order created", httpHeaders, HttpStatus.CREATED);
    }
}
