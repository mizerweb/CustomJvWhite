package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ddc implements v1i {
    public final /* synthetic */ edc a;

    public ddc(edc edcVar) {
        this.a = edcVar;
    }

    @Override // defpackage.v1i
    public final void c(u25 u25Var, a35 a35Var, boolean z) {
        edc edcVar = this.a;
        zg6 zg6Var = edcVar.a;
        if (zg6Var == null) {
            zg6Var = null;
        }
        if (zg6Var != null) {
            zg6Var.c(u25Var, a35Var, z);
        }
        Iterator it = edcVar.b.iterator();
        while (it.hasNext()) {
            ((v1i) it.next()).c(u25Var, a35Var, z);
        }
    }

    @Override // defpackage.v1i
    public final void d(u25 u25Var, a35 a35Var, boolean z, int i) {
        edc edcVar = this.a;
        zg6 zg6Var = edcVar.a;
        if (zg6Var == null) {
            zg6Var = null;
        }
        if (zg6Var != null) {
            zg6Var.d(u25Var, a35Var, z, i);
        }
        Iterator it = edcVar.b.iterator();
        while (it.hasNext()) {
            ((v1i) it.next()).d(u25Var, a35Var, z, i);
        }
    }

    @Override // defpackage.v1i
    public final void h(u25 u25Var, a35 a35Var, boolean z) {
        edc edcVar = this.a;
        zg6 zg6Var = edcVar.a;
        if (zg6Var == null) {
            zg6Var = null;
        }
        if (zg6Var != null) {
            zg6Var.h(u25Var, a35Var, z);
        }
        Iterator it = edcVar.b.iterator();
        while (it.hasNext()) {
            ((v1i) it.next()).h(u25Var, a35Var, z);
        }
    }

    @Override // defpackage.v1i
    public final void i(u25 u25Var, a35 a35Var, boolean z) {
        edc edcVar = this.a;
        zg6 zg6Var = edcVar.a;
        if (zg6Var == null) {
            zg6Var = null;
        }
        if (zg6Var != null) {
            zg6Var.i(u25Var, a35Var, z);
        }
        Iterator it = edcVar.b.iterator();
        while (it.hasNext()) {
            ((v1i) it.next()).i(u25Var, a35Var, z);
        }
    }
}
