package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hjb extends nq4 {
    public s04 d;
    public q24 e;
    public List f;
    public Collection g;
    public Iterator h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mjb m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjb(mjb mjbVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = mjbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, this);
    }
}
