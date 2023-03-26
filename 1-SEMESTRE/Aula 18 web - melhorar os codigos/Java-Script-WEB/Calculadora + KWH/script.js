var n1 = document.querySelector('#n1')
console.log(n1)

var n2 = document.querySelector('#n2')
console.log(n2)

var resultado = document.querySelector('span')
console.log(resultado)

function somar(){
    resultado.innerHTML = parseInt(n1.value) + parseInt(n2.value)
}

function subtrair(){
    resultado.innerHTML = parseInt(n1.value) - parseInt(n2.value)
}

function dividir(){
    resultado.innerHTML = parseInt(n1.value) / parseInt(n2.value)
}

function multiplicar(){
    resultado.innerHTML = parseInt(n1.value) * parseInt(n2.value)
}


