package labshopcontracttest.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import labshopcontracttest.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/inventories")
@Transactional
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;

    @GetMapping(path = "/inventories/search/testInventory")
    public Inventory testInventory(@PathVariable("id") Integer id, GetInventoryQuery getInventoryQuery) {
        return inventoryRepository.testInventory(id, getInventoryQuery.getStock());
    }

    
}
//>>> Clean Arch / Inbound Adaptor
