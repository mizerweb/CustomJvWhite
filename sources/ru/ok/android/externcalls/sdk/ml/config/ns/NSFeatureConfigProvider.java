package ru.ok.android.externcalls.sdk.ml.config.ns;

import defpackage.j95;
import defpackage.ww3;
import defpackage.y3e;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/ns/NSFeatureConfigProvider;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProviderBase;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "", "version", "Ly3e;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/api/RemoteSettings;ILy3e;)V", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NSFeatureConfigProvider extends MLFeatureConfigProviderBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public NSFeatureConfigProvider(RemoteSettings remoteSettings, int i, y3e y3eVar) {
        super(remoteSettings, y3eVar, String.format("android.mlfeatures.%s", Arrays.copyOf(new Object[]{NSFeatureDelegate.INSTANCE.getFeatureKeyByVersion(i)}, 1)));
    }

    public static final Set<String> getFeatureKeys() {
        return INSTANCE.getFeatureKeys();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/ns/NSFeatureConfigProvider$Companion;", "", "<init>", "()V", "getFeatureKeys", "", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final Set<String> getFeatureKeys() {
            Set setP1 = a.p1(new Integer[]{1, 2, 3});
            ArrayList arrayList = new ArrayList(yw3.W0(setP1, 10));
            Iterator it = setP1.iterator();
            while (it.hasNext()) {
                arrayList.add(NSFeatureDelegate.INSTANCE.getFeatureKeyByVersion(((Number) it.next()).intValue()));
            }
            ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.format("android.mlfeatures.%s", Arrays.copyOf(new Object[]{(String) it2.next()}, 1)));
            }
            return ww3.X1(arrayList2);
        }

        private Companion() {
        }
    }
}
