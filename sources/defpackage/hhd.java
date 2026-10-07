package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hhd {
    public Size a;
    public final FrameLayout b;
    public final bhd c;
    public boolean d = false;

    public hhd(FrameLayout frameLayout, bhd bhdVar) {
        this.b = frameLayout;
        this.c = bhdVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(ich ichVar, oo ooVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.d) {
            return;
        }
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        bhd bhdVar = this.c;
        bhdVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            tvj.g("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (bhdVar.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(bhdVar.d());
            } else {
                Display display = viewA.getDisplay();
                boolean z = false;
                boolean z2 = (!bhdVar.g || display == null || display.getRotation() == bhdVar.e) ? false : true;
                boolean z3 = bhdVar.g;
                if (!z3) {
                    if ((!z3 ? bhdVar.c : -njl.c(bhdVar.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    tvj.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = bhdVar.e(layoutDirection, size);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFE.width() / bhdVar.a.getWidth());
            viewA.setScaleY(rectFE.height() / bhdVar.a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public abstract e89 g();
}
