package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class svb {
    public final ny8 a;
    public final ny8 b;

    public svb(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final zed a() {
        return (zed) this.a.getValue();
    }

    public final boolean b() {
        String string;
        return (a().a.t() == -1 || (string = a().d.d.getString("auth.token", null)) == null || string.length() == 0) ? false : true;
    }

    public final String c() {
        String string;
        if (a().a.t() != 0 && (string = a().d.d.getString("auth.token", null)) != null && string.length() != 0) {
            return a().d.d.getString("auth.token", null);
        }
        gm0.Y(svb.class.getName(), "Early return in peekToken cuz of prefs.client().userId == 0L || prefs.auth().token.isNullOrEmpty()");
        return null;
    }

    public final void d(boolean z) {
        gm0.n("svb", "removeAccount");
        a().d.b();
        if (z) {
            ((jh9) this.b.getValue()).a();
        }
    }

    public final void e(String str) {
        a().d.e("auth.token", str);
    }
}
