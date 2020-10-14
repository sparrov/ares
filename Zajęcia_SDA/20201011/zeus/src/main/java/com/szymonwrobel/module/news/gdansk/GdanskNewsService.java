package com.szymonwrobel.module.news.gdansk;

import com.szymonwrobel.module.news.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GdanskNewsService implements NewsService {
    @Override
    public List<String> getLastNews() {
        return List.of(
                "1 - News From Gdańsk...",
                "2 - News From Gdańsk..."
        );
    }
}
