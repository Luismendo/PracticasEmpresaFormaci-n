list()

function list(){
    fetch('http://localhost:8080/',{
        method: 'GET',
    })
    .then(Response => Response.json())
    .then(person_list =>{
        console.log(person_list)
        document.getElementById('persons').innerHTML = "";
        person_list.forEach(element => {
            console.log(element);
            Object.entries(element).forEach(([key, value]) =>{
                //console.log(`${key} ${value}`);
                document.getElementById('persons').innerHTML += `<b>${key}</b>: ${value} `;
            });
            document.getElementById('persons').innerHTML += "<br>";
        });
    })

}

/////////////////////////////////////


function lecgucga(){
    console.log("AAAAAAAAAAAAAAAA")
    fetch('http://localhost:8080/',{
    method:'post',
    headers:{"Content-Type": "application/json"},
    body:JSON.stringify({
        'usuario': document.getElementById('Usuario').value,
        "password": document.getElementById('Contraseña').value,
        "name": document.getElementById('Nombre').value,
        'surname': document.getElementById('Apellido').value,
        'company_email': document.getElementById('EmailCP').value,
        'personal_email': document.getElementById('EmailP').value,
        'city': document.getElementById('Ciudad').value,
        'active': document.getElementById('Activado').value,
        'created_date': document.getElementById('FechaInit').value,
        'imagen_url': document.getElementById('url').value,
        'termination_date': document.getElementById('FechaFin').value,
        })  
    })
    .then(Response => {
        console.log(Response)
        list()
    })
}

function Limpiar(){
    document.getElementById('formulario').reset();
}
