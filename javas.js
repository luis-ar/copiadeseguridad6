var num1;
var num2;
var operacion;

function init() {
  const resultado = document.getElementById("pantalla");
  var uno = document.getElementById("uno");
  var dos = document.getElementById("dos");
  var tres = document.getElementById("tres");
  var cuatro = document.getElementById("cuatro");
  var cinco = document.getElementById("cinco");
  var seis = document.getElementById("seis");
  var siete = document.getElementById("siete");
  var ocho = document.getElementById("ocho");
  var nueve = document.getElementById("nueve");
  var suma = document.getElementById("suma");
  var resta = document.getElementById("resta");
  var division = document.getElementById("division");
  var multiplicacion = document.getElementById("multiplicacion");
  var borrar = document.getElementById("borrar");
  var igual = document.getElementById("igual");
  var punto = document.getElementById("punto");
  var cero = document.getElementById("cero");
  //teclas
  resultado.onclick = function (e) {
    limpiar();
  };
  uno.onclick = function (e) {
    resultado.textContent += "1";
  };
  dos.onclick = function (e) {
    resultado.textContent = resultado.textContent + "2";
  };
  tres.onclick = function (e) {
    resultado.textContent = resultado.textContent + "3";
  };
  cuatro.onclick = function (e) {
    resultado.textContent = resultado.textContent + "4";
  };
  cinco.onclick = function (e) {
    resultado.textContent = resultado.textContent + "5";
  };
  seis.onclick = function (e) {
    resultado.textContent = resultado.textContent + "6";
  };
  siete.onclick = function (e) {
    resultado.textContent = resultado.textContent + "7";
  };
  ocho.onclick = function (e) {
    resultado.textContent = resultado.textContent + "8";
  };
  nueve.onclick = function (e) {
    resultado.textContent = resultado.textContent + "9";
  };
  punto.onclick = function (e) {
    resultado.textContent = resultado.textContent + ".";
  };
  cero.onclick = function (e) {
    resultado.textContent = resultado.textContent + "0";
  };
  //operadores
  borrar.onclick = function (e) {
    resetear();
  };
  igual.onclick = function (e) {
    num2 = resultado.textContent;
    respuesta();
  };
  resta.onclick = function (e) {
    num1 = resultado.textContent;
    operacion = "-";
    limpiar();
  };
  multiplicacion.onclick = function (e) {
    num1 = resultado.textContent;
    operacion = "X";
    limpiar();
  };
  division.onclick = function (e) {
    num1 = resultado.textContent;
    operacion = "/";
    limpiar();
  };
  suma.onclick = function (e) {
    num1 = resultado.textContent;
    operacion = "+";
    limpiar();
  };
  function limpiar() {
    resultado.textContent = "";
  }
  function resetear() {
    resultado.textContent = "";
    num1 = 0;
    num2 = 0;
    operacion = "";
  }
  function respuesta() {
    var solu = 0;
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    if (operacion == "+") {
      solu = num1 + num2;
    } else if (operacion == "-") {
      solu = num1 - num2;
    } else if (operacion == "X") {
      solu = num1 * num2;
    } else if (operacion == "/") {
      solu = num1 / num2;
    }
    resetear();
    resultado.textContent = solu;
  }
  console.log(uno);
}

// function limpiar() {
//   alert("holaaaaa");
//   resultado.textContent = resultado.textContent + "2"
// }
// function resetear() {
//   resultado.textContent = "";
//   num1 = 0;
//   num2 = 0;
//   operacion = "";
// }
// function respuesta() {
//   var res = 0;
//   switch (operacion) {
//     case "+":
//       res = parseFloat(num1) + parseFloat(num2);
//       break;
//     case "-":
//       res = parseFloat(num1) - parseFloat(num2);
//       break;
//     case "X":
//       res = parseFloat(num1) * parseFloat(num2);
//       break;
//     case "/":
//       res = parseFloat(num1) / parseFloat(num2);
//       break;
//   }
//   resetear();
//   resultado.textContent = res;
// }

// operacion = prompt(
//   `¿Que operacion va a realizar?
// SUMA:1
// RESTA:2
// MULTIPLICACION:3
// DIVISION:4
// POTENCIA:5
// RAIZ CUADRADA:6
// RAIZ CUBICA:7`
// );
// operacion = parseInt(operacion);
// if (operacion == 6 || operacion == 7) {
//   num1 = prompt("Ingrese el numero");
//   if (operacion == 6) {
//     function raizcuadrada(num1) {
//       resultado = Math.sqrt(num1);
//       document.write(resultado);
//     }
//     raizcuadrada(num1);
//   } else {
//     function raizcubica(num1) {
//       resultado = Math.cbrt(num1);
//       document.write(resultado);
//     }
//     raizcubica(num1);
//   }
// } else if (
//   operacion == 1 ||
//   operacion == 2 ||
//   operacion == 3 ||
//   operacion == 4 ||
//   operacion == 5
// ) {
//   num1 = prompt("Ingrese el primer numero");
//   num2 = prompt("Ingrese el segundo numero");
//   num1 = parseInt(num1);
//   num2 = parseInt(num2);
//   if (operacion == 1) {
//     function suma(num1, num2) {
//       resultado = num1 + num2;
//       document.write(resultado);
//     }
//     suma(num1, num2);
//   } else if (operacion == 2) {
//     function resta(num1, num2) {
//       resultado = num1 - num2;
//       document.write(resultado);
//     }
//     resta(num1, num2);
//   } else if (operacion == 3) {
//     function multiplicacion(num1, num2) {
//       resultado = num1 * num2;
//       document.write(resultado);
//     }
//     multiplicacion(num1, num2);
//   } else if (operacion == 4) {
//     function division(num1, num2) {
//       resultado = num1 / num2;
//       document.write(resultado);
//     }
//     division(num1, num2);
//   } else {
//     function potencia(num1, num2) {
//       resultado = num1 ** num2;
//       document.write(resultado);
//     }
//     potencia(num1, num2);
//   }
// } else document.write("Error al introducir la operacion");

// class celulares {
//   constructor(color, peso, rdp, rdc, ram) {
//     this.color = color;
//     this.peso = peso;
//     this.resoluciondepantalla = rdp;
//     this.resoluciondecamara = rdc;
//     this.ram = ram;
//     this.estado = "apagado";
//   }

//   info() {
//     document.write(`
//         Color: <b>${this.color}</b></br>
//         Peso: <b>${this.peso}</b></br>
//         Tamaño: <b>${this.resoluciondepantalla}</b></br>
//         Ram: <b>${this.ram}</b></br>
//         Camara: <b>${this.resoluciondecamara}</b><br>
//         `);
//   }

//   encendido() {
//     if (this.estado == "apagado") {
//       alert("El celular se esta prendiendo");
//       this.estado = "encendido";
//     } else {
//       alert("El celular se esta apagando");
//       this.estado = "apagado";
//     }
//   }

//   reiniciar() {
//     if (this.estado == "encendido") {
//       alert("El celular se esta reiniciando");
//     }
//   }
//   foto() {
//     alert("El celular esta tomando una foto");
//   }
//   video() {
//     alert("El celular esta grabando un video");
//   }
// }
// //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

// class altagama extends celulares {
//   constructor(color, peso, rdp, rdc, ram, extra) {
//     super(color, peso, rdp, rdc, ram);
//     this.camaraextra = extra;
//   }

//   camaralenta() {
//     alert("El celular esta grabando un video en camara lenta");
//   }

//   fotoextra() {
//     alert("El celuar esta tomando una foto con la camra extra");
//   }
//   recofacial() {
//     alert("Ejecutando el reconocimiento facial");
//   }

//   gamainfo() {
//     // console.log(this);
//     // const info = this.info();
//     // console.log({ info });
//     this.info();
//     document.write(`Camara extra: ${this.camaraextra}`);
//   }
// }

// // const cel1= new celulares("rojo","250gr",5,"40px","2gb")
// // const cel2= new celulares("verde","200gr",6,"30px","1gb")
// // const cel3= new celulares("negro","270gr",4,"50px","4gb")

// // cel1.info()
// // cel2.info()
// // cel3.info()

// const gama1 = new altagama("gris", "300gr", "7", "60px", "6gb", "30px");
// // const gama2=new altagama("azul","150gr","8","70px","8gb","50px")

// // // // gama1.encendido()
// // // gama1.foto()
// // // gama1.video()
// // // gama1.reiniciar()
// // // gama1.encendido()
// // // gama1.camaralenta()
// // // gama1.fotoextra()
// // // gama1.recofacial()

// gama1.gamainfo();
// // // gama2.gamainfo()

// // // class aplicaciones {
// // //     constructor(descargas,puntuacion,peso){
// // //         this.descargas=descargas
// // //         this.puntuacion=puntuacion
// // //         this.peso=peso
// // //         this.bajada="si"
// // //     }

// // //     instalacion(){
// // //         if(this.bajada=="si"){
// // //             alert("La app se esta instalando")
// // //             this.bajada="no"
// // //         }
// // //         else{
// // //             alert("La app se esta desinstalando")
// // //             this.bajada="si"
// // //         }
// // //     }
// // //     abrir(){
// // //         alert("La app se esta abriendo")
// // //     }
// // //     cerrar(){
// // //         alert("La app se esta cerrando")
// // //     }

// // //     info(){
// // //         document.write(`Cantidad de desscargas:<b>${this.descargas}</b><br>
// // //         Puntuacion:<b>${this.puntuacion}</b><br>
// // //         Peso:<b>${this.peso}</b><br>`)
// // //     }
// // // }

// // // const app1=new aplicaciones("150M",4,"300mb")

// // // app1.instalacion()
// // // app1.abrir()
// // // app1.cerrar()
// // // app1.instalacion()

// // // app1.info()
