package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.pm.PackageManager;
import defpackage.af7;
import defpackage.cqk;
import defpackage.j95;
import defpackage.no;
import defpackage.u21;
import defpackage.yab;
import defpackage.zo;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.CallExternalAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.CallNativeAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadHelper;", "", "", "logTag", "<init>", "(Ljava/lang/String;)V", "Lru/ok/android/externcalls/analytics/internal/upload/StatDeliveryException;", "ex", "Lsbi;", "reportApiInvocationError", "(Lru/ok/android/externcalls/analytics/internal/upload/StatDeliveryException;)V", "Lno;", "apiClient", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "Lu21;", CallAnalyticsApiRequest.KEY_ITEMS, "executeApiMethod$calls_sdk_analytics", "(Lno;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;Lu21;)V", "executeApiMethod", "Ljava/lang/String;", "lastReportedError", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UploadHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String SDK_TYPE_STRING = "ANDROID";

    @Deprecated
    public static final String SDK_VERSION_STRING = "0.2.6";

    @Deprecated
    public static final int VERSION_INT = 1;
    private static String appVersionString;
    private String lastReportedError;
    private final String logTag;

    public UploadHelper(String str) {
        this.logTag = str;
    }

    public static final String getApplicationVersionParams() {
        return Companion.getApplicationVersionParams();
    }

    private final void reportApiInvocationError(StatDeliveryException ex) {
        CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
        if (logger == null) {
            return;
        }
        String message = ex.getMessage();
        if (cqk.d(this.lastReportedError, message)) {
            String str = this.logTag;
            if (message == null) {
                message = "";
            }
            logger.e(str, message, ex);
            return;
        }
        this.lastReportedError = message;
        String str2 = this.logTag;
        if (message == null) {
            message = "";
        }
        logger.report(str2, message, ex);
    }

    public final void executeApiMethod$calls_sdk_analytics(no apiClient, EventChannel channel, u21 u21Var) throws IOException, ApiException {
        zo callNativeAnalyticsApiRequest;
        if (channel.isExternal()) {
            callNativeAnalyticsApiRequest = new CallExternalAnalyticsApiRequest(channel.getApiMethod(), channel.getApplication(), channel.getCollector(), channel.getPlatform(), u21Var, CallAnalyticsConfigStorage.INSTANCE.getLogger());
        } else {
            String apiMethod = channel.getApiMethod();
            Companion companion = Companion;
            callNativeAnalyticsApiRequest = new CallNativeAnalyticsApiRequest(apiMethod, companion.getPlatformParam(), companion.getApplicationVersionParams(), SDK_TYPE_STRING, "0.2.6", 1, u21Var, CallAnalyticsConfigStorage.INSTANCE.getLogger());
        }
        try {
            apiClient.a(callNativeAnalyticsApiRequest);
            this.lastReportedError = null;
        } catch (IOException e) {
            throw e;
        } catch (ApiInvocationException e2) {
            reportApiInvocationError(new StatDeliveryException(channel.getApiMethod(), e2));
            throw e2;
        } catch (Throwable th) {
            reportApiInvocationError(new StatDeliveryException(channel.getApiMethod(), th));
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadHelper$Companion;", "", "<init>", "()V", "appVersionString", "", "SDK_TYPE_STRING", "SDK_VERSION_STRING", "VERSION_INT", "", "applicationVersionParams", "getApplicationVersionParams$annotations", "getApplicationVersionParams", "()Ljava/lang/String;", "platformParam", "getPlatformParam", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public static /* synthetic */ void getApplicationVersionParams$annotations() {
        }

        public final String getApplicationVersionParams() throws PackageManager.NameNotFoundException {
            String str = UploadHelper.appVersionString;
            if (str != null) {
                return str;
            }
            Application application = ApplicationProvider.a;
            String str2 = yab.R() + ":" + yab.Q();
            Companion unused = UploadHelper.Companion;
            UploadHelper.appVersionString = str2;
            return str2;
        }

        public final String getPlatformParam() {
            EventMetaParamsConfig eventMetaParams;
            af7 appName;
            String str;
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            return (config == null || (eventMetaParams = config.getEventMetaParams()) == null || (appName = eventMetaParams.getAppName()) == null || (str = (String) appName.invoke()) == null) ? "debug" : str;
        }

        private Companion() {
        }
    }
}
