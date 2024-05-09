import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import java.util.Date

@Document(indexName = "calendar_items")
data class CalendarItem(
    @Id val id: String,
    val name: String,
    val date: Date,
    val description: String,
    val location: String,
    val type: String,
    val associatedClients: List<String>? = null
)
