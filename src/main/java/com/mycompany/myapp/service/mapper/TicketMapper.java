package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Label;
import com.mycompany.myapp.domain.Project;
import com.mycompany.myapp.domain.Ticket;
import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.service.dto.LabelDTO;
import com.mycompany.myapp.service.dto.ProjectDTO;
import com.mycompany.myapp.service.dto.TicketDTO;
import com.mycompany.myapp.service.dto.UserDTO;
import java.util.Set;
import java.util.stream.Collectors;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Ticket} and its DTO {@link TicketDTO}.
 */
@Mapper(componentModel = "spring")
public interface TicketMapper extends EntityMapper<TicketDTO, Ticket> {
    @Mapping(target = "project", source = "project", qualifiedByName = "projectName")
    @Mapping(target = "assignedTo", source = "assignedTo", qualifiedByName = "userLogin")
    @Mapping(target = "reportedBy", source = "reportedBy", qualifiedByName = "userLogin")
    @Mapping(target = "labels", source = "labels", qualifiedByName = "labelLabelSet")
    TicketDTO toDto(Ticket s);

    @Mapping(target = "removeLabel", ignore = true)
    Ticket toEntity(TicketDTO ticketDTO);

    @Named("projectName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    ProjectDTO toDtoProjectName(Project project);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);

    @Named("labelLabel")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "label", source = "label")
    LabelDTO toDtoLabelLabel(Label label);

    @Named("labelLabelSet")
    default Set<LabelDTO> toDtoLabelLabelSet(Set<Label> label) {
        return label.stream().map(this::toDtoLabelLabel).collect(Collectors.toSet());
    }
}
