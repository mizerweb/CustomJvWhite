package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nch implements SurfaceHolder.Callback {
    public Size a;
    public ich b;
    public ich c;
    public oo d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ och h;

    public nch(och ochVar) {
        this.h = ochVar;
    }

    public final void a() {
        oo ooVar;
        if (this.b != null) {
            tvj.a("SurfaceViewImpl", "Request canceled: " + this.b);
            if (!this.b.d() || (ooVar = this.d) == null) {
                return;
            }
            ooVar.g();
        }
    }

    public final boolean b() {
        och ochVar = this.h;
        Surface surface = ochVar.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
            return false;
        }
        tvj.a("SurfaceViewImpl", "Surface set on Preview.");
        oo ooVar = this.d;
        ich ichVar = this.b;
        Objects.requireNonNull(ichVar);
        ichVar.b(surface, np4.o(ochVar.e.getContext()), new mx1(4, ooVar));
        this.f = true;
        ochVar.d = true;
        ochVar.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        tvj.a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
        this.e = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ich ichVar;
        tvj.a("SurfaceViewImpl", "Surface created.");
        if (!this.g || (ichVar = this.c) == null) {
            return;
        }
        ichVar.d();
        ichVar.k.b(null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        tvj.a("SurfaceViewImpl", "Surface destroyed.");
        if (!this.f) {
            a();
        } else if (this.b != null) {
            tvj.a("SurfaceViewImpl", "Surface closed " + this.b);
            this.b.m.a();
        }
        this.g = true;
        ich ichVar = this.b;
        if (ichVar != null) {
            this.c = ichVar;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.a = null;
    }
}
