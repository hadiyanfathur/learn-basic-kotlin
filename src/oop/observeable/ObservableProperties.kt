package oop.observeable

import kotlin.properties.Delegates

class ObservableProperties(name: String) {
    var name: String by Delegates.observable(name) {
            property, oldValue, newValue ->
                println("property: $property, oldValue: $oldValue, newValue: $newValue")
    }
}