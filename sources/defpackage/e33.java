package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e33 extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ f33 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(f33 f33Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = f33Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
