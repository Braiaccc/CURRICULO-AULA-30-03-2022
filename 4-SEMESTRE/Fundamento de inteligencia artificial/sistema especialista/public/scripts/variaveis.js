let id = 0;

function addInputField() {
    var container = document.getElementById('values-container');
    var input = document.createElement('input');
    input.type = 'text';
    input.name = 'variableValues[]';
    input.required = true;
    container.appendChild(input);
}


function enviarVariavel(){
    id++
    const form = document.getElementById('variable-form')
    const varName = form.elements['variableName'].value
    let variableValues = []
    const valueInputs = form.elements['variableValues[]']
    const type = form.elements['tipo-variavel'].value

    if(!valueInputs.length){
        variableValues = [valueInputs.value]
    }else{
        for (let i = 0; i < valueInputs.length; i++){
            variableValues.push(valueInputs[i].value)
        }
    }
    
    const data = {
        "id": id,
        "varName": varName,
        "values": variableValues,
        "type": type
    }

    const OPTIONS = {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json' 
        }
    }
    fetch('/vars', OPTIONS)
    
}