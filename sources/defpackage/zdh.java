package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zdh extends nq4 {
    public List d;
    public Object e;
    public Collection f;
    public Collection g;
    public Iterator h;
    public Iterator i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ceh n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdh(ceh cehVar, nq4 nq4Var) {
        super(nq4Var);
        this.n = cehVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
