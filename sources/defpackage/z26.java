package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z26 {
    public final mjg a = p90.a(null);
    public Long b;

    public final void a() {
        mjg mjgVar;
        Object value;
        this.b = null;
        do {
            mjgVar = this.a;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, null));
    }

    public final mjg b(Long l) {
        Object value;
        boolean zD = cqk.d(this.b, l);
        mjg mjgVar = this.a;
        if (!zD) {
            this.b = l;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, null));
        }
        return mjgVar;
    }

    public final void c(Long l, y26 y26Var) {
        mjg mjgVar;
        Object value;
        if (cqk.d(this.b, l)) {
            do {
                mjgVar = this.a;
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, y26Var));
        }
    }
}
