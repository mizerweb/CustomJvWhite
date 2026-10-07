package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nxd extends nq4 {
    public String d;
    public List e;
    public gu4 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ txd h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxd(txd txdVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = txdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, null, null, null, this);
    }
}
