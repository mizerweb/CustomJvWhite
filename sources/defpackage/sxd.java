package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class sxd extends nq4 {
    public String d;
    public lme e;
    public Iterator f;
    public d9 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ txd i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxd(txd txdVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = txdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.i(null, null, this);
    }
}
