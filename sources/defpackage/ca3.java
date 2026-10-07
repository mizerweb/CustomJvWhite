package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class ca3 extends nq4 {
    public AtomicLong d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ga3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca3(ga3 ga3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ga3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, null, this);
    }
}
