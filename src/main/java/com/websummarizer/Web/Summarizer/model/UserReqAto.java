package com.websummarizer.Web.Summarizer.model;

import com.websummarizer.Web.Summarizer.model.Provider;
import lombok.*;

@Builder
@Data
@ToString(onlyExplicitlyIncluded = true)
/**
 * model representing API request model to add / register a user
 */
public class UserReqAto {

    @NonNull
    @ToString.Include
    private String first_name;

    @NonNull
    @ToString.Include
    private String last_name;

    @NonNull
    @ToString.Include
    private String email;

    @NonNull
    @ToString.Include
    private String password;

    @NonNull
    @ToString.Include
    private String phone_number;

    @ToString.Include
    private String request_token;

    private String account_llm;

    private Provider provider;
}
