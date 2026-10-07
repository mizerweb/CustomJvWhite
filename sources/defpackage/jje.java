package defpackage;

import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class jje extends nq4 {
    public Drawable d;
    public File e;
    public wfe f;
    public wfe g;
    public boolean h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kje l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jje(kje kjeVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = kjeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, false, this);
    }
}
