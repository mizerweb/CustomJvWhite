package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.mv8;
import defpackage.u21;
import defpackage.x1;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/api/CallNativeAnalyticsApiRequest;", "Lru/ok/android/externcalls/analytics/internal/api/CallAnalyticsApiRequest;", "", "apiMethod", "platform", "appVersion", "sdkType", ApiProtocol.PARAM_SDK_VERSION, "", "version", "Lu21;", CallAnalyticsApiRequest.KEY_ITEMS, "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILu21;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;)V", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "Ljava/lang/String;", "I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallNativeAnalyticsApiRequest extends CallAnalyticsApiRequest {
    private final String appVersion;
    private final String platform;
    private final String sdkType;
    private final String sdkVersion;
    private final int version;

    public CallNativeAnalyticsApiRequest(String str, String str2, String str3, String str4, String str5, int i, u21 u21Var, CallAnalyticsLogger callAnalyticsLogger) {
        super(str, u21Var, callAnalyticsLogger);
        this.platform = str2;
        this.appVersion = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.version = i;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.op
    public void writeParams(mv8 writer) throws JsonSerializeException, IOException {
        writer.a0("data");
        writer.p();
        try {
            writeString(writer, "platform", this.platform, true);
            CallAnalyticsApiRequest.writeString$default(this, writer, CallAnalyticsApiRequest.KEY_APP_VERSION, this.appVersion, false, 8, null);
            CallAnalyticsApiRequest.writeString$default(this, writer, CallAnalyticsApiRequest.KEY_SDK_TYPE, this.sdkType, false, 8, null);
            CallAnalyticsApiRequest.writeString$default(this, writer, "sdk_version", this.sdkVersion, false, 8, null);
            writer.a0("version");
            ((x1) writer).y(this.version);
            writer.a0(CallAnalyticsApiRequest.KEY_ITEMS);
            getItems().write(writer);
        } finally {
            writer.t();
        }
    }
}
