package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;

/* JADX INFO: loaded from: classes2.dex */
public final class rn9 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ MasterHostApi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn9(MasterHostApi masterHostApi, lq4 lq4Var) {
        super(lq4Var);
        this.e = masterHostApi;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objM25getMastergIAlus = this.e.m25getMastergIAlus(null, this);
        return objM25getMastergIAlus == hu4.a ? objM25getMastergIAlus : new roe(objM25getMastergIAlus);
    }
}
