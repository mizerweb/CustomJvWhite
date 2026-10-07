package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class nz9 extends afe {
    public final kj1 a;
    public final kj1 b;
    public final int c;
    public final int d = 50;
    public int e;
    public int f;

    public nz9(Context context, kj1 kj1Var, kj1 kj1Var2) {
        this.a = kj1Var;
        this.b = kj1Var2;
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.c;
        int i4 = this.d;
        if (i2 > 0) {
            int i5 = this.f + i2;
            this.f = i5;
            if (i5 >= i4 || i2 >= i3) {
                this.b.invoke();
                this.f = 0;
                this.e = 0;
                return;
            }
            return;
        }
        if (i2 < 0) {
            int i6 = this.e + i2;
            this.e = i6;
            if (Math.abs(i6) >= i4 || Math.abs(i2) >= i3) {
                this.a.invoke();
                this.e = 0;
                this.f = 0;
            }
        }
    }
}
