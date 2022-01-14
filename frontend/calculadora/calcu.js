function numero(num){
    pantalla=document.getElementById("screen");
    if(pantalla.innerHTML == '0' || pantalla.innerHTML == 'ERROR' ){
      pantalla.innerHTML=num;
    }else{
      pantalla.innerHTML+=num
    }
    event.preventDefault();
  }
  
  
  
    var operando;
    var num1;
    var num2;
  
  
  
  
  
  
  
  function operacion(signo)
  {
  
    pantalla=document.getElementById("screen");
    var result;
    console.log(signo, operando);
  
    if(operando != null){
      switch (signo)
      {
        case 'C':
          if(pantalla.innerHTML.length == 1){
            pantalla.innerHTML = '0'
          }else{
            pantalla.innerHTML = pantalla.innerHTML.substring(0, pantalla.innerHTML.length - 1);
          }
          event.preventDefault();
          break;
          
        case '=':
          num2 = parseInt(pantalla.innerHTML);
          console.log(num2);
  
          switch (operando)
          {
            case '+':
              console.log("AAAAAAAAAAAA");
              result = num1 + num2;
              pantalla.innerHTML =  result.toString();
              console.log(result);
  
              break;
            case '-':
              result = num1 - num2;
              pantalla.innerHTML = result.toString();
              console.log(result);
              break;
            case 'exp':
              result = num1 ** num2;
              pantalla.innerHTML = result.toString();
              break;
            case '/':
              result = num1 / num2;
              pantalla.innerHTML = result.toString();
              break;
            case 'X':
              result = num1 * num2;
              pantalla.innerHTML = result.toString();
              break;
            case '=':
              break;
          }
          operando = null;
          event.preventDefault();
          break;
        default:
          operando = null;
          console.log("ERROR");
          pantalla.innerHTML = 'ERROR';
          event.preventDefault();
          break;
      }  
    }else{
      if(signo == 'C'){
        if(pantalla.innerHTML.length == 1){
          pantalla.innerHTML = '0'
        }else{
          pantalla.innerHTML = pantalla.innerHTML.substring(0, pantalla.innerHTML.length - 1);
        }
        operando = null;
        event.preventDefault();
      }else if(signo != '='){
        num1 = parseInt(pantalla.innerHTML);
        console.log(num1);
        pantalla.innerHTML = '0';
        operando = signo;
         console.log("operando si "+operando + " signo " + signo);
        event.preventDefault();
      }
    }
  }