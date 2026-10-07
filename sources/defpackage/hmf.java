package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class hmf extends gmf {
    public static hmf d(cmi cmiVar, Size size) {
        if (((ki2) cmiVar.b(cmi.X0, null)) == null) {
            qr7.x((String) cmiVar.b(wih.S0, cmiVar.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        hmf hmfVar = new hmf();
        lmf lmfVar = (lmf) cmiVar.b(cmi.V0, null);
        dhc dhcVar = dhc.c;
        int i = lmf.a().g.c;
        ArrayList arrayList = hmfVar.d;
        ArrayList arrayList2 = hmfVar.c;
        j28 j28Var = hmfVar.b;
        if (lmfVar != null) {
            hl2 hl2Var = lmfVar.g;
            i = hl2Var.c;
            for (CameraDevice.StateCallback stateCallback : lmfVar.c) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : lmfVar.d) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            j28Var.m(hl2Var.d);
            dhcVar = hl2Var.b;
        }
        j28Var.getClass();
        j28Var.d = w8b.h(dhcVar);
        if (cmiVar instanceof ugd) {
            Rational rational = wgd.a;
            if (((PreviewPixelHDRnetQuirk) uk5.a(PreviewPixelHDRnetQuirk.class)) != null && !cqk.d(wgd.a, new Rational(size.getWidth(), size.getHeight()))) {
                w8b w8bVarE = w8b.e();
                w8bVarE.m(shl.a(CaptureRequest.TONEMAP_MODE), 2);
                j28Var.o(new jc2(dhc.a(w8bVarE)));
            }
        }
        j28Var.b = ((Number) cmiVar.b(jc2.c, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) cmiVar.b(jc2.d, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) cmiVar.b(jc2.e, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) cmiVar.b(jc2.f, null);
        if (captureCallback != null) {
            hi2 hi2Var = new hi2(captureCallback);
            j28Var.n(hi2Var);
            ArrayList arrayList3 = hmfVar.e;
            if (!arrayList3.contains(hi2Var)) {
                arrayList3.add(hi2Var);
            }
        }
        int iU = cmiVar.u();
        if (iU != 0) {
            j28Var.getClass();
            if (iU != 0) {
                ((w8b) j28Var.d).m(cmi.h1, Integer.valueOf(iU));
            }
        }
        int iR = cmiVar.r();
        if (iR != 0) {
            j28Var.getClass();
            if (iR != 0) {
                ((w8b) j28Var.d).m(cmi.i1, Integer.valueOf(iR));
            }
        }
        w8b w8bVarE2 = w8b.e();
        bh0 bh0Var = jc2.i;
        String str = (String) cmiVar.b(bh0Var, null);
        if (str != null) {
            w8bVarE2.m(bh0Var, str);
        }
        bh0 bh0Var2 = jc2.g;
        Long l = (Long) cmiVar.b(bh0Var2, null);
        if (l != null) {
            w8bVarE2.m(bh0Var2, Long.valueOf(l.longValue()));
        }
        j28Var.o(w8bVarE2);
        uik uikVar = new uik(6);
        cmiVar.j(new hu(uikVar, 6, cmiVar));
        j28Var.o(new i1m(dhc.a((w8b) uikVar.b)));
        return hmfVar;
    }

    public final void a(t94 t94Var) {
        this.b.o(t94Var);
    }

    public final void b(wf5 wf5Var, fx5 fx5Var, int i) {
        g85 g85VarA = ui0.a(wf5Var);
        if (fx5Var == null) {
            ore.n("Null dynamicRange");
            return;
        }
        g85VarA.e = fx5Var;
        g85VarA.c = Integer.valueOf(i);
        this.a.add(g85VarA.x());
        ((HashSet) this.b.c).add(wf5Var);
    }

    public final lmf c() {
        return new lmf(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.q(), this.f, this.g, this.h, this.i);
    }
}
