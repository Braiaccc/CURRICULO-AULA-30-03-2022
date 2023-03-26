

$(document).ready(function () {
    $('#calcularKwh').click(function () {
        event.preventDefault()

        var nw1 = parseFloat($('#nw1').val())  // parseFloat(document.querySelector('#nw1').value);
        var nw2 = parseFloat($('#nw2').val()) //parseFloat(document.querySelector('#nw2').value);
       

        var consumo = nw1 * nw2;

        if (consumo > 100 && consumo <= 200) {
            alert(`Adicionando 25%. R$${consumo}`);
            consumo += (consumo * 25) / 100;
            
        }
        else if (consumo > 200) {
            alert(`Adicionando 50%. R$${consumo}`);
            consumo += (consumo * 50) / 100;
            
        }

        $('#valorFinal').html(`o preço sera:` + consumo)
        
    })

})