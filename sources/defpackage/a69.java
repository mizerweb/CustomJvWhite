package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a69 extends a8j {
    public final mjg c;
    public final r8e d;
    public final ny8 e;
    public final mjg f;
    public final ny8 g;

    public a69(ny8 ny8Var, String str) {
        mjg mjgVarA = p90.a(new u59(ynh.b, ""));
        this.c = mjgVarA;
        this.d = new r8e(mjgVarA);
        this.e = ny8Var;
        mjg mjgVarA2 = p90.a("");
        this.f = mjgVarA2;
        this.g = rx8.P(3, new q38(25));
        tre.m0(new fz6(e9i.F(e9i.K(mjgVarA2, 1), 300L), new w8(2, this, a69.class, "validateText", "validateText(Ljava/lang/String;)V", 4, 16), 3), this.b);
        if (str.length() > 0) {
            mjgVarA.j(null, new u59(((u59) mjgVarA.getValue()).b, str));
        }
    }
}
