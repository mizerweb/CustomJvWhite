package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qu8 extends v1 {
    public final jt8 f;

    public qu8(qs8 qs8Var, jt8 jt8Var, String str) {
        super(qs8Var, str);
        this.f = jt8Var;
        this.a.add("primitive");
    }

    @Override // defpackage.v1
    public final jt8 F(String str) {
        if (str == "primitive") {
            return this.f;
        }
        ore.p("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.v1
    public final jt8 T() {
        return this.f;
    }

    @Override // defpackage.v74
    public final int v(fif fifVar) {
        return 0;
    }

    public /* synthetic */ qu8(qs8 qs8Var, pu8 pu8Var) {
        this(qs8Var, pu8Var, null);
    }
}
