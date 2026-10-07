package ru.ok.android.externcalls.sdk.ml.model;

import defpackage.la6;
import defpackage.ma6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "", "prefsKey", "", "subDirName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getPrefsKey", "()Ljava/lang/String;", "getSubDirName", "WS", "NS", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum MLFeatureType {
    WS("ws", "ws"),
    NS("ns", "ns");

    private static final /* synthetic */ la6 $ENTRIES = new ma6(values());
    private final String prefsKey;
    private final String subDirName;

    MLFeatureType(String str, String str2) {
        this.prefsKey = str;
        this.subDirName = str2;
    }

    public static la6 getEntries() {
        return $ENTRIES;
    }

    public final String getPrefsKey() {
        return this.prefsKey;
    }

    public final String getSubDirName() {
        return this.subDirName;
    }
}
