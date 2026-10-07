package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class exd implements v1i {
    public final v1i a;
    public volatile v1i b;
    public volatile boolean c = true;

    public exd(v1i v1iVar) {
        this.a = v1iVar;
    }

    public final void a() {
        this.c = false;
    }

    public final void b(v1i v1iVar) {
        this.b = v1iVar;
    }

    @Override // defpackage.v1i
    public final void c(u25 u25Var, a35 a35Var, boolean z) {
        v1i v1iVar = this.b;
        if (v1iVar != null) {
            v1iVar.c(u25Var, a35Var, z);
        }
        if (this.c) {
            this.a.c(u25Var, a35Var, z);
        }
    }

    @Override // defpackage.v1i
    public final void d(u25 u25Var, a35 a35Var, boolean z, int i) {
        v1i v1iVar = this.b;
        if (v1iVar != null) {
            v1iVar.d(u25Var, a35Var, z, i);
        }
        if (this.c) {
            this.a.d(u25Var, a35Var, z, i);
        }
    }

    @Override // defpackage.v1i
    public final void h(u25 u25Var, a35 a35Var, boolean z) {
        v1i v1iVar = this.b;
        if (v1iVar != null) {
            v1iVar.h(u25Var, a35Var, z);
        }
        if (this.c) {
            this.a.h(u25Var, a35Var, z);
        }
    }

    @Override // defpackage.v1i
    public final void i(u25 u25Var, a35 a35Var, boolean z) {
        v1i v1iVar = this.b;
        if (v1iVar != null) {
            v1iVar.i(u25Var, a35Var, z);
        }
        if (this.c) {
            this.a.i(u25Var, a35Var, z);
        }
    }
}
