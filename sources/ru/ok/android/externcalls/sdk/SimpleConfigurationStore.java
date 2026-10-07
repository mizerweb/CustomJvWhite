package ru.ok.android.externcalls.sdk;

import defpackage.sa4;
import defpackage.ta4;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleConfigurationStore implements ta4 {
    private final String appKey;
    private final String baseEndpoint;
    private sa4 sessionInfo;

    public SimpleConfigurationStore(ta4 ta4Var) {
        this.appKey = ta4Var.getAppKey();
        this.baseEndpoint = ta4Var.getBaseEndpoint();
    }

    @Override // defpackage.ta4
    public String getAppKey() {
        return this.appKey;
    }

    @Override // defpackage.ta4
    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    @Override // defpackage.ta4
    public sa4 getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // defpackage.ta4
    public void setSessionInfo(sa4 sa4Var) {
        this.sessionInfo = sa4Var;
    }
}
