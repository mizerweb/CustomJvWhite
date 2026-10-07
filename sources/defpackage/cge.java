package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class cge extends nq4 {
    public Iterator d;
    public c79 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dge h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cge(dge dgeVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = dgeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return dge.a(this.h, null, this);
    }
}
