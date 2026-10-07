package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Looper;
import android.os.Trace;
import android.provider.MediaStore;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.camera.camera2.pipe.compat.ObjectUnavailableException;
import androidx.media3.transformer.ExoPlayerAssetLoader$Factory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public final class j28 implements ey, an7, w3f, fbf {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public j28(Context context, s26 s26Var, w4a w4aVar, hu3 hu3Var, int i, Looper looper, dy dyVar, qt3 qt3Var, syh syhVar, LogSessionId logSessionId, s99 s99Var) {
        this.a = 2;
        this.c = context;
        this.d = s26Var;
        kr6 kr6Var = new kr6();
        kr6Var.a = hu3Var;
        this.e = kr6Var;
        uyh uyhVarLambda$createAssetLoader$0 = ExoPlayerAssetLoader$Factory.lambda$createAssetLoader$0(((ie5) syhVar).a, context);
        if6 if6Var = new if6(context, new mf6(s26Var.b, s26Var.c, kr6Var, i, dyVar, logSessionId));
        lvb.b0(!if6Var.B);
        if6Var.d = new hf6(0, w4aVar);
        if6Var.c(uyhVarLambda$createAssetLoader$0);
        if6Var.b(s99Var);
        lvb.b0(!if6Var.B);
        looper.getClass();
        if6Var.i = looper;
        lvb.b0(!if6Var.B);
        if6Var.v = Integer.MAX_VALUE;
        lvb.b0(!if6Var.B);
        if6Var.w = Integer.MAX_VALUE;
        lvb.b0(!if6Var.B);
        if6Var.x = Integer.MAX_VALUE;
        lvb.b0(!if6Var.B);
        if6Var.z = false;
        if (hu3Var instanceof s95) {
            lvb.b0(!if6Var.B);
        }
        if (qt3Var != qt3.a) {
            lvb.b0(!if6Var.B);
            if6Var.b = qt3Var;
        }
        bg6 bg6VarA = if6Var.a();
        this.f = bg6VarA;
        bg6VarA.n.a(new lf6(this, dyVar));
        this.b = 0;
    }

    public Integer A() {
        String string;
        c29 c29Var = new c29((StringBuilder) this.f);
        String str = (String) (!c29Var.hasNext() ? null : c29Var.next());
        if (str != null && (string = r5h.y1(str).toString()) != null) {
            if (string.length() < 12) {
                string = null;
            }
            if (string != null) {
                return y5h.B0(string.substring(9, 12));
            }
        }
        return null;
    }

    public void B() {
        wb2 wb2Var = (wb2) this.c;
        synchronized (wb2Var.j) {
            Log.d("CXCP", wb2Var + "#stopRepeating");
            wb2Var.a.F0();
        }
    }

    public boolean C(boolean z, List list, Map map, Map map2, Map map3, List list2) throws Exception {
        Throwable th;
        boolean z2;
        boolean zIsTerminated;
        if (((b40) this.d).b()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            vb2 vb2VarB = ((wb2) this.c).b(z, list, map, map2, map3, (ks9) this.f, list2);
            Trace.endSection();
            boolean z3 = true;
            if (vb2VarB == null) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((fle) it.next()).f != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                fle fleVar = (fle) it2.next();
                                di8 di8Var = fleVar.f;
                                if (di8Var != null) {
                                    a88 a88Var = di8Var.a;
                                    if (a88Var instanceof AutoCloseable) {
                                        a88Var.close();
                                    } else {
                                        if (!(a88Var instanceof ExecutorService)) {
                                            ore.a();
                                            return false;
                                        }
                                        ExecutorService executorService = (ExecutorService) a88Var;
                                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            boolean z4 = false;
                                            while (!zIsTerminated) {
                                                try {
                                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (!z4) {
                                                        executorService.shutdownNow();
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                                Iterator it3 = fleVar.d.iterator();
                                while (it3.hasNext()) {
                                    ((cle) it3.next()).o0(fleVar);
                                }
                            }
                            return true;
                        }
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (((b40) this.d).b()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!vb2VarB.b) {
                synchronized (((ArrayList) this.e)) {
                    ((ArrayList) this.e).add(vb2VarB);
                }
            }
            try {
                Log.d("CXCP", this + " submitting " + vb2VarB);
                Trace.beginSection("InvokeInternalListeners");
                int size = vb2VarB.d.size();
                for (int i = 0; i < size; i++) {
                    jme jmeVar = (jme) vb2VarB.d.get(i);
                    int size2 = vb2VarB.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((cle) vb2VarB.e.get(i2)).E(jmeVar);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = vb2VarB.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    jme jmeVar2 = (jme) vb2VarB.d.get(i3);
                    int size4 = jmeVar2.K().d.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((cle) jmeVar2.K().d.get(i4)).E(jmeVar2);
                    }
                }
                Trace.endSection();
                synchronized (vb2VarB) {
                    if (!((b40) this.d).b()) {
                        try {
                            Trace.beginSection("CXCP#submit(CaptureSequence)");
                            Integer numD = ((wb2) this.c).d(vb2VarB);
                            int iIntValue = numD != null ? numD.intValue() : -1;
                            vb2VarB.m = Integer.valueOf(iIntValue);
                            Trace.endSection();
                            if (iIntValue != -1) {
                                Trace.beginSection("InvokeInternalListeners");
                                int size5 = vb2VarB.d.size();
                                for (int i5 = 0; i5 < size5; i5++) {
                                    jme jmeVar3 = (jme) vb2VarB.d.get(i5);
                                    int size6 = vb2VarB.e.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        ((cle) vb2VarB.e.get(i6)).y(jmeVar3);
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size7 = vb2VarB.d.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    jme jmeVar4 = (jme) vb2VarB.d.get(i7);
                                    int size8 = jmeVar4.K().d.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        ((cle) jmeVar4.K().d.get(i8)).y(jmeVar4);
                                    }
                                }
                                Trace.endSection();
                                try {
                                    Log.d("CXCP", this + " submitted " + vb2VarB);
                                    z2 = true;
                                } catch (CameraAccessException | ObjectUnavailableException unused2) {
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (z3 || vb2VarB.b) {
                                        throw th;
                                    }
                                    synchronized (((ArrayList) this.e)) {
                                        ((ArrayList) this.e).remove(vb2VarB);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size9 = vb2VarB.d.size();
                                    for (int i9 = 0; i9 < size9; i9++) {
                                        jme jmeVar5 = (jme) vb2VarB.d.get(i9);
                                        int size10 = vb2VarB.e.size();
                                        for (int i10 = 0; i10 < size10; i10++) {
                                            ((cle) vb2VarB.e.get(i10)).o0(jmeVar5.K());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size11 = vb2VarB.d.size();
                                    for (int i11 = 0; i11 < size11; i11++) {
                                        jme jmeVar6 = (jme) vb2VarB.d.get(i11);
                                        int size12 = jmeVar6.K().d.size();
                                        for (int i12 = 0; i12 < size12; i12++) {
                                            ((cle) jmeVar6.K().d.get(i12)).o0(jmeVar6.K());
                                        }
                                    }
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                Log.w("CXCP", "Failed to submit " + vb2VarB + ": " + this + " received -1 from submit.");
                                z2 = false;
                                z3 = false;
                            }
                            if (z2 || vb2VarB.b) {
                                return z3;
                            }
                            synchronized (((ArrayList) this.e)) {
                                ((ArrayList) this.e).remove(vb2VarB);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = vb2VarB.d.size();
                            for (int i13 = 0; i13 < size13; i13++) {
                                jme jmeVar7 = (jme) vb2VarB.d.get(i13);
                                int size14 = vb2VarB.e.size();
                                for (int i14 = 0; i14 < size14; i14++) {
                                    ((cle) vb2VarB.e.get(i14)).o0(jmeVar7.K());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = vb2VarB.d.size();
                            for (int i15 = 0; i15 < size15; i15++) {
                                jme jmeVar8 = (jme) vb2VarB.d.get(i15);
                                int size16 = jmeVar8.K().d.size();
                                for (int i16 = 0; i16 < size16; i16++) {
                                    ((cle) jmeVar8.K().d.get(i16)).o0(jmeVar8.K());
                                }
                            }
                            Trace.endSection();
                            return z3;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    Log.w("CXCP", "Failed to submit " + vb2VarB + ": " + this + " is closed.");
                    if (!vb2VarB.b) {
                        synchronized (((ArrayList) this.e)) {
                            ((ArrayList) this.e).remove(vb2VarB);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = vb2VarB.d.size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            jme jmeVar9 = (jme) vb2VarB.d.get(i17);
                            int size18 = vb2VarB.e.size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                ((cle) vb2VarB.e.get(i18)).o0(jmeVar9.K());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = vb2VarB.d.size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            jme jmeVar10 = (jme) vb2VarB.d.get(i19);
                            int size20 = jmeVar10.K().d.size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                ((cle) jmeVar10.K().d.get(i20)).o0(jmeVar10.K());
                            }
                        }
                        Trace.endSection();
                        return false;
                    }
                    return false;
                }
            } catch (CameraAccessException unused3) {
                if (!vb2VarB.b) {
                    synchronized (((ArrayList) this.e)) {
                        ((ArrayList) this.e).remove(vb2VarB);
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = vb2VarB.d.size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            jme jmeVar11 = (jme) vb2VarB.d.get(i21);
                            int size22 = vb2VarB.e.size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                ((cle) vb2VarB.e.get(i22)).o0(jmeVar11.K());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = vb2VarB.d.size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            jme jmeVar12 = (jme) vb2VarB.d.get(i23);
                            int size24 = jmeVar12.K().d.size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                ((cle) jmeVar12.K().d.get(i24)).o0(jmeVar12.K());
                            }
                        }
                        Trace.endSection();
                    }
                }
            } catch (ObjectUnavailableException unused4) {
                if (!vb2VarB.b) {
                    synchronized (((ArrayList) this.e)) {
                        ((ArrayList) this.e).remove(vb2VarB);
                        Trace.beginSection("InvokeInternalListeners");
                        int size25 = vb2VarB.d.size();
                        for (int i25 = 0; i25 < size25; i25++) {
                            jme jmeVar13 = (jme) vb2VarB.d.get(i25);
                            int size26 = vb2VarB.e.size();
                            for (int i26 = 0; i26 < size26; i26++) {
                                ((cle) vb2VarB.e.get(i26)).o0(jmeVar13.K());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size27 = vb2VarB.d.size();
                        for (int i27 = 0; i27 < size27; i27++) {
                            jme jmeVar14 = (jme) vb2VarB.d.get(i27);
                            int size28 = jmeVar14.K().d.size();
                            for (int i28 = 0; i28 < size28; i28++) {
                                ((cle) jmeVar14.K().d.get(i28)).o0(jmeVar14.K());
                            }
                        }
                        Trace.endSection();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z3 = false;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    public void D(OutputStream outputStream) throws IOException {
        int i = this.b;
        byte[] bArr = new byte[np0.q];
        int i2 = 0;
        do {
            int iMin = Math.min(np0.q, i - i2);
            ((cba) this.c).E(i2, 0, iMin, bArr);
            outputStream.write(bArr, 0, iMin);
            i2 += iMin;
        } while (i2 < i);
        outputStream.flush();
    }

    @Override // defpackage.w3f
    public sya a() {
        return (sya) this.e;
    }

    @Override // defpackage.w3f
    public void b(ContentResolver contentResolver, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream != null) {
            try {
                D(outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.ey
    public int c(ww6 ww6Var) {
        bg6 bg6Var = (bg6) this.f;
        if (this.b == 2) {
            long duration = bg6Var.getDuration();
            ww6Var.b = vqi.c0(Math.min(bg6Var.e(), duration), duration);
        }
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // defpackage.fbf
    public void d(nmc nmcVar) {
        dth dthVar;
        dth dthVar2;
        SparseArray sparseArray;
        int i;
        mo2 mo2Var;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        mo2 mo2Var2 = (mo2) this.c;
        k5i k5iVar = (k5i) this.f;
        SparseArray sparseArray3 = k5iVar.h;
        SparseBooleanArray sparseBooleanArray = k5iVar.i;
        we5 we5Var = k5iVar.f;
        List list = k5iVar.c;
        int i2 = k5iVar.a;
        if (nmcVar.A() != 2) {
            return;
        }
        if (i2 == 1 || i2 == 2 || k5iVar.n == 1) {
            dthVar = (dth) list.get(0);
        } else {
            dthVar = new dth(((dth) list.get(0)).d());
            list.add(dthVar);
        }
        if ((nmcVar.A() & np0.m) == 0) {
            return;
        }
        nmcVar.O(1);
        int iH = nmcVar.H();
        nmcVar.O(3);
        nmcVar.k(0, mo2Var2.b, 2);
        mo2Var2.q(0);
        mo2Var2.t(3);
        k5iVar.t = mo2Var2.i(13);
        nmcVar.k(0, mo2Var2.b, 2);
        mo2Var2.q(0);
        mo2Var2.t(4);
        nmcVar.O(mo2Var2.i(12));
        if (i2 == 2 && k5iVar.r == null) {
            n5i n5iVarA = we5Var.a(21, new a9m(21, (String) null, 0, (ArrayList) null, vqi.b));
            k5iVar.r = n5iVarA;
            if (n5iVarA != null) {
                n5iVarA.e(dthVar, k5iVar.m, new m5i(iH, 21, 8192));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iA = nmcVar.a();
        while (iA > 0) {
            nmcVar.k(0, mo2Var2.b, 5);
            mo2Var2.q(0);
            int i3 = mo2Var2.i(8);
            mo2Var2.t(3);
            int i4 = mo2Var2.i(13);
            mo2Var2.t(4);
            int i5 = mo2Var2.i(12);
            int i6 = nmcVar.b;
            int i7 = i6 + i5;
            int i8 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iA2 = 0;
            int i9 = iA;
            while (true) {
                if (nmcVar.b >= i7) {
                    mo2Var = mo2Var2;
                    break;
                }
                int iA3 = nmcVar.A();
                mo2Var = mo2Var2;
                int iA4 = nmcVar.b + nmcVar.A();
                if (iA4 > i7) {
                    break;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (iA3 == 5) {
                    long jC = nmcVar.C();
                    if (jC == 1094921523) {
                        i8 = 129;
                    } else if (jC == 1161904947) {
                        i8 = 135;
                    } else if (jC == 1094921524) {
                        i8 = 172;
                    } else if (jC == 1212503619) {
                        i8 = 36;
                    }
                } else if (iA3 == 106) {
                    iA4 = iA4;
                    i8 = 129;
                } else if (iA3 == 122) {
                    i8 = 135;
                    iA4 = iA4;
                } else if (iA3 == 127) {
                    int iA5 = nmcVar.A();
                    if (iA5 == 21) {
                        i8 = 172;
                    } else if (iA5 == 14) {
                        i8 = 136;
                    } else if (iA5 == 33) {
                        i8 = 139;
                    }
                } else if (iA3 == 123) {
                    i8 = 138;
                } else if (iA3 == 10) {
                    strTrim = nmcVar.y(3, StandardCharsets.UTF_8).trim();
                    iA2 = nmcVar.A();
                } else if (iA3 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (nmcVar.b < iA4) {
                        String strTrim2 = nmcVar.y(3, StandardCharsets.UTF_8).trim();
                        nmcVar.A();
                        dth dthVar3 = dthVar;
                        byte[] bArr = new byte[4];
                        nmcVar.k(0, bArr, 4);
                        arrayList2.add(new l5i(bArr, strTrim2));
                        dthVar = dthVar3;
                        iA4 = iA4;
                        iH = iH;
                    }
                    iA4 = iA4;
                    iH = iH;
                    dthVar = dthVar;
                    arrayList = arrayList2;
                    i8 = 89;
                } else {
                    iA4 = iA4;
                    iH = iH;
                    dthVar = dthVar;
                    if (iA3 == 111) {
                        i8 = 257;
                    }
                }
                nmcVar.O(iA4 - nmcVar.b);
                dthVar = dthVar;
                mo2Var2 = mo2Var;
                sparseArray3 = sparseArray4;
                iH = iH;
            }
            SparseArray sparseArray5 = sparseArray3;
            int i10 = iH;
            dth dthVar4 = dthVar;
            nmcVar.N(i7);
            a9m a9mVar = new a9m(i8, strTrim, iA2, arrayList, Arrays.copyOfRange(nmcVar.a, i6, i7));
            if (i3 == 6 || i3 == 5) {
                i3 = i8;
            }
            int i11 = i9 - (i5 + 5);
            int i12 = i2 == 2 ? i3 : i4;
            if (sparseBooleanArray.get(i12)) {
                c = 21;
            } else {
                c = 21;
                n5i n5iVarA2 = (i2 == 2 && i3 == 21) ? k5iVar.r : we5Var.a(i3, a9mVar);
                if (i2 != 2 || i4 < sparseIntArray.get(i12, 8192)) {
                    sparseIntArray.put(i12, i4);
                    sparseArray2.put(i12, n5iVarA2);
                }
            }
            iA = i11;
            dthVar = dthVar4;
            mo2Var2 = mo2Var;
            sparseArray3 = sparseArray5;
            iH = i10;
        }
        SparseArray sparseArray6 = sparseArray3;
        int i13 = iH;
        dth dthVar5 = dthVar;
        int size = sparseIntArray.size();
        int i14 = 0;
        while (i14 < size) {
            int iKeyAt = sparseIntArray.keyAt(i14);
            int iValueAt = sparseIntArray.valueAt(i14);
            sparseBooleanArray.put(iKeyAt, true);
            k5iVar.j.put(iValueAt, true);
            n5i n5iVar = (n5i) sparseArray2.valueAt(i14);
            if (n5iVar != null) {
                if (n5iVar != k5iVar.r) {
                    i = i13;
                    dthVar2 = dthVar5;
                    n5iVar.e(dthVar2, k5iVar.m, new m5i(i, iKeyAt, 8192));
                } else {
                    dthVar2 = dthVar5;
                    i = i13;
                }
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, n5iVar);
            } else {
                dthVar2 = dthVar5;
                sparseArray = sparseArray6;
                i = i13;
            }
            i14++;
            sparseArray6 = sparseArray;
            i13 = i;
            dthVar5 = dthVar2;
        }
        SparseArray sparseArray7 = sparseArray6;
        if (i2 == 2) {
            if (k5iVar.o) {
                return;
            }
            k5iVar.m.D();
            k5iVar.n = 0;
            k5iVar.o = true;
            return;
        }
        sparseArray7.remove(this.b);
        int i15 = i2 == 1 ? 0 : k5iVar.n - 1;
        k5iVar.n = i15;
        if (i15 == 0) {
            k5iVar.m.D();
            k5iVar.o = true;
        }
    }

    @Override // defpackage.fbf
    public void e(dth dthVar, lj6 lj6Var, m5i m5iVar) {
    }

    @Override // defpackage.w3f
    public Uri f() {
        return (Uri) this.f;
    }

    @Override // defpackage.ey
    public g98 g() {
        hle hleVar = new hle(4);
        kr6 kr6Var = (kr6) this.e;
        String str = (String) kr6Var.b;
        if (str != null) {
            hleVar.j(1, str);
        }
        String str2 = (String) kr6Var.c;
        if (str2 != null) {
            hleVar.j(2, str2);
        }
        return hleVar.c(true);
    }

    @Override // defpackage.w3f
    public Integer getHeight() {
        return null;
    }

    @Override // defpackage.w3f
    public Integer getWidth() {
        return null;
    }

    public void h() {
        List<vb2> listT1;
        synchronized (((ArrayList) this.e)) {
            listT1 = ww3.T1((ArrayList) this.e);
            ((ArrayList) this.e).clear();
        }
        for (vb2 vb2Var : listT1) {
            Trace.beginSection("InvokeInternalListeners");
            int size = vb2Var.d.size();
            for (int i = 0; i < size; i++) {
                jme jmeVar = (jme) vb2Var.d.get(i);
                int size2 = vb2Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((cle) vb2Var.e.get(i2)).o0(jmeVar.K());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = vb2Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                jme jmeVar2 = (jme) vb2Var.d.get(i3);
                int size4 = jmeVar2.K().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((cle) jmeVar2.K().d.get(i4)).o0(jmeVar2.K());
                }
            }
            Trace.endSection();
        }
        wb2 wb2Var = (wb2) this.c;
        synchronized (wb2Var.j) {
            Log.d("CXCP", wb2Var + "#abortCaptures");
            wb2Var.a.J();
        }
    }

    @Override // defpackage.w3f
    public String i() {
        return (String) this.d;
    }

    @Override // defpackage.w3f
    public Integer j() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.an7
    public synchronized void k() {
        this.b = 0;
        ((ArrayDeque) this.f).clear();
    }

    @Override // defpackage.w3f
    public void l(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            D(fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public void m(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n((zc2) it.next());
        }
    }

    public void n(zc2 zc2Var) {
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList.contains(zc2Var)) {
            return;
        }
        arrayList.add(zc2Var);
    }

    public void o(t94 t94Var) {
        for (bh0 bh0Var : t94Var.c()) {
            ((w8b) this.d).b(bh0Var, null);
            ((w8b) this.d).l(bh0Var, t94Var.g(bh0Var), t94Var.i(bh0Var));
        }
    }

    public void p() throws HttpErrorException {
        m18 m18Var;
        StringBuilder sb = (StringBuilder) this.f;
        Integer numA = A();
        if (numA == null) {
            throw new HttpErrorException("Malformed response - status code is absent", bgc.k, sb.toString());
        }
        int iIntValue = numA.intValue();
        if (200 > iIntValue || iIntValue >= 300) {
            String strS = s("X-Reason");
            m18 m18Var2 = bgc.f;
            if (iIntValue == 400) {
                m18Var = bgc.d;
            } else if (iIntValue == 406) {
                m18Var = bgc.j;
            } else if (iIntValue == 409) {
                m18Var = bgc.g;
            } else if (iIntValue == 500) {
                m18Var = bgc.c;
            } else if (iIntValue == 403) {
                m18Var = m18Var2;
            } else if (iIntValue == 404) {
                m18Var = bgc.a;
            } else if (iIntValue == 412) {
                m18Var = bgc.e;
            } else if (iIntValue == 413) {
                m18Var = bgc.h;
            } else if (iIntValue != 415) {
                m18Var = iIntValue != 416 ? new m18(iIntValue, null) : bgc.b;
            } else {
                m18Var = bgc.i;
            }
            if (strS != null) {
                m18Var = new m18(m18Var.a, m18Var.b, strS);
            }
            if (((dii) this.c) != dii.b || !m18Var.equals(m18Var2)) {
                throw new HttpErrorException(null, m18Var, sb.toString(), 1);
            }
            throw new HttpUrlExpiredException(m18Var, sb.toString(), 1);
        }
    }

    public hl2 q() {
        ArrayList arrayList = new ArrayList((HashSet) this.c);
        dhc dhcVarA = dhc.a((w8b) this.d);
        int i = this.b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.e);
        g9b g9bVar = (g9b) this.f;
        ghh ghhVar = ghh.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : g9bVar.a.keySet()) {
            arrayMap.put(str, g9bVar.a.get(str));
        }
        return new hl2(arrayList, dhcVarA, i, arrayList2, new ghh(arrayMap));
    }

    public void r(CharBuffer charBuffer) {
        e2m e2mVar = (e2m) this.e;
        if (!(e2mVar instanceof i28) && !(e2mVar instanceof h28)) {
            ((StringBuilder) this.f).append((CharSequence) charBuffer);
            String str = (String) this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Current response buffer:\n" + ((Object) ((StringBuilder) this.f)), null);
                }
            }
            u();
            return;
        }
        String str2 = "Trying to feed more data on already completed reader. Current buffer: " + ((Object) ((StringBuilder) this.f)) + ", new data: " + ((Object) charBuffer);
        b28 b28Var = new b28(str2, null);
        String str3 = (String) this.d;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str3, str2, b28Var);
        }
    }

    @Override // defpackage.ey
    public void release() {
        ((bg6) this.f).o0();
        this.b = 0;
    }

    public String s(String str) {
        Object next;
        c29 c29Var = new c29((StringBuilder) this.f);
        do {
            if (!c29Var.hasNext()) {
                next = null;
                break;
            }
            next = c29Var.next();
        } while (!z5h.K0((String) next, str, true));
        String str2 = (String) next;
        if (str2 != null) {
            return r5h.y1(r5h.q1(str2, ":", str2)).toString();
        }
        return null;
    }

    @Override // defpackage.ey
    public void start() {
        bg6 bg6Var = (bg6) this.f;
        bg6Var.t(((s26) this.d).a);
        bg6Var.prepare();
        this.b = 1;
    }

    public void t() {
        if (((e2m) this.e) instanceof i28) {
            return;
        }
        String str = (String) this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Response is not in Ready state, but connection closed", null);
            }
        }
        this.e = h28.a;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 4:
                return "GraphRequestProcessor-" + this.b;
            case 5:
                String str2 = (String) this.d;
                ux9 ux9Var = (ux9) this.c;
                ux9 ux9Var2 = (ux9) this.e;
                int i = this.b;
                EnumSet enumSet = (EnumSet) this.f;
                StringBuilder sb = new StringBuilder("OneVideoDecoderReuseEvaluation(decoderName='");
                sb.append(str2);
                sb.append("', oldFormat=");
                sb.append(ux9Var);
                sb.append(", newFormat=");
                sb.append(ux9Var2);
                sb.append(", result=");
                if (i == 1) {
                    str = "NO";
                } else if (i == 2) {
                    str = "YES_WITH_FLUSH";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "YES_WITHOUT_RECONFIGURATION";
                } else {
                    str = "YES_WITH_RECONFIGURATION";
                }
                sb.append(str);
                sb.append(", discardReasons=");
                sb.append(enumSet);
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        Integer numB0;
        Object d28Var = i28.a;
        je9 je9Var = je9.d;
        e2m e2mVar = (e2m) this.e;
        if (e2mVar instanceof g28) {
            Integer numA = A();
            if (numA != null) {
                String str = (String) this.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Status code = " + numA + ", start reading headers", null);
                }
                this.e = f28.a;
                u();
                return;
            }
            return;
        }
        if (!(e2mVar instanceof f28)) {
            if (e2mVar instanceof c28) {
                if (((StringBuilder) this.f).indexOf("0\r\n\r\n", this.b) != -1) {
                    String str2 = (String) this.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "End of chunked body found, stop reading response", null);
                    }
                    this.e = d28Var;
                    return;
                }
                return;
            }
            if (e2mVar instanceof d28) {
                if (((StringBuilder) this.f).length() - this.b >= ((d28) e2mVar).a) {
                    String str3 = (String) this.d;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "Read all bytes of fixed-length body, stop reading response", null);
                    }
                    this.e = d28Var;
                    return;
                }
                return;
            }
            if (!(e2mVar instanceof e28)) {
                if ((e2mVar instanceof i28) || (e2mVar instanceof h28)) {
                    return;
                }
                ore.o();
                return;
            }
            int iIndexOf = ((StringBuilder) this.f).indexOf("<html");
            int iIndexOf2 = ((StringBuilder) this.f).indexOf("</html>");
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 <= iIndexOf) {
                return;
            }
            String str4 = (String) this.d;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str4, "Read all bytes of fixed-html body, stop reading response", null);
            }
            this.e = d28Var;
            return;
        }
        int iIndexOf3 = ((StringBuilder) this.f).indexOf("\r\n\r\n");
        String str5 = (String) this.d;
        if (iIndexOf3 == -1) {
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, str5, "No end-of-headers separator found, keep reading headers", null);
                return;
            }
            return;
        }
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            a4cVar6.c(je9Var, str5, "End-of-headers separator found, start reading body", null);
        }
        this.b = iIndexOf3 + 4;
        String strS = s(HTTP.TRANSFER_ENCODING);
        if (strS == null || !r5h.L0(strS, HTTP.CHUNK_CODING, true)) {
            String strS2 = s(HTTP.CONTENT_LEN);
            int iIntValue = (strS2 == null || (numB0 = y5h.B0(strS2)) == null) ? 0 : numB0.intValue();
            if (iIntValue == 0) {
                String str6 = (String) this.d;
                a4c a4cVar7 = gm0.f;
                if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                    a4cVar7.c(je9Var, str6, "Content-Length is absent or 0, stop reading response", null);
                }
            } else {
                String strS3 = s(HTTP.CONTENT_TYPE);
                if (strS3 == null || !r5h.L0(strS3, "text/html", true)) {
                    String str7 = (String) this.d;
                    a4c a4cVar8 = gm0.f;
                    if (a4cVar8 != null && a4cVar8.b(je9Var)) {
                        a4cVar8.c(je9Var, str7, c0a.k(iIntValue, "Content-Length = ", ", read until end of fixed-length body"), null);
                    }
                    d28Var = new d28(iIntValue);
                } else {
                    String str8 = (String) this.d;
                    a4c a4cVar9 = gm0.f;
                    if (a4cVar9 != null && a4cVar9.b(je9Var)) {
                        a4cVar9.c(je9Var, str8, c0a.o("Content-Type = ", strS3, ", read until end of html body"), null);
                    }
                    d28Var = e28.a;
                }
            }
        } else {
            String str9 = (String) this.d;
            a4c a4cVar10 = gm0.f;
            if (a4cVar10 != null && a4cVar10.b(je9Var)) {
                a4cVar10.c(je9Var, str9, "Transfer-Encoding = chunked, read until end of chunked body", null);
            }
            d28Var = c28.a;
        }
        this.e = d28Var;
        u();
    }

    public synchronized void v(final dn7 dn7Var, final long j) {
        try {
            if (this.b > 0) {
                ((o02) this.e).q(new pwi() { // from class: cc7
                    @Override // defpackage.pwi
                    public final void run() {
                        j28 j28Var = this.a;
                        ((cn7) j28Var.d).b((wm7) j28Var.c, dn7Var, j);
                    }
                }, true);
                this.b--;
            } else {
                ((ArrayDeque) this.f).add(new osh(dn7Var, j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public sbi w() {
        Log.d("CXCP", "Closing " + this);
        boolean zA = ((b40) this.d).a();
        sbi sbiVar = sbi.a;
        if (zA) {
            ((wb2) this.c).c();
        }
        return sbiVar;
    }

    public synchronized void x() {
        try {
            if (((ArrayDeque) this.f).isEmpty()) {
                o02 o02Var = (o02) this.e;
                cn7 cn7Var = (cn7) this.d;
                Objects.requireNonNull(cn7Var);
                o02Var.q(new ap2(cn7Var, 1), true);
            } else {
                ((ArrayDeque) this.f).add(new osh(dn7.e, Long.MIN_VALUE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.an7
    public synchronized void y() {
        osh oshVar = (osh) ((ArrayDeque) this.f).poll();
        if (oshVar == null) {
            this.b++;
            return;
        }
        ((o02) this.e).q(new zo2(this, 4, oshVar), true);
        osh oshVar2 = (osh) ((ArrayDeque) this.f).peek();
        if (oshVar2 != null && oshVar2.b == Long.MIN_VALUE) {
            o02 o02Var = (o02) this.e;
            cn7 cn7Var = (cn7) this.d;
            Objects.requireNonNull(cn7Var);
            o02Var.q(new ap2(cn7Var, 1), true);
            ((ArrayDeque) this.f).remove();
        }
    }

    public j28(String str, ux9 ux9Var, ux9 ux9Var2, int i, EnumSet enumSet) {
        this.a = 5;
        this.d = str;
        this.c = ux9Var;
        this.e = ux9Var2;
        this.b = i;
        this.f = enumSet;
    }

    public j28(cba cbaVar, sya syaVar, String str) {
        this.a = 6;
        this.c = cbaVar;
        this.e = syaVar;
        this.d = str;
        this.b = cbaVar.I();
        this.f = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public j28(dii diiVar) {
        this.a = 0;
        this.c = diiVar;
        this.d = j28.class.getName();
        this.e = g28.a;
        this.f = new StringBuilder();
    }

    public j28(wb2 wb2Var) {
        this.a = 4;
        this.c = wb2Var;
        g40 g40Var = zp7.a;
        g40Var.getClass();
        this.b = g40.b.incrementAndGet(g40Var);
        this.d = gvk.a(false);
        this.e = new ArrayList();
        this.f = new ks9(16, this);
    }

    public j28(wm7 wm7Var, cn7 cn7Var, o02 o02Var) {
        this.a = 3;
        this.c = wm7Var;
        this.d = cn7Var;
        this.e = o02Var;
        this.f = new ArrayDeque();
    }

    public j28(a3b a3bVar, rai raiVar, byte[] bArr, sc8[] sc8VarArr, int i) {
        this.a = 9;
        this.c = a3bVar;
        this.d = raiVar;
        this.e = bArr;
        this.f = sc8VarArr;
        this.b = i;
    }

    public j28() {
        this.a = 1;
        this.c = new HashSet();
        this.d = w8b.e();
        this.b = -1;
        this.e = new ArrayList();
        this.f = g9b.a();
    }

    public j28(dnf dnfVar, int i, List list, uvc uvcVar, List list2) {
        this.a = 7;
        this.c = dnfVar;
        this.b = i;
        this.d = list;
        this.e = uvcVar;
        this.f = list2;
    }

    public j28(k5i k5iVar, int i) {
        this.a = 8;
        this.f = k5iVar;
        this.c = new mo2(5, new byte[5]);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }
}
