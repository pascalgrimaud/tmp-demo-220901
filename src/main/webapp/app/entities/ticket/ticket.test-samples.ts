import dayjs from 'dayjs/esm';

import { Status } from 'app/entities/enumerations/status.model';
import { Type } from 'app/entities/enumerations/type.model';
import { Priority } from 'app/entities/enumerations/priority.model';

import { ITicket, NewTicket } from './ticket.model';

export const sampleWithRequiredData: ITicket = {
  id: 65582,
  title: 'Sleek Centralized Fish',
};

export const sampleWithPartialData: ITicket = {
  id: 20885,
  title: 'transmit',
  date: dayjs('2022-08-31T10:22'),
  status: Status['CANNOT_REPRODUCE'],
  type: Type['BUG'],
};

export const sampleWithFullData: ITicket = {
  id: 2511,
  title: 'Outdoors',
  description: 'Cambridgeshire Brand Optional',
  dueDate: dayjs('2022-08-31'),
  date: dayjs('2022-08-31T13:14'),
  status: Status['WONT_IMPLEMENT'],
  type: Type['FEATURE'],
  priority: Priority['LOWER'],
};

export const sampleWithNewData: NewTicket = {
  title: 'cutting-edge',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
