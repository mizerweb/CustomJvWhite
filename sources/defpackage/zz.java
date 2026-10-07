package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zz extends nq4 {
    public ArrayList d;
    public l8b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b00 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(b00 b00Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.Q(null, this);
    }
}
