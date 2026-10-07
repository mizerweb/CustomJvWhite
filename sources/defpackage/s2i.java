package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class s2i implements q2i {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ rda b;
    public final /* synthetic */ t2i c;

    public s2i(t2i t2iVar, ViewGroup viewGroup, rda rdaVar) {
        this.c = t2iVar;
        this.a = viewGroup;
        this.b = rdaVar;
    }

    @Override // defpackage.q2i
    public final void a(r2i r2iVar) {
        this.a.removeCallbacks(this.b);
    }

    @Override // defpackage.q2i
    public final void b() {
    }

    @Override // defpackage.q2i
    public final void c(r2i r2iVar) {
        t2i t2iVar = this.c;
        t2iVar.f.a();
        t2iVar.f = null;
    }

    @Override // defpackage.q2i
    public final void d() {
    }

    @Override // defpackage.q2i
    public final void e(r2i r2iVar) {
        t2i t2iVar = this.c;
        t2iVar.f.a();
        t2iVar.f = null;
    }
}
