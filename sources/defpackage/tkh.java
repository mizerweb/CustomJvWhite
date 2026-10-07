package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tkh extends nq4 {
    public xkh d;
    public Iterator e;
    public ArrayList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xkh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkh(xkh xkhVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = xkhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return xkh.c(this.m, null, this);
    }
}
