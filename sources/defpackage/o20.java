package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o20 extends nq4 {
    public rt2 d;
    public ArrayList e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ p20 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(p20 p20Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = p20Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.L(null, null, this);
    }
}
