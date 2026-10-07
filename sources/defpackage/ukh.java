package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ukh extends nq4 {
    public xkh d;
    public Iterator e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xkh h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukh(xkh xkhVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = xkhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return xkh.d(this.h, null, this);
    }
}
