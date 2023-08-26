package com.example.addressidentificator.controller;

import com.example.addressidentificator.model.Address;
import com.example.addressidentificator.service.AddressService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/address")
@Log4j2
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    /**
     * TODO One query with 10 addresses back in Json
     * С клиента приходит запрос, передается на ИИ, возвращается 10 адресов на сервер, потом обратно на клиент
     */
    @GetMapping("/getAddress")
    public ResponseEntity<Address> getAddress(String query) {
        log.info("Request to get right address");
        Address address = addressService.getAddress(query);
        if (address.getTargetBuildingId() == null) {
            return new ResponseEntity<>(address, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(address, HttpStatus.OK);
    }
}
