package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z37 extends nq4 {
    public vfe d;
    public Long e;
    public ufe f;
    public Iterator g;
    public List h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a47 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z37(a47 a47Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = a47Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
