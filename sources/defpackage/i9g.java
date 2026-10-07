package defpackage;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class i9g extends nq4 {
    public m9g d;
    public FileInputStream e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m9g g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(this);
    }
}
