package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mo4 extends nq4 {
    public long d;
    public ufe e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public vfe i;
    public ufe j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ no4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo4(no4 no4Var, nq4 nq4Var) {
        super(nq4Var);
        this.m = no4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(0L, this, null);
    }
}
