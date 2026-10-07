package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ij2 implements srb, cg7 {
    public final /* synthetic */ j22 a;

    public ij2(j22 j22Var) {
        this.a = j22Var;
    }

    @Override // defpackage.srb
    public final /* synthetic */ void a(Object obj) {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof srb) && (obj instanceof cg7)) {
            return this.a == ((cg7) obj).getFunctionDelegate();
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
