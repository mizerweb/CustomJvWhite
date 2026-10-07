package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n97 extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ o97 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n97(o97 o97Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = o97Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(0L, this, null);
    }
}
