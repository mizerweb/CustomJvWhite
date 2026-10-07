package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class iv9 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ jv9 a;

    public iv9(jv9 jv9Var) {
        this.a = jv9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        jv9 jv9Var = this.a;
        if (jv9Var.B == surfaceHolder && jv9Var.isConnected()) {
            xnf xnfVar = jv9Var.n;
            xnfVar.getClass();
            if (xnfVar.a.e() >= 8) {
                jv9Var.c0(new f75(this, i2, i3));
            }
            jv9Var.l0(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        jv9 jv9Var = this.a;
        if (jv9Var.B != surfaceHolder) {
            return;
        }
        jv9Var.A = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        jv9Var.s0(jv9Var.A, surfaceFrame.width(), surfaceFrame.height());
        jv9Var.l0(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        jv9 jv9Var = this.a;
        if (jv9Var.B != surfaceHolder) {
            return;
        }
        jv9Var.A = null;
        jv9Var.s0(null, 0, 0);
        jv9Var.l0(0, 0);
    }
}
