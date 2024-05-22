import com.algolia.search.client.ClientSearch
import com.algolia.search.helper.deserialize
import com.algolia.search.model.APIKey
import com.algolia.search.model.ApplicationID
import com.algolia.search.model.IndexName
import com.algolia.search.model.ObjectID
import com.algolia.search.model.indexing.Indexable
import com.algolia.search.model.response.ResponseSearch
import com.algolia.search.model.search.Query
import kotlinx.serialization.Serializable
import okhttp3.internal.wait

// Define your data class representing the structure of your index records
@Serializable
data class Record(
    val name: String,
    override val objectID: ObjectID
) : Indexable

suspend fun main() {
    // Connect and authenticate with your Algolia app
    val client = ClientSearch(
        applicationID = ApplicationID("K3VK1732XZ"),
        apiKey = APIKey("68c746573c0d9a0065250f66529c5ca4")
    )

    // Create a new index and add a record (using the Record class)
    val index = client.initIndex(indexName = IndexName("test_index"))
    val record = Record("test_record", ObjectID("1"))

    try {
        // Add a record
        index.saveObject(Record.serializer(), record).wait()
        println("Record added successfully.")

        // Search the index and print the results
        val response: ResponseSearch = index.search(Query("test_record"))

        // Deserialize the response
        val results: List<Record> = response.hits.deserialize(Record.serializer())
        if (results.isNotEmpty()) {
            println("Data retrieved from the API:")
            for (result in results) {
                println(result)
            }
        } else {
            println("No data found.")
        }
    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
        e.printStackTrace()
    }
}