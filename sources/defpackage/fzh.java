package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fzh {
    public static final fzh b;
    public static final String c;
    public final c98 a;

    static {
        a98 a98Var = c98.b;
        b = new fzh(ghe.e);
        String str = vqi.a;
        c = Integer.toString(0, 36);
    }

    public fzh(ghe gheVar) {
        this.a = c98.n(gheVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            c98 c98Var = this.a;
            if (i2 >= c98Var.size()) {
                return false;
            }
            ezh ezhVar = (ezh) c98Var.get(i2);
            if (ezhVar.f() && ezhVar.e() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fzh.class != obj.getClass()) {
            return false;
        }
        c98 c98Var = ((fzh) obj).a;
        c98 c98Var2 = this.a;
        c98Var2.getClass();
        return j8f.a(c98Var2, c98Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
