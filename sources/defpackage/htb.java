package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class htb implements OnBackAnimationCallback {
    public final /* synthetic */ cf7 a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ af7 c;
    public final /* synthetic */ af7 d;

    public htb(cf7 cf7Var, cf7 cf7Var2, af7 af7Var, af7 af7Var2) {
        this.a = cf7Var;
        this.b = cf7Var2;
        this.c = af7Var;
        this.d = af7Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new sl0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new sl0(backEvent));
    }
}
