package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bma extends nq4 {
    public jla d;
    public Set e;
    public Long f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ nma j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bma(nma nmaVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = nmaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return nma.B(this.j, null, null, false, this);
    }
}
