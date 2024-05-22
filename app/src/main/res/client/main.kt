//package com.example.telavergeassignment.client
//// Main.kt
//import com.algolia.search.client.ClientSearch
//import com.algolia.search.helper.deserialize
//import com.algolia.search.model.APIKey
//import com.algolia.search.model.ApplicationID
//import com.algolia.search.model.IndexName
//import com.algolia.search.model.ObjectID
//import com.algolia.search.model.indexing.Indexable
//import com.algolia.search.model.search.Query
//import kotlinx.serialization.Serializable
//import okhttp3.internal.wait
//
//// A simple record for your index
//@Serializable
//private data class Record(
//    val name: String,
//    override val objectID: ObjectID
//) : Indexable
//
//suspend fun main() {
//    // Connect and authenticate with your Algolia app
//    val client = ClientSearch(
//        applicationID = ApplicationID("K3VK1732XZ"),
//        apiKey = APIKey("68c746573c0d9a0065250f66529c5ca4")
//    )
//
//    // Create a new index and add a record (using the `Record` class)
//    val index = client.initIndex(indexName = IndexName("test_index"))
//    val record = Record("test_record", ObjectID("1"))
//
//    index.saveObject(Record.serializer(), record).wait()
//
//
//    // Search the index and print the results
//    val response = index.run {
//        search(Query("test_record"))
//    }
//    val results: List<Record> = response.hits.deserialize(Record.serializer())
//    println(results[0])
//}
