package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tn4 extends nq4 {
    public v44 d;
    public ArrayList e;
    public e2 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ un4 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn4(un4 un4Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = un4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return un4.a(this.h, this);
    }
}
