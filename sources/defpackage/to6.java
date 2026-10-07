package defpackage;

import com.vk.push.core.feature.FeatureManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class to6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ FeatureManagerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to6(FeatureManagerImpl featureManagerImpl, lq4 lq4Var) {
        super(lq4Var);
        this.e = featureManagerImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$getFileUpdateInterval(this.e, this);
    }
}
