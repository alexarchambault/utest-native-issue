package dummy

import utest._

object Foo extends TestSuite {

  val tests = Tests {
    'foo - {
      sys.error("nope")
    }
  }

}
