package ru.ok.android.externcalls.sdk.ml.delegate;

import android.content.Context;
import defpackage.j95;
import defpackage.xj9;
import defpackage.y3e;
import defpackage.zo5;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.ml.config.ns.NSFeatureConfigProvider;
import ru.ok.android.externcalls.sdk.ml.model.ExtensionRule;
import ru.ok.android.externcalls.sdk.ml.model.MLFeatureType;
import ru.ok.android.externcalls.sdk.ml.model.ModelSpec;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/NSFeatureDelegate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate;", "Lxj9;", "mlFeaturesInfoDataSource", "Lru/ok/android/externcalls/sdk/ml/config/ns/NSFeatureConfigProvider;", "nsConfigProvider", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "downloadService", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "mlDownloadStat", "Landroid/content/Context;", "context", "", "nsVersion", "Ly3e;", "logger", "<init>", "(Lxj9;Lru/ok/android/externcalls/sdk/ml/config/ns/NSFeatureConfigProvider;Lru/ok/android/externcalls/sdk/net/DownloadService;Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;Landroid/content/Context;ILy3e;)V", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NSFeatureDelegate extends MLFeatureDelegate {
    private static final String CONFIG_FILE_EXT = "cfg";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TFLITE_EXT = "tflite";
    private static final String VKMLMODEL_EXT = "vkmlmodel";

    public NSFeatureDelegate(xj9 xj9Var, NSFeatureConfigProvider nSFeatureConfigProvider, DownloadService downloadService, MLDownloadStat mLDownloadStat, Context context, int i, y3e y3eVar) {
        super(xj9Var, nSFeatureConfigProvider, downloadService, mLDownloadStat, MLFeatureType.NS, INSTANCE.getFeatureKeyByVersion(i), y3eVar, context, new ModelSpec(a.p1(new ExtensionRule[]{new ExtensionRule.Required(CONFIG_FILE_EXT), new ExtensionRule.OneOf(a.p1(new String[]{VKMLMODEL_EXT, TFLITE_EXT}))}), 0L, 2, null));
    }

    public static final String getFeatureKeyByVersion(int i) {
        return INSTANCE.getFeatureKeyByVersion(i);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/NSFeatureDelegate$Companion;", "", "<init>", "()V", "VKMLMODEL_EXT", "", "TFLITE_EXT", "CONFIG_FILE_EXT", "getFeatureKeyByVersion", "version", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final String getFeatureKeyByVersion(int version) {
            return zo5.h(version, "ns_");
        }

        private Companion() {
        }
    }
}
