let idRegra = 0;

async function cadastrarRegra(){
    const nomeRegra = document.getElementById('nome-regra').value
    const containerAcao = document.getElementById('container-acao')
    let acaoChildren = Array.prototype.slice.call(containerAcao.children)
    let children = containerRegras.children
    let divArr = Array.prototype.slice.call(children)

    let regraObj = {
        "id": idRegra,
        "nomeRegra": nomeRegra,
        "condicoes": [],
        "entao": {}
    }
    console.log(divArr)
    for(let i = 0; i < divArr.length; i++){
        let condicoesObj = {}
        
        let children = divArr[i].children
        let arr = Array.prototype.slice.call(children)

        for(let j = 0; j < arr.length; j++){
            if(arr[j].className == "variavel"){
                condicoesObj.var = arr[j].value
            }

            else if(arr[j].className == "operador"){
                condicoesObj.op = arr[j].value
            }
            
            else if(arr[j].className == "resultado"){
                condicoesObj.value = arr[j].value
            }
            
            else if(arr[j].className == 'logical-operator-radio-input'){
                if(arr[j].value == 'OU'){
                    condicoesObj.statementOperator = '||'
                }else{
                    condicoesObj.statementOperator = '&&'
                }
                
            }
        }

        regraObj.condicoes.push(condicoesObj)
        console.log(acaoChildren)
        for(let i = 0; i < acaoChildren.length; i++){

            console.log(acaoChildren[i]);

            if(acaoChildren[i].id == 'variavel-ent'){
                regraObj.entao.var = acaoChildren[i].value
            }
            
            else if(acaoChildren[i].id == 'resultado-ent'){
                regraObj.entao.value = acaoChildren[i].value
            }
        }
    }
    idRegra++

    enviarBanco(regraObj, '/regras')
    containerRegras.innerHTML = ''
}

const enviarBanco = async (obj, route) => {
    const OPTIONS = {
        method: 'POST',
        body: JSON.stringify(obj),
        headers: {
            'Content-Type': 'application/json' 
        }
    }

    fetch(route, OPTIONS)
}