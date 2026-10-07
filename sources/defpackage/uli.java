package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class uli implements kli {
    public static final i64 l = qyj.a(new toe(4, null));
    public static final i64 m;
    public final Provider a;
    public final Provider b;
    public final hmi c;
    public final Provider d;
    public final omi e;
    public final ui2 f;
    public volatile boolean g;
    public final ifh h;
    public final ifh i;
    public final ifh j;
    public final LinkedHashMap k;

    static {
        i64 i64Var = new i64();
        i64Var.b(null);
        m = i64Var;
    }

    public uli(Provider provider, Provider provider2, hmi hmiVar, Provider provider3, omi omiVar, ui2 ui2Var) {
        this.a = provider;
        this.b = provider2;
        this.c = hmiVar;
        this.d = provider3;
        this.e = omiVar;
        this.f = ui2Var;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i = 0;
        this.h = new ifh(new af7(this) { // from class: lli
            public final /* synthetic */ uli b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                uli uliVar = this.b;
                switch (i2) {
                    case 0:
                        return (pl2) uliVar.a.get();
                    case 1:
                        return (nmi) uliVar.d.get();
                    default:
                        return (zli) uliVar.b.get();
                }
            }
        });
        final int i2 = 1;
        this.i = new ifh(new af7(this) { // from class: lli
            public final /* synthetic */ uli b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                uli uliVar = this.b;
                switch (i3) {
                    case 0:
                        return (pl2) uliVar.a.get();
                    case 1:
                        return (nmi) uliVar.d.get();
                    default:
                        return (zli) uliVar.b.get();
                }
            }
        });
        final int i3 = 2;
        this.j = new ifh(new af7(this) { // from class: lli
            public final /* synthetic */ uli b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                uli uliVar = this.b;
                switch (i4) {
                    case 0:
                        return (pl2) uliVar.a.get();
                    case 1:
                        return (nmi) uliVar.d.get();
                    default:
                        return (zli) uliVar.b.get();
                }
            }
        });
        this.k = new LinkedHashMap();
    }

    public static final Object m(uli uliVar, jli jliVar, Map map, s94 s94Var, mdh mdhVar) {
        LinkedHashMap linkedHashMap = uliVar.k;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + jliVar + "] values = " + map + ", optionPriority = " + s94Var);
        }
        Object mliVar = linkedHashMap.get(jliVar);
        if (mliVar == null) {
            mliVar = new mli((ft0) null, (LinkedHashMap) null, (pme) null, 15);
            linkedHashMap.put(jliVar, mliVar);
        }
        mli mliVar2 = (mli) mliVar;
        ft0 ft0Var = new ft0();
        ft0Var.u((w8b) mliVar2.a.a);
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            ((w8b) ft0Var.a).l(shl.a(key), s94Var, entry.getValue());
        }
        linkedHashMap.put(jliVar, new mli(ft0Var, new LinkedHashMap(mliVar2.b), ww3.W1(mliVar2.c), mliVar2.d));
        return uliVar.q(o(linkedHashMap), null, mdhVar);
    }

    public static ArrayList n(int i, String str) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            i64 i64Var = new i64();
            i64Var.j0(new ImageCaptureException(2, str, null));
            arrayList.add(i64Var);
        }
        return arrayList;
    }

    public static mli o(LinkedHashMap linkedHashMap) {
        mli mliVar = new mli((ft0) null, (LinkedHashMap) null, new pme(1), 7);
        y1 y1Var = new y1(0, jli.e);
        while (y1Var.hasNext()) {
            mli mliVar2 = (mli) linkedHashMap.get((jli) y1Var.next());
            if (mliVar2 != null) {
                mliVar.a.u((w8b) mliVar2.a.a);
                mliVar.b.putAll(mliVar2.b);
                mliVar.c.addAll(mliVar2.c);
                pme pmeVar = mliVar2.d;
                if (pmeVar != null) {
                    mliVar.d = new pme(pmeVar.a);
                }
            }
        }
        return mliVar;
    }

    @Override // defpackage.kli
    public final xf5 a(List list, List list2, List list3, jd9 jd9Var, oe oeVar, long j) {
        i64 i64VarP = !this.g ? p(new qli(this, list, list2, list3, jd9Var, oeVar, j, null)) : null;
        return i64VarP == null ? l : i64VarP;
    }

    @Override // defpackage.kli
    public final Object b(mdh mdhVar) {
        nmi nmiVar = (nmi) this.i.getValue();
        nmiVar.getClass();
        return nmi.c(nmiVar, mdhVar);
    }

    @Override // defpackage.kli
    public final List c(ArrayList arrayList, int i, int i2, int i3) {
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        byte b = 0;
        if (this.g) {
            arrayList2 = arrayList;
        } else {
            int size = arrayList.size();
            arrayList2 = arrayList;
            nli nliVar = new nli(this, arrayList2, i, i2, i3, null);
            omi omiVar = this.e;
            int i4 = 1;
            int i5 = cqk.d(omiVar.d.get(), Boolean.TRUE) ? 4 : 1;
            ArrayList arrayList4 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList4.add(new i64());
            }
            yab.i0(omiVar.f, null, i5, new oli(nliVar, arrayList4, b == true ? 1 : 0, i4), 1);
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? n(arrayList2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList3;
    }

    @Override // defpackage.kli
    public final void close() {
        this.g = true;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        zli zliVar = (zli) this.j.getValue();
        synchronized (zliVar.c) {
            try {
                if (zliVar.g) {
                    zliVar.g = false;
                    i64 i64Var = zliVar.d;
                    if (i64Var != null) {
                        i64Var.j0(new CancellationException("UseCaseCameraState closed"));
                    }
                    zliVar.d = null;
                }
                while (!zliVar.f.isEmpty()) {
                    ((wli) zliVar.f.removeFirst()).b.j0(new CancellationException("UseCaseCameraState closed"));
                    zliVar.q.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kli
    public final xf5 d(LinkedHashSet linkedHashSet, boolean z) {
        i64 i64VarP = this.g ? null : p(new tli(linkedHashSet, z, this, null));
        return i64VarP == null ? m : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 e() {
        i64 i64VarP = this.g ? null : p(new wj1(this, null));
        return i64VarP == null ? l : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 f() {
        i64 i64VarP = this.g ? null : p(new m25(this, null, 7));
        return i64VarP == null ? l : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 g(List list, List list2, List list3) {
        i64 i64VarP = !this.g ? p(new rli(this, list, list2, list3, null)) : null;
        return i64VarP == null ? l : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 h(jc2 jc2Var, Map map) {
        i64 i64VarP = null;
        byte b = 0;
        if (!this.g) {
            i64VarP = p(new d24(this, jc2Var, map, b == true ? 1 : 0, 6));
        }
        return i64VarP == null ? m : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 i(int i) {
        i64 i64VarP = this.g ? null : p(new pli(this, i, null));
        return i64VarP == null ? l : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 j(List list) {
        i64 i64VarP = null;
        byte b = 0;
        if (!this.g) {
            i64VarP = p(new wj1(this, list, b == true ? 1 : 0, 10));
        }
        return i64VarP == null ? m : i64VarP;
    }

    @Override // defpackage.kli
    public final xf5 k(Map map, jli jliVar, s94 s94Var) {
        if (this.g) {
            return m;
        }
        if (cqk.d(this.e.d.get(), Boolean.TRUE)) {
            return yab.h(this.e.f, null, 4, new xra(29, (lq4) null, this, jliVar, map, s94Var), 1);
        }
        qr7.r(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    @Override // defpackage.kli
    public final xf5 l(Map map, s94 s94Var) {
        i64 i64VarP = null;
        byte b = 0;
        if (!this.g) {
            i64VarP = p(new d24(this, map, s94Var, b == true ? 1 : 0, 5));
        }
        return i64VarP == null ? m : i64VarP;
    }

    public final i64 p(cf7 cf7Var) {
        omi omiVar = this.e;
        int i = cqk.d(omiVar.d.get(), Boolean.TRUE) ? 4 : 1;
        i64 i64Var = new i64();
        yab.i0(omiVar.f, null, i, new oli(cf7Var, i64Var, null, 0), 1);
        return i64Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(mli mliVar, LinkedHashSet linkedHashSet, nq4 nq4Var) {
        sli sliVar;
        if (nq4Var instanceof sli) {
            sliVar = (sli) nq4Var;
            int i = sliVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sliVar.f = i - Integer.MIN_VALUE;
            } else {
                sliVar = new sli(this, nq4Var);
            }
        } else {
            sliVar = new sli(this, nq4Var);
        }
        sli sliVar2 = sliVar;
        Object objC = sliVar2.d;
        hu4 hu4Var = hu4.a;
        int i2 = sliVar2.f;
        xf5 xf5Var = null;
        if (i2 == 0) {
            ch3.d0(objC);
            if (!this.g) {
                if (this.f.a.b(ub2.a, null) != null) {
                    ore.m();
                    return null;
                }
                pl2 pl2Var = (pl2) this.h.getValue();
                int i3 = mliVar.d.a;
                if (i3 == -1) {
                    i3 = 1;
                }
                pl2Var.b(i3);
                zli zliVar = (zli) this.j.getValue();
                LinkedHashMap linkedHashMapC = shl.c(mliVar.a.r());
                kwa kwaVar = ihh.a;
                g9b g9bVarA = g9b.a();
                for (Map.Entry entry : mliVar.b.entrySet()) {
                    g9bVarA.a.put((String) entry.getKey(), entry.getValue());
                }
                Map mapSingletonMap = Collections.singletonMap(kwaVar, g9bVarA);
                pme pmeVar = mliVar.d;
                Set set = mliVar.c;
                sliVar2.f = 1;
                objC = zliVar.c(linkedHashMapC, mapSingletonMap, linkedHashSet, pmeVar, set, sliVar2);
                if (objC == hu4Var) {
                    return hu4Var;
                }
            }
            if (xf5Var == null) {
                return m;
            }
            return xf5Var;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objC);
        xf5Var = (xf5) objC;
        if (xf5Var == null) {
            return m;
        }
        return xf5Var;
    }
}
