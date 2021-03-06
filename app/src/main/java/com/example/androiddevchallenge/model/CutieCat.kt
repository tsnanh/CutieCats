/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import androidx.compose.ui.graphics.Color

data class CutieCat(val id: Long, val catName: String, val species: String, val age: Int, val eyeColor: Color, val gender: Gender, val skinColor: Color, val image: List<String>, val description: String, val hairColor: List<Color>)

enum class Gender {
    MALE, FEMALE
}

val cats = listOf(
    CutieCat(1, "DD", "Norwegian Forest cat", 5, Color.Yellow, Gender.MALE, Color.White, listOf("https://static.wikia.nocookie.net/creamheroes/images/6/6e/DD_Pose_2.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/7/72/0506FCED-9374-4AB3-9726-B8E4B2599900.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/3/33/DD_Pose_1.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/8/82/CF20063C-43F4-4C03-8163-98B83A5A5CBA.jpeg"), "DD (디디) is a Norwegian Forest Cat and one of the CreamHeroes cats. He is very friendly and gentle as well as being one of the closest cats to Claire.", listOf(Color.White)),
    CutieCat(2, "LuLu", "Munchkin cat, British Shorthair and Scottish Fold hybrid + alpha", 3, Color.Yellow, Gender.MALE, Color.DarkGray, listOf("https://static.wikia.nocookie.net/creamheroes/images/5/52/Lulu%27s_Profile_Image.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/a/a3/Lulucat1.jpg", "https://static.wikia.nocookie.net/creamheroes/images/6/69/Screenshot_2021-01-09_210646.png", "https://static.wikia.nocookie.net/creamheroes/images/e/e0/Creamheroes.jpg"), "Lulu (루루) is a Hybrid-mixed cat and is one of the CreamHeroes cats.", listOf(Color.Black)),
    CutieCat(3, "TT", "American+European shorthair mix and tabby cat", 5, Color.Yellow, Gender.FEMALE, Color.LightGray, listOf("https://static.wikia.nocookie.net/creamheroes/images/3/3b/659F03EC-47D9-4EEB-A7E4-CDCE7A4B42A4.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/5/53/9C353F58-0A8A-45B3-95F2-1A7F0F83EB8E.jpeg"), "TT (티티) is an American Shorthair cat and one of the CreamHeroes cats. She is one of the more territorial cats but has the closest bond with Claire. Most think her as the top ranking cat.", listOf(Color.White)),
    CutieCat(4, "MoMo", "Exotic Shorthair and tabby cat", 4, Color.Yellow, Gender.MALE, Color.White, listOf("https://static.wikia.nocookie.net/creamheroes/images/f/f8/645611DB-7FC6-46A6-AB01-01C5C5FBF018.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/1/1d/A70B369C-63C1-485A-909F-19C3EBBA9DEE.jpeg"), "Momo (모모) is a Garfield-faced Exotic Shorthair and one of the CreamHeroes cats. His name also means peaches in Japanese.", listOf(Color.Yellow)),
    CutieCat(5, "CoCo", "Scottish Highland Straight", 4, Color.Yellow, Gender.MALE, Color.Black, listOf("https://static.wikia.nocookie.net/creamheroes/images/6/6b/E9D2ED11-369A-469D-81D8-C02777DD4EC1.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/6/6f/359A13CE-60FD-421B-8770-415FD99B2CC8.jpeg/revision/latest/scale-to-width-down/220?cb=20190831100924", "https://static.wikia.nocookie.net/creamheroes/images/f/f1/C01F7039-CE2C-4C23-A143-627BABB8F529.jpeg"), "Coco (코코) is a white-coated Highland Straight and one of the CreamHeroes cats.", listOf(Color.White)),
    CutieCat(6, "LaLa", "Long hair Napoleon Munchkin cat", 3, Color.Yellow, Gender.FEMALE, Color.Blue, listOf("https://static.wikia.nocookie.net/creamheroes/images/4/41/LalaProfileImage.jpeg"), "Lala (라라) is a white-coated munchkin cat and is one of the CreamHeroes cats.", listOf(Color.White)),
    CutieCat(7, "ChuChu", "Scottish Fold/Persian mix", 3, Color.Yellow, Gender.FEMALE, Color.White, listOf("https://static.wikia.nocookie.net/creamheroes/images/2/26/2000E79F-F837-450E-8F5F-3D81C2A94BD7.jpeg", "https://static.wikia.nocookie.net/creamheroes/images/d/db/0E7D3068-F873-45EC-80CD-FEF8049B94DA.jpeg"), "Chuchu (츄츄) is a tri-colored Highland Fold and is one of the Cream Heroes cats.", listOf(Color.White, Color.Yellow, Color.Black)),
)
