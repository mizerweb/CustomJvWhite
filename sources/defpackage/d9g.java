package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d9g extends nq4 {
    public m9g d;
    public Object e;
    public Serializable f;
    public Object g;
    public f9g h;
    public Iterator i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m9g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
