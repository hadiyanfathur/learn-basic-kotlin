package oop.reflection

import oop.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun main() {
    try {
        val request = CreateProductRequest("", "Buku", 10000)
        validate(request)

        val request2 = CreateCategoryRequest("", "Buku")
        validate(request2)
    }catch (e: ValidationException){
        println("error thrown : ${e.message}")
    }

}

// use Reflection, reflection full nedd to be imported
fun validate(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            if (value is String && value.isBlank()) {
                throw ValidationException("${property.name} is blank")
            }
        }
    }
}
// manual validation
//fun validateRequest(request: CreateProductRequest){
//    if(request.id.isBlank()){
//        throw ValidationException("Id must not be blank")
//    } else if(request.name.isBlank()){
//        throw ValidationException("Name must not be blank")
//    }
//}
//
//fun validateRequest(request: CreateCategoryRequest){
//    if(request.id.isBlank()){
//        throw ValidationException("Id must not be blank")
//    } else if(request.name.isBlank()){
//        throw ValidationException("Name must not be blank")
//    }
//}