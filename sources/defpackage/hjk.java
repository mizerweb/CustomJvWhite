package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hjk implements sb5 {
    public final /* synthetic */ ljk a;

    public hjk(ljk ljkVar) {
        this.a = ljkVar;
    }

    @Override // defpackage.sb5
    public final void onStart(g19 g19Var) {
        if (this.a.h) {
            return;
        }
        this.a.h = true;
        if (this.a.i) {
            this.a.b();
        }
    }

    @Override // defpackage.sb5
    public final void onStop(g19 g19Var) {
        if (this.a.h) {
            this.a.h = false;
            this.a.a();
        }
    }
}
