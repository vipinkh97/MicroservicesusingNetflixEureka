package io.vipin.dtc.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import io.vipin.dtc.model.M1Model;


@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "books", viewName = "all")
public interface M1Repository extends CouchbaseRepository<M1Model,String> {

}
