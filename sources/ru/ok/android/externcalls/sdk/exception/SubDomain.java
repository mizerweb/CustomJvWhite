package ru.ok.android.externcalls.sdk.exception;

import defpackage.la6;
import defpackage.ma6;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/exception/SubDomain;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "RTC", "API", "START", "JOIN", "WS", "WT", "RINGING_TIMEOUT", "asString", "", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum SubDomain {
    RTC(-1),
    API(-2),
    START(-3),
    JOIN(-4),
    WS(-5),
    WT(-6),
    RINGING_TIMEOUT(12);

    private static final /* synthetic */ la6 $ENTRIES = new ma6(values());
    private final int code;

    SubDomain(int i) {
        this.code = i;
    }

    public static la6 getEntries() {
        return $ENTRIES;
    }

    public final String asString() {
        int i = this.code;
        return i <= 0 ? name().toLowerCase(Locale.ROOT) : String.valueOf(i);
    }
}
