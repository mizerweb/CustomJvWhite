package ru.ok.android.externcalls.sdk.api;

import defpackage.lof;
import defpackage.v7g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.ml.config.ns.NSFeatureConfigProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "", "", "key", "Lv7g;", "get", "(Ljava/lang/String;)Lv7g;", "Lsbi;", "release", "()V", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface RemoteSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String KEY_BITRATE_DUMP = "android.dump.bitrate";
    public static final String KEY_ML_FEATURES = "android.mlfeatures.%s";
    public static final String KEY_RATING_LIMITS = "android.rating.limits";
    public static final String KEY_WEBRTC_STAT = "android.webrtc.stats";
    public static final String P2P_RELAY_SWITCH_CONFIG = "android.p2prelay.config";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/api/RemoteSettings$Companion;", "", "<init>", "()V", "KEY_PLATFORM", "", "KEY_RATING_LIMITS", "KEY_ML_FEATURES", "P2P_RELAY_SWITCH_CONFIG", "KEY_BITRATE_DUMP", "KEY_WEBRTC_STAT", ApiProtocol.PARAM_KEYS, "", "getKeys$annotations", "getKeys", "()Ljava/util/Set;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_BITRATE_DUMP = "android.dump.bitrate";
        public static final String KEY_ML_FEATURES = "android.mlfeatures.%s";
        private static final String KEY_PLATFORM = "android";
        public static final String KEY_RATING_LIMITS = "android.rating.limits";
        public static final String KEY_WEBRTC_STAT = "android.webrtc.stats";
        public static final String P2P_RELAY_SWITCH_CONFIG = "android.p2prelay.config";

        private Companion() {
        }

        public static /* synthetic */ void getKeys$annotations() {
        }

        public final Set<String> getKeys() {
            return lof.Z(a.p1(new String[]{"android.dump.bitrate", "android.rating.limits", "android.p2prelay.config", "android.webrtc.stats"}), NSFeatureConfigProvider.INSTANCE.getFeatureKeys());
        }
    }

    static Set<String> getKeys() {
        return INSTANCE.getKeys();
    }

    v7g get(String key);

    void release();
}
