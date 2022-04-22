package com.tushar.springjpaexample;

import com.tushar.springjpaexample.InheriteJoinTable.Enums.InfantryType;
import com.tushar.springjpaexample.InheriteJoinTable.model.Archer;
import com.tushar.springjpaexample.InheriteJoinTable.model.Infantry;
import com.tushar.springjpaexample.InheriteJoinTable.model.Knight;
import com.tushar.springjpaexample.InheriteJoinTable.repository.ArcherRepository;
import com.tushar.springjpaexample.InheriteJoinTable.repository.InfantryRepository;
import com.tushar.springjpaexample.InheriteJoinTable.repository.KnightRepository;
import com.tushar.springjpaexample.InheriteSingleTable.Enum.Material;
import com.tushar.springjpaexample.InheriteSingleTable.Enum.PaintingTechnique;
import com.tushar.springjpaexample.InheriteSingleTable.model.ArtPiece;
import com.tushar.springjpaexample.InheriteSingleTable.model.Painting;
import com.tushar.springjpaexample.InheriteSingleTable.model.Sculpture;
import com.tushar.springjpaexample.InheriteSingleTable.repository.ArtPieceRepository;
import com.tushar.springjpaexample.InheriteSingleTable.repository.PaintingRepository;
import com.tushar.springjpaexample.InheriteSingleTable.repository.SclulptureRepository;
import com.tushar.springjpaexample.InheriteTablePerClass.model.FireSpell;
import com.tushar.springjpaexample.InheriteTablePerClass.model.FrostSpell;
import com.tushar.springjpaexample.InheriteTablePerClass.model.Spell;
import com.tushar.springjpaexample.InheriteTablePerClass.repository.FireSpellRepository;
import com.tushar.springjpaexample.InheriteTablePerClass.repository.FrostSpellRepository;
import com.tushar.springjpaexample.InheriteTablePerClass.repository.SpellRepository;
import com.tushar.springjpaexample.ManyToMany.model.Stream;
import com.tushar.springjpaexample.ManyToMany.model.Viewer;
import com.tushar.springjpaexample.ManyToMany.repository.StreamRepository;
import com.tushar.springjpaexample.ManyToMany.repository.ViewerRepository;
import com.tushar.springjpaexample.OneToManyBidirectional.model.Cart;
import com.tushar.springjpaexample.OneToManyBidirectional.model.Item;
import com.tushar.springjpaexample.OneToManyBidirectional.repository.CartRepository;
import com.tushar.springjpaexample.OneToManyBidirectional.repository.ItemRepository;
import com.tushar.springjpaexample.OneToManyUnidirectional.model.Student;
import com.tushar.springjpaexample.OneToManyUnidirectional.model.University;
import com.tushar.springjpaexample.OneToManyUnidirectional.repository.StudentRepository;
import com.tushar.springjpaexample.OneToManyUnidirectional.repository.UniversityRepository;
import com.tushar.springjpaexample.OneToOneBidirectional.Models.Car;
import com.tushar.springjpaexample.OneToOneBidirectional.Models.Owner;
import com.tushar.springjpaexample.OneToOneBidirectional.Repository.CarRepository;
import com.tushar.springjpaexample.OneToOneBidirectional.Repository.OwnerRepository;
import com.tushar.springjpaexample.OneToOneUnidirectional.model.Address;
import com.tushar.springjpaexample.OneToOneUnidirectional.model.User;
import com.tushar.springjpaexample.OneToOneUnidirectional.repository.AddressRepository;
import com.tushar.springjpaexample.OneToOneUnidirectional.repository.UserRepository;
import com.tushar.springjpaexample.mappedSuperClass.model.Tank;
import com.tushar.springjpaexample.mappedSuperClass.model.Truck;
import com.tushar.springjpaexample.mappedSuperClass.repository.TankRepository;
import com.tushar.springjpaexample.mappedSuperClass.repository.TruckRepository;
import com.tushar.springjpaexample.mappedSuperClass.repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication @Slf4j
public class SpringjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(SpringjpaexampleApplication.class, args);

//		StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);
//		UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);
//
//		Student std1 = new Student("1111");
//		Student std2 = new Student("1112");
//		List<Student> students = Arrays.asList(std1,std2);
//
//		University university = new University("Tushar", students);
//
//		universityRepository.save(university);

//		CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);
//		ItemRepository itemRepository = configurableApplicationContext.getBean(ItemRepository.class);
//
//		Cart cart = new Cart("999");
//		Item chocolate = new Item("SE123", cart);
//		Item shampoo = new Item("SE122", cart);
//
//		List<Item> items = Arrays.asList(chocolate, shampoo);
//		cart.setItems(items);
//		cartRepository.save(cart);

//		StreamRepository streamRepository = configurableApplicationContext.getBean(StreamRepository.class);
//		ViewerRepository viewerRepository = configurableApplicationContext.getBean(ViewerRepository.class);
//
//		Viewer tusharViewer = new Viewer("Tushar");
//		Viewer bijayViewer = new Viewer("Bijay");
//		Viewer rubyViewer = new Viewer("Ruby");
//
//		List<Viewer> viewers = Arrays.asList(tusharViewer,bijayViewer,rubyViewer);
//
//		Stream cookingStream = new Stream("CookingIsAwesome");
//		Stream gamingStream = new Stream("ChillGaming");
//
//		List<Stream> streams = Arrays.asList(cookingStream,gamingStream);
//		streamRepository.saveAll(streams);
//
//		tusharViewer.followedStream(cookingStream);
//		bijayViewer.followedStream(gamingStream);
//		rubyViewer.followedStream(cookingStream);
//
//		viewerRepository.saveAll(viewers);


//		VehicleRepository tankRepository = configurableApplicationContext.getBean(TankRepository.class);
//		VehicleRepository truckRepository = configurableApplicationContext.getBean(TruckRepository.class);
//
//		Tank myTank = new Tank("T-150",5,50);
//		Truck myTruck = new Truck("200M",2,36,true);
//
//		tankRepository.save(myTank);
//		truckRepository.save(myTruck);

//		ArtPieceRepository paintingRepository = configurableApplicationContext.getBean(PaintingRepository.class);
//		ArtPieceRepository scluptureRepository = configurableApplicationContext.getBean(SclulptureRepository.class);
//
//		ArtPiece sculpure = new Sculpture("Tushar", Material.WOOD,200.2);
//		ArtPiece painting = new Painting("Tom smith", PaintingTechnique.OIL, 25.5, 55.5);
//
//		scluptureRepository.save(sculpure);
//		paintingRepository.save(painting);


//		InfantryRepository archorRepository = configurableApplicationContext.getBean(ArcherRepository.class);
//		InfantryRepository knightRepository = configurableApplicationContext.getBean(KnightRepository.class);
//
//		Infantry archer = new Archer(InfantryType.LIGHT,300,500,100,1000);
//		Infantry knight = new Knight(InfantryType.HEAVY,200,200,100,true);
//
//		archorRepository.save(archer);
//		knightRepository.save(knight);

//		SpellRepository spellRepository = configurableApplicationContext.getBean(SpellRepository.class);
//		SpellRepository fireSpellRepository = configurableApplicationContext.getBean(FireSpellRepository.class);
//		SpellRepository frostSpellRepository = configurableApplicationContext.getBean(FrostSpellRepository.class);
//
//
//		Spell archaneSpart = new Spell("ArcanSpark",50,60);
//		Spell fireBall = new FireSpell("FireBall",100,100,100,2000);
//		Spell meteorShower = new FireSpell("MeteorShower",200,200,150,3000);
//
//		Spell frostBolt = new FrostSpell("FrostBolt",80,80,true,200);
//
//		spellRepository.save(archaneSpart);
//		fireSpellRepository.save(fireBall);
//		fireSpellRepository.save(meteorShower);
//
//		frostSpellRepository.save(frostBolt);

	}

}
