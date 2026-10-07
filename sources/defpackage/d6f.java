package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class d6f {
    public final c6f a;

    public d6f(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new b6f(nestedScrollView);
        } else {
            this.a = new nv8(8);
        }
    }

    public static d6f a(NestedScrollView nestedScrollView) {
        return new d6f(nestedScrollView);
    }

    public final void b(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
