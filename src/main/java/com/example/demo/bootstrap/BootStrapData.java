package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Add default objects to Parts
        if (partRepository.count() == 0) {

            /*
            OutsourcedPart o= new OutsourcedPart();
            o.setCompanyName("Western Governors University");
            o.setName("out test");
            o.setInv(5);
            o.setPrice(20.0);
            o.setId(100L);
            outsourcedPartRepository.save(o);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))thePart=part;
            }

            System.out.println(thePart.getCompanyName());
            */

            // Part 1 - Inhouse
            InhousePart deck = new InhousePart();
            deck.setName("Deck");
            deck.setInv(5);
            deck.setPrice(50.0);
            deck.setId(1);
            inhousePartRepository.save(deck);
            InhousePart thePart = null;


            // Part 2 - Inhouse
            InhousePart wheels = new InhousePart();
            wheels.setName("wheels");
            wheels.setInv(12);
            wheels.setPrice(25.0);
            wheels.setId(2);
            inhousePartRepository.save(wheels);


            // Part 3 - Outsourced
            OutsourcedPart grip = new OutsourcedPart();
            grip.setCompanyName("Hold On");
            grip.setName("Grip Tape");
            grip.setInv(3);
            grip.setPrice(5.0);
            grip.setId(3);
            outsourcedPartRepository.save(grip);


            // Part 4 - Outsourced
            OutsourcedPart trucks = new OutsourcedPart();
            trucks.setCompanyName("Thunder Trucks");
            trucks.setName("Trucks");
            trucks.setInv(4);
            trucks.setPrice(10.0);
            trucks.setId(4);
            outsourcedPartRepository.save(trucks);

            // Part 5 - Outsourced
            OutsourcedPart screws = new OutsourcedPart();
            screws.setCompanyName("JR Fasteners");
            screws.setName("Screws");
            screws.setInv(5);
            screws.setPrice(1.0);
            screws.setId(30);
            outsourcedPartRepository.save(screws);

            // Print out parts to console
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                System.out.println(part.getName()+" "+part.getCompanyName());
            }
            List<InhousePart> inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
            for(InhousePart part:inhouseParts){
                System.out.println(part.getName()+" "+"Deck It Out");
            }
        }

        // Add default objects to Products
        if (productRepository.count() == 0) {

            /*
            Product bicycle= new Product("bicycle",100.0,15);
            Product unicycle= new Product("unicycle",100.0,15);
            productRepository.save(bicycle);
            productRepository.save(unicycle);
            */

            Product personal = new Product("Personal Skateboard", 300.0, 5);
            Product t1 = new Product("Tier 1 Skateboard", 250.0, 10);
            Product t2 = new Product("Tier 2 Skateboard", 200.0, 8);
            Product t3 = new Product("Tier 3 Skateboard", 150.0, 16);
            Product t4 = new Product("Tier 4 Skateboard", 100.0, 25);
            productRepository.save(personal);
            productRepository.save(t1);
            productRepository.save(t2);
            productRepository.save(t3);
            productRepository.save(t4);
        }

            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products"+productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts"+partRepository.count());
            System.out.println(partRepository.findAll());

    }
}
