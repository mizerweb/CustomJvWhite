package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class p6b extends nq4 {
    public ha9 d;
    public Collection e;
    public Iterator f;
    public ha9 g;
    public int h;
    public int i;
    public int j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y6b m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6b(y6b y6bVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = y6bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
