$(document).ready(function(){

    $('#calcular').click(function(){
    var n1 = parseFloat($('#n1').val())
    var n2 = parseFloat($('#n2').val())
    var operacao = $('#operacao').val()
    var resultado 
    

        switch (operacao) {
            case '+':
                resultado = n1 + n2
            break;
            case '-':
                resultado = n1 - n2
            break;
            case '*':
                resultado = n1 * n2
            break;
            case '/':
                resultado = n1 / n2
            break;
        }
    
  
    $('#resultado').html(resultado)
    
    })
    

})

