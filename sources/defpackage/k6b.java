package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k6b {
    public final ny8 a;

    public k6b(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, int i2, Long l) {
        String str;
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        int i3 = 2;
        if (i == 1) {
            str = "add";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "switch";
        }
        ul9Var.put("action", str);
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 != 2) {
            throw null;
        }
        ul9Var.put("entryPoint", Integer.valueOf(i3));
        if (l != null) {
            ul9Var.put("toUserId", l);
        }
        ae9Var.h("multiaccount_click", ul9Var.b());
    }
}
