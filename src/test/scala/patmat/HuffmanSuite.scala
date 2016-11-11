package patmat

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import patmat.Huffman._

import scala.collection.immutable.List

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
	trait TestTrees {
		val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
		val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
	}


 /* test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }


  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a','b','d'))
    }
  }*/

  ignore("chars of a time") {
    new TestTrees {
      (times(List('a','a','d')))
    }
  }


/*

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }
*/
  ignore("singleton for some frequency table") {
    assert(singleton(List(Leaf('e',1))) == true)
  }


  ignore("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e',1), Leaf('t',2), Leaf('x',3)))
  }


  ignore("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3), Leaf('x',4)))
  }


  ignore("until of some leaf list") {
    val trees = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))

    assert(until(singleton,combine)(trees) === Fork(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3),Leaf('x',4),List('e', 't', 'x'),7))
    //assert(until(false,List())(leaflist) === List(Leaf('e',1),Leaf('t',2)))
  }

  ignore("createCodeTree of some leaf list") {
    val CharList = List('a','b', 'c', 'd', 'e')

    assert(createCodeTree(CharList) ===   Fork(Fork(Leaf('e',1),Leaf('a',1),List('e', 'a'),2),Fork(Leaf('d',1),Fork(Leaf('b',1),Leaf('c',1),List('b', 'c'),2),List('d', 'b', 'c'),3),List('e', 'a', 'd', 'b', 'c'),5))
    //assert(until(false,List())(leaflist) === List(Leaf('e',1),Leaf('t',2)))
  }

  test("decode of some leaf list") {
    val CharList = Fork(Leaf('c',1),Fork(Leaf('a',1),Leaf('b',1),List('a', 'b'),2),List('c', 'a', 'b'),3)
    val listBits = List(0,1,0,1,1)
    assert(decode(CharList, listBits) ===   Fork(Fork(Leaf('e',1),Leaf('a',1),List('e', 'a'),2),Fork(Leaf('d',1),Fork(Leaf('b',1),Leaf('c',1),List('b', 'c'),2),List('d', 'b', 'c'),3),List('e', 'a', 'd', 'b', 'c'),5))
    //assert(until(false,List())(leaflist) === List(Leaf('e',1),Leaf('t',2)))
  }

  /*  test("decode and encode a very short text should be identity") {
      new TestTrees {
        assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
      }
    }*/

}
