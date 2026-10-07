package ru.ok.android.externcalls.sdk.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/api/JoinByIdResponse;", "", "p2pForbidden", "", ApiProtocol.KEY_ENDPOINT, "", "deviceIndex", "", "<init>", "(ZLjava/lang/String;I)V", "getP2pForbidden", "()Z", "getEndpoint", "()Ljava/lang/String;", "getDeviceIndex", "()I", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinByIdResponse {
    private final int deviceIndex;
    private final String endpoint;
    private final boolean p2pForbidden;

    public JoinByIdResponse(boolean z, String str, int i) {
        this.p2pForbidden = z;
        this.endpoint = str;
        this.deviceIndex = i;
    }

    public final int getDeviceIndex() {
        return this.deviceIndex;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final boolean getP2pForbidden() {
        return this.p2pForbidden;
    }
}
