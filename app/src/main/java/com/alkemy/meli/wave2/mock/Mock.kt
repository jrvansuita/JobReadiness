package com.alkemy.meli.wave2.mock

data class ItemModel(
    val id: String,
    val name: String,
    val price: String,
    val image: String,
    val descriptionOne: String,
    val descriptionTwo: String,
)

object ItemList {
    fun getCarList(): List<ItemModel> {
        return listOf(
            ItemModel(
                id = "0",
                name = "Honda HR-V EXL 2019",
                price = "R$132.650,00",
                image = "https://img.freepik.com/fotos-premium/carros-dirigindo-na-estrada_10541-1257.jpg?w=1060",
                descriptionOne = "SUV",
                descriptionTwo = "Sport"
            ),
            ItemModel(
                id = "1",
                name = "Ford Fiesta 1.6",
                price = "R$60.000,00",
                image = "https://img.freepik.com/fotos-gratis/um-cupe-mini-vermelho-dirigindo-na-estrada-com-alta-velocidade_114579-4060.jpg?w=1060&t=st=1664471873~exp=1664472473~hmac=bd933784d16f69d22f3b22d4f8a8df5f5d8f3a363588e5c857b0b96dcfaa4cab",
                descriptionOne = "City",
                descriptionTwo = "Coupé"
            ),
            ItemModel(
                id = "2",
                name = "Lamborgini Urus",
                price = "R$200.000,00",
                image = "https://img.freepik.com/fotos-premium/carro-suv-realista-isolado-na-ilustracao-de-renderizacao-3d-de-fundo_494250-8539.jpg?w=1480",
                descriptionOne = "SUV",
                descriptionTwo = "Ultra Sport"
            ),
            ItemModel(
                id = "3",
                name = "BMW M3 Concept",
                price = "R$870.000,00",
                image = "https://img.freepik.com/fotos-gratis/sedan-azul-esporte-estacionado-no-quintal_114579-5078.jpg?w=1060&t=st=1664472052~exp=1664472652~hmac=c17dfff8acf3083e3eb2b12bc1f977d2ca636a5de95e68e28fe99ed97db845b6",
                descriptionOne = "SuperCar",
                descriptionTwo = "Ultra Sport"
            ),
            ItemModel(
                id = "4",
                name = "Camaro 2.8",
                price = "R$460.000,00",
                image = "https://img.freepik.com/fotos-gratis/carros-esporte-vermelhos-e-pretos-correndo-na-estrada_114579-4069.jpg?w=1060&t=st=1664472156~exp=1664472756~hmac=e0d5cef7d9bf4e26937b31972a1e249c7acc86fc639f04c04e820e566b18533a",
                descriptionOne = "SuperCar",
                descriptionTwo = "Ultra Sport"
            ),
            ItemModel(
                id = "5",
                name = "Porche 911 carrera",
                price = "R$780.000,00",
                image = "https://img.freepik.com/fotos-gratis/um-mini-cupe-vermelho-estacionou-no-porto_114579-5194.jpg?w=1060&t=st=1664472212~exp=1664472812~hmac=fb9cba333d297e4262ab8d2ab56610369655c227442845fb07b3bc8a93716a22",
                descriptionOne = "SuperCar",
                descriptionTwo = "Ultra Sport"
            ),
        )
    }

    fun getMotorcycleList(): List<ItemModel> {
        return listOf(
            ItemModel(
                id = "0",
                name = "Honda CBR 650R",
                price = "R$50.900,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/CBR-650R-cinza.webp",
                descriptionOne = "Sport",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "1",
                name = "Honda CBR 1000RR-R Fireblade SP",
                price = "R$160.590,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/CBR-1000RR-vermelha.webp",
                descriptionOne = "Sport",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "2",
                name = "Honda CRF 250F",
                price = "R$19.070,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/CRF-250F-vermelha.webp",
                descriptionOne = "Off Road",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "3",
                name = "TRX 420 FourTrax",
                price = "R$44.650,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-08/TRX%20Vermelha%202023%20Cor%20Eixo.png",
                descriptionOne = "Off Road",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "4",
                name = "NC 750X",
                price = "R$49.700,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/NC-750X-Vermelha.webp",
                descriptionOne = "Adventure",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "5",
                name = "Honda CRF 1100L Africa Twin Adventure Sports ES",
                price = "R$95.440,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/CRF-1000L-Africa-Twin-Adventure-Sports.webp",
                descriptionOne = "Adventure",
                descriptionTwo = "Honda Motos Brasil"
            )

        )
    }

    fun getTruckList(): List<ItemModel> {
        return listOf(
            ItemModel(
                id = "0",
                name = "Volksvagen 9.160 4x2",
                price = "R$149.900,00",
                image = "https://img.freepik.com/foto-gratis/camion-3d_1048-4526.jpg?3&w=1380&t=st=1664456680~exp=1664457280~hmac=a5cef03205daea01147fd6f8a2cc285a4b0d84dc847d682fcef56ee9073bd607",
                descriptionOne = "2013 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "1",
                name = "Volksvagen 6x2 Trucado",
                price = "R$229.000,00",
                image = "https://img.freepik.com/foto-gratis/camion-parado-al-aire-libre-cerca-almacen_259150-56932.jpg?w=1800&t=st=1664456757~exp=1664457357~hmac=07dc2c420b3c556618a7736b47306021d693e72e35d57a2c0232955dde1706e8",
                descriptionOne = "2014 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "2",
                name = "Volksvagen Vw Baú",
                price = "R$235.000,00",
                image = "https://img.freepik.com/foto-gratis/camion-vehiculo-largo-listo-entregar-transportar_342744-1294.jpg?w=1800&t=st=1664456795~exp=1664457395~hmac=78c5b140151c18765e28c5d6fda1e6117310901e8317ba082c157e2b733b55ec",
                descriptionOne = "2013 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "3",
                name = "Caminhão Actros Cavalo 6x2",
                price = "R$625.000,00",
                image = "https://img.freepik.com/foto-gratis/vehiculo-camion-remolques-segundo-plano_342744-1297.jpg?size=626&ext=jpg&ga=GA1.2.1054598073.1664456634",
                descriptionOne = "2021 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "4",
                name = "Caminhão Volvo Fh540",
                price = "R$595.000,00",
                image = "https://img.freepik.com/foto-gratis/paseos-camiones-carretera-asfaltada-otono_185193-83624.jpg?size=626&ext=jpg&ga=GA1.2.1054598073.1664456634",
                descriptionOne = "2018 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "5",
                name = "Caminhão Volvo Fh540",
                price = "R$889.000,00",
                image = "https://img.freepik.com/foto-gratis/grupo-camiones-estacionados-fila_342744-533.jpg?size=626&ext=jpg&ga=GA1.2.1054598073.1664456634",
                descriptionOne = "2022 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
        )
    }

    fun getPropertyList(): List<ItemModel> {
        return listOf(
            ItemModel(
                id = "0",
                name = "Apartamento em Barueri 2 Suítes",
                price = "R$399.000,00",
                image = "https://img.freepik.com/fotos-gratis/foto-de-baixo-angulo-da-fachada-de-um-edificio-moderno-branco-sob-um-ceu-azul-claro_181624-48219.jpg?w=1480&t=st=1664471687~exp=1664472287~hmac=d016af6fc726862cb6b09e337300445b22b3715b10eaafeaad283af26ed4f0e7",
                descriptionOne = "Barueri",
                descriptionTwo = "105m²"
            ),
            ItemModel(
                id = "1",
                name = "Casa com 2 Dorms. Jundiaí",
                price = "R$440.500,00",
                image = "https://img.freepik.com/fotos-gratis/casa-isolada-no-campo_1303-23773.jpg?w=1480&t=st=1664471776~exp=1664472376~hmac=73dda2dd1f0fe552841da127fd90dc1d71241ca7bbfc9046ef2d94683ee8a968",
                descriptionOne = "Jundiaí",
                descriptionTwo = "75m²"
            ),
            ItemModel(
                id = "2",
                name = "Apartamento de 3 dormitórios São Paulo",
                price = "R$980.000,00",
                image = "https://img.freepik.com/fotos-gratis/arquitetura-moderna-de-apartamentos_1268-14696.jpg?w=1480&t=st=1664471876~exp=1664472476~hmac=52fb632dd3ae1ea7647d35a84a54bd69e34c2fb0f80ca7040f2145b6d4732e6a",
                descriptionOne = "São Paulo",
                descriptionTwo = "85m²"
            ),
            ItemModel(
                id = "3",
                name = "Apartamento de 1 dormitório Pinheiros",
                price = "R$800.000,00",
                image = "https://img.freepik.com/fotos-gratis/foto-interior-bonita-de-uma-casa-moderna-com-paredes-brancas-relaxantes-moveis-e-tecnologia_181624-3828.jpg?w=1480&t=st=1664472004~exp=1664472604~hmac=92e7cc1411c9a1aad9494e671d3e284bcb0572270edfdbe22968b4f507fd969a",
                descriptionOne = "São Paulo",
                descriptionTwo = "75m²"
            ),
            ItemModel(
                id = "4",
                name = "Linda casa nova com Piscina em Monguaguá",
                price = "R$319.900,00",
                image = "https://img.freepik.com/fotos-gratis/paineis-solares-no-telhado-de-uma-casa-moderna-coleta-de-energia-renovavel-com-paineis-de-celulas-solares-design-exterior-renderizacao-em-3d_41470-3654.jpg?w=1800&t=st=1664472071~exp=1664472671~hmac=ea77da5a6aa0a55a2446d46d797b1a2acdbc565ac2caa9069e2ed494805df527",
                descriptionOne = "Monguaguá",
                descriptionTwo = "155m²"
            ),
            ItemModel(
                id = "5",
                name = "Apartamento com 3 dormitórios em Interlagos",
                price = "R$919.900,00",
                image = "https://img.freepik.com/fotos-gratis/area-de-jantar-de-estudio-confortavel-ou-quarto-de-hotel_1262-12324.jpg?w=1480&t=st=1664472179~exp=1664472779~hmac=13b74c9d45d13febd016bd1e90b6f4236de13f78e720ad4272211523309f602b",
                descriptionOne = "São Paulo",
                descriptionTwo = "141m²"
            ),
        )
    }

    fun getFavoriteList(): List<ItemModel> {
        return listOf(
            ItemModel(
                id = "0",
                name = "Apartamento em Barueri 2 Suítes",
                price = "R$399.000,00",
                image = "https://img.freepik.com/fotos-gratis/foto-de-baixo-angulo-da-fachada-de-um-edificio-moderno-branco-sob-um-ceu-azul-claro_181624-48219.jpg?w=1480&t=st=1664471687~exp=1664472287~hmac=d016af6fc726862cb6b09e337300445b22b3715b10eaafeaad283af26ed4f0e7",
                descriptionOne = "Barueri",
                descriptionTwo = "105m²"
            ),
            ItemModel(
                id = "1",
                name = "Volksvagen 6x2 Trucado",
                price = "R$229.000,00",
                image = "https://img.freepik.com/foto-gratis/camion-parado-al-aire-libre-cerca-almacen_259150-56932.jpg?w=1800&t=st=1664456757~exp=1664457357~hmac=07dc2c420b3c556618a7736b47306021d693e72e35d57a2c0232955dde1706e8",
                descriptionOne = "2014 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "2",
                name = "NC 750X",
                price = "R$49.700,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/NC-750X-Vermelha.webp",
                descriptionOne = "Adventure",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "3",
                name = "Caminhão Volvo Fh540",
                price = "R$595.000,00",
                image = "https://img.freepik.com/foto-gratis/paseos-camiones-carretera-asfaltada-otono_185193-83624.jpg?size=626&ext=jpg&ga=GA1.2.1054598073.1664456634",
                descriptionOne = "2018 - 37.000 Km",
                descriptionTwo = "Bs.As. G.B.A. Norte"
            ),
            ItemModel(
                id = "4",
                name = "Honda CRF 250F",
                price = "R$19.070,00",
                image = "https://www.honda.com.br/motos/sites/hda/files/styles/product_200x128/public/2022-03/CRF-250F-vermelha.webp",
                descriptionOne = "Off Road",
                descriptionTwo = "Honda Motos Brasil"
            ),
            ItemModel(
                id = "5",
                name = "Linda casa nova com Piscina em Monguaguá",
                price = "R$319.900,00",
                image = "https://img.freepik.com/fotos-gratis/paineis-solares-no-telhado-de-uma-casa-moderna-coleta-de-energia-renovavel-com-paineis-de-celulas-solares-design-exterior-renderizacao-em-3d_41470-3654.jpg?w=1800&t=st=1664472071~exp=1664472671~hmac=ea77da5a6aa0a55a2446d46d797b1a2acdbc565ac2caa9069e2ed494805df527",
                descriptionOne = "Monguaguá",
                descriptionTwo = "155m²"
            ),
        )
    }
}