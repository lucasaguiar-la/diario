package com.meudiario.Diary.service;

import com.meudiario.Diary.dto.JwtAuthenticationResponse;
import com.meudiario.Diary.dto.SignInRequest;
import com.meudiario.Diary.dto.SignUpRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(SignInRequest request);
}
