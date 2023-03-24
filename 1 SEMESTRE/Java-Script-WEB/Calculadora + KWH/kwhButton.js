

function kwhClick() {
    event.preventDefault()
    
    var nw1 = parseFloat(document.querySelector('#nw1').value);
    var nw2 = parseFloat(document.querySelector('#nw2').value);
    var valorFinal = document.querySelector('#valorFinal'); 

    var consumo = nw1 * nw2;

    if(consumo > 100 && consumo <= 200){
        console.log(`Adicionando 25%. R$${consumo}`);
        consumo += (consumo * 25) / 100;
        console.log(`Atualmente R${consumo}`)
    }
    else if(consumo > 200){
        console.log(`Adicionando 50%. R$${consumo}`);
        consumo += (consumo * 50) / 100;
        console.log(`Atualmente R${consumo}`)
    }

    valorFinal.value = `Valor do consumo: R${consumo}`;
   


}
