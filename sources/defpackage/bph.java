package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class bph extends hhd {
    public TextureView e;
    public SurfaceTexture f;
    public u72 g;
    public ich h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public oo l;

    @Override // defpackage.hhd
    public final View a() {
        return this.e;
    }

    @Override // defpackage.hhd
    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // defpackage.hhd
    public final void c() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // defpackage.hhd
    public final void d() {
        this.i = true;
    }

    @Override // defpackage.hhd
    public final void e(ich ichVar, oo ooVar) {
        oo ooVar2;
        Size size = ichVar.b;
        this.a = size;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.e.setSurfaceTextureListener(new aph(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        ich ichVar2 = this.h;
        if (ichVar2 != null && ichVar2.d() && (ooVar2 = this.l) != null) {
            ooVar2.g();
            this.l = null;
        }
        this.h = ichVar;
        this.l = ooVar;
        ichVar.l.a(new ewg(this, 8, ichVar), np4.o(this.e.getContext()));
        h();
    }

    @Override // defpackage.hhd
    public final e89 g() {
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            this.k.set(r72Var);
            r72Var.a = "textureViewImpl_waitForNextFrame";
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        Surface surface = new Surface(this.f);
        ich ichVar = this.h;
        u72 u72VarM = f55.m(new c5f(this, 6, surface));
        this.g = u72VarM;
        u72VarM.b.b(new sc2(this, surface, u72VarM, ichVar, 14), np4.o(this.e.getContext()));
        this.d = true;
        f();
    }
}
