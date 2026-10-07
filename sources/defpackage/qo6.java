package defpackage;

import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class qo6 extends nq4 {
    public FeatureManagerImpl d;
    public Feature.BooleanFeature e;
    public /* synthetic */ Object f;
    public final /* synthetic */ FeatureManagerImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(FeatureManagerImpl featureManagerImpl, lq4 lq4Var) {
        super(lq4Var);
        this.g = featureManagerImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.getFeatureValue((Feature.BooleanFeature) null, this);
    }
}
