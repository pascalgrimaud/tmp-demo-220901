import { IAttachment, NewAttachment } from './attachment.model';

export const sampleWithRequiredData: IAttachment = {
  id: 43624,
  name: 'programming Account',
};

export const sampleWithPartialData: IAttachment = {
  id: 51189,
  name: 'Refined Proactive Rue',
  file: '../fake-data/blob/hipster.png',
  fileContentType: 'unknown',
};

export const sampleWithFullData: IAttachment = {
  id: 30386,
  name: 'capacitor Central',
  file: '../fake-data/blob/hipster.png',
  fileContentType: 'unknown',
};

export const sampleWithNewData: NewAttachment = {
  name: 'Programmable',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
