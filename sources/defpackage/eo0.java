package defpackage;

import android.content.Context;
import me.leolin.shortcutbadger.ShortcutBadger;

/* JADX INFO: loaded from: classes.dex */
public final class eo0 implements hh9 {
    public final Context a;
    public final xn3 b;
    public final gq0 c;
    public final dq4 d;

    public eo0(Context context, xn3 xn3Var, gq0 gq0Var, xhh xhhVar, yt4 yt4Var) {
        this.a = context;
        this.b = xn3Var;
        this.c = gq0Var;
        xt4 xt4VarR0 = ((n0c) xhhVar).a().R0(1, "badge-count");
        xt4VarR0.getClass();
        this.d = cqk.a(lvb.x0(xt4VarR0, yt4Var));
    }

    @Override // defpackage.hh9
    public final void c() {
        ShortcutBadger.removeCount(this.a);
    }
}
