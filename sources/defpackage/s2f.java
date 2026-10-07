package defpackage;

import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s2f {
    public static final void a(tu0 tu0Var, String str, af7 af7Var) {
        tu0Var.b("MaxBatteryMetricRegistrar".concat(str != null ? ":".concat(str) : ""), af7Var);
    }

    public static void b(tu0 tu0Var, Throwable th, String str, af7 af7Var, int i) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        tu0Var.j("MaxBatteryMetricRegistrar".concat(str != null ? ":".concat(str) : ""), th, af7Var);
    }

    public static final Object c(e89 e89Var, mdh mdhVar) throws Throwable {
        try {
            if (e89Var.isDone()) {
                return y3.n(e89Var);
            }
            ek2 ek2Var = new ek2(1, p90.B(mdhVar));
            ek2Var.u();
            e89Var.b(new ruh(e89Var, 0, ek2Var), gm5.a);
            ek2Var.w(new ik5(2, e89Var));
            return ek2Var.s();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    public static final boolean d(int i, int i2, String str) {
        Object poeVar;
        a4c a4cVar;
        try {
            MediaCodecInfo mediaCodecInfoE = e(str);
            boolean z = false;
            if (mediaCodecInfoE != null && y86.g(mediaCodecInfoE, str, i, i2) != null) {
                z = true;
            }
            poeVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null && (a4cVar = gm0.f) != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MediaEncoderCapabilities", qt4.l("checkEncoderResolutionSupported: failed, target was ", i, i2, "x"), null);
            }
        }
        Boolean bool = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = bool;
        }
        return ((Boolean) poeVar).booleanValue();
    }

    public static final MediaCodecInfo e(String str) {
        List listE = y86.e(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (y86.h((MediaCodecInfo) obj, str)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            listE = arrayList;
        }
        return (MediaCodecInfo) ww3.t1(listE);
    }
}
