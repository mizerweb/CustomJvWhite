package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class um extends nq4 {
    public Map d;
    public wfe e;
    public Object f;
    public m8b g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ xm j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(xm xmVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = xmVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return xm.c(this.j, null, null, this);
    }
}
