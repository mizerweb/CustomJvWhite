package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r7e extends nq4 {
    public ArrayList d;
    public sfa e;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ u7e i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7e(u7e u7eVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = u7eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.v(null, 0L, 0, null, this);
    }
}
