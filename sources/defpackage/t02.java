package defpackage;

import one.me.calls.impl.service.CallServiceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class t02 extends nq4 {
    public y02 d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ CallServiceImpl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t02(CallServiceImpl callServiceImpl, nq4 nq4Var) {
        super(nq4Var);
        this.j = callServiceImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return CallServiceImpl.b(this.j, null, null, null, null, false, false, false, this);
    }
}
