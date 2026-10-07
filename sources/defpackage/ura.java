package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ura extends nq4 {
    public luk d;
    public q24 e;
    public List f;
    public long g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jsa k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ura(jsa jsaVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = jsaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u0(null, this);
    }
}
