package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t7e extends nq4 {
    public l8b d;
    public List e;
    public l8b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ u7e h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7e(u7e u7eVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = u7eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.C(null, null, this);
    }
}
