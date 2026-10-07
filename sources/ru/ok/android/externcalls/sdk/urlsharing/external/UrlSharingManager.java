package ru.ok.android.externcalls.sdk.urlsharing.external;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "", "", MLFeatureConfigProviderBase.URL_KEY, "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "start", "(Ljava/lang/String;Laf7;Lcf7;)V", "stop", "(Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;)V", "removeListener", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface UrlSharingManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void start$default(UrlSharingManager urlSharingManager, String str, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: start");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        urlSharingManager.start(str, af7Var, cf7Var);
    }

    static /* synthetic */ void stop$default(UrlSharingManager urlSharingManager, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: stop");
            return;
        }
        if ((i & 1) != 0) {
            af7Var = null;
        }
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        urlSharingManager.stop(af7Var, cf7Var);
    }

    void addListener(UrlSharingListener listener);

    void removeListener(UrlSharingListener listener);

    void start(String url, af7 onSuccess, cf7 onError);

    void stop(af7 onSuccess, cf7 onError);
}
