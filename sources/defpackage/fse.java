package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fse extends nq4 {
    public Collection d;
    public Iterator e;
    public Collection f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ose j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fse(ose oseVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = oseVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.n(null, this);
    }
}
