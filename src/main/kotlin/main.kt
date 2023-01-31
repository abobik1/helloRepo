fun main(){
        val employees = listOf(
            Employee("Tom", "Microsoft"),
            Employee("Bob", "JetBrains"),
            Employee("Sam", "Google"),
            Employee("Alice", "Microsoft"),
            Employee("Kate", "Google")
        )
    ffghvghjnf cjhfvu cbnnfg nmnbfcbdfhtb 230987654321
        val companies = employees.groupBy { it.company }    // объект Map<String, List<Employee>>
     
        println(companies) // {Microsoft=[Tom, Alice], JetBrains=[Bob], Google=[Sam, Kate]}
     
        // перебор групп
        for (company in companies){
                println(company.key) // название компании
                // перебор списка сотрудников
                for (employee in company.value){
                    println(employee.name)
                }
                println() // для отделения групп
            }
}
class Employee(val name: String, val company: String){
        override fun toString(): String = name
}



}
