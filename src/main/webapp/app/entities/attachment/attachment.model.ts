import { ITicket } from 'app/entities/ticket/ticket.model';

export interface IAttachment {
  id: number;
  name?: string | null;
  file?: string | null;
  fileContentType?: string | null;
  ticket?: Pick<ITicket, 'id'> | null;
}

export type NewAttachment = Omit<IAttachment, 'id'> & { id: null };
