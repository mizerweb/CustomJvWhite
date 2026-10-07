package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class r6e {
    public final RecyclerView a;
    public final ViewGroup b;
    public final int c;
    public final boolean d;
    public final ImageView e;
    public final int f;
    public final int g;
    public float h;

    public r6e(RecyclerView recyclerView, ViewGroup viewGroup, int i, boolean z, int i2) {
        this.a = recyclerView;
        this.b = viewGroup;
        this.c = i;
        this.d = z;
        ImageView imageView = new ImageView(recyclerView.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        imageView.setImageDrawable(anl.a(recyclerView.getContext(), i2));
        imageView.setClickable(false);
        this.e = imageView;
        int i3 = i - 1;
        this.f = i3;
        this.g = z ? 0 : i3;
    }

    public final void a() {
        this.b.removeView(this.e);
        y1 y1Var = new y1(2, this.a);
        while (y1Var.hasNext()) {
            View view = (View) y1Var.next();
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }
    }

    public final void b(float f) {
        View viewR;
        ImageView imageView = this.e;
        if (imageView.getParent() == null) {
            this.b.addView(imageView);
        }
        float f2 = 1.0f - f;
        imageView.setAlpha(f2);
        RecyclerView recyclerView = this.a;
        vee layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (viewR = layoutManager.r(this.g)) != null) {
            imageView.setTranslationX(viewR.getLeft() + recyclerView.getLeft());
            imageView.setTranslationY(viewR.getTop() + recyclerView.getTop());
        }
        nee adapter = recyclerView.getAdapter();
        int iL = adapter != null ? adapter.l() : 0;
        int i = this.c;
        boolean z = iL > i;
        if (layoutManager == null || !z) {
            return;
        }
        if (!this.d) {
            View viewR2 = layoutManager.r(this.f);
            if (viewR2 != null) {
                viewR2.setAlpha(f);
                return;
            }
            return;
        }
        View viewR3 = layoutManager.r(0);
        View viewR4 = layoutManager.r(1);
        if (viewR3 != null && viewR4 != null) {
            this.h = viewR4.getLeft() - viewR3.getLeft();
        }
        float f3 = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            View viewR5 = layoutManager.r(i2);
            if (viewR5 != null) {
                viewR5.setTranslationX(f2 * f3);
            }
        }
    }
}
