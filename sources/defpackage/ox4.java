package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class ox4 extends nq4 {
    public ux4 d;
    public nv4 e;
    public au3 f;
    public File g;
    public /* synthetic */ Object h;
    public final /* synthetic */ rx4 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox4(rx4 rx4Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = rx4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return rx4.B(this.i, null, null, this);
    }
}
