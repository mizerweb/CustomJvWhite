package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h13 extends nq4 {
    public long d;
    public long e;
    public m8b f;
    public Iterator g;
    public f99 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ i13 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h13(i13 i13Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = i13Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.u(0L, null, null, this);
    }
}
