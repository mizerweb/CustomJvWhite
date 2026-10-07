package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class bui extends cli {
    public static final zti I = new zti();
    public int A;
    public xde B;
    public Rect C;
    public int D;
    public boolean E;
    public aui F;
    public imf G;
    public final xg2 H;
    public wf5 u;
    public zbh v;
    public xi0 w;
    public hmf x;
    public u72 y;
    public ich z;

    public bui(cui cuiVar) {
        super(cuiVar);
        this.w = xi0.d;
        this.x = new hmf();
        this.y = null;
        this.A = 3;
        this.E = false;
        this.H = new xg2(3, this);
    }

    public static void J(HashSet hashSet, int i, int i2, Size size, awi awiVar) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) awiVar.i(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            tvj.i("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) awiVar.b(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            tvj.i("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    public static int K(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static awi T(mj0 mj0Var, fx5 fx5Var, o5a o5aVar) {
        awi awiVarA = bwi.a(qui.c(mj0Var, fx5Var, o5aVar).a);
        if (awiVarA != null) {
            return o3m.b(awiVarA, mj0Var != null ? mj0Var.f.a() : null);
        }
        tvj.g("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    @Override // defpackage.cli
    public final yi0 A(t94 t94Var) {
        this.x.a(t94Var);
        Object[] objArr = {this.x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        yi0 yi0Var = this.j;
        Objects.requireNonNull(yi0Var);
        tw5 tw5VarB = yi0Var.b();
        tw5VarB.f = t94Var;
        return tw5VarB.j();
    }

    @Override // defpackage.cli
    public final yi0 B(yi0 yi0Var, yi0 yi0Var2) {
        Size size = yi0Var.a;
        tvj.a("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yi0Var + ", secondaryStreamSpec " + yi0Var2);
        List list = (List) ((cui) this.i).b(v68.E0, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(size)) {
            tvj.g("VideoCapture", "suggested resolution " + size + " is not in custom ordered resolutions " + arrayList);
        }
        return yi0Var;
    }

    @Override // defpackage.cli
    public final void F(Rect rect) {
        this.l = rect;
        U();
    }

    public final void L(hmf hmfVar, xi0 xi0Var, yi0 yi0Var) {
        wf5 wf5Var;
        boolean z = xi0Var.a == -1;
        boolean z2 = xi0Var.b == 1;
        if (z && z2) {
            ore.k("Unexpected stream state, stream is error but active");
            return;
        }
        hmfVar.a.clear();
        ((HashSet) hmfVar.b.c).clear();
        fx5 fx5Var = yi0Var.c;
        if (!z && (wf5Var = this.u) != null) {
            if (z2) {
                hmfVar.b(wf5Var, fx5Var, -1);
            } else {
                g85 g85VarA = ui0.a(wf5Var);
                if (fx5Var == null) {
                    ore.n("Null dynamicRange");
                    return;
                } else {
                    g85VarA.e = fx5Var;
                    hmfVar.a.add(g85VarA.x());
                }
            }
        }
        u72 u72Var = this.y;
        if (u72Var != null && u72Var.cancel(false)) {
            tvj.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        u72 u72VarM = f55.m(new vuf(this, hmfVar));
        this.y = u72VarM;
        o9b.a(u72VarM, new ch(this, u72VarM, z2), zjl.d());
    }

    public final void M() {
        wxl.a();
        imf imfVar = this.G;
        if (imfVar != null) {
            imfVar.b();
            this.G = null;
        }
        wf5 wf5Var = this.u;
        if (wf5Var != null) {
            wf5Var.a();
            this.u = null;
        }
        xde xdeVar = this.B;
        if (xdeVar != null) {
            xdeVar.P();
            this.B = null;
        }
        zbh zbhVar = this.v;
        if (zbhVar != null) {
            zbhVar.c();
            this.v = null;
        }
        this.C = null;
        this.z = null;
        this.w = xi0.d;
        this.D = 0;
        this.E = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hmf N(cui cuiVar, yi0 yi0Var) {
        Object obj;
        pf2 pf2Var;
        int i;
        fx5 fx5Var;
        Rect rectI;
        Size size;
        xde xdeVar;
        cui cuiVar2;
        bui buiVar = this;
        wxl.a();
        pf2 pf2VarE = buiVar.e();
        pf2VarE.getClass();
        Size size2 = yi0Var.a;
        f4g f4gVar = new f4g(18, buiVar);
        Range range = yi0Var.e;
        if (Objects.equals(range, yi0.h)) {
            range = yi0Var.d == 1 ? zti.c : zti.b;
        }
        Range range2 = range;
        e89 e89VarF = buiVar.Q().c().f();
        if (e89VarF.isDone()) {
            try {
                obj = e89VarF.get();
            } catch (InterruptedException | ExecutionException e) {
                qr7.w(e);
                return null;
            }
        } else {
            obj = null;
        }
        o5a o5aVar = (o5a) obj;
        Objects.requireNonNull(o5aVar);
        int i2 = yi0Var.d;
        s86 s86VarG = buiVar.Q().g(i2, pf2VarE.a());
        fx5 fx5Var2 = yi0Var.c;
        al2 al2VarA = s86VarG.a(fx5Var2);
        mj0 mj0VarA = al2VarA != null ? al2VarA.a(size2) : null;
        Objects.requireNonNull((bwi) cuiVar.i(cui.c));
        awi awiVarT = T(mj0VarA, fx5Var2, o5aVar);
        buiVar.D = buiVar.O(pf2VarE);
        Rect rect = buiVar.l;
        if (rect == null) {
            rect = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        if (awiVarT == null || awiVarT.f(rect.width(), rect.height())) {
            pf2Var = pf2VarE;
            i = i2;
            fx5Var = fx5Var2;
        } else {
            pf2Var = pf2VarE;
            tvj.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", y1i.g(rect), Integer.valueOf(awiVarT.g()), Integer.valueOf(awiVarT.d()), awiVarT.j(), awiVarT.k()));
            awi hehVar = (!(awiVarT.j().contains(Integer.valueOf(rect.width())) && awiVarT.k().contains(Integer.valueOf(rect.height()))) && awiVarT.a() && awiVarT.k().contains(Integer.valueOf(rect.width())) && awiVarT.j().contains(Integer.valueOf(rect.height()))) ? new heh(awiVarT) : awiVarT;
            int iG = hehVar.g();
            int iD = hehVar.d();
            Range rangeJ = hehVar.j();
            Range rangeK = hehVar.k();
            i = i2;
            int iK = K(true, rect.width(), iG, rangeJ);
            fx5Var = fx5Var2;
            int iK2 = K(false, rect.width(), iG, rangeJ);
            int iK3 = K(true, rect.height(), iD, rangeK);
            int iK4 = K(false, rect.height(), iD, rangeK);
            HashSet hashSet = new HashSet();
            J(hashSet, iK, iK3, size2, hehVar);
            J(hashSet, iK, iK4, size2, hehVar);
            J(hashSet, iK2, iK3, size2, hehVar);
            J(hashSet, iK2, iK4, size2, hehVar);
            if (hashSet.isEmpty()) {
                tvj.g("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                tvj.a("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new z70(10, rect));
                tvj.a("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    tvj.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    qyj.l(null, width % 2 == 0 && height % 2 == 0 && width <= size2.getWidth() && height <= size2.getHeight());
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        int iMax = Math.max(0, rect.centerX() - (width / 2));
                        rect2.left = iMax;
                        int i3 = iMax + width;
                        rect2.right = i3;
                        if (i3 > size2.getWidth()) {
                            int width2 = size2.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != rect.height()) {
                        int iMax2 = Math.max(0, rect.centerY() - (height / 2));
                        rect2.top = iMax2;
                        int i4 = iMax2 + height;
                        rect2.bottom = i4;
                        if (i4 > size2.getHeight()) {
                            int height2 = size2.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    }
                    tvj.a("VideoCapture", "Adjust cropRect from " + y1i.g(rect) + " to " + y1i.g(rect2));
                    rect = rect2;
                }
            }
        }
        int i5 = buiVar.D;
        dj0 dj0Var = buiVar.w.c;
        if (dj0Var != null) {
            dj0Var.getClass();
            rectI = y1i.i(y1i.h(i5, y1i.f(dj0Var.a)));
        } else {
            rectI = rect;
        }
        buiVar.C = rectI;
        if (buiVar.w.c == null || rectI.equals(rect)) {
            size = size2;
        } else {
            float fHeight = rectI.height() / rect.height();
            size = new Size((int) Math.ceil(size2.getWidth() * fHeight), (int) Math.ceil(size2.getHeight() * fHeight));
        }
        if (buiVar.w.c != null) {
            buiVar.E = true;
        }
        Rect rect3 = buiVar.C;
        int i6 = buiVar.D;
        pf2 pf2Var2 = pf2Var;
        int i7 = i;
        fx5 fx5Var3 = fx5Var;
        boolean zR = buiVar.R(pf2Var2, cuiVar, i7, rect3, size2, fx5Var3);
        if (((SizeCannotEncodeVideoQuirk) sk5.a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zR) {
                i6 = 0;
            }
            Size sizeH = y1i.h(i6, y1i.f(rect3));
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeH)) {
                int iD2 = awiVarT != 0 ? awiVarT.d() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == sizeH.getHeight()) {
                    rect4.left += iD2;
                    rect4.right -= iD2;
                } else {
                    rect4.top += iD2;
                    rect4.bottom -= iD2;
                }
                rect3 = rect4;
            }
        } else {
            pf2Var2 = pf2Var2;
        }
        buiVar.C = rect3;
        pf2 pf2Var3 = pf2Var2;
        if (buiVar.R(pf2Var3, cuiVar, i7, rect3, size2, fx5Var3)) {
            tvj.a("VideoCapture", "Surface processing is enabled.");
            pf2 pf2VarE2 = buiVar.e();
            Objects.requireNonNull(pf2VarE2);
            xxi xxiVar = buiVar.p;
            xdeVar = new xde(pf2VarE2, xxiVar != null ? new euc(xxiVar) : new fe5(fx5Var3), "VideoCapture");
        } else {
            xdeVar = null;
        }
        buiVar.B = xdeVar;
        boolean z = (pf2Var3.p() && buiVar.B == null) ? false : true;
        msh mshVarZ = (buiVar.B == null && pf2Var3.p()) ? msh.a : pf2Var3.j().z();
        tvj.a("VideoCapture", "camera timebase = " + pf2Var3.j().z() + ", processing timebase = " + mshVarZ);
        tw5 tw5VarB = yi0Var.b();
        tw5VarB.a = size;
        if (range2 == null) {
            ore.n("Null expectedFrameRateRange");
            return null;
        }
        tw5VarB.e = range2;
        yi0 yi0VarJ = tw5VarB.j();
        qyj.l(null, buiVar.v == null);
        zbh zbhVar = new zbh(2, 34, yi0VarJ, buiVar.m, pf2Var3.p(), buiVar.C, buiVar.D, buiVar.c(), pf2Var3.p() && buiVar.q(pf2Var3));
        buiVar.v = zbhVar;
        zbhVar.a(f4gVar);
        xde xdeVar2 = buiVar.B;
        zbh zbhVar2 = buiVar.v;
        if (xdeVar2 != null) {
            int i8 = zbhVar2.f;
            int i9 = zbhVar2.a;
            Rect rect5 = zbhVar2.d;
            ei0 ei0Var = new ei0(UUID.randomUUID(), i8, i9, rect5, y1i.h(zbhVar2.i, y1i.f(rect5)), zbhVar2.i, zbhVar2.e, false);
            zbh zbhVar3 = (zbh) buiVar.B.T(new bj0(buiVar.v, Collections.singletonList(ei0Var))).get(ei0Var);
            Objects.requireNonNull(zbhVar3);
            i5a i5aVar = new i5a(this, zbhVar3, pf2Var3, cuiVar, mshVarZ, z, 2);
            buiVar = this;
            cuiVar2 = cuiVar;
            zbhVar3.a(i5aVar);
            buiVar.z = zbhVar3.d(pf2Var3, true);
            zbh zbhVar4 = buiVar.v;
            zbhVar4.getClass();
            wxl.a();
            zbhVar4.b();
            qyj.l("Consumer can only be linked once.", !zbhVar4.j);
            zbhVar4.j = true;
            ybh ybhVar = zbhVar4.l;
            buiVar.u = ybhVar;
            o9b.g(ybhVar.e).b(new ewg(buiVar, 15, ybhVar), zjl.d());
        } else {
            cuiVar2 = cuiVar;
            ich ichVarD = zbhVar2.d(pf2Var3, true);
            buiVar.z = ichVarD;
            buiVar.u = ichVarD.m;
        }
        u2j u2jVar = (u2j) cuiVar2.i(cui.b);
        Objects.requireNonNull(u2jVar);
        u2jVar.f(buiVar.z, mshVarZ, z);
        buiVar.U();
        buiVar.u.j = MediaCodec.class;
        hmf hmfVarD = hmf.d(cuiVar2, yi0Var.a);
        hmfVarD.h = i7;
        buiVar.a(hmfVarD, yi0Var);
        int iR = cuiVar2.r();
        if (iR != 0) {
            j28 j28Var = hmfVarD.b;
            j28Var.getClass();
            if (iR != 0) {
                ((w8b) j28Var.d).m(cmi.i1, Integer.valueOf(iR));
            }
        }
        imf imfVar = buiVar.G;
        if (imfVar != null) {
            imfVar.b();
        }
        imf imfVar2 = new imf(new v58(3, buiVar));
        buiVar.G = imfVar2;
        hmfVarD.f = imfVar2;
        t94 t94Var = yi0Var.f;
        if (t94Var != null) {
            hmfVarD.b.o(t94Var);
        }
        return hmfVarD;
    }

    public final int O(pf2 pf2Var) {
        boolean zQ = q(pf2Var);
        int iJ = j(pf2Var, zQ);
        dj0 dj0Var = this.w.c;
        if (dj0Var == null) {
            return iJ;
        }
        Objects.requireNonNull(dj0Var);
        int i = dj0Var.b;
        if (zQ != dj0Var.f) {
            i = -i;
        }
        return y1i.k(iJ - i);
    }

    public final m1e P() {
        HashSet<kr7> hashSet = this.h;
        if (hashSet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (kr7 kr7Var : hashSet) {
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        m1e m1eVar = m1e.c;
        return m1e.b(arrayList, mh0.c);
    }

    public final u2j Q() {
        u2j u2jVar = (u2j) ((cui) this.i).i(cui.b);
        Objects.requireNonNull(u2jVar);
        return u2jVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    public final boolean R(pf2 pf2Var, cui cuiVar, int i, Rect rect, Size size, fx5 fx5Var) {
        if (i == 1) {
            return false;
        }
        if (this.p == null) {
            if (pf2Var.p()) {
                Boolean bool = (Boolean) cuiVar.b(cui.d, Boolean.FALSE);
                Objects.requireNonNull(bool);
                if (!bool.booleanValue()) {
                    if (pf2Var.p() || (!SurfaceProcessingQuirk.a(sk5.a) && !SurfaceProcessingQuirk.a(pf2Var.j().p()))) {
                        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) sk5.a.b(HdrRepeatingRequestFailureQuirk.class);
                        if (!pf2Var.p() && hdrRepeatingRequestFailureQuirk != null) {
                            boolean z = fx5Var != fx5.d;
                            if (!"samsung".equalsIgnoreCase(Build.BRAND) || !"pa3q".equalsIgnoreCase(Build.DEVICE) || !z) {
                                if (size.getWidth() == rect.width()) {
                                    if (pf2Var.p()) {
                                    }
                                }
                            }
                        } else if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
                            return (!pf2Var.p() && q(pf2Var)) || this.w.c != null;
                        }
                    }
                }
            } else if (pf2Var.p()) {
                HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk2 = (HdrRepeatingRequestFailureQuirk) sk5.a.b(HdrRepeatingRequestFailureQuirk.class);
                if (!pf2Var.p()) {
                    if (size.getWidth() == rect.width()) {
                        if (pf2Var.p()) {
                        }
                    }
                } else if (size.getWidth() == rect.width()) {
                    if (pf2Var.p()) {
                    }
                }
            } else {
                HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk3 = (HdrRepeatingRequestFailureQuirk) sk5.a.b(HdrRepeatingRequestFailureQuirk.class);
                if (!pf2Var.p()) {
                    if (size.getWidth() == rect.width()) {
                        if (pf2Var.p()) {
                        }
                    }
                } else if (size.getWidth() == rect.width()) {
                    if (pf2Var.p()) {
                    }
                }
            }
        }
        return true;
    }

    public final void S() {
        if (e() == null) {
            return;
        }
        M();
        cui cuiVar = (cui) this.i;
        yi0 yi0Var = this.j;
        yi0Var.getClass();
        hmf hmfVarN = N(cuiVar, yi0Var);
        this.x = hmfVarN;
        L(hmfVarN, this.w, this.j);
        Object[] objArr = {this.x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        s();
    }

    public final void U() {
        pf2 pf2VarE = e();
        zbh zbhVar = this.v;
        if (pf2VarE == null || zbhVar == null) {
            return;
        }
        int iO = O(pf2VarE);
        this.D = iO;
        wxl.d(new q31(zbhVar, iO, c(), 6));
    }

    @Override // defpackage.cli
    public final cmi h(boolean z, fmi fmiVar) {
        I.getClass();
        cui cuiVar = zti.a;
        t94 t94VarA = fmiVar.a(cuiVar.L(), 1);
        if (z) {
            t94VarA = t94.I(t94VarA, cuiVar);
        }
        if (t94VarA == null) {
            return null;
        }
        return new cui(dhc.a(((r48) n(t94VarA)).b));
    }

    @Override // defpackage.cli
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // defpackage.cli
    public final bmi n(t94 t94Var) {
        return new r48(w8b.h(t94Var), 3);
    }

    @Override // defpackage.cli
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return "VideoCapture:".concat(i());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x016a  */
    @Override // defpackage.cli
    public final cmi w(nf2 nf2Var, bmi bmiVar) {
        Object obj;
        o5a o5aVar;
        s86 s86Var;
        Range range;
        int i;
        ArrayList<pi0> arrayList;
        List listQ;
        LinkedHashMap linkedHashMap;
        o5a o5aVar2;
        awi awiVarT;
        Map.Entry entry;
        Iterator it;
        e89 e89VarF = Q().c().f();
        if (e89VarF.isDone()) {
            try {
                obj = e89VarF.get();
            } catch (InterruptedException | ExecutionException e) {
                qr7.w(e);
                return null;
            }
        } else {
            obj = null;
        }
        o5a o5aVar3 = (o5a) obj;
        if (o5aVar3 == null) {
            ore.p("MediaSpec can't be null");
            return null;
        }
        n4j n4jVar = o5aVar3.a;
        m1e m1eVarP = P();
        if (m1eVarP == null) {
            m1eVarP = n4jVar.a;
        }
        cui cuiVar = (cui) bmiVar.q();
        if (cuiVar.f(v68.E0)) {
            qyj.h("Custom ordered resolutions and QualitySelector can't both be set", Q().e());
            qyj.h("Can't set both custom ordered resolutions and QualitySelector  through a groupable feature (e.g. GroupableFeatures.UHD_RECORDING)", P() == null);
        } else {
            fx5 fx5VarB = cuiVar.B();
            int iIntValue = ((Integer) cuiVar.b(cmi.a1, 0)).intValue();
            Range range2 = (Range) cuiVar.b(cmi.b1, yi0.h);
            Objects.requireNonNull(range2);
            uti utiVarA = Q().a(iIntValue, nf2Var);
            s86 s86VarG = Q().g(iIntValue, nf2Var);
            tvj.a("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + fx5VarB + ", sessionType = " + iIntValue + ", targetFrameRate = " + range2);
            List listB = utiVarA.b(fx5VarB);
            StringBuilder sb = new StringBuilder("supportedQualities = ");
            sb.append(listB);
            tvj.a("VideoCapture", sb.toString());
            if (listB.isEmpty() && iIntValue == 1) {
                ore.p("No supported quality on the device for high-speed capture.");
                return null;
            }
            if (listB.isEmpty()) {
                tvj.g("VideoCapture", "Can't find any supported quality on the device.");
            } else {
                m1eVarP.getClass();
                if (listB.isEmpty()) {
                    tvj.g("QualitySelector", "No supported quality on the device.");
                    arrayList = new ArrayList();
                    o5aVar = o5aVar3;
                    i = iIntValue;
                    range = range2;
                    s86Var = s86VarG;
                } else {
                    tvj.a("QualitySelector", "supportedQualities = " + listB);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = m1eVarP.a.iterator();
                    while (it2.hasNext()) {
                        pi0 pi0Var = (pi0) it2.next();
                        Iterator it3 = it2;
                        if (pi0Var == pi0.j) {
                            linkedHashSet.addAll(listB);
                            break;
                        }
                        if (pi0Var == pi0.i) {
                            ArrayList arrayList2 = new ArrayList(listB);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (listB.contains(pi0Var)) {
                            linkedHashSet.add(pi0Var);
                        } else {
                            tvj.g("QualitySelector", "quality is not supported and will be ignored: " + pi0Var);
                        }
                        it2 = it3;
                        o5aVar3 = o5aVar3;
                    }
                    o5aVar = o5aVar3;
                    mh0 mh0Var = m1eVarP.b;
                    if (listB.isEmpty() || linkedHashSet.containsAll(listB)) {
                        i = iIntValue;
                        range = range2;
                        s86Var = s86VarG;
                    } else {
                        tvj.a("QualitySelector", "Select quality by fallbackStrategy = " + mh0Var);
                        if (mh0Var == mh0.c) {
                            i = iIntValue;
                            range = range2;
                            s86Var = s86VarG;
                        } else {
                            qyj.l("Currently only support type RuleStrategy", mh0Var instanceof mh0);
                            ArrayList arrayList3 = new ArrayList(pi0.m);
                            pi0 pi0Var2 = mh0Var.a;
                            s86Var = s86VarG;
                            if (pi0Var2 == pi0.j) {
                                pi0Var2 = (pi0) arrayList3.get(0);
                            } else if (pi0Var2 == pi0.i) {
                                pi0Var2 = (pi0) qv1.f(1, arrayList3);
                            }
                            int iIndexOf = arrayList3.indexOf(pi0Var2);
                            qyj.l(null, iIndexOf != -1);
                            ArrayList arrayList4 = new ArrayList();
                            int i2 = iIndexOf - 1;
                            while (i2 >= 0) {
                                int i3 = i2;
                                pi0 pi0Var3 = (pi0) arrayList3.get(i2);
                                if (listB.contains(pi0Var3)) {
                                    arrayList4.add(pi0Var3);
                                }
                                i2 = i3 - 1;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            range = range2;
                            i = iIntValue;
                            for (int i4 = iIndexOf + 1; i4 < arrayList3.size(); i4++) {
                                pi0 pi0Var4 = (pi0) arrayList3.get(i4);
                                if (listB.contains(pi0Var4)) {
                                    arrayList5.add(pi0Var4);
                                }
                            }
                            tvj.a("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + pi0Var2 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                            int i5 = mh0Var.b;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    ahc.f(mh0Var, "Unhandled fallback strategy: ");
                                    return null;
                                }
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                tvj.a("VideoCapture", "Found selectedQualities " + arrayList + " by " + m1eVarP);
                if (arrayList.isEmpty()) {
                    ore.p("Unable to find selected quality");
                    return null;
                }
                Objects.requireNonNull((bwi) cuiVar.i(cui.c));
                int i6 = n4jVar.c;
                HashMap map = new HashMap();
                for (pi0 pi0Var5 : utiVarA.b(fx5VarB)) {
                    Size sizeA = utiVarA.a(pi0Var5, fx5VarB);
                    Objects.requireNonNull(sizeA);
                    map.put(pi0Var5, sizeA);
                }
                int i7 = i;
                if (i7 == 1) {
                    Range range3 = range;
                    listQ = yi0.h.equals(range3) ? nf2Var.G() : nf2Var.w(range3);
                } else {
                    listQ = nf2Var.q(this.i.getInputFormat());
                }
                l1e l1eVar = new l1e(listQ, map);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (pi0 pi0Var6 : arrayList) {
                    List list = (List) l1eVar.a.get(new oi0(pi0Var6, i6));
                    linkedHashMap2.put(pi0Var6, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    linkedHashMap = new LinkedHashMap();
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry2.getValue());
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Size size = (Size) it5.next();
                            if (!map.containsValue(size)) {
                                s86 s86Var2 = s86Var;
                                al2 al2VarA = s86Var2.a(fx5VarB);
                                mj0 mj0VarA = al2VarA != null ? al2VarA.a(size) : null;
                                if (mj0VarA == null) {
                                    s86Var = s86Var2;
                                } else {
                                    if (fx5VarB.b()) {
                                        o5aVar2 = o5aVar;
                                        awiVarT = T(mj0VarA, fx5VarB, o5aVar2);
                                    } else {
                                        o5aVar2 = o5aVar;
                                        int i8 = Integer.MIN_VALUE;
                                        awi awiVar = null;
                                        for (ih0 ih0Var : mj0VarA.d) {
                                            HashMap map2 = map;
                                            Iterator it6 = it4;
                                            if (nx5.a(ih0Var, fx5VarB)) {
                                                entry = entry2;
                                                int i9 = ih0Var.j;
                                                HashMap map3 = nx5.d;
                                                it = it5;
                                                qyj.i(map3.containsKey(Integer.valueOf(i9)));
                                                Integer num = (Integer) map3.get(Integer.valueOf(i9));
                                                Objects.requireNonNull(num);
                                                int iIntValue2 = num.intValue();
                                                int i10 = ih0Var.h;
                                                HashMap map4 = nx5.c;
                                                qyj.i(map4.containsKey(Integer.valueOf(i10)));
                                                Integer num2 = (Integer) map4.get(Integer.valueOf(i10));
                                                Objects.requireNonNull(num2);
                                                awi awiVarT2 = T(mj0VarA, new fx5(iIntValue2, num2.intValue()), o5aVar2);
                                                if (awiVarT2 != null) {
                                                    int iIntValue3 = ((Integer) awiVarT2.j().getUpper()).intValue();
                                                    int iIntValue4 = ((Integer) awiVarT2.k().getUpper()).intValue();
                                                    Size size2 = mag.a;
                                                    int i11 = iIntValue3 * iIntValue4;
                                                    if (i11 > i8) {
                                                        awiVar = awiVarT2;
                                                        i8 = i11;
                                                    }
                                                }
                                            } else {
                                                entry = entry2;
                                                it = it5;
                                            }
                                            it4 = it6;
                                            entry2 = entry;
                                            map = map2;
                                            it5 = it;
                                        }
                                        awiVarT = awiVar;
                                    }
                                    HashMap map5 = map;
                                    Iterator it7 = it4;
                                    Map.Entry entry3 = entry2;
                                    Iterator it8 = it5;
                                    if (awiVarT != null && !awiVarT.f(size.getWidth(), size.getHeight())) {
                                        it8.remove();
                                    }
                                    it4 = it7;
                                    entry2 = entry3;
                                    s86Var = s86Var2;
                                    map = map5;
                                    it5 = it8;
                                    o5aVar = o5aVar2;
                                }
                            }
                        }
                        HashMap map6 = map;
                        Iterator it9 = it4;
                        Map.Entry entry4 = entry2;
                        s86 s86Var3 = s86Var;
                        o5a o5aVar4 = o5aVar;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap.put((pi0) entry4.getKey(), arrayList6);
                        }
                        it4 = it9;
                        s86Var = s86Var3;
                        o5aVar = o5aVar4;
                        map = map6;
                    }
                }
                s86 s86Var4 = s86Var;
                if (i7 == 1) {
                    w8b w8bVarG = bmiVar.g();
                    bh0 bh0Var = cmi.d1;
                    HashMap map7 = new HashMap();
                    for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                        pi0 pi0Var7 = (pi0) entry5.getKey();
                        al2 al2VarA2 = s86Var4.a(fx5VarB);
                        mj0 mj0VarB = al2VarA2 != null ? al2VarA2.b(pi0Var7) : null;
                        Objects.requireNonNull(mj0VarB);
                        int i12 = mj0VarB.f.d;
                        Iterator it10 = ((List) entry5.getValue()).iterator();
                        while (it10.hasNext()) {
                            map7.put((Size) it10.next(), Integer.valueOf(i12));
                        }
                    }
                    w8bVarG.m(bh0Var, map7);
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it11 = linkedHashMap.values().iterator();
                while (it11.hasNext()) {
                    arrayList7.addAll((List) it11.next());
                }
                tvj.a("VideoCapture", "Set custom ordered resolutions = " + arrayList7);
                bmiVar.g().m(v68.E0, arrayList7);
            }
        }
        return bmiVar.q();
    }

    @Override // defpackage.cli
    public final void x(int i) {
        if (E(i)) {
            U();
        }
    }

    @Override // defpackage.cli
    public final void y() {
        this.a = true;
        tvj.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + g());
        yi0 yi0Var = this.j;
        if (yi0Var == null || this.z != null) {
            return;
        }
        gqb gqbVarD = Q().d();
        Object obj = xi0.d;
        e89 e89VarF = gqbVarD.f();
        if (e89VarF.isDone()) {
            try {
                obj = e89VarF.get();
            } catch (InterruptedException | ExecutionException e) {
                qr7.w(e);
                return;
            }
        }
        this.w = (xi0) obj;
        hmf hmfVarN = N((cui) this.i, yi0Var);
        this.x = hmfVarN;
        L(hmfVarN, this.w, yi0Var);
        Object[] objArr = {this.x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        H(Collections.unmodifiableList(arrayList));
        this.e = 1;
        t();
        Q().d().n(zjl.d(), this.H);
        aui auiVar = this.F;
        if (auiVar != null) {
            auiVar.b();
        }
        be2 be2VarF = f();
        aui auiVar2 = new aui();
        auiVar2.b = false;
        auiVar2.a = be2VarF;
        this.F = auiVar2;
        Q().i().n(zjl.d(), this.F);
        if (2 != this.A) {
            this.A = 2;
            Q().h(2);
        }
    }

    @Override // defpackage.cli
    public final void z() {
        tvj.a("VideoCapture", "VideoCapture#onStateDetached");
        qyj.l("VideoCapture can only be detached on the main thread.", wxl.c());
        if (this.F != null) {
            Q().i().j(this.F);
            this.F.b();
            this.F = null;
        }
        if (3 != this.A) {
            this.A = 3;
            Q().h(3);
        }
        Q().d().j(this.H);
        u72 u72Var = this.y;
        if (u72Var != null && u72Var.cancel(false)) {
            tvj.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        M();
    }
}
