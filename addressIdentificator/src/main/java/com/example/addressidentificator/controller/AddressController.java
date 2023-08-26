package com.example.addressidentificator.controller;

import com.example.addressidentificator.model.Address;
import com.example.addressidentificator.service.AddressService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
     *
     * @param query Запрос, пришедший с клиентской части.
     * @return Адрес из запроса, корректный адрес и id строения
     */
    @PostMapping("/getAddress")
    public ResponseEntity<Address> getAddress(@RequestPart("address") String query) {
        log.info("Request to get right address");
        Address address = addressService.getAddress(query);
        if (address.getTargetAddress().length == 0) {
            log.warn("No suitable addresses");
            return new ResponseEntity<>(address, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(address, HttpStatus.OK);
    }
}
