package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aui implements eqb {
    public be2 a;
    public boolean b;

    @Override // defpackage.eqb
    public final void a(Object obj) {
        qyj.l("SourceStreamRequirementObserver can be updated from main thread only", wxl.c());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b == zEquals) {
            return;
        }
        this.b = zEquals;
        be2 be2Var = this.a;
        if (be2Var == null) {
            tvj.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (zEquals) {
            be2Var.l();
        } else {
            be2Var.c();
        }
    }

    public final void b() {
        qyj.l("SourceStreamRequirementObserver can be closed from main thread only", wxl.c());
        tvj.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.b);
        be2 be2Var = this.a;
        if (be2Var == null) {
            tvj.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.b) {
            this.b = false;
            if (be2Var != null) {
                be2Var.c();
            } else {
                tvj.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            }
        }
        this.a = null;
    }

    @Override // defpackage.eqb
    public final void onError(Throwable th) {
        tvj.i("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }
}
