package io.vipin.dtc.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import io.vipin.dtc.model.Food;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "food", viewName = "all")
public interface FoodRepository extends CouchbaseRepository<Food,String> {

}
