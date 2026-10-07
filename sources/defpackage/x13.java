package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x13 {
    public final zed a;
    public final wd4 b;

    public x13(zed zedVar, wd4 wd4Var) {
        this.a = zedVar;
        this.b = wd4Var;
    }

    public final boolean a(boolean z) {
        int i = this.a.c.d.getInt("app.media.load.gif", 0);
        if (z) {
            return b(i);
        }
        return i != -1;
    }

    public final boolean b(int i) {
        wd4 wd4Var = this.b;
        boolean zD = wd4Var.d();
        we4 we4VarA = wd4Var.a();
        if (i != -1) {
            we4 we4Var = we4.TYPE_WIFI;
            if (i != 0) {
                if (we4VarA == we4Var) {
                    return true;
                }
            } else if (we4VarA == we4Var || this.a.c.d.getBoolean("app.media.load.roaming", false) || !zD) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return b(this.a.c.d.getInt("app.media.load.photo", 0));
    }
}
