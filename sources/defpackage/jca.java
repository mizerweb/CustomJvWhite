package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class jca {
    public final Context a;
    public final yba b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public oca h;
    public hca i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final ica k = new ica(0, this);

    public jca(Context context, yba ybaVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = ybaVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final hca a() {
        hca vggVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                vggVar = new yn2(context2, this.e, this.d, this.c);
            } else {
                vggVar = new vgg(context2, this.b, this.e, this.d, this.c);
            }
            vggVar.j(this.b);
            vggVar.r(this.k);
            vggVar.l(this.e);
            vggVar.d(this.h);
            vggVar.o(this.g);
            vggVar.p(this.f);
            this.i = vggVar;
        }
        return this.i;
    }

    public final boolean b() {
        hca hcaVar = this.i;
        return hcaVar != null && hcaVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        hca hcaVarA = a();
        hcaVarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            hcaVarA.q(i);
            hcaVarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hcaVarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        hcaVarA.m();
    }
}
