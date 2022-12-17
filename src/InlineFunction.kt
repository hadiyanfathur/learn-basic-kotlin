inline fun hello(name : () -> String) : String {
    return "Hello ${name()}"
}

inline fun fullName(firstName : () -> String, noinline lastName: () -> String) : String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    // Inline Function
    // Inline function adalah sebuah fungsi yang akan di eksekusi secara langsung ketika fungsi tersebut dipanggil.
    // Inline function akan menghilangkan overhead dari sebuah fungsi, sehingga akan menghemat waktu eksekusi.
    // Inline function mengoptimalkan Higher Order Function.
    // Inline function hanya bisa digunakan untuk fungsi yang memiliki lambda expression sebagai parameter.
    // Inline function tidak bisa digunakan untuk fungsi yang memiliki return value.
    // Inline function tidak bisa digunakan untuk fungsi yang memiliki reified type parameter.

    //cons
    // Meski mengoptimalkan Higher Order Function, Inline function akan membuat bytecode yang lebih besar.

    print(hello { "Hadiyan" })
    print(fullName({ "Hadiyan" }, { "Rahman" }))
}