package com.alkemy.meli.wave2.mock

import com.alkemy.meli.wave2.car.model.Car

fun getMockedCars() =
    listOf(
        Car(
            id = 1,
            name = "Honda HR-V EXL 2019",
            price = "R$132.650,00",
            image = "https://img.freepik.com/fotos-premium/carros-dirigindo-na-estrada_10541-1257.jpg?w=1060",
            descriptionOne = "SUV",
            descriptionTwo = "Sport"
        ),
        Car(
            id = 2,
            name = "Ford Fiesta 1.6",
            price = "R$60.000,00",
            image = "https://img.freepik.com/fotos-gratis/um-cupe-mini-vermelho-dirigindo-na-estrada-com-alta-velocidade_114579-4060.jpg?w=1060&t=st=1664471873~exp=1664472473~hmac=bd933784d16f69d22f3b22d4f8a8df5f5d8f3a363588e5c857b0b96dcfaa4cab",
            descriptionOne = "City",
            descriptionTwo = "Coupé"
        ),
        Car(
            id = 3,
            name = "Lamborgini Urus",
            price = "R$200.000,00",
            image = "https://img.freepik.com/fotos-premium/carro-suv-realista-isolado-na-ilustracao-de-renderizacao-3d-de-fundo_494250-8539.jpg?w=1480",
            descriptionOne = "SUV",
            descriptionTwo = "Ultra Sport"
        ),
        Car(
            id = 4,
            name = "BMW M3 Concept",
            price = "R$870.000,00",
            image = "https://img.freepik.com/fotos-gratis/sedan-azul-esporte-estacionado-no-quintal_114579-5078.jpg?w=1060&t=st=1664472052~exp=1664472652~hmac=c17dfff8acf3083e3eb2b12bc1f977d2ca636a5de95e68e28fe99ed97db845b6",
            descriptionOne = "SuperCar",
            descriptionTwo = "Ultra Sport"
        ),
        Car(
            id = 5,
            name = "Camaro 2.8",
            price = "R$460.000,00",
            image = "https://img.freepik.com/fotos-gratis/carros-esporte-vermelhos-e-pretos-correndo-na-estrada_114579-4069.jpg?w=1060&t=st=1664472156~exp=1664472756~hmac=e0d5cef7d9bf4e26937b31972a1e249c7acc86fc639f04c04e820e566b18533a",
            descriptionOne = "SuperCar",
            descriptionTwo = "Ultra Sport"
        ),
        Car(
            id = 6,
            name = "Porche 911 carrera",
            price = "R$780.000,00",
            image = "https://img.freepik.com/fotos-gratis/um-mini-cupe-vermelho-estacionou-no-porto_114579-5194.jpg?w=1060&t=st=1664472212~exp=1664472812~hmac=fb9cba333d297e4262ab8d2ab56610369655c227442845fb07b3bc8a93716a22",
            descriptionOne = "SuperCar",
            descriptionTwo = "Ultra Sport"
        )
    )