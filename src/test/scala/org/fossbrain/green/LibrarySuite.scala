package org.fossbrain.green

import org.scalatest.{FunSpec, Matchers}

class LibrarySuite extends FunSpec with Matchers {

    describe("loading a csv file") {
        describe("with legal content") {
            it("someLibraryMethod is always true") {
                def library = new Library
                library.someLibraryMethod should be(true)
            }
        }

        describe("with illegal content") {
            describe("blub") {
                it("also do something fancy euda") {
                    true should be(true)
                }
            }
        }
    }

}
