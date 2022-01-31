
import {InMemoryDbService} from 'angular-in-memory-web-api';
import { User } from './persona'


export class UserData implements InMemoryDbService {
  createDb(){
      const users: User[]=[
        {
          position: 0,
          name: 'Hydrogen',
          usuario: 'luis',
          emailC: 'gg@gmail',
          emailP: 'gg@gmail',
          city: 'malaga',
          url: '.com',
          DateInit: new Date().getFullYear().toString()  +"-"+ "01" +"-"+ new Date().getUTCDate().toString(),
          act: true,
          DateEnd: "2022-10-01"},
      {
          position: 1,
          name: 'Hydrogen',
          usuario: 'Pepe',
          emailC: 'gg@gmail',
          emailP: 'gg@wee',
          city: 'LOOOOL',
          url: '.com',
          DateInit: new Date().getFullYear().toString()  +"-"+ "10" +"-"+ new Date().getUTCDate().toString(),
          act: true,
          DateEnd: "2022-07-01"
      },
      {
          position: 2,
          name: 'Hydrogen',
          usuario: 'Migul',
          emailC: 'uynimki@gmail',
          emailP: 'gg@waeweew',
          city: 'AAAAAAAAAAAA',
          url: '.com',
          DateInit: new Date().getFullYear().toString()  +"-"+ "02" +"-"+ new Date().getUTCDate().toString(),
          act: true,
          DateEnd: "2022-05-01"
      }];
      return {users};
    }
}

