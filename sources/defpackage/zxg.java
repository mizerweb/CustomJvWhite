package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes3.dex */
public final class zxg extends nq4 {
    public Canvas d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dyg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxg(dyg dygVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = dygVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return dyg.d(this.h, null, null, 0, 0, this);
    }
}
