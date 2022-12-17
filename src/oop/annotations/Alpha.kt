package oop.annotations

// for java frameworks if you still want to use kotlin
@Target(AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Alpha()

class ExampleTarget(
    @field:Alpha val field: String,
    @get:Alpha val getter: String,
    @param:Alpha val constructorParameter: String
)
