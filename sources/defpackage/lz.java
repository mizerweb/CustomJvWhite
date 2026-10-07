package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lz extends nq4 {
    public qh3 d;
    public List e;
    public pw f;
    public List g;
    public pw h;
    public pw i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b00 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(b00 b00Var, lq4 lq4Var) {
        super(lq4Var);
        this.k = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
