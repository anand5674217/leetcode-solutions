import java.util.List;

public record ResponseObject(long page, long per_page, long total, long total_pages, List<TVSeries> data) {
}
