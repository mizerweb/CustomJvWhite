package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i31 extends nq4 {
    public List d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m31 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(m31 m31Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = m31Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, this);
    }
}
