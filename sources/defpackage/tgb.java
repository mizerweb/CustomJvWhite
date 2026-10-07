package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class tgb {
    public final ny8 a;
    public final mjg b;
    public final r8e c;
    public final AtomicReference d;
    public final pzf e;
    public final q8e f;

    public tgb(Context context) {
        this.a = rx8.P(3, new rgb(context, this));
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.b = mjgVarA;
        this.c = new r8e(mjgVarA);
        this.d = new AtomicReference(null);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.e = pzfVarB;
        this.f = new q8e(pzfVarB);
    }
}
