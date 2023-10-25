let num = 0;
const containerRegras = document.getElementById('container-regras')
const operadoresNumericos = ['>', '>=', '<', '<=', '==', '!='];
const operadoresTexto = ['==', '!='];
const variaveisEl = document.querySelector('.variavel')
let arraySelectsVar = []

const adicionarCondicoes = async () => {
    
    const novoSelectDiv = document.createElement('div');
    novoSelectDiv.id = `condicao-regra${num}`;

    const novoVariavelSelect = document.createElement('select');
    novoVariavelSelect.name = `variavel${num}`;
    novoVariavelSelect.id = `variavel${num}`;
    novoVariavelSelect.className = 'variavel';

    const novoOperadorSelect = document.createElement('select');
    novoOperadorSelect.name = `operador${num}`;
    novoOperadorSelect.id = `operador${num}`;
    novoOperadorSelect.className = 'operador'

    const novoResultadoSelect = document.createElement('select');
    novoResultadoSelect.name = `resultado${num}`;
    novoResultadoSelect.id = `resultado${num}`;
    novoResultadoSelect.className = 'resultado'

    novoSelectDiv.appendChild(novoVariavelSelect);
    novoSelectDiv.appendChild(novoOperadorSelect);
    novoSelectDiv.appendChild(novoResultadoSelect);
    
    if(num > 0){
        const radioAnd = document.createElement('input')
        const labelAnd = document.createElement('label')
    
        radioAnd.type = 'radio'
        radioAnd.name = `operador-logico${num}`
        radioAnd.value = 'E'
        radioAnd.className = 'logical-operator-radio-input'

        labelAnd.for = 'E'
        labelAnd.textContent = 'E'

        const radioOr = document.createElement('input')
        const labelOr = document.createElement('label')

        radioOr.type = 'radio'
        radioOr.name = `operador-logico${num}`
        radioOr.value = 'OU'
        labelOr.for = 'OU'
        labelOr.textContent = 'OU'
        radioOr.className = 'logical-operator-radio-input'
        
        novoSelectDiv.appendChild(radioAnd)
        novoSelectDiv.appendChild(labelAnd)
        novoSelectDiv.appendChild(radioOr)
        novoSelectDiv.appendChild(labelOr)
    }
    num++
    containerRegras.appendChild(novoSelectDiv);
    popularVariaveis(novoSelectDiv.id)
}

const getData = async () => {
    const response = await fetch('/variaveis');
    const json = await response.json();
    return json;
}

const getDataForVar = async (nome) => {
    const response = await fetch(`/vars/${nome}`)
    const json = await response.json();
    return json;
}

function getElementChildrenArr(id){
    const children = document.getElementById(id).children
    let arr = Array.prototype.slice.call(children)
    return arr
}

async function popularVariaveis(id){
    const [variavelEl, operadorEl, resultadoEl] = getElementChildrenArr(id)

    const json = await getData()
    
    for(let key of json){
        const opt = document.createElement('option')
        opt.value = key.varName
        opt.text = key.varName
        variavelEl.appendChild(opt)
    }
    console.log(variavelEl.value)
    arraySelectsVar.push(variavelEl)

    variavelEl.addEventListener('change', popularValores(variavelEl, operadorEl, resultadoEl))
}

const popularValores = async (variavelEl, operadorEl, resultadoEl) => {
    const nome = variavelEl.value
    const json = await getDataForVar(nome);
    const tipoOperador = json.type === 'numerica' ? operadoresNumericos : operadoresTexto;
    console.log(json)

    operadorEl.innerHTML = ''
    resultadoEl.innerHTML = ''

    for(let value of json.values){
        console.log(value)
        const opt = document.createElement('option')
        opt.value = value
        opt.text = value
        resultadoEl.appendChild(opt)
    }

    for(let op of tipoOperador){
        const opt = document.createElement('option')
        opt.value = op
        opt.text = op
        operadorEl.appendChild(opt)
    }
}

containerRegras.addEventListener('click', (e) => {
    if(e.target.className === 'variavel'){
        let num = e.target.id.charAt(e.target.id.length -1)
        const variavelEl = document.getElementById(`variavel${num}`)
        const operadorEl = document.getElementById(`operador${num}`)
        const resultadoEl = document.getElementById(`resultado${num}`)

        //const [variavel, operador, resultado] = getElementChildrenArr(e.target.id)
        console.log(variavelEl, operadorEl, resultadoEl)
        popularValores(variavelEl, operadorEl, resultadoEl)
    }
})

const variavelAcaoEl = document.getElementById('variavel-ent')
const operadorAcaoEl = document.getElementById('operador-ent')
const resultadoAcaoEl = document.getElementById('resultado-ent')
const containerAcao = document.getElementById('container-acao')

containerAcao.addEventListener('click', popularVariaveis(containerAcao.id))
variavelAcaoEl.addEventListener('change', async () => {
    popularValores(variavelAcaoEl, operadorAcaoEl, resultadoAcaoEl)
})