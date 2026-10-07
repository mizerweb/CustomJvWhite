package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ds3 extends nq4 {
    public long d;
    public Iterator e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ es3 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds3(es3 es3Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = es3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, this);
    }
}
