package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fz extends nq4 {
    public ArrayList d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b00 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(b00 b00Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.K(null, this);
    }
}
