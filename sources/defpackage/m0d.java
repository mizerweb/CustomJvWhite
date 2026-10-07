package defpackage;

import one.me.pinbars.pinnedmessage.b;

/* JADX INFO: loaded from: classes2.dex */
public final class m0d extends nq4 {
    public t0d d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0d(b bVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return b.a(this.g, null, null, this);
    }
}
