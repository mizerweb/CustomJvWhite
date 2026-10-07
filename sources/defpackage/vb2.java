package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vb2 extends CameraCaptureSession.CaptureCallback {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final ks9 f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final i4h i;
    public final d5h j;
    public final long k;
    public final i64 l;
    public volatile Integer m;

    public vb2(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, ks9 ks9Var, ArrayMap arrayMap, ArrayMap arrayMap2, i4h i4hVar, d5h d5hVar) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = ks9Var;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = i4hVar;
        this.j = d5hVar;
        h40 h40Var = xb2.b;
        h40Var.getClass();
        this.k = h40.b.incrementAndGet(h40Var);
        this.l = new i64();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        ore.k("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int iIntValue;
        if (this.m != null) {
            Integer num = this.m;
            if (num != null) {
                return num.intValue();
            }
            o75.f(33, this, "SequenceNumber has not been set for ");
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.m;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(jme jmeVar, long j, eme emeVar) {
        this.f.D(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cle) list.get(i)).Y(jmeVar, j, emeVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVar.K().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cle) jmeVar.K().d.get(i2)).Y(jmeVar, j, emeVar);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.D(this);
        Trace.endSection();
        jme jmeVarI = i(captureRequest);
        wg wgVar = new wg(totalCaptureResult, this.a);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((cle) list.get(i)).W(jmeVarI, j, wgVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVarI.K().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cle) jmeVarI.K().d.get(i2)).W(jmeVarI, j, wgVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((cle) list.get(i3)).k0(jmeVarI, j, wgVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = jmeVarI.K().d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((cle) jmeVarI.K().d.get(i4)).k0(jmeVarI, j, wgVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.l.Q(sbi.a);
        jme jmeVarI = i(captureRequest);
        b(jmeVarI, j, new yh6(jmeVarI, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        jme jmeVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cle) list.get(i2)).l(jmeVarI, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVarI.K().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cle) jmeVarI.K().d.get(i3)).l(jmeVarI, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.Q(sbi.a);
        this.f.D(this);
        if (a() != i) {
            String str = "onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i + '!';
            this.j.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jme jmeVar = (jme) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((cle) list.get(i3)).K(jmeVar);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            jme jmeVar2 = (jme) arrayList.get(i4);
            int size4 = jmeVar2.K().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((cle) jmeVar2.K().d.get(i5)).K(jmeVar2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.Q(sbi.a);
        this.f.D(this);
        if (a() != i) {
            String str = "onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i + '!';
            this.j.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jme jmeVar = (jme) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((cle) list.get(i3)).I(jmeVar, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            jme jmeVar2 = (jme) arrayList.get(i4);
            int size4 = jmeVar2.K().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((cle) jmeVar2.K().d.get(i5)).I(jmeVar2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.l.Q(sbi.a);
        jme jmeVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cle) list.get(i)).P(jmeVarI, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVarI.K().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cle) jmeVarI.K().d.get(i2)).P(jmeVarI, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final jme i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (jme) this.d.get(i);
            }
        }
        c.v("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        h4h h4hVar;
        Object next;
        Trace.beginSection("onCaptureBufferLost");
        j4h j4hVar = (j4h) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (j4hVar == null) {
            ojc ojcVar = (ojc) arrayMap.get(surface);
            j4h j4hVar2 = null;
            if (ojcVar != null) {
                int i = ojcVar.a;
                Iterator it = this.i.h.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((h4h) next).a != i);
                h4hVar = (h4h) next;
            } else {
                h4hVar = null;
            }
            if (h4hVar != null) {
                bi2 bi2Var = h4hVar.j;
                if (bi2Var == null) {
                    bi2Var = null;
                }
                if (bi2Var != null) {
                    j4hVar2 = new j4h(bi2Var.a);
                }
            }
            j4hVar = j4hVar2;
        }
        ojc ojcVar2 = (ojc) arrayMap.get(surface);
        if (j4hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            qr7.n(sb, " on ", tc7.a(j));
            return;
        }
        if (ojcVar2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            qr7.n(sb2, " on ", tc7.a(j));
            return;
        }
        jme jmeVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cle) list.get(i2)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVarI.K().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cle) jmeVarI.K().d.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((cle) list.get(i4)).b(jmeVarI, j, j4hVar.a, ojcVar2.a);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = jmeVarI.K().d.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((cle) jmeVarI.K().d.get(i5)).b(jmeVarI, j, j4hVar.a, ojcVar2.a);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Trace.beginSection("onCaptureFailed");
        this.l.Q(sbi.a);
        b(i(captureRequest), captureFailure.getFrameNumber(), new mg(captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        xg xgVar = new xg(captureResult, this.a);
        jme jmeVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cle) list.get(i)).A(jmeVarI, frameNumber, xgVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVarI.K().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cle) jmeVarI.K().d.get(i2)).A(jmeVarI, frameNumber, xgVar);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        f(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        g(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        h(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onReadoutStarted");
        jme jmeVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cle) list.get(i)).g(jmeVarI, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = jmeVarI.K().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cle) jmeVarI.K().d.get(i2)).g(jmeVarI, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}
