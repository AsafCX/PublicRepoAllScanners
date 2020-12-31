package com.checkmarx.service;

import com.checkmarx.dto.datastore.*;
import lombok.NonNull;

import java.util.List;

public interface DataService {
    void storeScmOrgsToken(@NonNull List<ScmAccessTokenDto> scmAccessTokenDtos);
    ScmAccessTokenDto getSCMOrgToken(@NonNull String scmUrl, @NonNull String orgIdentity);
    void storeScm(@NonNull ScmDto scmDto);
    ScmDto getScm(@NonNull String scmUrl);
    void storeScmOrgRepos(@NonNull OrgReposDto orgReposDto);
    List<RepoDto> getScmOrgRepos(@NonNull String scmUrl, @NonNull String orgIdentity);
    RepoDto getScmOrgRepo(@NonNull String scmUrl, @NonNull String orgIdentity,
                          @NonNull String repoIdentity);
    void updateScmOrgRepo(@NonNull OrgReposDto orgReposDto);
    OrgPropertiesDto getScmOrgSettings(@NonNull String scmUrl, @NonNull String orgIdentity);
    void storeScmOrgSettings(@NonNull OrgPropertiesDto orgPropertiesDto);
    void updateWebhook(@NonNull String repoId, ScmAccessTokenDto scmAccessTokenDto,
                       String webhookId, Boolean isWebhook);
    void updateRepo2(String scmUrl, String orgId, RepoDto updateRequest);
    void storeOrgs(List<OrgDto> orgDtos);
    void storeOrgs2(String scmUrl, List<OrgDto2> orgs);

    ScmAccessTokenDto2 getTokenInfo(String scmUrl, String orgId);
    void updateTokenInfo(ScmAccessTokenDto2 tokenInfo);
    long createTokenInfo(ScmAccessTokenDto2 tokenInfo);
}
