package defpackage;

import android.os.SystemClock;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yol extends yj9 {
    private static final z78 j = z78.b();
    static boolean k = true;
    private final pp0 d;
    private final yrl e;
    private final dbm f;
    private final fbm g;
    private final wx0 h = new wx0();
    private boolean i;

    public yol(j0b j0bVar, pp0 pp0Var, yrl yrlVar, dbm dbmVar) {
        yab.t(j0bVar, "MlKitContext can not be null");
        yab.t(pp0Var, "BarcodeScannerOptions can not be null");
        this.d = pp0Var;
        this.e = yrlVar;
        this.f = dbmVar;
        this.g = fbm.a(j0bVar.b());
    }

    private final void n(final n3m n3mVar, long j2, final vg8 vg8Var, List list) {
        final zvk zvkVar = new zvk();
        final zvk zvkVar2 = new zvk();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                np0 np0Var = (np0) it.next();
                zvkVar.e(jqk.a(np0Var.h()));
                zvkVar2.e(jqk.b(np0Var.o()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.f.f(new cbm() { // from class: nil
            @Override // defpackage.cbm
            public final sam zza() {
                return this.a.k(jElapsedRealtime, n3mVar, zvkVar, zvkVar2, vg8Var);
            }
        }, p3m.ON_DEVICE_BARCODE_DETECT);
        q7l q7lVar = new q7l();
        q7lVar.e(n3mVar);
        q7lVar.f(Boolean.valueOf(k));
        q7lVar.g(jqk.c(this.d));
        q7lVar.c(zvkVar.g());
        q7lVar.d(zvkVar2.g());
        final w7l w7lVarH = q7lVar.h();
        final vll vllVar = new vll(this);
        final dbm dbmVar = this.f;
        final p3m p3mVar = p3m.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        zj9.g().execute(new Runnable() { // from class: bbm
            @Override // java.lang.Runnable
            public final void run() {
                dbmVar.h(p3mVar, w7lVarH, jElapsedRealtime, vllVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.g.c(true != this.i ? 24301 : 24302, n3mVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // defpackage.t0b
    public final synchronized void c() throws MlKitException {
        this.i = this.e.b();
    }

    @Override // defpackage.t0b
    public final synchronized void e() {
        try {
            this.e.zzb();
            k = true;
            r3m r3mVar = new r3m();
            l3m l3mVar = this.i ? l3m.TYPE_THICK : l3m.TYPE_THIN;
            dbm dbmVar = this.f;
            r3mVar.e(l3mVar);
            p4m p4mVar = new p4m();
            p4mVar.i(jqk.c(this.d));
            r3mVar.g(p4mVar.j());
            dbmVar.d(gbm.e(r3mVar), p3m.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ sam k(long j2, n3m n3mVar, zvk zvkVar, zvk zvkVar2, vg8 vg8Var) {
        z1m z1mVar;
        p4m p4mVar = new p4m();
        k2m k2mVar = new k2m();
        k2mVar.c(Long.valueOf(j2));
        k2mVar.d(n3mVar);
        k2mVar.e(Boolean.valueOf(k));
        Boolean bool = Boolean.TRUE;
        k2mVar.a(bool);
        k2mVar.b(bool);
        p4mVar.h(k2mVar.f());
        p4mVar.i(jqk.c(this.d));
        p4mVar.e(zvkVar.g());
        p4mVar.f(zvkVar2.g());
        int iJ = vg8Var.j();
        int iD = j.d(vg8Var);
        x1m x1mVar = new x1m();
        if (iJ == -1) {
            z1mVar = z1m.BITMAP;
        } else if (iJ == 35) {
            z1mVar = z1m.YUV_420_888;
        } else if (iJ == 842094169) {
            z1mVar = z1m.YV12;
        } else if (iJ != 16) {
            z1mVar = iJ != 17 ? z1m.UNKNOWN_FORMAT : z1m.NV21;
        } else {
            z1mVar = z1m.NV16;
        }
        x1mVar.a(z1mVar);
        x1mVar.b(Integer.valueOf(iD));
        p4mVar.g(x1mVar.d());
        r3m r3mVar = new r3m();
        r3mVar.e(this.i ? l3m.TYPE_THICK : l3m.TYPE_THIN);
        r3mVar.g(p4mVar.j());
        return gbm.e(r3mVar);
    }

    public final /* synthetic */ sam l(w7l w7lVar, int i, p1m p1mVar) {
        r3m r3mVar = new r3m();
        r3mVar.e(this.i ? l3m.TYPE_THICK : l3m.TYPE_THIN);
        n7l n7lVar = new n7l();
        n7lVar.a(Integer.valueOf(i));
        n7lVar.c(w7lVar);
        n7lVar.b(p1mVar);
        r3mVar.d(n7lVar.e());
        return gbm.e(r3mVar);
    }

    @Override // defpackage.yj9
    /* JADX INFO: renamed from: m */
    public final synchronized List j(vg8 vg8Var) throws Throwable {
        yol yolVar;
        vg8 vg8Var2;
        try {
            try {
                wx0 wx0Var = this.h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                wx0Var.a(vg8Var);
                try {
                    List listA = this.e.a(vg8Var);
                    yolVar = this;
                    vg8Var2 = vg8Var;
                    try {
                        yolVar.n(n3m.NO_ERROR, jElapsedRealtime, vg8Var2, listA);
                        k = false;
                        return listA;
                    } catch (MlKitException e) {
                        e = e;
                        MlKitException mlKitException = e;
                        yolVar.n(mlKitException.a() == 14 ? n3m.MODEL_NOT_DOWNLOADED : n3m.UNKNOWN_ERROR, jElapsedRealtime, vg8Var2, null);
                        throw mlKitException;
                    }
                } catch (MlKitException e2) {
                    e = e2;
                    yolVar = this;
                    vg8Var2 = vg8Var;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }
}
