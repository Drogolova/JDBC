import java.util.List;

public interface CityDAO {
    void addCity(City city);
    City getCity(int cityId);
    List<City> getAllCites();
    void updateCity(City city);
    void deleteCity(City city);
}
