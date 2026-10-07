package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lul implements rp0 {
    private final xcm a;

    public lul(xcm xcmVar) {
        this.a = xcmVar;
    }

    private static np0.d o(kcm kcmVar) {
        if (kcmVar == null) {
            return null;
        }
        return new np0.d(kcmVar.g(), kcmVar.e(), kcmVar.b(), kcmVar.c(), kcmVar.d(), kcmVar.f(), kcmVar.j(), kcmVar.h());
    }

    @Override // defpackage.rp0
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.rp0
    public final np0.e b() {
        lcm lcmVarD = this.a.d();
        if (lcmVarD != null) {
            return new np0.e(lcmVarD.h(), lcmVarD.d(), lcmVarD.e(), lcmVarD.f(), lcmVarD.g(), o(lcmVarD.c()), o(lcmVarD.b()));
        }
        return null;
    }

    @Override // defpackage.rp0
    public final String c() {
        return this.a.n();
    }

    @Override // defpackage.rp0
    public final np0.k d() {
        rcm rcmVarJ = this.a.j();
        if (rcmVarJ != null) {
            return new np0.k(rcmVarJ.c(), rcmVarJ.b());
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.g e() {
        ncm ncmVarF = this.a.f();
        if (ncmVarF != null) {
            return new np0.g(ncmVarF.g(), ncmVarF.j(), ncmVarF.s(), ncmVarF.n(), ncmVarF.k(), ncmVarF.d(), ncmVarF.b(), ncmVarF.c(), ncmVarF.e(), ncmVarF.p(), ncmVarF.l(), ncmVarF.h(), ncmVarF.f(), ncmVarF.m());
        }
        return null;
    }

    @Override // defpackage.rp0
    public final Rect f() {
        Point[] pointArrT = this.a.t();
        if (pointArrT == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrT) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // defpackage.rp0
    public final String g() {
        return this.a.p();
    }

    @Override // defpackage.rp0
    public final int getFormat() {
        return this.a.b();
    }

    @Override // defpackage.rp0
    public final np0.m getUrl() {
        tcm tcmVarL = this.a.l();
        if (tcmVarL != null) {
            return new np0.m(tcmVarL.b(), tcmVarL.c());
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.l h() {
        scm scmVarK = this.a.k();
        if (scmVarK != null) {
            return new np0.l(scmVarK.b(), scmVarK.c());
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.f i() {
        List arrayList;
        mcm mcmVarE = this.a.e();
        if (mcmVarE == null) {
            return null;
        }
        qcm qcmVarB = mcmVarE.b();
        np0.j jVar = qcmVarB == null ? null : new np0.j(qcmVarB.c(), qcmVarB.g(), qcmVarB.f(), qcmVarB.b(), qcmVarB.e(), qcmVarB.d(), qcmVarB.h());
        String strC = mcmVarE.c();
        String strD = mcmVarE.d();
        rcm[] rcmVarArrG = mcmVarE.g();
        ArrayList arrayList2 = new ArrayList();
        if (rcmVarArrG != null) {
            for (rcm rcmVar : rcmVarArrG) {
                if (rcmVar != null) {
                    arrayList2.add(new np0.k(rcmVar.c(), rcmVar.b()));
                }
            }
        }
        ocm[] ocmVarArrF = mcmVarE.f();
        ArrayList arrayList3 = new ArrayList();
        if (ocmVarArrF != null) {
            for (ocm ocmVar : ocmVarArrF) {
                if (ocmVar != null) {
                    arrayList3.add(new np0.h(ocmVar.b(), ocmVar.c(), ocmVar.e(), ocmVar.d()));
                }
            }
        }
        if (mcmVarE.h() != null) {
            String[] strArrH = mcmVarE.h();
            yab.s(strArrH);
            arrayList = Arrays.asList(strArrH);
        } else {
            arrayList = new ArrayList();
        }
        jcm[] jcmVarArrE = mcmVarE.e();
        ArrayList arrayList4 = new ArrayList();
        if (jcmVarArrE != null) {
            for (jcm jcmVar : jcmVarArrE) {
                if (jcmVar != null) {
                    arrayList4.add(new np0.a(jcmVar.b(), jcmVar.c()));
                }
            }
        }
        return new np0.f(jVar, strC, strD, arrayList2, arrayList3, arrayList, arrayList4);
    }

    @Override // defpackage.rp0
    public final byte[] j() {
        return this.a.s();
    }

    @Override // defpackage.rp0
    public final Point[] k() {
        return this.a.t();
    }

    @Override // defpackage.rp0
    public final np0.h l() {
        ocm ocmVarG = this.a.g();
        if (ocmVarG == null) {
            return null;
        }
        return new np0.h(ocmVarG.b(), ocmVarG.c(), ocmVarG.e(), ocmVarG.d());
    }

    @Override // defpackage.rp0
    public final np0.i m() {
        pcm pcmVarH = this.a.h();
        if (pcmVarH != null) {
            return new np0.i(pcmVarH.b(), pcmVarH.c());
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.n n() {
        wcm wcmVarM = this.a.m();
        if (wcmVarM != null) {
            return new np0.n(wcmVarM.d(), wcmVarM.c(), wcmVarM.b());
        }
        return null;
    }
}
