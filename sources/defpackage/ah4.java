package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ah4 {
    public final ny8 a;

    public ah4(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(long j) {
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("user2Id", Long.valueOf(j));
        ae9.k(ae9Var, "CONTACT_RENAME_BANNER", "show", ul9Var.b(), 8);
    }
}
