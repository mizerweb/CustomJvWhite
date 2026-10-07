package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
public final class aph implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ bph a;

    public aph(bph bphVar) {
        this.a = bphVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        tvj.a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
        bph bphVar = this.a;
        bphVar.f = surfaceTexture;
        if (bphVar.g == null) {
            bphVar.h();
            return;
        }
        bphVar.h.getClass();
        tvj.a("TextureViewImpl", "Surface invalidated " + bphVar.h);
        bphVar.h.m.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bph bphVar = this.a;
        bphVar.f = null;
        u72 u72Var = bphVar.g;
        if (u72Var == null) {
            tvj.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        o9b.a(u72Var, new wze(this, surfaceTexture, false, 7), np4.o(bphVar.e.getContext()));
        bphVar.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        tvj.a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r72 r72Var = (r72) this.a.k.getAndSet(null);
        if (r72Var != null) {
            r72Var.b(null);
        }
    }
}
