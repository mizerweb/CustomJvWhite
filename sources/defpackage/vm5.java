package defpackage;

import bolts.Task;
import com.facebook.imagepipeline.producers.DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class vm5 implements mjd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public vm5(mjd mjdVar, k2d k2dVar, Executor executor) {
        this.a = 4;
        mjdVar.getClass();
        this.b = mjdVar;
        this.c = k2dVar;
        executor.getClass();
        this.d = executor;
    }

    public static Map c(pjd pjdVar, es0 es0Var, boolean z, int i) {
        if (pjdVar.c(es0Var, "DiskCacheProducer")) {
            return z ? h98.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : h98.a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    public static void e(dba dbaVar, int i, lq0 lq0Var) throws Throwable {
        g95 g95VarY = au3.Y(dbaVar.y());
        p76 p76Var = null;
        try {
            p76 p76Var2 = new p76(g95VarY);
            try {
                p76Var2.W();
                lq0Var.g(i, p76Var2);
                p76Var2.close();
                g95VarY.close();
            } catch (Throwable th) {
                th = th;
                p76Var = p76Var2;
                p76.g(p76Var);
                au3.E(g95VarY);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        Task taskForError;
        int i = this.a;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                vm5 vm5Var = (vm5) obj2;
                v78 v78Var = es0Var.a;
                u78 u78Var = es0Var.e;
                pjd pjdVar = es0Var.c;
                if (v78Var.e(16)) {
                    pjdVar.a(es0Var, "DiskCacheProducer");
                    j85 j85Var = (j85) obj;
                    j85Var.getClass();
                    l6g l6gVarO = j85Var.o(v78Var.b);
                    cn5 cn5Var = (cn5) ((oah) obj3).get();
                    w41 w41VarM = qyj.m(v78Var, cn5Var.c(), cn5Var.b(), cn5Var.a());
                    if (w41VarM != null) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        pgg pggVar = w41VarM.g;
                        qe7.v();
                        p76 p76VarK = pggVar.k(l6gVarO);
                        if (p76VarK != null) {
                            pj6.d(w41.class, l6gVarO.a, "Found image for %s in staging area");
                            w41VarM.f.getClass();
                            taskForError = Task.forResult(p76VarK);
                        } else {
                            try {
                                taskForError = Task.call(new v41(atomicBoolean, w41VarM, l6gVarO, 0), w41VarM.d);
                            } catch (Exception e) {
                                pj6.k(e, "Failed to schedule disk-cache read for %s", l6gVarO.a);
                                taskForError = Task.forError(e);
                            }
                        }
                        taskForError.continueWith(new um5(this, pjdVar, es0Var, lq0Var));
                        es0Var.a(new o55(1, atomicBoolean));
                        break;
                    } else {
                        pjdVar.b(es0Var, "DiskCacheProducer", new DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(v78Var.a.ordinal()).toString()), null);
                        if (u78Var.a < 2) {
                            vm5Var.b(lq0Var, es0Var);
                        } else {
                            es0Var.h("disk", "nil-result_read");
                            lq0Var.g(1, null);
                        }
                    }
                } else if (u78Var.a < 2) {
                    vm5Var.b(lq0Var, es0Var);
                } else {
                    es0Var.h("disk", "nil-result_read");
                    lq0Var.g(1, null);
                }
                break;
            case 1:
                if (es0Var.e.a < 2) {
                    ((mjd) obj2).b(es0Var.a.e(32) ? new zm5(lq0Var, es0Var, (oah) obj3, (j85) obj) : lq0Var, es0Var);
                } else {
                    es0Var.h("disk", "nil-result_write");
                    lq0Var.g(1, null);
                }
                break;
            case 2:
                es0Var.c.a(es0Var, "NetworkFetchProducer");
                sb8 sb8Var = (sb8) obj2;
                ep6 ep6VarM = sb8Var.m(lq0Var, es0Var);
                sb8Var.v(ep6VarM, new qg7(this, ep6VarM, z, 15));
                break;
            case 3:
                taa taaVar = (taa) obj3;
                vm5 vm5Var2 = (vm5) obj2;
                pjd pjdVar2 = es0Var.c;
                v78 v78Var2 = es0Var.a;
                Object obj4 = es0Var.d;
                qcd qcdVar = v78Var2.o;
                if (qcdVar == null || qcdVar.b() == null) {
                    vm5Var2.b(lq0Var, es0Var);
                } else {
                    pjdVar2.a(es0Var, "PostprocessedBitmapMemoryCacheProducer");
                    ay0 ay0VarP = ((j85) obj).p(v78Var2, obj4);
                    au3 au3Var = v78Var2.e(1) ? taaVar.get(ay0VarP) : null;
                    if (au3Var == null) {
                        cy0 cy0Var = new cy0(lq0Var, ay0VarP, taaVar, v78Var2.e(2), 2);
                        pjdVar2.d(es0Var, "PostprocessedBitmapMemoryCacheProducer", pjdVar2.c(es0Var, "PostprocessedBitmapMemoryCacheProducer") ? h98.a("cached_value_found", "false") : null);
                        vm5Var2.b(cy0Var, es0Var);
                    } else {
                        pjdVar2.d(es0Var, "PostprocessedBitmapMemoryCacheProducer", pjdVar2.c(es0Var, "PostprocessedBitmapMemoryCacheProducer") ? h98.a("cached_value_found", "true") : null);
                        pjdVar2.e(es0Var, "PostprocessedBitmapMemoryCacheProducer", true);
                        es0Var.h("memory_bitmap", "postprocessed");
                        lq0Var.i(1.0f);
                        lq0Var.g(1, au3Var);
                        au3Var.close();
                    }
                }
                break;
            default:
                pjd pjdVar3 = es0Var.c;
                qcd qcdVar2 = es0Var.a.o;
                qcdVar2.getClass();
                ((mjd) obj3).b(new fb(new rcd(this, lq0Var, pjdVar3, qcdVar2, es0Var), 1), es0Var);
                break;
        }
    }

    public void d(dba dbaVar, ep6 ep6Var) throws Throwable {
        int i = dbaVar.c;
        es0 es0Var = ep6Var.b;
        Map mapE = !es0Var.c.c(es0Var, "NetworkFetchProducer") ? null : ((sb8) this.d).E(ep6Var, i);
        pjd pjdVar = es0Var.c;
        pjdVar.d(es0Var, "NetworkFetchProducer", mapE);
        pjdVar.e(es0Var, "NetworkFetchProducer", true);
        es0Var.h("network", "default");
        e(dbaVar, 1, ep6Var.a);
    }

    public /* synthetic */ vm5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
