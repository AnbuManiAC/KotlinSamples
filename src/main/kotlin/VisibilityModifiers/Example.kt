package VisibilityModifiers

import Shapes

class Example {
    private fun getName() = "Example"

    public var className: String = "example"
        private set

    private val a = 1
    protected open val b = 2
    internal open val c  =3
    val d = 4



}

internal open class Hello{
    val a = 1
}