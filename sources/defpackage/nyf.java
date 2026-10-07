package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class nyf extends nq4 {
    public ynh d;
    public Collection e;
    public Iterator f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v63 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyf(v63 v63Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = v63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, null, this);
    }
}
