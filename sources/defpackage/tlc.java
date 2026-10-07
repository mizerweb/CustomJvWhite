package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class tlc extends t8j {
    public final LinearLayoutManager a;
    public u8j b;

    public tlc(s8j s8jVar) {
        this.a = s8jVar;
    }

    @Override // defpackage.t8j
    public final void h(int i) {
    }

    @Override // defpackage.t8j
    public final void i(int i, float f, int i2) {
        if (this.b == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (i3 >= linearLayoutManager.w()) {
                return;
            }
            View viewV = linearLayoutManager.v(i3);
            if (viewV == null) {
                Locale locale = Locale.US;
                ore.k(nbh.u("LayoutManager returned a null child at pos ", i3, "/", linearLayoutManager.w(), " while transforming pages"));
                return;
            } else {
                this.b.i((vee.M(viewV) - i) + f2, viewV);
                i3++;
            }
        }
    }

    @Override // defpackage.t8j
    public final void j(int i) {
    }
}
