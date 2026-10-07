package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class kd2 {
    public final ArrayList a;
    public final ArrayList b;
    public final ex8 c;
    public final sr d;
    public final y3e e;
    public final CopyOnWriteArraySet f;
    public final Object g;
    public volatile String h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;

    public kd2(opb opbVar, CameraVideoCapturer cameraVideoCapturer, sr srVar, ArrayList arrayList, ArrayList arrayList2, boolean z, CidLogger cidLogger) {
        ArrayList arrayList3 = new ArrayList();
        this.a = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.b = arrayList4;
        this.f = new CopyOnWriteArraySet();
        this.g = new Object();
        this.h = null;
        this.e = cidLogger;
        ex8 ex8Var = (ex8) opbVar;
        ex8Var.getClass();
        cameraVideoCapturer.getClass();
        CidLogger cidLogger2 = (CidLogger) ex8Var.b;
        this.c = new ex8(23, new eoc(cameraVideoCapturer, new gh2(cidLogger2), cidLogger2));
        this.d = srVar;
        arrayList3.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        this.i = z;
    }

    public final void a() {
        boolean z;
        ArrayList<CameraEnumerationAndroid.CaptureFormat> arrayList;
        synchronized (this.g) {
            try {
                z = this.i;
                arrayList = z ? this.a : this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.log("CameraCapturerAdapter", "select capture format for ".concat(z ? "front camera" : "back camera"));
        boolean z2 = uza.a;
        if (arrayList.isEmpty()) {
            ore.a();
            return;
        }
        crg crgVar = new crg(7);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (CameraEnumerationAndroid.CaptureFormat captureFormat : arrayList) {
            int i = captureFormat.width;
            if (i >= 500) {
                int i2 = captureFormat.height;
                if (i * i2 <= 921600) {
                    float f = i / i2;
                    if (Math.abs(f - 1.7777778f) < 0.1f) {
                        arrayList2.add(captureFormat);
                    } else if (f > 1.1d && !z) {
                        arrayList3.add(captureFormat);
                    }
                }
            }
        }
        Collections.sort(arrayList2, crgVar);
        Collections.sort(arrayList3, crgVar);
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = arrayList2.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList2.get(0) : arrayList3.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList3.get(0) : (CameraEnumerationAndroid.CaptureFormat) arrayList.get(arrayList.size() - 1);
        int iRound = Math.round(captureFormat2.framerate.max / 1000.0f);
        int i3 = (iRound <= 0 || iRound > 60) ? 30 : iRound;
        y3e y3eVar = this.e;
        StringBuilder sb = new StringBuilder("capture format selected, size: ");
        sb.append(captureFormat2.width);
        sb.append("x");
        qt4.x(captureFormat2.height, iRound, ", frame rate: ", ", actual frame rate: ", sb);
        sb.append(i3);
        y3eVar.log("CameraCapturerAdapter", sb.toString());
        int i4 = captureFormat2.width;
        int i5 = captureFormat2.height;
        int iRound2 = i3 < 1000 ? i3 : Math.round(i3 / 1000.0f);
        if (iRound2 != i3) {
            String strL = qt4.l("Unexpected frame rate requested: ", i3, iRound2, ", truncated to ");
            this.e.reportException("CameraCapturerAdapter", strL, new IllegalArgumentException(strL));
        }
        y3e y3eVar2 = this.e;
        StringBuilder sbP = qv1.p("changeFormat, ", i4, "x", i5, "@");
        sbP.append(iRound2);
        y3eVar2.log("CameraCapturerAdapter", sbP.toString());
        if (this.n != i4 || this.m != i5 || this.l != iRound2) {
            this.l = iRound2;
            this.m = i5;
            this.n = i4;
            for (sb9 sb9Var : this.f) {
                if (this != sb9Var.r) {
                    sb9Var.n.reportException("OKRTCLmsAdapter", "camera.format.change", new RuntimeException("Wrong camera capturer"));
                }
                p3j p3jVar = sb9Var.y;
                p3jVar.a.log("VideoRecord", qt4.l("Camera capture dimensions were changed to ", i4, i5, "x"));
                p3jVar.l.width = i4;
                p3jVar.l.height = i5;
                p3jVar.p();
            }
            if (this.k) {
                this.e.log("CameraCapturerAdapter", "Camera is already started, just change capture format");
                ((eoc) this.c.b).changeCaptureFormat(i4, i5, iRound2);
            }
        }
        this.e.log("CameraCapturerAdapter", "start");
        if (this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already started");
            return;
        }
        if (this.n == 0 || this.m == 0 || this.l == 0) {
            this.e.log("CameraCapturerAdapter", "start camera capture invalid arguments: " + this.n + "x" + this.m + "@" + this.l);
        }
        try {
            ((eoc) this.c.b).startCapture(this.n, this.m, this.l);
            this.k = true;
        } catch (RuntimeException e) {
            this.e.reportException("CameraCapturerAdapter", "Camera start was interrupted", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b() {
        this.e.log("CameraCapturerAdapter", "stop");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already stopped");
            return;
        }
        try {
            ((eoc) this.c.b).stopCapture();
            this.k = false;
        } catch (InterruptedException e) {
            this.e.reportException("CameraCapturerAdapter", "Camera stop was interrupted", e);
            Thread.currentThread().interrupt();
        }
    }
}
