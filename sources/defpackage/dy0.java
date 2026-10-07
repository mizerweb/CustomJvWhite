package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class dy0 implements mjd {
    public final /* synthetic */ int a;
    public final taa b;
    public final j85 c;
    public final mjd d;

    public /* synthetic */ dy0(taa taaVar, j85 j85Var, mjd mjdVar, int i) {
        this.a = i;
        this.b = taaVar;
        this.c = j85Var;
        this.d = mjdVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0147 A[Catch: all -> 0x01a5, TRY_ENTER, TryCatch #1 {all -> 0x01a5, blocks: (B:50:0x00ce, B:52:0x00e8, B:57:0x00f4, B:59:0x0111, B:61:0x011f, B:63:0x0125, B:64:0x013b, B:67:0x0147, B:69:0x014e, B:71:0x015c, B:73:0x0162, B:74:0x0179, B:76:0x0191, B:78:0x0197), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:69:0x014e A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:50:0x00ce, B:52:0x00e8, B:57:0x00f4, B:59:0x0111, B:61:0x011f, B:63:0x0125, B:64:0x013b, B:67:0x0147, B:69:0x014e, B:71:0x015c, B:73:0x0162, B:74:0x0179, B:76:0x0191, B:78:0x0197), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:71:0x015c A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:50:0x00ce, B:52:0x00e8, B:57:0x00f4, B:59:0x0111, B:61:0x011f, B:63:0x0125, B:64:0x013b, B:67:0x0147, B:69:0x014e, B:71:0x015c, B:73:0x0162, B:74:0x0179, B:76:0x0191, B:78:0x0197), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179 A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:50:0x00ce, B:52:0x00e8, B:57:0x00f4, B:59:0x0111, B:61:0x011f, B:63:0x0125, B:64:0x013b, B:67:0x0147, B:69:0x014e, B:71:0x015c, B:73:0x0162, B:74:0x0179, B:76:0x0191, B:78:0x0197), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0191 A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:50:0x00ce, B:52:0x00e8, B:57:0x00f4, B:59:0x0111, B:61:0x011f, B:63:0x0125, B:64:0x013b, B:67:0x0147, B:69:0x014e, B:71:0x015c, B:73:0x0162, B:74:0x0179, B:76:0x0191, B:78:0x0197), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0196  */
    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        Map mapA;
        Map mapA2;
        int i = this.a;
        mjd mjdVar = this.d;
        j85 j85Var = this.c;
        switch (i) {
            case 0:
                try {
                    qe7.v();
                    pjd pjdVar = es0Var.c;
                    v78 v78Var = es0Var.a;
                    pjdVar.a(es0Var, d());
                    ay0 ay0VarM = j85Var.m(v78Var, es0Var.d);
                    au3 au3Var = v78Var.e(1) ? this.b.get(ay0VarM) : null;
                    if (au3Var != null) {
                        es0Var.putExtras(((l68) au3Var.K()).getExtras());
                        boolean z = ((s98) ((xt3) au3Var.K()).getQualityInfo()).c;
                        if (z) {
                            pjdVar.d(es0Var, d(), pjdVar.c(es0Var, d()) ? h98.a("cached_value_found", "true") : null);
                            pjdVar.e(es0Var, d(), true);
                            es0Var.h("memory_bitmap", c());
                            lq0Var.i(1.0f);
                        }
                        lq0Var.g(z ? 1 : 0, au3Var);
                        au3Var.close();
                        if (!z) {
                            if (es0Var.e.a >= 4) {
                                String strD = d();
                                if (pjdVar.c(es0Var, d())) {
                                    mapA2 = h98.a("cached_value_found", "false");
                                } else {
                                    mapA2 = null;
                                }
                                pjdVar.d(es0Var, strD, mapA2);
                                pjdVar.e(es0Var, d(), false);
                                es0Var.h("memory_bitmap", c());
                                lq0Var.g(1, null);
                            } else {
                                lq0 lq0VarE = e(lq0Var, ay0VarM, v78Var.e(2));
                                String strD2 = d();
                                if (pjdVar.c(es0Var, d())) {
                                    mapA = h98.a("cached_value_found", "false");
                                } else {
                                    mapA = null;
                                }
                                pjdVar.d(es0Var, strD2, mapA);
                                qe7.v();
                                mjdVar.b(lq0VarE, es0Var);
                                qe7.v();
                            }
                        }
                    } else if (es0Var.e.a >= 4) {
                        String strD3 = d();
                        if (pjdVar.c(es0Var, d())) {
                            mapA2 = h98.a("cached_value_found", "false");
                        } else {
                            mapA2 = null;
                        }
                        pjdVar.d(es0Var, strD3, mapA2);
                        pjdVar.e(es0Var, d(), false);
                        es0Var.h("memory_bitmap", c());
                        lq0Var.g(1, null);
                    } else {
                        lq0 lq0VarE2 = e(lq0Var, ay0VarM, v78Var.e(2));
                        String strD4 = d();
                        if (pjdVar.c(es0Var, d())) {
                            mapA = h98.a("cached_value_found", "false");
                        } else {
                            mapA = null;
                        }
                        pjdVar.d(es0Var, strD4, mapA);
                        qe7.v();
                        mjdVar.b(lq0VarE2, es0Var);
                        qe7.v();
                    }
                    return;
                } finally {
                    qe7.v();
                }
            default:
                try {
                    qe7.v();
                    pjd pjdVar2 = es0Var.c;
                    v78 v78Var2 = es0Var.a;
                    pjdVar2.a(es0Var, "EncodedMemoryCacheProducer");
                    j85Var.getClass();
                    l6g l6gVarO = j85Var.o(v78Var2.b);
                    boolean zE = v78Var2.e(4);
                    taa taaVar = this.b;
                    au3 au3Var2 = zE ? taaVar.get(l6gVarO) : null;
                    try {
                        if (au3Var2 != null) {
                            p76 p76Var = new p76(au3Var2);
                            try {
                                pjdVar2.d(es0Var, "EncodedMemoryCacheProducer", pjdVar2.c(es0Var, "EncodedMemoryCacheProducer") ? h98.a("cached_value_found", "true") : null);
                                pjdVar2.e(es0Var, "EncodedMemoryCacheProducer", true);
                                es0Var.h("memory_encoded", "default");
                                lq0Var.i(1.0f);
                                lq0Var.g(1, p76Var);
                                p76Var.close();
                                au3Var2.close();
                            } catch (Throwable th) {
                                p76Var.close();
                                throw th;
                            }
                        } else {
                            if (es0Var.e.a >= 3) {
                                pjdVar2.d(es0Var, "EncodedMemoryCacheProducer", pjdVar2.c(es0Var, "EncodedMemoryCacheProducer") ? h98.a("cached_value_found", "false") : null);
                                pjdVar2.e(es0Var, "EncodedMemoryCacheProducer", false);
                                es0Var.h("memory_encoded", "nil-result");
                                lq0Var.g(1, null);
                            } else {
                                boolean zE2 = v78Var2.e(8);
                                es0Var.l.w.getClass();
                                cy0 cy0Var = new cy0(lq0Var, taaVar, l6gVarO, zE2, 1);
                                pjdVar2.d(es0Var, "EncodedMemoryCacheProducer", pjdVar2.c(es0Var, "EncodedMemoryCacheProducer") ? h98.a("cached_value_found", "false") : null);
                                mjdVar.b(cy0Var, es0Var);
                            }
                            au3.E(au3Var2);
                        }
                        qe7.v();
                        return;
                    } catch (Throwable th2) {
                        au3.E(au3Var2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    qe7.v();
                    throw th3;
                }
        }
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public lq0 e(lq0 lq0Var, ay0 ay0Var, boolean z) {
        return new cy0(this, lq0Var, ay0Var, z);
    }
}
