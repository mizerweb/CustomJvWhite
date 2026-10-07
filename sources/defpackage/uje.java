package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class uje {
    public final t3a a;
    public final gvb b;
    public final x5 c;
    public final ol d;
    public boolean e;
    public int f;
    public final hle g;
    public f2d h;
    public final tje i;
    public Size j;
    public g85 k;
    public boolean l;

    public uje(t3a t3aVar, gvb gvbVar, Looper looper, g3 g3Var, x5 x5Var, ol olVar) throws Exception {
        this.a = t3aVar;
        this.b = gvbVar;
        this.c = x5Var;
        this.d = olVar;
        final ap9 ap9Var = new ap9(21, this);
        hle hleVar = new hle(3, (byte) 0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        oc9.o("glGenTextures", new int[0]);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        oc9.o("glBindTexture", new int[0]);
        GLES20.glTexParameteri(36197, 10240, 9729);
        oc9.o("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        oc9.o("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        oc9.o("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(36197, 10243, 33071);
        oc9.o("glTexParameteri", new int[0]);
        GLES20.glBindTexture(36197, 0);
        oc9.o("glBindTexture", new int[0]);
        hleVar.b = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(hleVar.b);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: rg7
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                ap9Var.invoke();
            }
        });
        hleVar.c = surfaceTexture;
        Surface surface = new Surface((SurfaceTexture) hleVar.c);
        g3Var.invoke(surface);
        hleVar.d = surface;
        this.g = hleVar;
        this.h = new f2d();
        this.i = new tje(this, looper);
    }

    public final void a() {
        this.h.getClass();
        hle hleVar = this.g;
        Surface surface = (Surface) hleVar.d;
        if (surface != null) {
            surface.release();
        }
        hleVar.d = null;
        SurfaceTexture surfaceTexture = (SurfaceTexture) hleVar.c;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = (SurfaceTexture) hleVar.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        hleVar.c = null;
        GLES20.glDeleteTextures(1, new int[]{hleVar.b}, 0);
        oc9.o("glDeleteTextures", new int[0]);
        hleVar.b = -1;
        g85 g85Var = this.k;
        if (g85Var != null) {
            g85Var.P();
        }
    }

    public final void b() {
        g85 g85Var;
        Surface surfaceI;
        g85 g85Var2;
        Surface surfaceI2;
        tje tjeVar = this.i;
        tjeVar.removeMessages(tjeVar.a);
        Size size = this.j;
        if (size != null) {
            if (!this.e || size.getWidth() <= 0 || size.getHeight() <= 0) {
                size = null;
            }
            if (size != null) {
                g85 g85Var3 = this.k;
                if ((g85Var3 == null || (surfaceI2 = g85Var3.I()) == null || surfaceI2.isValid()) && (g85Var2 = this.k) != null) {
                    g85Var2.J(new os1(this, size, g85Var2, 17));
                    return;
                }
                return;
            }
        }
        g85 g85Var4 = this.k;
        if ((g85Var4 == null || (surfaceI = g85Var4.I()) == null || surfaceI.isValid()) && (g85Var = this.k) != null) {
            g85Var.J(new p7d(18, g85Var));
        }
    }

    public final void c(Surface surface) {
        g85 g85Var = this.k;
        if (!cqk.d(g85Var != null ? g85Var.I() : null, surface)) {
            this.l = false;
        }
        this.b.Q(new k9d(this, 26, surface));
        if (this.k != null) {
            b();
        }
    }
}
