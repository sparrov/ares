package com.szymonwrobel.module.news.sopot;

import com.szymonwrobel.module.news.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SopotNewsService implements NewsService {
    @Override
    public List<String> getLastNews() {
        return List.of(
                "1 - News From Sopot...",
                "2 - News From Sopot..."
        );
    }
}
