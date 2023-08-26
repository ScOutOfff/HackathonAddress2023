package com.example.addressidentificator.service;

import com.example.addressidentificator.model.Address;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AddressServiceImpl implements AddressService {
    @Override
    public Address getAddress(String query) {
        log.error("AddressService.getAddress return null");
        /**
         * Здесь должна быть логика подключения к нейросети или тип того
         * Пока заглушка
         */
        return Address.builder()
                .address(query)
                .targetBuildingId(1L)       //TODO Получать из ИИ
                .targetAddress("address")   //TODO Получать из ИИ
                .build();
    }
}
