package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class ni4 extends nq4 {
    public AtomicLong d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vi4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni4(vi4 vi4Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = vi4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.h(null, null, this);
    }
}
