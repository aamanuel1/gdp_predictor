package com.worldbankdata.backend.Controller;
import com.worldbankdata.backend.Entity.CombinedDataEntity;
import com.worldbankdata.backend.Entity.GDPEntity;
import com.worldbankdata.backend.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin({"*"})
//@CrossOrigin(origins = "http://localhost:4200")
public class DataController {

    @Autowired
    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService){
        this.dataService = dataService;
    }

//    @PostMapping("/api/v1/postcountry")
//    public void postCountry(@RequestParam String country){
//
//    }

    @GetMapping("api/v1/getcountrystats")
    public void getCountryStats(@RequestBody CombinedDataEntity combinedDataEntity){

    }

//    @GetMapping("api/v1/getcountryfuturegdp")
//    public Double getCountryFutureGDP(@RequestParam String name) throws Exception {
//        Double result = this.dataService.getCountryGDP(name);
//        return result;
//    }

    @GetMapping("api/v1/getcountryfuturegdp/{name}")
    public Double getCountryFutureGDP(@PathVariable String name) throws Exception {
        Double result = this.dataService.getCountryGDP(name);
        System.out.println(result);
        return result;
    }
}
