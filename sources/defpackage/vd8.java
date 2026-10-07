package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vd8 extends nq4 {
    public wd8 d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wd8 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd8(wd8 wd8Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = wd8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return wd8.a(this.g, null, null, this);
    }
}
