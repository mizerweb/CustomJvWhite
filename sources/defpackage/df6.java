package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class df6 {
    public final ny8 a;
    public final ny8 b;

    public df6(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final s25 a(boolean z, final yki ykiVar) {
        s25 s25Var = new s25() { // from class: cf6
            @Override // defpackage.s25
            public final u25 a() {
                return new zv6(new rsb(((gih) this.a.b.getValue()).a(), new qg7(3)), ykiVar);
            }
        };
        if (!z) {
            return s25Var;
        }
        j71 j71Var = new j71();
        j71Var.e((j6g) this.a.getValue());
        j71Var.h(s25Var);
        j71Var.g();
        return j71Var;
    }
}
