package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pgi implements yx6, cg7 {
    public final /* synthetic */ njd a;

    public pgi(njd njdVar) {
        this.a = njdVar;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        Object objA = this.a.f.a(lq4Var, (vfi) obj);
        return objA == hu4.a ? objA : sbi.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yx6) && (obj instanceof cg7)) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(2, 0, njd.class, this.a, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
