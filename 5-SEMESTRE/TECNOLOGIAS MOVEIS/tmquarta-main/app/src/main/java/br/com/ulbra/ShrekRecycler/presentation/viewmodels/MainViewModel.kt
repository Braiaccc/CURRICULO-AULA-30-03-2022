package br.com.ulbra.ShrekRecycler.presentation.viewmodels

import androidx.lifecycle.ViewModel
import br.com.ulbra.ShrekRecycler.data.Product

class MainViewModel : ViewModel() {
    private val list = mutableListOf(
        Product(
            urlImage = "https://i.ytimg.com/vi/9e3D23xJC3c/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLDOafCJn2vhOuUMzkSIbIUR8Py7rQ",
            name = "Shrek",
            price = "R$26.00"
        ),
        Product(
            urlImage = "https://i.blogs.es/98cb78/shrek3/450_1000.jpg",
            name = "shrek 3",
            price = "R$55.00"
        ),
        Product(
            urlImage = "https://br.web.img2.acsta.net/medias/nmedia/18/97/04/22/20504502.jpg",
            name = "Shrek 2",
            price = "R$45.90"
        ),
        Product(
            urlImage = "https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/87/90/45/19962744.jpg",
            name = "Shrek 4",
            price = "R$57.90"
        ),
        Product(
            urlImage = "https://upload.wikimedia.org/wikipedia/pt/e/ed/Shrek%28personagem%29.jpg",
            name = "Shrek?",
            price = "R$99.90"
        ),
        Product(
            urlImage = "https://img6.arthub.ai/649eb0da-be1c.webp",
            name = "Batman",
            price = "R$330.90",
    )

    )
    fun getProducts() = list

    fun removeItem(index: Int) {
        list.removeAt(index)
    }
}