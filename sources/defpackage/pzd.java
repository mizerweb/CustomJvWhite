package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class pzd {
    public final gjf a;
    public final Context b;
    public final pfh c;
    public final AtomicLong d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ifh h;

    public pzd(gjf gjfVar, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        pfh pfhVar = new pfh(2);
        this.a = gjfVar;
        this.b = context;
        this.c = pfhVar;
        this.d = new AtomicLong();
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = new ifh(new a8d(20, this));
    }
}
