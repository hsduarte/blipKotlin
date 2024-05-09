import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ClientRepository : ReactiveCrudRepository<Client, String>

interface CalendarItemRepository : ReactiveCrudRepository<CalendarItem, String>