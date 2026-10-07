package defpackage;

import android.graphics.Canvas;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cyg extends nq4 {
    public List d;
    public i6a e;
    public au3 f;
    public Canvas g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ dyg o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyg(dyg dygVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = dygVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return dyg.g(this.o, null, 0, 0, null, 0, 0, 0, 0, null, this);
    }
}
