package org.fossbrain.green

import org.scalatest.{FunSpec, Matchers}

class LibrarySuite extends FunSpec with Matchers {

    describe("some library method should") {
        it("someLibraryMethod is always true") {
            def library = new Library
            library.someLibraryMethod should be(true)
        }

        it("also do something fancy euda") {
            true should be(true)
        }
    }

}
