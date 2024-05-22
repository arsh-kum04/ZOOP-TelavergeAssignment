package com.example.zoop

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.algolia.search.client.ClientRecommend
import com.algolia.search.model.APIKey
import com.algolia.search.model.ApplicationID
import com.algolia.search.model.IndexName
import com.algolia.search.model.ObjectID
import com.algolia.search.model.recommend.FrequentlyBoughtTogetherQuery
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        fetchRecommendData()
    }

    private fun fetchRecommendData() {
        lifecycleScope.launch {
            val recommendClient = ClientRecommend(
                applicationID = ApplicationID("K3VK1732XZ"),
                apiKey = APIKey("68c746573c0d9a0065250f66529c5ca4")
            )
            val request = FrequentlyBoughtTogetherQuery(
                indexName = IndexName("test_data"), // Ensure this index exists
                objectID = ObjectID("ecommerce-sample-data-9998175")
            )

            try {
                val response = recommendClient.getFrequentlyBoughtTogether(requests = listOf(request))
                println(response)
                Log.d(TAG, "Recommend API Response: $response")
            } catch (e: Exception) {
                Log.e(TAG, "Error fetching recommend data", e)
            }
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
