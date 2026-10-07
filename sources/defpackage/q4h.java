package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class q4h extends cli {
    public g85 A;
    public xde B;
    public zbh C;
    public zbh D;
    public zbh E;
    public zbh F;
    public zbh G;
    public zbh H;
    public hmf I;
    public hmf J;
    public imf K;
    public final r4h u;
    public final faj v;
    public final uvc w;
    public final uvc x;
    public xde y;
    public xde z;

    public q4h(pf2 pf2Var, pf2 pf2Var2, uvc uvcVar, uvc uvcVar2, HashSet hashSet, fmi fmiVar) {
        super(O(hashSet));
        this.u = O(hashSet);
        this.w = uvcVar;
        this.x = uvcVar2;
        this.v = new faj(pf2Var, pf2Var2, hashSet, fmiVar, new vuf(8, this));
        HashSet hashSet2 = ((cli) hashSet.iterator().next()).h;
        this.h = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static r4h O(HashSet hashSet) {
        w8b w8bVarE = w8b.e();
        new si2(w8bVarE);
        w8bVarE.m(n68.s0, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            if (cliVar.i.f(cmi.g1)) {
                arrayList.add(cliVar.i.L());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        w8bVarE.m(r4h.b, arrayList);
        w8bVarE.m(v68.y0, 2);
        w8bVarE.m(cmi.l1, t4h.PREVIEW_VIDEO_STILL);
        return new r4h(dhc.a(w8bVarE));
    }

    @Override // defpackage.cli
    public final yi0 A(t94 t94Var) {
        this.I.a(t94Var);
        Object[] objArr = {this.I.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        tw5 tw5VarB = this.j.b();
        tw5VarB.f = t94Var;
        return tw5VarB.j();
    }

    @Override // defpackage.cli
    public final yi0 B(yi0 yi0Var, yi0 yi0Var2) {
        tvj.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yi0Var + ", secondaryStreamSpec " + yi0Var2);
        H(L(g(), k() == null ? null : k().j().g(), this.i, yi0Var, yi0Var2));
        this.e = 1;
        t();
        return yi0Var;
    }

    @Override // defpackage.cli
    public final void C() {
        J();
        faj fajVar = this.v;
        for (cli cliVar : fajVar.a) {
            eaj eajVar = (eaj) fajVar.c.get(cliVar);
            Objects.requireNonNull(eajVar);
            cliVar.G(eajVar);
        }
    }

    public final void J() {
        imf imfVar = this.K;
        if (imfVar != null) {
            imfVar.b();
            this.K = null;
        }
        zbh zbhVar = this.C;
        if (zbhVar != null) {
            zbhVar.c();
            this.C = null;
        }
        zbh zbhVar2 = this.D;
        if (zbhVar2 != null) {
            zbhVar2.c();
            this.D = null;
        }
        zbh zbhVar3 = this.E;
        if (zbhVar3 != null) {
            zbhVar3.c();
            this.E = null;
        }
        zbh zbhVar4 = this.F;
        if (zbhVar4 != null) {
            zbhVar4.c();
            this.F = null;
        }
        zbh zbhVar5 = this.G;
        if (zbhVar5 != null) {
            zbhVar5.c();
            this.G = null;
        }
        zbh zbhVar6 = this.H;
        if (zbhVar6 != null) {
            zbhVar6.c();
            this.H = null;
        }
        xde xdeVar = this.z;
        if (xdeVar != null) {
            xdeVar.P();
            this.z = null;
        }
        g85 g85Var = this.A;
        if (g85Var != null) {
            ((dch) g85Var.a).release();
            wxl.d(new jj2(28, g85Var));
            this.A = null;
        }
        xde xdeVar2 = this.y;
        if (xdeVar2 != null) {
            xdeVar2.P();
            this.y = null;
        }
        xde xdeVar3 = this.B;
        if (xdeVar3 != null) {
            xdeVar3.P();
            this.B = null;
        }
    }

    public final xde K(pf2 pf2Var, yi0 yi0Var) {
        xxi xxiVar = this.p;
        if (xxiVar == null || xxiVar.b != 1) {
            return new xde(pf2Var, new fe5(yi0Var.c), "StreamSharing");
        }
        xde xdeVar = new xde(pf2Var, new euc(xxiVar), "StreamSharing");
        this.y = xdeVar;
        return xdeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List L(String str, String str2, cmi cmiVar, yi0 yi0Var, yi0 yi0Var2) {
        igd igdVar;
        wxl.a();
        if (yi0Var2 == null) {
            zbh zbhVarM = M(str, str2, cmiVar, yi0Var, null);
            pf2 pf2VarE = e();
            Objects.requireNonNull(pf2VarE);
            xde xdeVarK = K(pf2VarE, yi0Var);
            this.z = xdeVarK;
            Q(zbhVarM, xdeVarK, false);
            Object[] objArr = {this.I.c()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        zbh zbhVarM2 = M(str, str2, cmiVar, yi0Var, yi0Var2);
        Matrix matrix = this.m;
        pf2 pf2VarK = k();
        Objects.requireNonNull(pf2VarK);
        boolean zP = pf2VarK.p();
        Size size = yi0Var2.a;
        Rect rect = this.l;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        pf2 pf2VarK2 = k();
        Objects.requireNonNull(pf2VarK2);
        int iJ = j(pf2VarK2, false);
        pf2 pf2VarK3 = k();
        Objects.requireNonNull(pf2VarK3);
        zbh zbhVar = new zbh(3, 34, yi0Var2, matrix, zP, rect2, iJ, -1, q(pf2VarK3));
        this.D = zbhVar;
        Objects.requireNonNull(k());
        this.F = zbhVar;
        hmf hmfVarN = N(this.D, cmiVar, yi0Var2);
        this.J = hmfVarN;
        imf imfVar = this.K;
        if (imfVar != null) {
            imfVar.b();
        }
        imf imfVar2 = new imf(new p4h(this, str, str2, cmiVar, yi0Var, yi0Var2));
        this.K = imfVar2;
        hmfVarN.f = imfVar2;
        zbh zbhVar2 = this.F;
        pf2 pf2VarE2 = e();
        pf2 pf2VarK4 = k();
        zv5 zv5Var = new zv5(yi0Var.c, this.w, this.x);
        g85 g85Var = new g85();
        g85Var.b = pf2VarE2;
        g85Var.c = pf2VarK4;
        g85Var.a = zv5Var;
        this.A = g85Var;
        xxi xxiVar = this.p;
        Rect rect3 = this.l;
        faj fajVar = this.v;
        if (xxiVar != null) {
            boolean z = rect3 != null;
            int iM = m();
            Iterator it = fajVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    igdVar = null;
                    break;
                }
                cli cliVar = (cli) it.next();
                if (cliVar instanceof igd) {
                    igdVar = (igd) cliVar;
                    break;
                }
            }
            igd igdVar2 = igdVar;
            igdVar2.getClass();
            zbh zbhVar3 = (zbh) g85Var.U(new fh0(zbhVarM2, zbhVar2, Arrays.asList(new eh0(fajVar.s(igdVar2, fajVar.k, fajVar.f, zbhVarM2, iM, z, false), fajVar.s(igdVar2, fajVar.k, fajVar.g, zbhVar2, iM, z, false))))).values().iterator().next();
            this.G = zbhVar3;
            if (this.p.b == 1) {
                this.H = zbhVar3;
            } else {
                Objects.requireNonNull(zbhVar3);
                pf2 pf2VarE3 = e();
                Objects.requireNonNull(pf2VarE3);
                this.H = P(zbhVar3, pf2VarE3);
            }
            pf2 pf2VarE4 = e();
            Objects.requireNonNull(pf2VarE4);
            xde xdeVarK2 = K(pf2VarE4, yi0Var);
            this.B = xdeVarK2;
            Q(this.H, xdeVarK2, true);
        } else {
            boolean z2 = rect3 != null;
            int iM2 = m();
            fajVar.getClass();
            HashMap map = new HashMap();
            for (cli cliVar2 : fajVar.a) {
                ei0 ei0VarS = fajVar.s(cliVar2, fajVar.k, fajVar.f, zbhVarM2, iM2, z2, false);
                fne fneVar = fajVar.l;
                Objects.requireNonNull(fneVar);
                pf2 pf2Var = fajVar.g;
                Objects.requireNonNull(pf2Var);
                ei0 ei0VarS2 = fajVar.s(cliVar2, fneVar, pf2Var, zbhVar2, iM2, z2, false);
                int iD = fajVar.f.a().D(((v68) cliVar2.i).y(0));
                eaj eajVar = (eaj) fajVar.c.get(cliVar2);
                Objects.requireNonNull(eajVar);
                eajVar.c.c = iD;
                map.put(cliVar2, new eh0(ei0VarS, ei0VarS2));
            }
            boolean z3 = z2;
            aw5 aw5VarU = this.A.U(new fh0(zbhVarM2, zbhVar2, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((cli) entry.getKey(), (zbh) aw5VarU.get(entry.getValue()));
            }
            fajVar.y(map2, fajVar.v(zbhVarM2, z3));
        }
        Object[] objArr2 = {this.I.c(), this.J.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj2 = objArr2[i];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final zbh M(String str, String str2, cmi cmiVar, yi0 yi0Var, yi0 yi0Var2) {
        Matrix matrix = this.m;
        pf2 pf2VarE = e();
        Objects.requireNonNull(pf2VarE);
        boolean zP = pf2VarE.p();
        Size size = yi0Var.a;
        Rect rect = this.l;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        pf2 pf2VarE2 = e();
        Objects.requireNonNull(pf2VarE2);
        int iJ = j(pf2VarE2, false);
        pf2 pf2VarE3 = e();
        Objects.requireNonNull(pf2VarE3);
        zbh zbhVar = new zbh(3, 34, yi0Var, matrix, zP, rect2, iJ, -1, q(pf2VarE3));
        this.C = zbhVar;
        boolean z = str2 != null;
        pf2 pf2VarE4 = e();
        Objects.requireNonNull(pf2VarE4);
        xxi xxiVar = this.p;
        if (xxiVar != null && xxiVar.c != 2 && !z && xxiVar.b != 1) {
            zbhVar = P(zbhVar, pf2VarE4);
        }
        this.E = zbhVar;
        hmf hmfVarN = N(this.C, cmiVar, yi0Var);
        this.I = hmfVarN;
        imf imfVar = this.K;
        if (imfVar != null) {
            imfVar.b();
        }
        imf imfVar2 = new imf(new p4h(this, str, str2, cmiVar, yi0Var, yi0Var2));
        this.K = imfVar2;
        hmfVarN.f = imfVar2;
        return this.E;
    }

    public final hmf N(zbh zbhVar, cmi cmiVar, yi0 yi0Var) {
        hmf hmfVarD = hmf.d(cmiVar, yi0Var.a);
        j28 j28Var = hmfVarD.b;
        faj fajVar = this.v;
        Iterator it = fajVar.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((lmf) ((cli) it.next()).i.i(cmi.V0)).g.c;
            List list = lmf.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            j28Var.b = i;
        }
        Size size = yi0Var.a;
        Iterator it2 = fajVar.a.iterator();
        while (it2.hasNext()) {
            lmf lmfVarC = hmf.d(((cli) it2.next()).i, size).c();
            hl2 hl2Var = lmfVarC.g;
            j28Var.m(hl2Var.d);
            List<zc2> list2 = lmfVarC.e;
            ArrayList arrayList = hmfVarD.e;
            for (zc2 zc2Var : list2) {
                j28Var.n(zc2Var);
                if (!arrayList.contains(zc2Var)) {
                    arrayList.add(zc2Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : lmfVarC.d) {
                ArrayList arrayList2 = hmfVarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : lmfVarC.c) {
                ArrayList arrayList3 = hmfVarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            j28Var.o(hl2Var.b);
        }
        zbhVar.getClass();
        wxl.a();
        zbhVar.b();
        qyj.l("Consumer can only be linked once.", !zbhVar.j);
        zbhVar.j = true;
        hmfVarD.b(zbhVar.l, yi0Var.c, -1);
        j28Var.n(fajVar.h);
        t94 t94Var = yi0Var.f;
        if (t94Var != null) {
            j28Var.o(t94Var);
        }
        hmfVarD.h = yi0Var.d;
        a(hmfVarD, yi0Var);
        return hmfVarD;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final zbh P(zbh zbhVar, pf2 pf2Var) {
        int iJ;
        boolean z;
        xxi xxiVar = this.p;
        xxiVar.getClass();
        this.y = new xde(pf2Var, new euc(xxiVar), "StreamSharing");
        xxi xxiVar2 = this.p;
        xxiVar2.getClass();
        if (xxiVar2.c == 1) {
            pf2 pf2VarE = e();
            pf2VarE.getClass();
            iJ = j(pf2VarE, false);
        } else {
            iJ = 0;
        }
        xxi xxiVar3 = this.p;
        xxiVar3.getClass();
        Rect rectI = xxiVar3.c == 1 ? y1i.i(zbhVar.g.a) : zbhVar.d;
        int i = zbhVar.f;
        int i2 = zbhVar.a;
        Size sizeH = y1i.h(iJ, y1i.f(rectI));
        xxi xxiVar4 = this.p;
        xxiVar4.getClass();
        if (xxiVar4.c == 1) {
            pf2 pf2VarE2 = e();
            pf2VarE2.getClass();
            if (pf2VarE2.k() && pf2VarE2.p()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ei0 ei0Var = new ei0(UUID.randomUUID(), i, i2, rectI, sizeH, iJ, z, true);
        zbh zbhVar2 = (zbh) this.y.T(new bj0(zbhVar, Collections.singletonList(ei0Var))).get(ei0Var);
        Objects.requireNonNull(zbhVar2);
        return zbhVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(zbh zbhVar, xde xdeVar, boolean z) {
        boolean z2 = this.l != null;
        int iM = m();
        faj fajVar = this.v;
        fajVar.getClass();
        HashMap map = new HashMap();
        for (cli cliVar : fajVar.a) {
            zbh zbhVar2 = zbhVar;
            boolean z3 = z;
            ei0 ei0VarS = fajVar.s(cliVar, fajVar.k, fajVar.f, zbhVar2, iM, z2, z3);
            int iD = fajVar.f.a().D(((v68) cliVar.i).y(0));
            eaj eajVar = (eaj) fajVar.c.get(cliVar);
            Objects.requireNonNull(eajVar);
            eajVar.c.c = iD;
            map.put(cliVar, ei0VarS);
            zbhVar = zbhVar2;
            z = z3;
        }
        zbh zbhVar3 = zbhVar;
        aw5 aw5VarT = xdeVar.T(new bj0(zbhVar3, new ArrayList(map.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((cli) entry.getKey(), (zbh) aw5VarT.get(entry.getValue()));
        }
        fajVar.y(map2, fajVar.v(zbhVar3, z2));
    }

    @Override // defpackage.cli
    public final cmi h(boolean z, fmi fmiVar) {
        r4h r4hVar = this.u;
        t94 t94VarA = fmiVar.a(r4hVar.L(), 1);
        if (z) {
            t94VarA = t94.I(t94VarA, r4hVar.a);
        }
        if (t94VarA == null) {
            return null;
        }
        return ((si2) n(t94VarA)).q();
    }

    @Override // defpackage.cli
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.cli
    public final bmi n(t94 t94Var) {
        return new si2(w8b.h(t94Var));
    }

    @Override // defpackage.cli
    public final void u() {
        faj fajVar = this.v;
        for (cli cliVar : fajVar.a) {
            eaj eajVar = (eaj) fajVar.c.get(cliVar);
            Objects.requireNonNull(eajVar);
            cliVar.b(eajVar, null, null, cliVar.h(true, fajVar.e));
        }
    }

    @Override // defpackage.cli
    public final void v() {
        Iterator it = this.v.a.iterator();
        while (it.hasNext()) {
            ((cli) it.next()).v();
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.cli
    public final cmi w(nf2 nf2Var, bmi bmiVar) {
        cmi cmiVar;
        cmi cmiVar2;
        Object fx5Var;
        ?? r6;
        ?? r4;
        w8b w8bVarG = bmiVar.g();
        faj fajVar = this.v;
        HashSet hashSet = fajVar.i;
        fne fneVar = fajVar.k;
        List listQ = fneVar.f.q(34);
        HashSet hashSet2 = fneVar.d;
        Iterator it = hashSet2.iterator();
        while (true) {
            cmiVar = null;
            if (!it.hasNext()) {
                break;
            }
            cmi cmiVar3 = (cmi) it.next();
            if (!((Boolean) cmiVar3.b(cmi.f1, Boolean.FALSE)).booleanValue() && (cmiVar3 instanceof v68)) {
            }
        }
        List list = (List) w8bVarG.b(v68.C0, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    listQ = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    listQ = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = fneVar.c;
        ArrayList arrayList = new ArrayList();
        HashSet<Size> hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(fneVar.c((cmi) it3.next()));
        }
        for (Size size : hashSet3) {
            Rational rational2 = ix.a;
            if (!ix.a(size, rational, mag.c)) {
                arrayList.addAll(fneVar.g(fneVar.b, listQ, false));
                break;
            }
        }
        int size2 = arrayList.size();
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            loop9: while (true) {
                if (!it4.hasNext()) {
                    cmiVar2 = cmiVar;
                    size2 = 0;
                    break;
                }
                boolean z = false;
                boolean z2 = false;
                for (Size size3 : fneVar.c((cmi) it4.next())) {
                    cmiVar2 = cmiVar;
                    Rational rational3 = ix.a;
                    boolean zA = ix.a(size3, rational, mag.c);
                    if (zA) {
                        z = true;
                    }
                    if (z2 && zA) {
                        break loop9;
                    }
                    if (!zA) {
                        z2 = true;
                    }
                    cmiVar = cmiVar2;
                }
                cmiVar2 = cmiVar;
                if (!z) {
                    break;
                }
                cmiVar = cmiVar2;
            }
        } else {
            cmiVar2 = null;
        }
        arrayList.addAll(size2, fneVar.g(rational, listQ, false));
        arrayList.addAll(fneVar.f(listQ, false));
        if (arrayList.isEmpty()) {
            tvj.g("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(fneVar.f(listQ, true));
        }
        tvj.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        w8bVarG.m(v68.E0, arrayList);
        bh0 bh0Var = cmi.Z0;
        Iterator it5 = hashSet.iterator();
        int iMax = 0;
        while (it5.hasNext()) {
            iMax = Math.max(iMax, ((Integer) ((cmi) it5.next()).b(cmi.Z0, 0)).intValue());
        }
        w8bVarG.m(bh0Var, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((cmi) it6.next()).B());
        }
        if (arrayList2.isEmpty()) {
            fx5Var = cmiVar2;
            break;
        }
        fx5 fx5Var2 = (fx5) arrayList2.get(0);
        ?? ValueOf = Integer.valueOf(fx5Var2.a);
        int i = 1;
        ?? ValueOf2 = Integer.valueOf(fx5Var2.b);
        while (true) {
            if (i >= arrayList2.size()) {
                fx5Var = new fx5(ValueOf.intValue(), ValueOf2.intValue());
                break;
            }
            fx5 fx5Var3 = (fx5) arrayList2.get(i);
            Integer numValueOf = Integer.valueOf(fx5Var3.a);
            if (ValueOf.equals(0)) {
                r6 = ValueOf;
                r6 = numValueOf;
            } else if (!numValueOf.equals(0)) {
                if (!ValueOf.equals(2) || numValueOf.equals(1)) {
                    r6 = ValueOf;
                    r6 = ValueOf;
                    if (!numValueOf.equals(2) || ValueOf.equals(1)) {
                        r6 = ValueOf;
                        boolean zEquals = ValueOf.equals(numValueOf);
                        r6 = ValueOf;
                        if (!zEquals) {
                            r6 = cmiVar2;
                        }
                    }
                } else {
                    r6 = ValueOf;
                    r6 = numValueOf;
                }
            }
            r6 = ValueOf;
            r6 = ValueOf;
            Integer numValueOf2 = Integer.valueOf(fx5Var3.b);
            if (ValueOf2.equals(0)) {
                r4 = numValueOf2;
            } else if (!numValueOf2.equals(0) && !ValueOf2.equals(numValueOf2)) {
                r4 = ValueOf2;
                r4 = ValueOf2;
                r4 = cmiVar2;
            }
            if (r6 == 0 || r4 == 0) {
                fx5Var = cmiVar2;
                break;
            }
            i++;
            ValueOf2 = r4;
            ValueOf = r6;
        }
        if (fx5Var == null) {
            ore.p("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return cmiVar2;
        }
        w8bVarG.m(n68.u0, fx5Var);
        bh0 bh0Var2 = cmi.b1;
        Range rangeExtend = yi0.h;
        Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            Range range = (Range) ((cmi) it7.next()).b(cmi.b1, rangeExtend);
            Objects.requireNonNull(range);
            if (yi0.h.equals(rangeExtend)) {
                rangeExtend = range;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(range);
                } catch (IllegalArgumentException unused) {
                    tvj.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeExtend + " <<>> " + range);
                    rangeExtend = rangeExtend.extend(range);
                }
            }
        }
        w8bVarG.m(bh0Var2, rangeExtend);
        Iterator it8 = fajVar.a.iterator();
        while (it8.hasNext()) {
            cmi cmiVar4 = (cmi) fajVar.j.get((cli) it8.next());
            Objects.requireNonNull(cmiVar4);
            if (cmiVar4.r() != 0) {
                w8bVarG.m(cmi.i1, Integer.valueOf(cmiVar4.r()));
            }
            if (cmiVar4.u() != 0) {
                w8bVarG.m(cmi.h1, Integer.valueOf(cmiVar4.u()));
            }
        }
        return bmiVar.q();
    }

    @Override // defpackage.cli
    public final void y() {
        this.a = true;
        Iterator it = this.v.a.iterator();
        while (it.hasNext()) {
            ((cli) it.next()).y();
        }
    }

    @Override // defpackage.cli
    public final void z() {
        this.a = false;
        Iterator it = this.v.a.iterator();
        while (it.hasNext()) {
            ((cli) it.next()).z();
        }
    }
}
