package labshopcontracttest.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory", url = "${api.url.inventory}")
public interface InventoryService {
    @GetMapping(path = "/inventories/search/testInventory")
    public Inventory testInventory(@PathVariable("id") Long id, GetInventoryQuery getInventoryQuery);
}
