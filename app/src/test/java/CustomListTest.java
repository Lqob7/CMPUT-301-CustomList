import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals( listSize+1, list.getCount());
    }
    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        list.deleteCity(new City("Halifax","NS"));
        assertEquals(listSize-1, list.getCount());
    }

    @Test
    public void getCountTest(){
        int listSize = list.getCount();
        assertEquals(listSize,list.getCount());
    }

}
