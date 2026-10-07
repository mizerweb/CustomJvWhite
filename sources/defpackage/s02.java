package defpackage;

import one.me.calls.impl.service.CallServiceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class s02 extends nq4 {
    public y02 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ CallServiceImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s02(CallServiceImpl callServiceImpl, nq4 nq4Var) {
        super(nq4Var);
        this.f = callServiceImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return CallServiceImpl.a(this.f, null, null, null, null, this);
    }
}
