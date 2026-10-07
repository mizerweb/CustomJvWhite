package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class kj9 implements fli {
    public final ejg a;
    public final omi b;
    public kli c;
    public final boolean d;
    public boolean e;
    public final g8b f;
    public final AtomicInteger g;
    public i64 h;
    public xf5 i;

    public kj9(bg2 bg2Var, ejg ejgVar, omi omiVar, zx3 zx3Var) {
        this.a = ejgVar;
        this.b = omiVar;
        boolean z = false;
        if (bg2Var != null) {
            bg2.U.getClass();
            int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr == null ? false : a.L0(6, iArr)) {
                z = true;
            }
        }
        this.d = z;
        this.f = new g8b(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            zx3Var.a(new jj9(this), omiVar.e);
        }
    }

    public final void a(List list) {
        if (this.d) {
            if (list.isEmpty()) {
                this.i = qyj.a(Boolean.FALSE);
            } else {
                this.i = yab.h(this.b.f, null, 0, new el6(this, list, null, 23), 3);
            }
        }
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.c = kliVar;
        if (this.e) {
            if (kliVar != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(g8b g8bVar, int i) {
        if (this.g.getAndSet(i) != i) {
            if (wxl.c()) {
                g8bVar.k(Integer.valueOf(i));
            } else {
                g8bVar.i(Integer.valueOf(i));
            }
        }
    }

    public final i64 d(boolean z, boolean z2) {
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        i64 i64Var = new i64();
        if (this.d) {
            yab.i0(this.b.f, null, 0, new km0((lq4) null, this, i64Var, z, z2), 3);
            return i64Var;
        }
        i64Var.j0(new IllegalStateException("Low Light Boost is not supported!"));
        return i64Var;
    }

    @Override // defpackage.fli
    public final void reset() {
        i64 i64Var = this.h;
        if (i64Var != null) {
            bc1.p("There is a new enableLowLightBoost being set", i64Var);
        }
        this.h = null;
        d(false, true);
    }
}
