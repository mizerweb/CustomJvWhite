package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class x34 extends nq4 {
    public m8b d;
    public LinkedHashSet e;
    public Collection f;
    public Iterator g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y34 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x34(y34 y34Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = y34Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
