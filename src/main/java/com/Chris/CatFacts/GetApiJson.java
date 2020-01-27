package com.Chris.CatFacts;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GetApiJson {

    @RequestMapping("/json")
    public JsonNode getData() throws UnirestException {
        HttpResponse<JsonNode> jsonResponse
                = Unirest.get("https://brianiswu-cat-facts-v1.p.rapidapi.com/facts")
                .header("x-rapidapi-host", "brianiswu-cat-facts-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "ab641fc238msh8b82c9ee652a6c2p10f75fjsn4b75aad01ba7")
                .asJson();
        return jsonResponse.getBody();
    }
}
