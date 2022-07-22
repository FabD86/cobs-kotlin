fun ByteArray.toHexString() = joinToString(" ") { "0x%02x".format(it) }

fun main() {
    val cobs = cobs()

    val a = byteArrayOf(0)
    println("a: " + a.toHexString())
    println(cobs.encode(a).toHexString())
    println(cobs.decode(cobs.encode(a)).toHexString())
    val b = byteArrayOf(1)
    println("b: " + b.toHexString())
    println(cobs.encode(b).toHexString())
    println(cobs.decode(cobs.encode(b)).toHexString())
    val c = byteArrayOf(2)
    println("c: " + c.toHexString())
    println(cobs.encode(c).toHexString())
    println(cobs.decode(cobs.encode(c)).toHexString())
    val d = byteArrayOf(3)
    println("d: " + d.toHexString())
    println(cobs.encode(d).toHexString())
    println(cobs.decode(cobs.encode(d)).toHexString())
    val e = byteArrayOf(0,0)
    println("e: " + e.toHexString())
    println(cobs.encode(e).toHexString())
    println(cobs.decode(cobs.encode(e)).toHexString())
    val f = byteArrayOf(0,1)
    println("f: " + f.toHexString())
    println(cobs.encode(f).toHexString())
    println(cobs.decode(cobs.encode(f)).toHexString())
    val g = ByteArray(255)
    for (i in 1 ..g.size)
        g[i-1] = i.toByte()
    println("g: " + g.toHexString())
    println(cobs.encode(g).toHexString())
    println(cobs.decode(cobs.encode(g)).toHexString())




}