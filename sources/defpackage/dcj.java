package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dcj {
    public final ny8 a;

    public dcj(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        ul9 ul9Var = new ul9();
        if (i2 == 1) {
            str = "procced_url_modal_window";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "blocked_url_modal_window";
        }
        ul9Var.put("UIElementType", str);
        if (i3 != 0) {
            if (i3 == 1) {
                str3 = "go";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str3 = "close";
            }
            ul9Var.put("clickType", str3);
        }
        ul9 ul9VarB = ul9Var.b();
        ae9 ae9Var = (ae9) this.a.getValue();
        if (i == 1) {
            str2 = "clicked";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "showed";
        }
        ae9.k(ae9Var, "DANGEROUS_URL_ACTIONS", str2, ul9VarB, 8);
    }
}
