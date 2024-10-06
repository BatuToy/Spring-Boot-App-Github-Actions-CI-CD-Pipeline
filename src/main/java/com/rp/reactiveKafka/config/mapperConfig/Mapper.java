package com.rp.reactiveKafka.config.mapperConfig;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Mapper {

    private final ModelMapper mapper;

    public <T, R> R map(T source, Class<R> destinationType) {
        return mapper.map(source, destinationType);
    }
}
