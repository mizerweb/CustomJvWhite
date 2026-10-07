package ru.ok.android.externcalls.sdk.ml.config;

import defpackage.j95;
import defpackage.y3e;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b \u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProviderBase;", "Lru/ok/android/externcalls/sdk/config/BaseConfigProvider;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProvider;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Ly3e;", "log", "", "configKey", "<init>", "(Lru/ok/android/externcalls/sdk/api/RemoteSettings;Ly3e;Ljava/lang/String;)V", "config", "parseConfig", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class MLFeatureConfigProviderBase extends BaseConfigProvider<MLFeatureConfig> implements MLFeatureConfigProvider {

    @Deprecated
    public static final String CHECKSUM_KEY = "cs";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENABLED_KEY = "use";

    @Deprecated
    public static final String LOG_TAG = "MLFeatureConfigProviderBase";

    @Deprecated
    public static final String URL_KEY = "url";

    public MLFeatureConfigProviderBase(RemoteSettings remoteSettings, y3e y3eVar, String str) {
        super(remoteSettings, y3eVar, str, LOG_TAG);
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public MLFeatureConfig parseConfig(String config) {
        JSONObject jSONObject = new JSONObject(config);
        return new MLFeatureConfig(jSONObject.getString(URL_KEY), jSONObject.getString(CHECKSUM_KEY), JsonExtKt.getBooleanOrDefault(jSONObject, ENABLED_KEY, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProviderBase$Companion;", "", "<init>", "()V", "URL_KEY", "", "CHECKSUM_KEY", "ENABLED_KEY", "LOG_TAG", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
