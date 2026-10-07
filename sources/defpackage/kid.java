package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kid extends nq4 {
    public q24 d;
    public List e;
    public Iterator f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nid m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kid(nid nidVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = nidVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, 0L, 0L, this);
    }
}
