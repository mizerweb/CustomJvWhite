package ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands;

import defpackage.af7;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "", "", MLFeatureConfigProviderBase.URL_KEY, "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "start", "(Ljava/lang/String;Laf7;Lcf7;)V", "stop", "(Laf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface UrlSharingCommandsExecutor {
    void start(String url, af7 onSuccess, cf7 onError);

    void stop(af7 onSuccess, cf7 onError);
}
