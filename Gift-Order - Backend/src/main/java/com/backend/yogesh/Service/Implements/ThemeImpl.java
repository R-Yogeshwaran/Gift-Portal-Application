package com.backend.yogesh.Service.Implements;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.backend.yogesh.model.Theme;
import com.backend.yogesh.repository.ThemeRepository;
import com.backend.yogesh.dto.response.BasicResponse;
import com.backend.yogesh.dto.response.ThemeResponse;
import com.backend.yogesh.Service.ThemeService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ThemeImpl implements ThemeService {
    private final ThemeRepository giftRepo;

    @Override
    public BasicResponse<ThemeResponse> getAllTheme() 
    {
        List<Theme> gifts = giftRepo.findAll();
        List<ThemeResponse> giftResponses = gifts.stream()
            .map(gift -> ThemeResponse.builder()
                .themeId(gift.getThemeid())
                .themeName(gift.getTheme())
                .build())
            .collect(Collectors.toList());
        return BasicResponse.<ThemeResponse>builder()
            .message("success!")
            .data(giftResponses)
            .build();
    }
}