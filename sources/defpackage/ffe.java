package defpackage;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ffe {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.Z(i);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.e;
        if (interpolator != null && this.c < 1) {
            ore.k("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.c;
        if (i2 < 1) {
            ore.k("Scroll duration must be a positive number");
            return;
        }
        recyclerView.D1.c(this.a, this.b, i2, interpolator);
        int i3 = this.g + 1;
        this.g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = baseInterpolator;
        this.f = true;
    }
}
