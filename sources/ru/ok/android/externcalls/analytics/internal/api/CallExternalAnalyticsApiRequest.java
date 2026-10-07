package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.mv8;
import defpackage.u21;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/api/CallExternalAnalyticsApiRequest;", "Lru/ok/android/externcalls/analytics/internal/api/CallAnalyticsApiRequest;", "", "apiMethod", CallAnalyticsApiRequest.KEY_APPLICATION, "collector", "platform", "Lu21;", CallAnalyticsApiRequest.KEY_ITEMS, "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu21;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;)V", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "Ljava/lang/String;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallExternalAnalyticsApiRequest extends CallAnalyticsApiRequest {
    private final String application;
    private final String collector;
    private final String platform;

    public CallExternalAnalyticsApiRequest(String str, String str2, String str3, String str4, u21 u21Var, CallAnalyticsLogger callAnalyticsLogger) {
        super(str, u21Var, callAnalyticsLogger);
        this.application = str2;
        this.collector = str3;
        this.platform = str4;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.op
    public void writeParams(mv8 writer) throws Throwable {
        mv8 mv8Var = writer;
        CallAnalyticsApiRequest.writeString$default(this, mv8Var, "collector", this.collector, false, 8, null);
        mv8Var.a0("data");
        mv8Var.p();
        try {
            try {
                CallAnalyticsApiRequest.writeString$default(this, mv8Var, CallAnalyticsApiRequest.KEY_APPLICATION, this.application, false, 8, null);
                writeString(mv8Var, "platform", this.platform, true);
                mv8Var.a0(CallAnalyticsApiRequest.KEY_ITEMS);
                getItems().write(mv8Var);
                mv8Var.t();
            } catch (Throwable th) {
                th = th;
                mv8Var = mv8Var;
                Throwable th2 = th;
                mv8Var.t();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
