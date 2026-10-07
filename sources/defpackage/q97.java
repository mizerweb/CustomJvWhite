package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q97 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(aec aecVar, int i, long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).a(aecVar, i, j, j2);
        }
    }

    public final void b(aec aecVar, int i, long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).b(aecVar, i, j, j2);
        }
    }

    public final void c(aec aecVar, fdc fdcVar, long j, long j2, vdc vdcVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).c(aecVar, fdcVar, j, j2, vdcVar);
        }
    }

    public final void d(aec aecVar, fdc fdcVar, vdc vdcVar, IOException iOException) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).d(aecVar, fdcVar, vdcVar, iOException);
        }
    }

    public final void e(aec aecVar, fdc fdcVar, vdc vdcVar, ux9 ux9Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).e(aecVar, fdcVar, vdcVar, ux9Var);
        }
    }

    public final void f(wdc wdcVar, aec aecVar, p4d p4dVar, p4d p4dVar2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).f(wdcVar, aecVar, p4dVar, p4dVar2);
        }
    }

    public final void g(aec aecVar, long j, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).g(aecVar, j, i);
        }
    }

    public final void h(aec aecVar, ux9 ux9Var, j28 j28Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q97) it.next()).h(aecVar, ux9Var, j28Var);
        }
    }
}
