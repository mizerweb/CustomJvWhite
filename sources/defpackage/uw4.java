package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class uw4 extends nq4 {
    public String d;
    public Bitmap e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xw4 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw4(xw4 xw4Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = xw4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, this);
    }
}
