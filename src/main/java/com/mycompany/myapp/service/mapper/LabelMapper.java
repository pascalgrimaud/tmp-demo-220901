package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Label;
import com.mycompany.myapp.service.dto.LabelDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Label} and its DTO {@link LabelDTO}.
 */
@Mapper(componentModel = "spring")
public interface LabelMapper extends EntityMapper<LabelDTO, Label> {}
