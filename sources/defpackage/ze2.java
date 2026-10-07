package defpackage;

import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class ze2 implements AutoCloseable, ie2 {
    public final yp7 a;
    public final yp7 b;
    public final i4h c;
    public final ach d;
    public final kb2 e;
    public final ec7 f;
    public final zb7 g;
    public final pb0 h;
    public final xe2 i;
    public final af2 j;
    public final bf2 k;
    public final bq7 l;
    public final gu4 m;
    public final ar4 n;
    public final b40 o;

    public ze2(se2 se2Var, bg2 bg2Var, yp7 yp7Var, yp7 yp7Var2, i4h i4hVar, ach achVar, kb2 kb2Var, ec7 ec7Var, zb7 zb7Var, pb0 pb0Var, xe2 xe2Var, af2 af2Var, bf2 bf2Var, bq7 bq7Var, gu4 gu4Var, ar4 ar4Var) {
        String str;
        String strA;
        ArrayList arrayList = se2Var.d;
        int i = se2Var.h;
        List list = i4hVar.f;
        this.a = yp7Var;
        this.b = yp7Var2;
        this.c = i4hVar;
        this.d = achVar;
        this.e = kb2Var;
        this.f = ec7Var;
        this.g = zb7Var;
        this.h = pb0Var;
        this.i = xe2Var;
        this.j = af2Var;
        this.k = bf2Var;
        this.l = bq7Var;
        this.m = gu4Var;
        this.n = ar4Var;
        this.o = gvk.a(false);
        String str2 = se2Var.a;
        qb2 qb2Var = (qb2) bg2Var;
        Integer num = (Integer) qb2Var.c(CameraCharacteristics.LENS_FACING);
        String str3 = "External";
        String str4 = "Unknown";
        if (num != null && num.intValue() == 0) {
            str = "Front";
        } else if (num != null && num.intValue() == 1) {
            str = "Back";
        } else {
            str = (num != null && num.intValue() == 2) ? "External" : "Unknown";
        }
        Integer num2 = (Integer) qb2Var.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null && num2.intValue() == 0) {
            str3 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str3 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str3 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str3 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str3 = "Unknown";
        }
        if (i == 1) {
            str4 = "High Speed";
        } else if (i == 0) {
            str4 = "Normal";
        } else if (i == 2) {
            str4 = "Extension";
        }
        int[] iArr = (int[]) qb2Var.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        String str5 = (iArr == null || !a.L0(11, iArr)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str2 + ")\n");
        StringBuilder sbQ = qv1.q("  Facing:    ", str, " (", str5, ", ");
        sbQ.append(str3);
        sbQ.append(")\n");
        sb.append(sbQ.toString());
        sb.append("  Mode:      " + str4 + '\n');
        sb.append("Outputs:\n");
        Iterator it = i4hVar.g.iterator();
        while (true) {
            int i2 = 12;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                List<f4h> list2 = list;
                if (!list2.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (f4h f4hVar : list2) {
                        sb.append(" ");
                        sb.append(r5h.b1(12, "Input-" + f4hVar.a));
                        sb.append(r5h.b1(12, d4h.b(f4hVar.b)));
                        sb.append(r5h.b1(12, String.valueOf(1)));
                        sb.append("\n");
                    }
                }
                sb.append("Session Template: " + pme.a(se2Var.f) + '\n');
                lql.a(sb, "Session Parameters", se2Var.g);
                sb.append("Default Template: " + pme.a(se2Var.i) + '\n');
                lql.a(sb, "Default Parameters", se2Var.j);
                lql.a(sb, "Required Parameters", se2Var.m);
                Log.i("CXCP", sb.toString());
                if (i3 == 1) {
                    if (this.c.h.isEmpty()) {
                        ore.p("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.c.h.size();
                    i4h i4hVar2 = this.c;
                    if (size > 2) {
                        ore.e(i4hVar2.h, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList3 = i4hVar2.h;
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (!((h4h) it2.next()).a()) {
                                ore.e(this.c.h, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        ore.p("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList2.size() > 1) {
                        ore.p("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.c.e.isEmpty()) {
                    return;
                }
                this.d.l();
                return;
            }
            Iterator it3 = ((bi2) it.next()).b.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    xw3.V0();
                    throw null;
                }
                h4h h4hVar = (h4h) next;
                sb.append("  ");
                if (i4 == 0) {
                    bi2 bi2Var = h4hVar.j;
                    strA = j4h.a((bi2Var == null ? null : bi2Var).a);
                } else {
                    strA = "";
                }
                sb.append(r5h.b1(i2, strA));
                int i6 = h4hVar.a;
                String str6 = h4hVar.d;
                sb.append(r5h.b1(i2, ojc.a(i6)));
                sb.append(r5h.b1(i2, h4hVar.b.toString()));
                sb.append(r5h.b1(16, d4h.a(h4hVar.c)));
                zjc zjcVar = h4hVar.e;
                if (zjcVar != null) {
                    sb.append(" [" + ((Object) zjc.a(zjcVar.a)) + ']');
                }
                yjc yjcVar = h4hVar.f;
                Iterator it4 = it;
                ArrayList arrayList4 = arrayList;
                if (yjcVar != null) {
                    sb.append(" [" + ((Object) yjc.a(yjcVar.a)) + ']');
                }
                akc akcVar = h4hVar.g;
                int i7 = i;
                if (akcVar != null) {
                    long j = akcVar.a;
                    StringBuilder sb2 = new StringBuilder(" [");
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
                bkc bkcVar = h4hVar.i;
                if (bkcVar != null) {
                    long j2 = bkcVar.a;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!cqk.d(str6, str2)) {
                    sb.append(" [");
                    sb.append(new ef2(str6));
                    sb.append("]");
                }
                sb.append("\n");
                it = it4;
                it3 = it3;
                i = i7;
                arrayList = arrayList4;
                i4 = i5;
                list = list;
                i2 = 12;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.o.a()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.a.c.close();
            kb2 kb2Var = this.e;
            synchronized (kb2Var.p) {
                try {
                    if (!kb2Var.e()) {
                        kb2Var.r = ge2.b;
                        Log.d("CXCP", "Closed " + kb2Var);
                        iaj iajVar = kb2Var.x;
                        zm2 zm2Var = kb2Var.y;
                        kb2Var.x = null;
                        kb2Var.y = null;
                        sgg sggVar = kb2Var.v;
                        if (sggVar != null) {
                            sggVar.b(null);
                        }
                        sgg sggVar2 = kb2Var.A;
                        if (sggVar2 != null) {
                            sggVar2.b(null);
                        }
                        kb2Var.A = null;
                        sgg sggVar3 = kb2Var.B;
                        if (sggVar3 != null) {
                            sggVar3.b(null);
                        }
                        kb2Var.B = null;
                        sgg sggVar4 = kb2Var.C;
                        if (sggVar4 != null) {
                            sggVar4.b(null);
                        }
                        kb2Var.C = null;
                        bc1.o(kb2Var.f);
                        kb2Var.d(zm2Var, iajVar);
                        se2 se2Var = kb2Var.c;
                        if (se2Var.o.e || kb2Var.k.a(se2Var.a)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) ef2.b(kb2Var.c.a)) + " during " + kb2Var + "#close");
                            kb2Var.i.a(kb2Var.c.a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f.close();
            this.g.close();
            this.d.close();
            this.c.close();
            pb0 pb0Var = this.h;
            synchronized (pb0Var.c) {
                qb0 qb0VarA = pb0Var.a();
                pb0Var.d.remove(this);
                qb0 qb0VarA2 = pb0Var.a();
                if (qb0VarA2 != null && !qb0VarA2.equals(qb0VarA)) {
                    yab.i0(pb0Var.a, null, 4, new xra(pb0Var.b, new sfd(pb0Var, qb0VarA2, (lq4) null, 17), (lq4) null, 3), 1);
                }
            }
            cqk.g(this.m);
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(nq4 nq4Var) {
        ye2 ye2Var;
        if (nq4Var instanceof ye2) {
            ye2Var = (ye2) nq4Var;
            int i = ye2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ye2Var.f = i - Integer.MIN_VALUE;
            } else {
                ye2Var = new ye2(this, nq4Var);
            }
        } else {
            ye2Var = new ye2(this, nq4Var);
        }
        Object objA = ye2Var.d;
        int i2 = ye2Var.f;
        if (i2 == 0) {
            ch3.d0(objA);
            ye2Var.f = 1;
            objA = this.l.a(ye2Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        return new cf2((m9b) objA, this.a, this.n, this.j, this.k);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0132  */
    public final void l(int i, Surface surface) throws Exception {
        String str;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Trace.beginSection(((Object) j4h.a(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            Log.w("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        ach achVar = this.d;
        if (achVar.d.keySet().contains(new j4h(i))) {
            StringBuilder sb = new StringBuilder("Cannot configure surface for ");
            sb.append((Object) j4h.a(i));
            qr7.n(sb, ", it is permanently assigned to ", achVar.d.get(new j4h(i)));
            return;
        }
        synchronized (achVar.e) {
            if (!achVar.i) {
                if (surface != null) {
                    str = "Configured " + ((Object) j4h.a(i)) + " with " + surface;
                } else {
                    str = "Removed surface for " + ((Object) j4h.a(i));
                }
                Log.i("CXCP", str);
                LinkedHashMap linkedHashMap = achVar.f;
                if (surface == null) {
                    Surface surface2 = (Surface) linkedHashMap.remove(new j4h(i));
                    if (!achVar.h || surface2 == null) {
                        autoCloseable = null;
                    } else {
                        autoCloseable = (AutoCloseable) achVar.g.remove(surface2);
                    }
                } else {
                    Surface surface3 = (Surface) linkedHashMap.get(new j4h(i));
                    achVar.f.put(new j4h(i), surface);
                    if (!achVar.h || cqk.d(surface3, surface)) {
                        autoCloseable = null;
                    } else {
                        if (achVar.g.containsKey(surface)) {
                            throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                        }
                        LinkedHashMap linkedHashMap2 = achVar.g;
                        e9i.j(linkedHashMap2);
                        autoCloseable = (AutoCloseable) linkedHashMap2.remove(surface3);
                        achVar.g.put(surface, achVar.c.a(surface));
                    }
                }
                achVar.l();
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            ore.a();
                            return;
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
            } else if (surface != null) {
                Log.w("CXCP", "Refusing to configure " + ((Object) j4h.a(i)) + " with " + surface + " after close!");
            }
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.i.a;
    }
}
