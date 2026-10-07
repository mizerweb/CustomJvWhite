package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfiguration;", "", "Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;", "provider", "Lsbi;", "setApplicationNameProvider", "(Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;)V", "Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;", "setUploadConfigProvider", "(Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ConversationAnalyticsConfiguration {
    void setApplicationNameProvider(ApplicationNameProvider provider);

    void setUploadConfigProvider(UploadConfigProvider provider);
}
