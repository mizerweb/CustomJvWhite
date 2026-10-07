package com.my.tracker.core;

/* JADX INFO: loaded from: classes.dex */
public class EngineInfoState {
    public final boolean kidMode;
    public final String remoteConfig;
    public final UserInfoState userInfoState;

    public EngineInfoState(boolean z, UserInfoState userInfoState, String str) {
        this.kidMode = z;
        this.userInfoState = userInfoState;
        this.remoteConfig = str;
    }

    public EngineInfoState copyWithKidMode(boolean z) {
        return new EngineInfoState(z, this.userInfoState, this.remoteConfig);
    }

    public EngineInfoState copyWithRemoteConfig(String str) {
        return new EngineInfoState(this.kidMode, this.userInfoState, str);
    }

    public EngineInfoState copyWithUserInfoState(UserInfoState userInfoState) {
        return new EngineInfoState(this.kidMode, userInfoState, this.remoteConfig);
    }
}
