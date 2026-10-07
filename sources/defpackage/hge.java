package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hge extends nq4 {
    public List d;
    public List e;
    public Set f;
    public Iterator g;
    public rt2 h;
    public sfa i;
    public b9b j;
    public Iterator k;
    public long l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ige o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hge(ige igeVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = igeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
