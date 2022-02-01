
export interface Persona {
    position: number;

    name: string;
    //password: String ;
    usuario: string;
    //surname: String ;
    emailC: string;
    emailP: string;
    city: string;

    act: boolean;

    DateInit: string;
    url: string;
    DateEnd: string;
}

export interface PersonaHttp {
    position: number;

    name: string;
    password: String ;
    usuario: string;
    surname: String ;
    company_email: string;
    personal_email: string;
    city: string;

    active: boolean;

    created_date: String;
    imagen_url: string;
    termination_date: String;
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
  
  