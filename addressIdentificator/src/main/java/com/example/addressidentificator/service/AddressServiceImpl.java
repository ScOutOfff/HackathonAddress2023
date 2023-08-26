package com.example.addressidentificator.service;

import com.example.addressidentificator.model.Address;
import com.example.addressidentificator.model.TargetAddress;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AddressServiceImpl implements AddressService {

    @Override
    public Address getAddress(String query) {
        log.error("AddressService.getAddress return Address without correct target");
        /*
         * TODO
         * Здесь должна быть логика подключения к нейросети или тип того
         * Пока заглушка
         */

        TargetAddress targetAddress = TargetAddress.builder()
                .address(new String[]{"address one", "address two"})
                .build();

        return Address.builder()
                .address(query)
                .targetBuildingId(1L)           //TODO Получать из ИИ
                .targetAddress(targetAddress)   //TODO Получать из ИИ
                .build();
    }
}
