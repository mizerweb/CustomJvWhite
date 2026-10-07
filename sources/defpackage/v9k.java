package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.feature.FeatureManager;

/* JADX INFO: loaded from: classes3.dex */
public final class v9k {
    public final w9k a;
    public final xde b;
    public final FeatureManager c;
    public final dq4 d;
    public final Logger e;

    public v9k(w9k w9kVar, xde xdeVar, FeatureManager featureManager, Logger logger) {
        dq4 dq4VarA = cqk.a(ao5.b);
        this.a = w9kVar;
        this.b = xdeVar;
        this.c = featureManager;
        this.d = dq4VarA;
        this.e = logger.createLogger("DeleteExpiredPushTokenUseCase");
    }
}
