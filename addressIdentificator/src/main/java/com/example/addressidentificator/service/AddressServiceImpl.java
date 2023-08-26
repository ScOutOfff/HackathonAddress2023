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
            * Ожидаемое значение является массивом String, содержащих fullAddress и массив Long содержащий id строения.
         */


        //TODO Поменять на возвращаемое значение
        int countOfAddressesFromAI = 0;
        Long[] buildingIdArray = new Long[0]/*{1314l, 2413l}*/;
        String[] fullAddressFromAI = new String[0]/*{"Аптекарский д.15", "Ленина д.2"}*/;

        log.info(countOfAddressesFromAI + " addresses found");

        TargetAddress[] targetAddress = new TargetAddress[countOfAddressesFromAI];
        for (int i = 0; i < countOfAddressesFromAI; i++) {
            targetAddress[i] = TargetAddress.builder()
                    .id(buildingIdArray[i])
                    .fullAddress(fullAddressFromAI[i])
                    .build();
        }

        return Address.builder()
                .queryAddress(query)
                .targetAddress(targetAddress)
                .build();
    }

}
