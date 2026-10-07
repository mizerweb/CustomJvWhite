package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u4a {
    public final boolean a;
    public final String b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public u4a(ny8 ny8Var, ny8 ny8Var2, dsc dscVar, boolean z) {
        this.a = z;
        String name = u4a.class.getName();
        this.b = name;
        this.c = ny8Var;
        this.d = ny8Var2;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.s("Init with isAnyAutoplayAvailable=", z), null);
            }
        }
        this.e = rx8.P(3, new vx9(dscVar, 3, this));
    }

    public final boolean a(int i) {
        if (this.a) {
            boolean zD = ((wd4) this.c.getValue()).d();
            boolean z = ((wd4) this.c.getValue()).a() == we4.TYPE_WIFI;
            if (i != 0) {
                if (i == 1) {
                    return z;
                }
            } else if (z || b().c.d.getBoolean("app.media.load.roaming", false) || !zD) {
                return true;
            }
        } else {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Autoplay is fully disabled", null);
                    return false;
                }
            }
        }
        return false;
    }

    public final zed b() {
        return (zed) this.d.getValue();
    }

    public final boolean c() {
        return ((Boolean) b().b.C().i()).booleanValue() && a(b().c.k());
    }

    public final boolean d() {
        if (((Boolean) b().b.C().i()).booleanValue()) {
            return b().c.d.getInt("app.video.auto.play", 1) != -1;
        }
        return a(b().c.d.getInt("app.video.auto.play", 1));
    }
}
