package foo

import grails.transaction.Transactional
import groovy.transform.CompileStatic

@CompileStatic
@Transactional
class FooService<Param extends Named> {

    void serviceMethod(Param param) {

    }
}