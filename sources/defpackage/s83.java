package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s83 extends nq4 {
    public xf5 d;
    public Collection e;
    public Iterator f;
    public Object g;
    public d83 h;
    public t83 i;
    public int j;
    public int k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ t83 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(t83 t83Var, nq4 nq4Var) {
        super(nq4Var);
        this.n = t83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return t83.b(this.n, null, null, this);
    }
}
