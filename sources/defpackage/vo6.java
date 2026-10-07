package defpackage;

import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.filedatastore.FileDataSource;

/* JADX INFO: loaded from: classes4.dex */
public final class vo6 extends nq4 {
    public FileDataSource d;
    public /* synthetic */ Object e;
    public final /* synthetic */ FeatureManagerImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo6(FeatureManagerImpl featureManagerImpl, lq4 lq4Var) {
        super(lq4Var);
        this.f = featureManagerImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objM17access$saveUpdateIntervalIoAF18A = FeatureManagerImpl.m17access$saveUpdateIntervalIoAF18A(this.f, this);
        return objM17access$saveUpdateIntervalIoAF18A == hu4.a ? objM17access$saveUpdateIntervalIoAF18A : new roe(objM17access$saveUpdateIntervalIoAF18A);
    }
}
