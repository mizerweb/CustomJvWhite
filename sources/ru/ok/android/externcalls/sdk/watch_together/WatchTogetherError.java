package ru.ok.android.externcalls.sdk.watch_together;

import defpackage.la6;
import defpackage.ma6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT_EXCEEDED", "MOVIE_NOT_FOUND", "PLAY_NOT_ALLOWED", "CANT_PARSE_MOVIE_TYPE", "PLAY_PARSE_ERROR", "UNKNOWN_ERROR", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum WatchTogetherError {
    LIMIT_EXCEEDED,
    MOVIE_NOT_FOUND,
    PLAY_NOT_ALLOWED,
    CANT_PARSE_MOVIE_TYPE,
    PLAY_PARSE_ERROR,
    UNKNOWN_ERROR;

    private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

    public static la6 getEntries() {
        return $ENTRIES;
    }
}
