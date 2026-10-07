package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kp0 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final d8b d;
    public final d8b e;
    public final d8b f;

    public kp0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        int i = cj8.a;
        this.d = new d8b(6);
        this.e = new d8b(6);
        this.f = new d8b(6);
    }

    public final void a(int i, int i2, int i3) {
        Integer numC = ((tbb) this.c.getValue()).c();
        if (numC != null) {
            b("clicked", i, numC.intValue(), i2, i3);
        }
    }

    public final void b(String str, int i, int i2, int i3, int i4) {
        String str2;
        String str3;
        String str4;
        ae9 ae9Var = (ae9) this.b.getValue();
        ul9 ul9Var = new ul9();
        if (i == 1) {
            str2 = "push";
        } else if (i == 2) {
            str2 = "contacts";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "mic";
        }
        ul9Var.put("bannerType", str2);
        ul9Var.put("screen", Integer.valueOf(i2));
        if (i3 == 1) {
            str3 = "small";
        } else if (i3 == 2) {
            str3 = "medium";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str3 = "large";
        }
        ul9Var.put("bannerSize", str3);
        if (i4 == 1) {
            str4 = "carousel";
        } else {
            if (i4 != 2) {
                throw null;
            }
            str4 = "banner";
        }
        ul9Var.put("bannerShowType", str4);
        ae9.k(ae9Var, "BANNER", str, ul9Var.b(), 8);
    }
}
