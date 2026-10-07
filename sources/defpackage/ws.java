package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ws extends gm0 {
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ WeakReference m;
    public final /* synthetic */ bt n;

    public ws(bt btVar, int i, int i2, WeakReference weakReference) {
        this.n = btVar;
        this.k = i;
        this.l = i2;
        this.m = weakReference;
    }

    @Override // defpackage.gm0
    public final void G(int i) {
    }

    @Override // defpackage.gm0
    public final void H(Typeface typeface) {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.k) != -1) {
            typeface = at.a(typeface, i, (this.l & 2) != 0);
        }
        bt btVar = this.n;
        if (btVar.m) {
            btVar.l = typeface;
            TextView textView = (TextView) this.m.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i3 = btVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new xs(textView, typeface, i3, i2));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }
}
