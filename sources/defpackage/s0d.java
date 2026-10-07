package defpackage;

import one.me.pinbars.pinnedmessage.b;

/* JADX INFO: loaded from: classes2.dex */
public final class s0d extends nq4 {
    public rt2 d;
    public ynh e;
    public vfe f;
    public sfa g;
    public /* synthetic */ Object h;
    public final /* synthetic */ b i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0d(b bVar, lq4 lq4Var) {
        super(lq4Var);
        this.i = bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return b.b(this.i, null, this);
    }
}
