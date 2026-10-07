package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class wb2 {
    public final jd2 a;
    public final zqh b;
    public final int c;
    public final Map d;
    public final Map e;
    public final i4h f;
    public final d5h g;
    public final boolean h;
    public final int i;
    public final Object j;
    public boolean k;
    public vb2 l;
    public final dh m;

    public wb2(jd2 jd2Var, zqh zqhVar, int i, Map map, Map map2, i4h i4hVar, d5h d5hVar, boolean z) {
        this.a = jd2Var;
        this.b = zqhVar;
        this.c = i;
        this.d = map;
        this.e = map2;
        this.f = i4hVar;
        this.g = d5hVar;
        this.h = z;
        g40 g40Var = xb2.a;
        g40Var.getClass();
        this.i = g40.b.incrementAndGet(g40Var);
        this.j = new Object();
        List list = i4hVar.f;
        dh dhVarA = null;
        if (!list.isEmpty()) {
            f4h f4hVar = (f4h) ww3.r1(list);
            Surface inputSurface = jd2Var.getInputSurface();
            if (inputSurface == null) {
                ore.k("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                dhVarA = zrk.a(inputSurface, f4hVar.a, new d4h(f4hVar.b), zqhVar.a());
            } catch (RuntimeException e) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.a + "! Reprocessing will not be supported!", e);
            }
            if (dhVarA != null) {
                Log.d("CXCP", "Created ImageWriter " + dhVarA + " for session " + this.a);
            }
        }
        this.m = dhVarA;
    }

    public static final void a(wb2 wb2Var, vb2 vb2Var) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + vb2Var);
        if (((sbi) wb2Var.b.b(2000L, new m25(vb2Var, null, 1))) == null) {
            Log.e("CXCP", wb2Var + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + vb2Var);
        }
    }

    public final vb2 b(boolean z, List list, Map map, Map map2, Map map3, ks9 ks9Var, List list2) {
        CaptureRequest.Builder builderA;
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        long j;
        boolean zA;
        boolean zIsTerminated;
        boolean z2;
        List list3;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        ArrayMap arrayMap5 = new ArrayMap();
        jd2 jd2Var = this.a;
        i4h i4hVar = this.f;
        List list4 = list;
        if (list4.isEmpty()) {
            ore.k("build(...) should never be called with an empty request list!");
            return null;
        }
        if (jd2Var instanceof fg) {
            Iterator it = list.iterator();
            Boolean bool = null;
            Boolean bool2 = null;
            while (it.hasNext()) {
                fle fleVar = (fle) it.next();
                List list5 = fleVar.a;
                Iterator it2 = it;
                if ((list5 instanceof Collection) && list5.isEmpty()) {
                    list3 = list4;
                    arrayList = arrayList;
                    z3 = false;
                } else {
                    Iterator it3 = list5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ((j4h) it3.next()).getClass();
                            ArrayList arrayList3 = i4hVar.h;
                            if (arrayList3 == null || !arrayList3.isEmpty()) {
                                Iterator it4 = arrayList3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        Iterator it5 = it3;
                                        h4h h4hVar = (h4h) it4.next();
                                        list3 = list4;
                                        akc akcVar = h4hVar.g;
                                        bkc bkcVar = h4hVar.i;
                                        if (!(akcVar == null ? false : akc.a(akcVar.a, 1L))) {
                                            if (!(bkcVar == null ? false : bkc.a(bkcVar.a, 0L)) && bkcVar != null) {
                                                list4 = list3;
                                                it3 = it5;
                                                arrayList = arrayList;
                                                it4 = it4;
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                            list4 = list4;
                            it3 = it3;
                            arrayList = arrayList;
                        } else {
                            list3 = list4;
                            arrayList = arrayList;
                            z3 = false;
                        }
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                if (bool2 != null && !bool2.equals(boolValueOf)) {
                    Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool2.booleanValue() + ". Current request contains preview stream use case or hint: " + z3 + '.');
                }
                List list6 = fleVar.a;
                if ((list6 instanceof Collection) && list6.isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it6 = list6.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            ((j4h) it6.next()).getClass();
                            ArrayList arrayList4 = i4hVar.h;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it7 = arrayList4.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        h4h h4hVar2 = (h4h) it7.next();
                                        akc akcVar2 = h4hVar2.g;
                                        if (!(akcVar2 == null ? false : akc.a(akcVar2.a, 3L))) {
                                            bkc bkcVar2 = h4hVar2.i;
                                            if (bkcVar2 == null ? false : bkc.a(bkcVar2.a, 1L)) {
                                            }
                                        }
                                        z4 = true;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            z4 = false;
                        }
                    }
                }
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                if (bool != null && !bool.equals(boolValueOf2)) {
                    Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool.booleanValue() + ". Current request contains video stream use case: " + z4 + '.');
                }
                ArrayList arrayList5 = i4hVar.h;
                if (arrayList5 == null || !arrayList5.isEmpty()) {
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        if (!((h4h) it8.next()).a()) {
                            Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + i4hVar.h);
                            return null;
                        }
                    }
                }
                bool2 = boolValueOf;
                bool = boolValueOf2;
                it = it2;
                list4 = list3;
                arrayList = arrayList;
            }
        }
        ArrayList arrayList6 = arrayList;
        if (list4.isEmpty()) {
            ore.k("build(...) should never be called with an empty request list!");
            return null;
        }
        Iterator it9 = list.iterator();
        do {
            char c = '!';
            if (!it9.hasNext()) {
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    fle fleVar2 = (fle) it10.next();
                    Log.d("CXCP", "Building CaptureRequest for " + fleVar2);
                    pme pmeVar = fleVar2.e;
                    int i = pmeVar != null ? pmeVar.a : this.c;
                    jd2 jd2Var2 = this.a;
                    di8 di8Var = fleVar2.f;
                    if (di8Var != null) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) di8Var.b.W(zfe.a(TotalCaptureResult.class));
                        if (totalCaptureResult == null) {
                            c.p(di8Var.b, " as TotalCaptureResult", "Failed to unwrap FrameInfo ");
                            return null;
                        }
                        builderA = jd2Var2.n().k0(totalCaptureResult);
                    } else {
                        builderA = jd2Var2.n().A(i);
                    }
                    if (builderA == null) {
                        if (di8Var != null) {
                            Log.i("CXCP", "Failed to create a ReprocessingCaptureRequest.Builder from " + di8Var.b + c);
                        } else {
                            Log.i("CXCP", "Failed to create a CaptureRequest.Builder from " + ((Object) pme.b(i)) + c);
                        }
                        builderA = null;
                    }
                    if (builderA == null) {
                        return null;
                    }
                    kwa kwaVar = mg2.b;
                    Map map4 = map3;
                    Object obj = map4.get(kwaVar);
                    if (obj == null) {
                        obj = map.get(kwaVar);
                    }
                    builderA.setTag(obj);
                    int size = fleVar2.a.size();
                    boolean z5 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        Surface surface = (Surface) arrayMap5.get(fleVar2.a.get(i2));
                        if (surface != null) {
                            builderA.addTarget(surface);
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        ore.k("Check failed.");
                        return null;
                    }
                    di8 di8Var2 = fleVar2.f;
                    if (di8Var2 != null) {
                        if (this.m == null) {
                            Log.e("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
                            return null;
                        }
                        a88 a88Var = di8Var2.a;
                        synchronized (this.j) {
                            if (this.k) {
                                Log.w("CXCP", this + " disconnected. " + a88Var + " can't be queued to " + this.m);
                                return null;
                            }
                            Log.d("CXCP", "Queuing image " + a88Var + " for reprocessing to ImageWriter " + this.m);
                            dh dhVar = this.m;
                            dhVar.getClass();
                            try {
                                Image image = (Image) a88Var.W(zfe.a(Image.class));
                                if (image == null) {
                                    Log.w("CXCP", "Failed to unwrap image wrapper " + a88Var);
                                } else {
                                    dhVar.a.queueInputImage(image);
                                    ynl.c(builderA, fleVar2.b);
                                }
                            } catch (Throwable th) {
                                Log.w("CXCP", "Failed to queue image to " + dhVar + " due to error " + th.getMessage() + ". Ignoring failure and closing " + a88Var);
                                if (a88Var instanceof AutoCloseable) {
                                    a88Var.close();
                                } else {
                                    if (!(a88Var instanceof ExecutorService)) {
                                        ore.a();
                                        return null;
                                    }
                                    ExecutorService executorService = (ExecutorService) a88Var;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z6 = false;
                                        while (!zIsTerminated) {
                                            try {
                                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z6) {
                                                    executorService.shutdownNow();
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        if (z6) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                }
                            }
                            Log.d("CXCP", "Failed to queue image " + a88Var + " for reprocessing to ImageWriter " + this.m);
                            return null;
                        }
                    }
                    ynl.c(builderA, map);
                    ynl.c(builderA, map2);
                    ynl.c(builderA, fleVar2.b);
                    ynl.c(builderA, map4);
                    h40 h40Var = xb2.c;
                    h40Var.getClass();
                    long jIncrementAndGet = h40.b.incrementAndGet(h40Var);
                    CaptureRequest captureRequestBuild = builderA.build();
                    jd2 jd2Var3 = this.a;
                    if (jd2Var3 instanceof fg) {
                        fg fgVar = (fg) jd2Var3;
                        le2 le2Var = fgVar.a;
                        arrayMap = arrayMap4;
                        try {
                            Trace.beginSection("CXCP#createHighSpeedRequestList");
                            List<CaptureRequest> listCreateHighSpeedRequestList = fgVar.e.createHighSpeedRequestList(captureRequestBuild);
                            try {
                                Trace.endSection();
                            } catch (IllegalArgumentException unused2) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList from " + le2Var + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                listCreateHighSpeedRequestList = null;
                            } catch (IllegalStateException unused3) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList. " + le2Var + " may be closed.");
                                listCreateHighSpeedRequestList = null;
                            } catch (UnsupportedOperationException unused4) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList from " + le2Var + " because the output surface was not available.");
                                listCreateHighSpeedRequestList = null;
                            }
                            if (listCreateHighSpeedRequestList == null) {
                                return null;
                            }
                            List list7 = fleVar2.a;
                            if ((list7 instanceof Collection) && list7.isEmpty()) {
                                arrayMap2 = arrayMap3;
                                arrayList6 = arrayList6;
                                mc2 mc2Var = new mc2(this.a, listCreateHighSpeedRequestList.get(0), map, map2, map3, arrayMap5, z, fleVar2, jIncrementAndGet);
                                arrayList2.add(listCreateHighSpeedRequestList.get(0));
                                arrayList6.add(mc2Var);
                            } else {
                                Iterator it11 = list7.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        ((j4h) it11.next()).getClass();
                                        ArrayList arrayList7 = this.f.h;
                                        if (arrayList7 == null || !arrayList7.isEmpty()) {
                                            Iterator it12 = arrayList7.iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    h4h h4hVar3 = (h4h) it12.next();
                                                    akc akcVar3 = h4hVar3.g;
                                                    if (akcVar3 == null ? false : akc.a(akcVar3.a, 3L)) {
                                                        j = 1;
                                                    } else {
                                                        bkc bkcVar3 = h4hVar3.i;
                                                        if (bkcVar3 == null) {
                                                            zA = false;
                                                            j = 1;
                                                        } else {
                                                            j = 1;
                                                            zA = bkc.a(bkcVar3.a, 1L);
                                                        }
                                                        if (!zA) {
                                                            it11 = it11;
                                                            it12 = it12;
                                                        }
                                                    }
                                                    int size2 = listCreateHighSpeedRequestList.size();
                                                    int i3 = 0;
                                                    while (i3 < size2) {
                                                        int i4 = size2;
                                                        int i5 = i3;
                                                        mc2 mc2Var2 = new mc2(this.a, listCreateHighSpeedRequestList.get(i3), map, map2, map4, arrayMap5, z, fleVar2, jIncrementAndGet);
                                                        arrayList2.add(listCreateHighSpeedRequestList.get(i5));
                                                        arrayList6.add(mc2Var2);
                                                        i3 = i5 + 1;
                                                        size2 = i4;
                                                        map4 = map3;
                                                        arrayMap3 = arrayMap3;
                                                        j = j;
                                                    }
                                                    arrayMap2 = arrayMap3;
                                                }
                                            }
                                        }
                                        it11 = it11;
                                        map4 = map3;
                                        arrayList6 = arrayList6;
                                        arrayMap3 = arrayMap3;
                                    } else {
                                        arrayMap2 = arrayMap3;
                                        arrayList6 = arrayList6;
                                        mc2 mc2Var3 = new mc2(this.a, listCreateHighSpeedRequestList.get(0), map, map2, map3, arrayMap5, z, fleVar2, jIncrementAndGet);
                                        arrayList2.add(listCreateHighSpeedRequestList.get(0));
                                        arrayList6.add(mc2Var3);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        arrayMap = arrayMap4;
                        arrayMap2 = arrayMap3;
                        mc2 mc2Var4 = new mc2(jd2Var3, captureRequestBuild, map, map2, map3, arrayMap5, z, fleVar2, jIncrementAndGet);
                        arrayList2.add(captureRequestBuild);
                        arrayList6.add(mc2Var4);
                    }
                    arrayMap3 = arrayMap2;
                    arrayMap4 = arrayMap;
                    c = '!';
                }
                return new vb2(this.a.n().Y(), z, arrayList2, arrayList6, list2, ks9Var, arrayMap3, arrayMap4, this.f, this.g);
            }
            fle fleVar3 = (fle) it9.next();
            Iterator it13 = fleVar3.a.iterator();
            z2 = false;
            while (it13.hasNext()) {
                int i6 = ((j4h) it13.next()).a;
                if (!arrayMap5.containsKey(new j4h(i6))) {
                    Surface surface2 = (Surface) this.d.get(new j4h(i6));
                    if (surface2 != null) {
                        arrayMap3.put(surface2, new j4h(i6));
                        arrayMap5.put(new j4h(i6), surface2);
                        bi2 bi2VarB = this.f.b(i6);
                        if (bi2VarB == null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        for (h4h h4hVar4 : bi2VarB.b) {
                            Object obj2 = this.e.get(new ojc(h4hVar4.a));
                            if (obj2 == null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                            arrayMap4.put((Surface) obj2, new ojc(h4hVar4.a));
                        }
                    } else {
                        continue;
                    }
                }
                z2 = true;
            }
            if (!z2) {
                Log.i("CXCP", "  Failed to bind any surfaces for " + fleVar3 + '!');
                return null;
            }
        } while (z2);
        ore.k("Check failed.");
        return null;
    }

    public final void c() {
        vb2 vb2Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.j) {
                try {
                    if (this.k) {
                        vb2Var = null;
                    } else {
                        this.k = true;
                        dh dhVar = this.m;
                        if (dhVar != null) {
                            bc1.o(dhVar);
                        }
                        Surface inputSurface = this.a.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        vb2Var = this.l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.h && vb2Var != null) {
                a(this, vb2Var);
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    public final Integer d(vb2 vb2Var) {
        boolean z;
        jd2 jd2Var;
        ArrayList arrayList;
        Integer numO;
        synchronized (this.j) {
            if (this.k) {
                Log.w("CXCP", this + " disconnected. " + vb2Var + " won't be submitted");
                return null;
            }
            if (vb2Var.c.size() == 1) {
                jd2 jd2Var2 = this.a;
                if (jd2Var2 instanceof fg) {
                    z = vb2Var.b;
                    jd2Var = this.a;
                    arrayList = vb2Var.c;
                    if (z) {
                        numO = jd2Var.m0(arrayList, vb2Var);
                    } else {
                        numO = jd2Var.O(arrayList, vb2Var);
                    }
                } else if (vb2Var.b) {
                    if (this.h) {
                        this.l = vb2Var;
                    }
                    numO = jd2Var2.f((CaptureRequest) vb2Var.c.get(0), vb2Var);
                } else {
                    numO = jd2Var2.L0((CaptureRequest) vb2Var.c.get(0), vb2Var);
                }
            } else {
                z = vb2Var.b;
                jd2Var = this.a;
                arrayList = vb2Var.c;
                if (z) {
                    numO = jd2Var.m0(arrayList, vb2Var);
                } else {
                    numO = jd2Var.O(arrayList, vb2Var);
                }
            }
            return numO;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.i;
    }
}
