//use pizzaria;

//Criação das collections e os inserts
db.createCollection("clientes");
var clientesArray = [{
    "_id": 1,
    "nome": "Bernardo Alves",
    "enderecos": [
        {
            "rua": "Rua 123",
            "bairro": "Aquele la",
            "numero": 123
        },
        {
            "rua": "General Osório",
            "bairro": "Santa Luzia",
            "numero": 2929
        }
    ],
    "telefones": ["51923664988", "51928524157", "51938894586"]
},
{
    "_id": 2,
    "nome": "virso",
    "enderecos": [
        {
            "rua": "Anormal",
            "bairro": "estranhos",
            "numero": 69
        }
    ],
    "telefones": ["51985881205"]
}]
db.clientes.insertMany(clientesArray)

db.createCollection("itens")
var itensArray = [
    {
        "_id": 1,
        "nome": "pizza",
        "sabores": [
            {"sabor": "calabresa", "tamanhos": 
                [{"tamanho": "P", "valor":89.90},
                {"tamanho": "M", "valor": 100},
                {"tamanho": "G", "valor": 120}]
            },
            {"sabor": "chocolate", "tamanhos": 
                [{"tamanho": "P", "valor":89.90},
                {"tamanho": "M", "valor": 100},
                {"tamanho": "G", "valor": 120}]},
            {"sabor": "bacon com milho", "tamanhos": 
                [{"tamanho": "P", "valor":89.90},
                {"tamanho": "M", "valor": 100},
                {"tamanho": "G", "valor": 120}]}
        ]
    },
    {
        "_id": 2,
        "nome": "bebidas",
        "sabores": [
            {"sabor": "Coca-Cola", "estoque": 15, "tamanhos": 
                [{"tamanho": "350ml", "valor":6},
                {"tamanho": "1lt", "valor": 15},
                {"tamanho": "2lt", "valor": 20}]},
            {"sabor": "Fanta", "estoque": 15, "tamanhos": 
                [{"tamanho": "350ml", "valor":6},
                {"tamanho": "1lt", "valor": 15},
                {"tamanho": "2lt", "valor": 20}]},
            {"sabor": "Sprite", "estoque": 16, "tamanhos": 
                [{"tamanho": "350ml", "valor":6},
                {"tamanho": "1lt", "valor": 15},
                {"tamanho": "2lt", "valor": 20}]}
            ]
    },
    {
        "_id": 3,
        "nome": "chiclete",
        "sabores": [
            {"sabor": "trident menta", "estoque": 10}
        ]
    }
]
db.itens.insertMany(itensArray)

var pedidosArray = [
    {
        "_id": 1,
        "_idCliente": 1,
        "itens": [
            {"_idItem": 1, "qtd": 1, "valor": 89.90, "tamanho": "P", "sabores": ["cholate misto"]},
            {"_idItem": 1, "qtd": 3, "valor": 120, "tamanho": "G", "sabores":["bacon com milho", "filé com fritas", "portuguesa"]},
            {"_idItem": 2, "qtd": 2, "valor": 20, "tamanho": "1lt", "sabores":["Coca-Cola", "Sprite"]}
        ],
        "entrega": true,
        "numeroMesa": null,
        "endereco": {
            "rua": "Rua 123",
            "bairro": "Aquele la",
            "numero": 123
        },
        "valorTotal": 489,
        "dataEntrega": "2023-06-21"
    },
    {
        "_id": 2,
        "_idCliente": 1,
        "itens": [
            {"_idItem": 1, "qtd": 1, "valor": 89.90, "tamanho": "P", "sabores": ["cholate misto"]},
            {"_idItem": 1, "qtd": 1, "valor": 89.90, "tamanho": "P", "sabores": ["portuguesa"]},
            {"_idItem": 2, "qtd": 1, "valor": 20, "tamanho": "1lt", "sabores":["Coca-Cola"]}
        ],
        "entrega": false,
        "numeroMesa": 3,
        "endereco": null,
        "valorTotal": 199.8,
        "dataEntrega": "2023-06-21"
    },
    {
        "_id": 3,
        "_idCliente": 2,
        "itens": [
            {"_idItem": 1, "qtd": 1, "valor": 89.90, "tamanho": "P", "sabores": ["portuguesa"]},
            {"_idItem": 2, "qtd": 1, "valor": 20, "tamanho": "1lt", "sabores":["Sprite"]}
        ],
        "entrega": false,
        "numeroMesa": 24,
        "endereco": null,
        "valorTotal": 109.9,
        "dataEntrega": null
    }
]
db.pedidos.insertMany(pedidosArray)

//udpate de um documento
db.itens.updateMany(
    {"_id": 1},
    {$set: {"sabores.$[].tamanhos.$[tamanho].valor": 80}},
    {arrayFilters: [{"tamanho.tamanho": "P"}]}
)

//removendo um documento
db.itens.deleteOne(
    {"_id": 3}
)

//quey simples para achar o documento que tem o nome de pizza
db.itens.find(
    {"nome": "pizza"}
)

//query que retorna os pedidos com valor total maior que 300
db.pedidos.find(
    {"valorTotal": {$gt: 300}}
)

//query que retorna uma lista com os nomes dos clientes juntamente de quanto eles gastaram
db.pedidos.aggregate([
    {
        $lookup: {
            from: "clientes",
            localField: "_idCliente",
            foreignField: "_id",
            as: "cliente"
        }
    },
    {
        $group: {_id: "$_idCliente", "nomeCliente": {$first: "$cliente.nome"},"gastoPorCliente": {$sum: "$valorTotal"}}
    }
])

//retorna um documento que junta as informações sobre um cliente junto de todos os seus pedidos
db.clientes.aggregate(
    {
      $lookup: {
        from: "pedidos",
        localField: "_id",
        foreignField: "_idCliente",
        as: "pedidosCliente"
      }
    }
)

//retorna um documento que junta os pedidos que forma entregues juntamente com o cliente que fez o pedido
db.pedidos.aggregate([
    {
        $match: {"entrega": true}
    },
    {
        $lookup: {
            from: "clientes",
            localField: "_idCliente",
            foreignField: "_id",
            as: "pedidosCliente"
        }
    },
    {
        $project: {
            "pedidosCliente.nome": 1,
            "endereco": 1,
            "valorTotal": 1,
            "itens.sabores": 1
        }
    }
])

//retornas todos os clientes que fizeram o pedido de uma coca-cola
db.pedidos.aggregate([
    {
        $match: {
            "itens": {
                $elemMatch: {"sabores": "Coca-Cola"}
            }
        }
    },
    {
        $lookup: {
            from: "clientes",
            localField: "_idCliente",
            foreignField: "_id",
            as: "pedidosCliente"
        }
    },
    {
        $project: {
            "pedidosCliente.nome": 1,
        }
    },
    
])

db.pedidos.createIndex({"_idCliente": 1})
/*
foi criado um index na collection pedidos
o index está no atributo _idCliente
esse index foi criado pois fazemos varias consultas
combinando as collections pedidos e clientes, utilizando o _idCliente
como comparação no $lookup
*/