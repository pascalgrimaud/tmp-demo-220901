package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Project;
import com.mycompany.myapp.service.dto.ProjectDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Project} and its DTO {@link ProjectDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProjectMapper extends EntityMapper<ProjectDTO, Project> {}
