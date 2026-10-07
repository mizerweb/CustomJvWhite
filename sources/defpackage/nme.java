package defpackage;

import com.vk.push.core.retry.RequestRetryComponent;

/* JADX INFO: loaded from: classes2.dex */
public final class nme extends nq4 {
    public RequestRetryComponent d;
    public cf7 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ RequestRetryComponent h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nme(RequestRetryComponent requestRetryComponent, lq4 lq4Var) {
        super(lq4Var);
        this.h = requestRetryComponent;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Object objM27invokegIAlus = this.h.m27invokegIAlus(null, this);
        return objM27invokegIAlus == hu4.a ? objM27invokegIAlus : new roe(objM27invokegIAlus);
    }
}
