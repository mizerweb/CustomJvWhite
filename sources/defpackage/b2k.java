package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b2k implements a2k {
    public final bg2 a;
    public final ifh b = new ifh(new vbi(23, this));
    public final d2k c = new d2k(3, new dzh(13));
    public boolean d;
    public boolean e;
    public final boolean f;
    public ls9 g;
    public i88 h;

    public b2k(kg2 kg2Var) {
        this.a = kg2Var.b;
        this.f = uk5.a(ZslDisablerQuirk.class) != null;
    }

    @Override // defpackage.a2k
    public final void a(hmf hmfVar) throws Exception {
        j28 j28Var = hmfVar.b;
        i();
        if (this.d) {
            j28Var.b = 1;
            return;
        }
        if (this.f) {
            j28Var.b = 1;
            return;
        }
        bg2.U.getClass();
        int[] iArr = (int[]) ((qb2) this.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = ag2.b;
        }
        if (!a.L0(4, iArr)) {
            if (tvj.f(4, "CXCP")) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            j28Var.b = 1;
            return;
        }
        ifh ifhVar = this.b;
        Iterator it = a.n1(((StreamConfigurationMap) ifhVar.getValue()).getInputSizes(34)).iterator();
        if (!it.hasNext()) {
            qr7.d();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        if (!a.L0(np0.n, ((StreamConfigurationMap) ifhVar.getValue()).getValidOutputFormatsForInput(34))) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        qwa qwaVar = new qwa(size3.getWidth(), size3.getHeight(), 34, 9);
        ls9 ls9Var = new ls9(qwaVar);
        qwaVar.D(new atj(5, this), zjl.c());
        Surface surface = ls9Var.getSurface();
        if (surface == null) {
            ore.k("Required value was null.");
            return;
        }
        i88 i88Var = new i88(surface, new Size(ls9Var.getWidth(), ls9Var.getHeight()), 34);
        o9b.g(i88Var.e).b(new nl2(ls9Var, 3), zjl.d());
        hmfVar.b(i88Var, fx5.d, -1);
        ad2 ad2Var = qwaVar.b;
        j28Var.n(ad2Var);
        ArrayList arrayList = hmfVar.e;
        if (!arrayList.contains(ad2Var)) {
            arrayList.add(ad2Var);
        }
        hmfVar.g = new InputConfiguration(ls9Var.getWidth(), ls9Var.getHeight(), ls9Var.e());
        this.g = ls9Var;
        this.h = i88Var;
    }

    @Override // defpackage.a2k
    public final void b() throws Exception {
        i();
    }

    @Override // defpackage.a2k
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.a2k
    public final void d(boolean z) {
        this.e = z;
    }

    @Override // defpackage.a2k
    public final void e(boolean z) throws Exception {
        if (this.d != z && z) {
            while (true) {
                d2k d2kVar = this.c;
                if (d2kVar.g()) {
                    break;
                } else {
                    ((l78) d2kVar.d()).close();
                }
            }
        }
        this.d = z;
    }

    @Override // defpackage.a2k
    public final l78 f() {
        try {
            return (l78) this.c.d();
        } catch (NoSuchElementException unused) {
            if (!tvj.f(5, "CXCP")) {
                return null;
            }
            Log.w("CXCP", "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    @Override // defpackage.a2k
    public final boolean g(wf5 wf5Var, lmf lmfVar) {
        Size size = wf5Var.h;
        InputConfiguration inputConfiguration = lmfVar.i;
        return inputConfiguration != null && wf5Var.i == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
    }

    @Override // defpackage.a2k
    public final boolean h() {
        return this.e;
    }

    public final void i() throws Exception {
        i88 i88Var = this.h;
        if (i88Var != null) {
            ls9 ls9Var = this.g;
            if (ls9Var != null) {
                o9b.g(i88Var.e).b(new nl2(ls9Var, 4), zjl.d());
                ls9Var.f();
                this.g = null;
            }
            i88Var.a();
            this.h = null;
        }
        while (true) {
            d2k d2kVar = this.c;
            if (d2kVar.g()) {
                return;
            } else {
                ((l78) d2kVar.d()).close();
            }
        }
    }
}
