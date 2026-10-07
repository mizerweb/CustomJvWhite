package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r9a extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v9a f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9a(v9a v9aVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = v9aVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return v9a.B(this.f, null, null, this);
    }
}
