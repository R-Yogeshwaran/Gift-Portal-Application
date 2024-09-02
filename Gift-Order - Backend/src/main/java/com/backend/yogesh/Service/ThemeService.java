package com.backend.yogesh.Service;

import com.backend.yogesh.dto.response.BasicResponse;
import com.backend.yogesh.dto.response.ThemeResponse;

public interface ThemeService {
    BasicResponse<ThemeResponse> getAllTheme();
}
