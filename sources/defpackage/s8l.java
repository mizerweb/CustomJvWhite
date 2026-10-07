package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class s8l implements mie {
    private final j0b a;
    private final s5m b;

    public s8l(j0b j0bVar) {
        s5m s5mVarF = f6m.f();
        this.a = j0bVar;
        this.b = s5mVarF;
    }

    private final gie i(kz4 kz4Var) {
        hie hieVar = new hie(this.a, kz4Var, null, new p0b(this.a), new kmk(this.a, kz4Var.f()));
        j0b j0bVar = this.a;
        return gie.g(this.a, kz4Var, new p0b(j0bVar), hieVar, (r0b) j0bVar.a(r0b.class));
    }

    @Override // defpackage.mie
    public final Task a() {
        return gwl.d(new MlKitException("Custom Remote model does not support listing downloaded models", 12));
    }

    @Override // defpackage.mie
    public final /* bridge */ /* synthetic */ Task b(fie fieVar) {
        final kz4 kz4Var = (kz4) fieVar;
        Task taskC = zj9.b().c(new Callable() { // from class: m1l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.e(kz4Var);
            }
        });
        taskC.b(new otb() { // from class: i5l
            @Override // defpackage.otb
            public final void j(Task task) throws Throwable {
                this.a.h(task);
            }
        });
        return taskC;
    }

    @Override // defpackage.mie
    public final Task c(fie fieVar) {
        final kz4 kz4Var = (kz4) fieVar;
        final qjh qjhVar = new qjh();
        zj9.g().execute(new Runnable() { // from class: eqk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(kz4Var, qjhVar);
            }
        });
        otb otbVar = new otb() { // from class: rtk
            @Override // defpackage.otb
            public final void j(Task task) throws Throwable {
                this.a.g(task);
            }
        };
        kam kamVar = qjhVar.a;
        kamVar.b(otbVar);
        return kamVar;
    }

    @Override // defpackage.mie
    public final /* bridge */ /* synthetic */ Task d(fie fieVar, fq5 fq5Var) {
        final gie gieVarI = i((kz4) fieVar);
        gieVarI.k(fq5Var);
        return gwl.e(null).m(zj9.g(), new j8h() { // from class: nxk
            @Override // defpackage.j8h
            public final Task i(Object obj) {
                return gieVarI.a();
            }
        });
    }

    public final /* synthetic */ Boolean e(kz4 kz4Var) throws Exception {
        return Boolean.valueOf(i(kz4Var).h());
    }

    public final /* synthetic */ void f(kz4 kz4Var, qjh qjhVar) {
        try {
            p0b p0bVar = new p0b(this.a);
            u0b u0bVar = u0b.CUSTOM;
            String strC = kz4Var.c();
            yab.s(strC);
            p0bVar.a(u0bVar, strC);
            qjhVar.b(null);
        } catch (RuntimeException e) {
            qjhVar.a(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e));
        }
    }

    public final /* synthetic */ void g(Task task) throws Throwable {
        boolean zJ = task.j();
        yfj yfjVar = new yfj();
        wze wzeVar = new wze(16);
        wzeVar.i();
        wzeVar.h(Boolean.valueOf(zJ));
        yfjVar.r(wzeVar.j());
        this.b.a(wze.k(yfjVar), bul.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    public final /* synthetic */ void h(Task task) throws Throwable {
        Boolean bool = (Boolean) task.h();
        bool.getClass();
        yfj yfjVar = new yfj();
        h6f h6fVar = new h6f(14);
        h6fVar.r();
        h6fVar.q(bool);
        yfjVar.s(h6fVar.s());
        this.b.a(wze.k(yfjVar), bul.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
