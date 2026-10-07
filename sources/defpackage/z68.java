package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z68 implements oah {
    public final /* synthetic */ b78 a;
    public final /* synthetic */ v78 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ u78 d;

    public z68(b78 b78Var, v78 v78Var, Object obj, u78 u78Var) {
        this.a = b78Var;
        this.b = v78Var;
        this.c = obj;
        this.d = u78Var;
    }

    @Override // defpackage.oah
    public final Object get() {
        return this.a.a(this.b, this.c, this.d, null, null);
    }

    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.x(this.b.b, "uri");
        return dc9VarC.toString();
    }
}
