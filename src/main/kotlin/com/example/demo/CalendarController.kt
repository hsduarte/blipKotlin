import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class CalendarController(
    private val clientRepository: ClientRepository,
    private val calendarItemRepository: CalendarItemRepository
) {

    @GetMapping("/items")
    fun getAllItems(): Flux<CalendarItem> = calendarItemRepository.findAll()

    @DeleteMapping("/items/{id}")
    fun deleteItem(@PathVariable id: String): Mono<Void> = calendarItemRepository.deleteById(id)

    @GetMapping("/clients/{username}/items")
    fun getItemsByClient(@PathVariable username: String): Flux<CalendarItem> =
        calendarItemRepository.findAll()
            .filter { it.associatedClients?.contains(username) == true }
}
