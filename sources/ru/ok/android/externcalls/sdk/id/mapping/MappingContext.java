package ru.ok.android.externcalls.sdk.id.mapping;

import defpackage.j95;
import defpackage.y3e;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.exceptions.IdMappingResolveCalledException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/MappingContext;", "", "Ly3e;", "rtcLog", "", "isIdsMappersLoggingEnabled", "<init>", "(Ly3e;Z)V", "Lsbi;", "logContextIfNeeded", "()V", "Ly3e;", "Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Ljava/lang/Exception;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MappingContext {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "MappingContext";
    private final Exception exception;
    private final boolean isIdsMappersLoggingEnabled;
    private final y3e rtcLog;

    public MappingContext(y3e y3eVar, boolean z) {
        this.rtcLog = y3eVar;
        this.isIdsMappersLoggingEnabled = z;
        this.exception = z ? new IdMappingResolveCalledException() : null;
    }

    public final void logContextIfNeeded() {
        Exception exc = this.exception;
        if (exc != null) {
            this.rtcLog.reportException(LOG_TAG, "id mapping resolve called", exc);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/MappingContext$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
