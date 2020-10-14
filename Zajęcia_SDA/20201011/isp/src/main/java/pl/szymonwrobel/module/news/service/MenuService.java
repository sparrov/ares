package pl.szymonwrobel.module.news.service;

import org.springframework.stereotype.Service;
import pl.szymonwrobel.module.news.dto.MenuDto;

import java.util.List;

@Service
public class MenuService {
    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("Internet", "http://blog.netarea24.pl/category/internet/"),
                new MenuDto("Telewizja", "http://blog.netarea24.pl/category/tv/"),
                new MenuDto("Poradniki", "http://blog.netarea24.pl/category/poradniki/")
        );
    }
}
