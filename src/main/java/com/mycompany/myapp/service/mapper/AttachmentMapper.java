package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Attachment;
import com.mycompany.myapp.domain.Ticket;
import com.mycompany.myapp.service.dto.AttachmentDTO;
import com.mycompany.myapp.service.dto.TicketDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Attachment} and its DTO {@link AttachmentDTO}.
 */
@Mapper(componentModel = "spring")
public interface AttachmentMapper extends EntityMapper<AttachmentDTO, Attachment> {
    @Mapping(target = "ticket", source = "ticket", qualifiedByName = "ticketId")
    AttachmentDTO toDto(Attachment s);

    @Named("ticketId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TicketDTO toDtoTicketId(Ticket ticket);
}
