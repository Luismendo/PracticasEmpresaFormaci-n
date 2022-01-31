
export interface Persona {
    name: string;
    position: number;
    usuario: string;
    emailC: string;
    emailP: string;
    city: string;
    url: string;
    DateInit: String;
    act: boolean;
    DateEnd: String;
}

export class User {
    constructor(
        public name: string,
        public position: number,
        public usuario: string,
        public emailC: string,
        public emailP: string,
        public city: string,
        public url: string,
        public DateInit: String,
        public act: boolean,
        public DateEnd: String
    ){}
}
  

export class UserFetch {
    constructor( public id = 0, public name = '', public model='') {}
  }
  
  