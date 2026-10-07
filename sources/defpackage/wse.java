package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wse extends nq4 {
    public long d;
    public int e;
    public int f;
    public ArrayList g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xse i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wse(xse xseVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = xseVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
