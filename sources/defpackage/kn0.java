package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kn0 {
    public final ny8 a;

    public kn0(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final ae9 a() {
        return (ae9) this.a.getValue();
    }

    public final void b() {
        ae9.k(a(), "BACKGROUND_MODE", "snack_click_on", null, 12);
    }

    public final void c(String str) {
        ae9 ae9VarA = a();
        ul9 ul9Var = new ul9();
        ul9Var.put("reason", str);
        ae9.k(ae9VarA, "BACKGROUND_MODE", "snack_hidden", ul9Var.b(), 8);
    }

    public final void d() {
        ae9.k(a(), "BACKGROUND_MODE", "snack_shown", null, 12);
    }
}
