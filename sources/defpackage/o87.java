package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o87 extends nq4 {
    public q87 d;
    public List e;
    public g4b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ p87 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o87(p87 p87Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = p87Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, null, this);
    }
}
