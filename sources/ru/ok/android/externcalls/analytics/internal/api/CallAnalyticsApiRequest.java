package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import defpackage.c;
import defpackage.fq;
import defpackage.hu8;
import defpackage.l6m;
import defpackage.mv8;
import defpackage.ot4;
import defpackage.u21;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.vu8;
import defpackage.zo;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 22\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001e\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/api/CallAnalyticsApiRequest;", "Lzo;", "Ljava/lang/Void;", "", "apiMethod", "Lu21;", CallAnalyticsApiRequest.KEY_ITEMS, "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "<init>", "(Ljava/lang/String;Lu21;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;)V", "", "shouldPost", "()Z", "shouldGzip", "shouldReport", "canRepeat", "Lmv8;", "writer", SdkMetricStatEvent.NAME_KEY, SdkMetricStatEvent.VALUE_KEY, "requireNotEmpty", "Lsbi;", "writeString", "(Lmv8;Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getApiMethod", "()Ljava/lang/String;", "Lu21;", "getItems", "()Lu21;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class CallAnalyticsApiRequest implements zo {
    public static final String KEY_APPLICATION = "application";
    public static final String KEY_APP_VERSION = "app_version";
    public static final String KEY_COLLECTOR = "collector";
    public static final String KEY_DATA = "data";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_PLATFORM = "platform";
    public static final String KEY_SDK_TYPE = "sdk_type";
    public static final String KEY_SDK_VERSION = "sdk_version";
    public static final String KEY_VERSION = "version";
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final u21 items;
    private final CallAnalyticsLogger logger;

    public CallAnalyticsApiRequest(String str, u21 u21Var, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.items = u21Var;
        this.logger = callAnalyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void _get_okParser_$lambda$0(CallAnalyticsApiRequest callAnalyticsApiRequest, vu8 vu8Var) {
        try {
            if (vu8Var.peek() == 0) {
                callAnalyticsApiRequest.logger.d(LOG_TAG, "Got empty response");
                return null;
            }
            callAnalyticsApiRequest.logger.d(LOG_TAG, "Got response: " + vu8Var.F());
            return null;
        } catch (IOException e) {
            callAnalyticsApiRequest.logger.e(LOG_TAG, "Can't parse response", e);
        }
    }

    public static /* synthetic */ void writeString$default(CallAnalyticsApiRequest callAnalyticsApiRequest, mv8 mv8Var, String str, String str2, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: writeString");
            return;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        callAnalyticsApiRequest.writeString(mv8Var, str, str2, z);
    }

    @Override // defpackage.op
    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    @Override // defpackage.zo
    public /* bridge */ vo getConfigExtractor() {
        return vo.M;
    }

    @Override // defpackage.zo
    public /* bridge */ hu8 getFailParser() {
        return l6m.c;
    }

    public final u21 getItems() {
        return this.items;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    @Override // defpackage.zo
    public hu8 getOkParser() {
        return new ot4(10, this);
    }

    @Override // defpackage.op
    public int getPriority() {
        return 2;
    }

    @Override // defpackage.op
    public up getScope() {
        return up.c;
    }

    @Override // defpackage.zo
    public /* bridge */ vp getScopeAfter() {
        return vp.a;
    }

    @Override // defpackage.op
    public Uri getUri() {
        return fq.b(this.apiMethod);
    }

    public boolean shouldGzip() {
        return true;
    }

    @Override // defpackage.op
    public /* bridge */ boolean shouldNeverGzip() {
        return false;
    }

    public /* bridge */ boolean shouldNeverJson() {
        return false;
    }

    @Override // defpackage.op
    public /* bridge */ boolean shouldNeverPost() {
        return false;
    }

    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    @Override // defpackage.op
    public /* bridge */ boolean willWriteParams() {
        return true;
    }

    @Override // defpackage.op
    public /* bridge */ boolean willWriteSupplyParams() {
        return false;
    }

    @Override // defpackage.op
    public abstract /* synthetic */ void writeParams(mv8 mv8Var) throws JsonSerializeException, IOException;

    public final void writeString(mv8 writer, String name, String value, boolean requireNotEmpty) throws IOException {
        if (value != null) {
            if (requireNotEmpty && value.length() == 0) {
                return;
            }
            writer.a0(name);
            writer.p0(value);
        }
    }

    @Override // defpackage.op
    public /* bridge */ void writeSupplyParams(mv8 mv8Var) {
    }
}
