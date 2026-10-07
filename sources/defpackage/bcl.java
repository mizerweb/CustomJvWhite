package defpackage;

import android.graphics.Point;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class bcl extends o0b implements op0 {
    private static final pp0 m = new pp0.a().a();
    public static final /* synthetic */ int n = 0;
    private final boolean h;
    private final pp0 i;
    final ecm j;
    private int k;
    private boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcl(pp0 pp0Var, yol yolVar, Executor executor, dbm dbmVar, j0b j0bVar) {
        ecm ecmVarD;
        super(yolVar, executor);
        s1k s1kVarB = pp0Var.b();
        if (s1kVarB == null) {
            ecmVarD = null;
        } else {
            ecmVarD = ecm.d(j0bVar.b(), j0bVar.b().getPackageName());
            ecmVarD.o(new o1l(s1kVarB), h4l.a());
            if (s1kVarB.a() >= 1.0f) {
                ecmVarD.k(s1kVarB.a());
            }
            ecmVarD.m();
        }
        this.i = pp0Var;
        boolean zF = jqk.f();
        this.h = zF;
        p4m p4mVar = new p4m();
        p4mVar.i(jqk.c(pp0Var));
        t4m t4mVarJ = p4mVar.j();
        r3m r3mVar = new r3m();
        r3mVar.e(zF ? l3m.TYPE_THICK : l3m.TYPE_THIN);
        r3mVar.g(t4mVarJ);
        dbmVar.d(gbm.f(r3mVar, 1), p3m.ON_DEVICE_BARCODE_CREATE);
        this.j = ecmVarD;
    }

    private final Task o0(Task task, final int i, final int i2) {
        j8h j8hVar = new j8h() { // from class: k5l
            @Override // defpackage.j8h
            public final Task i(Object obj) {
                return this.a.Y(i, i2, (List) obj);
            }
        };
        kam kamVar = (kam) task;
        kamVar.getClass();
        c20 c20Var = vjh.a;
        kam kamVar2 = new kam();
        kamVar.b.d(new ecl(c20Var, j8hVar, kamVar2));
        kamVar.r();
        return kamVar2;
    }

    @Override // defpackage.op0
    public final Task D(vg8 vg8Var) {
        return o0(super.E(vg8Var), vg8Var.o(), vg8Var.k());
    }

    public final /* synthetic */ Task Y(int i, int i2, List list) throws Exception {
        if (this.j == null) {
            return gwl.e(list);
        }
        this.k++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            np0 np0Var = (np0) it.next();
            if (np0Var.h() == -1) {
                arrayList2.add(np0Var);
            } else {
                arrayList.add(np0Var);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Point[] pointArrD = ((np0) arrayList2.get(i3)).d();
                if (pointArrD != null) {
                    this.j.i(this.k, hcm.g(Arrays.asList(pointArrD), i, i2, 0.0f));
                }
            }
        } else {
            this.l = true;
        }
        if (true != this.i.d()) {
            list = arrayList;
        }
        return gwl.e(list);
    }

    @Override // defpackage.o0b, java.io.Closeable, java.lang.AutoCloseable, defpackage.op0
    public final synchronized void close() {
        try {
            ecm ecmVar = this.j;
            if (ecmVar != null) {
                ecmVar.n(this.l);
                this.j.j();
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bj5
    public final int i0() {
        return 1;
    }

    @Override // defpackage.op0
    public final Task j0(e0b e0bVar) {
        super.I(e0bVar);
        throw null;
    }

    @Override // defpackage.op0, defpackage.ygc
    public final do6[] s() {
        return this.h ? zgc.a : new do6[]{zgc.J};
    }
}
