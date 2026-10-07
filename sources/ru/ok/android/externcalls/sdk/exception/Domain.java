package ru.ok.android.externcalls.sdk.exception;

import defpackage.la6;
import defpackage.ma6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/exception/Domain;", "", "<init>", "(Ljava/lang/String;I)V", "NETWORK", "SERVER", "INTERNAL", "EXTERNAL", "UNKNOWN", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum Domain {
    NETWORK,
    SERVER,
    INTERNAL,
    EXTERNAL,
    UNKNOWN;

    private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

    public static la6 getEntries() {
        return $ENTRIES;
    }
}
