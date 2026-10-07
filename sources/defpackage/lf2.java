package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class lf2 implements nf2, ndi {
    public final kg2 a;
    public final qd2 b;
    public final lh2 c;
    public final ce2 d;
    public final yc2 e;
    public final ch2 f;
    public final p86 g;
    public final a4h h;
    public final ifh i;
    public final ifh j;

    public lf2(kg2 kg2Var, qd2 qd2Var, lh2 lh2Var, ce2 ce2Var, yc2 yc2Var, ch2 ch2Var, p86 p86Var, a4h a4hVar) {
        this.a = kg2Var;
        this.b = qd2Var;
        this.c = lh2Var;
        this.d = ce2Var;
        this.e = yc2Var;
        this.f = ch2Var;
        this.g = p86Var;
        this.h = a4hVar;
        Object objC = ((qb2) kg2Var.b).c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num = (Integer) (objC != null ? objC : -1);
        final int i = 1;
        String strJ = num.intValue() == 2 ? "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : num.intValue() == 4 ? "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : num.intValue() == 0 ? "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED" : num.intValue() == 1 ? "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : num.intValue() == 3 ? "INFO_SUPPORTED_HARDWARE_LEVEL_3" : qv1.j("Unknown value: ", num);
        if (tvj.f(4, "CXCP")) {
            Log.i("CXCP", "Device Level: ".concat(strJ));
        }
        final int i2 = 0;
        this.i = new ifh(new af7(this) { // from class: kf2
            public final /* synthetic */ lf2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                lf2 lf2Var = this.b;
                switch (i3) {
                    case 0:
                        ag2 ag2Var = bg2.U;
                        bg2 bg2Var = lf2Var.a.b;
                        ag2Var.getClass();
                        return Boolean.valueOf(ag2.b(bg2Var));
                    default:
                        kg2 kg2Var2 = lf2Var.a;
                        ob2 ob2Var = new ob2();
                        String str = kg2Var2.a.a;
                        return ob2Var;
                }
            }
        });
        this.j = new ifh(new af7(this) { // from class: kf2
            public final /* synthetic */ lf2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                lf2 lf2Var = this.b;
                switch (i3) {
                    case 0:
                        ag2 ag2Var = bg2.U;
                        bg2 bg2Var = lf2Var.a.b;
                        ag2Var.getClass();
                        return Boolean.valueOf(ag2.b(bg2Var));
                    default:
                        kg2 kg2Var2 = lf2Var.a;
                        ob2 ob2Var = new ob2();
                        String str = kg2Var2.a.a;
                        return ob2Var;
                }
            }
        });
    }

    @Override // defpackage.nf2
    public final String C() {
        return ((Boolean) this.i.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.nf2
    public final int D(int i) {
        return njl.b(njl.c(i), ((Number) ((qb2) this.a.b).c(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == j());
    }

    @Override // defpackage.nf2
    public final p86 F() {
        return this.g;
    }

    @Override // defpackage.nf2
    public final List G() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.h.c.b;
        Size[] highSpeedVideoSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizes() : null;
        return highSpeedVideoSizes != null ? a.n1(highSpeedVideoSizes) : r66.a;
    }

    @Override // defpackage.nf2
    public final b99 H() {
        return (g8b) this.d.a.e.getValue();
    }

    @Override // defpackage.nf2
    public final Set L() {
        Integer[] numArrA = this.h.c.a();
        return numArrA != null ? a.p1(numArrA) : c76.a;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(ob2.class))) {
            return (ob2) this.j.getValue();
        }
        boolean zEquals = sr3Var.equals(zfe.a(kg2.class));
        kg2 kg2Var = this.a;
        if (zEquals) {
            return kg2Var;
        }
        return sr3Var.equals(zfe.a(bg2.class)) ? kg2Var.b : ((qb2) kg2Var.b).W(sr3Var);
    }

    @Override // defpackage.nf2
    public final b99 b() {
        return this.c.c;
    }

    @Override // defpackage.nf2
    public final Set c() {
        return ((kx5) hvl.a(this.a.b).b).c();
    }

    @Override // defpackage.nf2
    public final int d() {
        return D(0);
    }

    @Override // defpackage.nf2
    public final boolean e() {
        if (j() == 2) {
            return true;
        }
        Integer num = (Integer) ((qb2) this.a.b).c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 4;
    }

    @Override // defpackage.nf2
    public final String g() {
        return this.b.a;
    }

    @Override // defpackage.nf2
    public final Rect h() {
        Rect rect = (Rect) ((qb2) this.a.b).c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, y5g.CLOSE_SOCKET_CODE_TIMEOUT, 3000) : rect;
    }

    @Override // defpackage.nf2
    public final int j() {
        int iIntValue = ((Number) ((qb2) this.a.b).c(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i = 1;
        if (iIntValue != 1) {
            i = 2;
            if (iIntValue != 2) {
                if (!tvj.f(5, "CXCP")) {
                    return -1;
                }
                Log.w("CXCP", "Unrecognized lens facing: " + iIntValue + '!');
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.nf2
    public final Object k() {
        return (CameraCharacteristics) ((qb2) this.a.b).W(zfe.a(CameraCharacteristics.class));
    }

    @Override // defpackage.nf2
    public final boolean m() {
        return eyl.b(this.a);
    }

    @Override // defpackage.nf2
    public final void o(Executor executor, ygd ygdVar) {
        this.e.a(ygdVar, executor);
    }

    @Override // defpackage.nf2
    public final s2e p() {
        return this.f.a();
    }

    @Override // defpackage.nf2
    public final List q(int i) {
        Size[] sizeArrA = this.h.a(i);
        return sizeArrA != null ? a.n1(sizeArrA) : r66.a;
    }

    @Override // defpackage.nf2
    public final Set r() {
        int length;
        int[] iArr = (int[]) ((qb2) this.a.b).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        c76 c76Var = c76.a;
        if (iArr == null || (length = iArr.length) == 0) {
            return c76Var;
        }
        if (length == 1) {
            return Collections.singleton(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    @Override // defpackage.nf2
    public final void s(zc2 zc2Var) {
        yc2 yc2Var = this.e;
        synchronized (yc2Var.a) {
            yc2Var.a.remove(zc2Var);
            yc2Var.c = wm9.X0(yc2Var.a);
        }
    }

    @Override // defpackage.nf2
    public final boolean t() {
        int[] iArr = (int[]) ((qb2) this.a.b).c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        return iArr != null && a.L0(1, iArr);
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.b + ".cameraId>";
    }

    @Override // defpackage.nf2
    public final b99 u() {
        return this.d.b.e;
    }

    @Override // defpackage.nf2
    public final List w(Range range) {
        Object poeVar;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.h.c.b;
            Size[] highSpeedVideoSizesFor = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizesFor(range) : null;
            poeVar = highSpeedVideoSizesFor != null ? a.n1(highSpeedVideoSizesFor) : null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        List list = (List) (poeVar instanceof poe ? null : poeVar);
        return list == null ? r66.a : list;
    }

    @Override // defpackage.nf2
    public final boolean x() {
        ag2 ag2Var = bg2.U;
        bg2 bg2Var = this.a.b;
        ag2Var.getClass();
        int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = ag2.b;
        }
        return a.L0(9, iArr);
    }

    @Override // defpackage.nf2
    public final msh z() {
        int iIntValue = ((Number) ((qb2) this.a.b).c(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)).intValue();
        msh mshVar = msh.a;
        return (iIntValue == 0 || iIntValue != 1) ? mshVar : msh.b;
    }
}
