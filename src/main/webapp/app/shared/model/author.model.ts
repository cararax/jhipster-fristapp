import dayjs from 'dayjs';

export interface IAuthor {
  id?: number;
  name?: string;
  birthDate?: string | null;
}

export const defaultValue: Readonly<IAuthor> = {};
