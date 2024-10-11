def person = ["name": "Alice", "age" : 28, "city":"Jakarta"]

//soal 1 (BENAR)
println("Name: ${person.name}")
println("City: ${person.city}")

//soal 2 (BENAR)
person.country = "Indonesia"
person.age = 29
println(person)

//soal 3 (BENAR)
person.remove("city")
println(person)

//soal 4 (BENAR)
def fruits = ["apple": 10, "banana": 15, "orange": 20]
fruits.each {key, value ->
    println("${key} : ${value}")
}

////soal 5 (BENAR)
//def grades = [:]
//Scanner scanner = new Scanner(System.in)
//
//while (true) {
//    println("Nama siswa (ketik 'selesai' untuk berhenti): ")
//    def namaSiswa = scanner.nextLine()
//
//    if (namaSiswa.toLowerCase() == "selesai"){
//        break
//    }
//
//    println("Nilai: ")
//    def nilai = scanner.nextLine().toInteger()
//
//    grades[namaSiswa] = nilai
//
//}
//println("Daftar nilai siswa")
//println(grades)
//
////soal 6 (BENAR)
//if (grades.containsKey("Alice")){
//    println("Nilai Alice: ${grades["Alice"]}")
//} else {
//    println("Alice tidak ditemukan dalam daftar")
//}

//soal 7 (BENAR)
map1 = ["a": 1, "b": 2, "c": 3]
map2 = ["d": 4, "e": 5, "f": 6]
println("${combinedMap = map1 + map2}")

//soal 8 (BENAR)
def keys = person.keySet()
def values = person.values()

println("Keys : ${keys}")
println("Values: ${values}")

//soal 9 (BENAR)
def angka = [1: "satu", 2: "dua", 3:"tiga"]
println(angka[2])
println(angka[3])

//soal 10
def immutablePerson = ["name" : "Alice", "age":28, "city" : "Jakarta"]
immutablePerson.asImmutable()
try {
    immutablePerson['country'] = "Indonesia"
} catch (Exception e) {
    println("Error: ${e.message}")
}
