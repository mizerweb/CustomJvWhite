package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class si5 extends nq4 {
    public csg d;
    public mw e;
    public Iterator f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ aj5 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.m(null, this);
    }
}
