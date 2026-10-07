package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ms9 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final p3a d;
    public final rs9 e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ y3a g;

    public ms9(y3a y3aVar, String str, int i, int i2, ss9 ss9Var) {
        this.g = y3aVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new p3a(str, i, i2);
        this.e = ss9Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.g.post(new pi(27, this));
    }
}
