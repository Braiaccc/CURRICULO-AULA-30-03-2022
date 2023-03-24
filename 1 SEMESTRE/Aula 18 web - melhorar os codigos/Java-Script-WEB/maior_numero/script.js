function encontrarMaiorNumero(){
    event.preventDefault();

    let numeros = document.getElementById("numeros").value;
    let arrNumeros = numeros.split(",").map(Number);
    let numFinal = document.getElementById("numero-final");
    let maior = 0;

    for(let i = 0; i < arrNumeros.length;  i++){
        if(arrNumeros[i] > maior){
            maior = arrNumeros[i];
        }
    }

    numFinal.value = `O maior valor é = ${maior}`;

}
