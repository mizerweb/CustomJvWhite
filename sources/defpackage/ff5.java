package defpackage;

import android.opengl.EGLDisplay;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ff5 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf5 b;

    public /* synthetic */ ff5(nf5 nf5Var, int i) {
        this.a = i;
        this.b = nf5Var;
    }

    @Override // defpackage.pwi
    public final void run() throws VideoFrameProcessingException {
        int i = this.a;
        nf5 nf5Var = this.b;
        switch (i) {
            case 0:
                uu6 uu6Var = nf5Var.k;
                String str = vqi.a;
                throw null;
            case 1:
                nf5Var.b();
                return;
            case 2:
                EGLDisplay eGLDisplay = nf5Var.e;
                wm7 wm7Var = nf5Var.c;
                boolean z = nf5Var.d;
                ArrayList arrayList = nf5Var.l;
                try {
                    try {
                        nf5Var.f.k();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((cn7) arrayList.get(i2)).release();
                        }
                        nf5Var.k.release();
                        break;
                    } catch (Exception e) {
                        lvb.l0("DefaultFrameProcessor", "Error releasing shader program", e);
                    }
                    if (z) {
                        try {
                            return;
                        } catch (GlUtil$GlException e2) {
                            return;
                        }
                    }
                    return;
                } finally {
                    if (z) {
                        try {
                            wm7Var.I(eGLDisplay);
                        } catch (GlUtil$GlException e3) {
                            lvb.l0("DefaultFrameProcessor", "Error releasing GL objects", e3);
                        }
                        break;
                    }
                }
            default:
                int i3 = nf5.x;
                nf5Var.b();
                return;
        }
    }
}
