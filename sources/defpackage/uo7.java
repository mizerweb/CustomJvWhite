package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uo7 extends nq4 {
    public op0 d;
    public List e;
    public Bitmap f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vo7 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo7(vo7 vo7Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = vo7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.g(null, null, this);
    }
}
