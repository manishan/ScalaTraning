object test {
  import patmat.Huffman._

  val trees = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
  until(singleton,combine)(trees)

  val charList =List('a','b','c','d','e','b','c','d','e','c','d','e','d','e','e')
  createCodeTree(charList)

  val charList1 =List('a','b','c')
  createCodeTree(charList1)
}