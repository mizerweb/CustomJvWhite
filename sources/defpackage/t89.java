package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t89 {
    public final Object a;
    public s74 b = new s74(1);
    public boolean c;
    public boolean d;

    public t89(Object obj) {
        this.a = obj;
    }

    public static void a(t89 t89Var, s89 s89Var) {
        t89Var.d = true;
        if (s89Var == null || !t89Var.c) {
            return;
        }
        t89Var.c = false;
        s89Var.c(t89Var.a, t89Var.b.d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t89.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((t89) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
