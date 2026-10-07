package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ped extends nq4 {
    public Object d;
    public Set e;
    public List f;
    public List g;
    public Iterator h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wed l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ped(wed wedVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = wedVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.s(null, null, this);
    }
}
