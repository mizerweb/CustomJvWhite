package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfiguration;", "<init>", "()V", "Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;", "provider", "Lsbi;", "setApplicationNameProvider", "(Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;)V", "Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;", "setUploadConfigProvider", "(Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;)V", SdkMetricStatEvent.VALUE_KEY, "applicationNameProvider", "Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;", "getApplicationNameProvider", "()Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;", "uploadConfigProvider", "Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;", "getUploadConfigProvider", "()Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationAnalyticsConfigurationImpl implements ConversationAnalyticsConfiguration {
    private ApplicationNameProvider applicationNameProvider;
    private UploadConfigProvider uploadConfigProvider;

    public final ApplicationNameProvider getApplicationNameProvider() {
        return this.applicationNameProvider;
    }

    public final UploadConfigProvider getUploadConfigProvider() {
        return this.uploadConfigProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration
    public void setApplicationNameProvider(ApplicationNameProvider provider) {
        this.applicationNameProvider = provider;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration
    public void setUploadConfigProvider(UploadConfigProvider provider) {
        this.uploadConfigProvider = provider;
    }
}
