package com.cvgras.cvgras.mapper;
import com.cvgras.cvgras.model.ResponseRID;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

import org.springframework.stereotype.Component;

@Component
public class CvMapper implements OrikaMapperFactoryConfigurer {

    @Override
    public void configure(MapperFactory orikaMapperFactory) {
        orikaMapperFactory.classMap(com.cvgras.cvgras.model.UserModel.class, ResponseRID.class).mapNulls(false).byDefault().register();
    }
}

