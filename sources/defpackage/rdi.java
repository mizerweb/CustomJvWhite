package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rdi extends nq4 {
    public long d;
    public long e;
    public String f;
    public Object g;
    public Collection h;
    public Iterator i;
    public Collection j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ vdi o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdi(vdi vdiVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = vdiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(0L, null, this);
    }
}
