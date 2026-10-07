package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class om3 extends nq4 {
    public List d;
    public Set e;
    public Map f;
    public Iterator g;
    public tm3 h;
    public tm3 i;
    public Map j;
    public Object k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tm3 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om3(tm3 tm3Var, nq4 nq4Var) {
        super(nq4Var);
        this.o = tm3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, this);
    }
}
