select p.nome as produto, sum(vp.qtd) as qtd_vendida,
        sum(vp.qtd * vp.val_unit) as valor_total
from vendas v
    join vendas_produtos vp
        on v.id = pv.venda_id
    join produtos p
        on vp.produto_id = p.id
where v.data>='2023-02-2' and v.data<='2023-02-28'
group by p.nome
order by valor_total desc
limit 1