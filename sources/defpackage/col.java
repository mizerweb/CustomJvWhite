package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.TouchDelegate;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class col {
    public static final void a(final int i, final int i2, final int i3, final int i4, final tha thaVar, final View view) {
        thaVar.post(new Runnable() { // from class: i84
            @Override // java.lang.Runnable
            public final void run() {
                Rect rect = new Rect();
                View view2 = view;
                view2.getHitRect(rect);
                rect.left -= i;
                rect.top -= i2;
                rect.right += i3;
                rect.bottom += i4;
                tha thaVar2 = thaVar;
                if (!(thaVar2.getTouchDelegate() instanceof h84)) {
                    thaVar2.setTouchDelegate(new h84(thaVar2));
                }
                ((h84) thaVar2.getTouchDelegate()).a.add(new TouchDelegate(rect, view2));
            }
        });
    }

    public static final RippleDrawable b(int i, Drawable drawable, Drawable drawable2) {
        return new RippleDrawable(ColorStateList.valueOf(i), drawable, drawable2);
    }

    public static /* synthetic */ RippleDrawable c(int i, Drawable drawable, ShapeDrawable shapeDrawable, int i2) {
        if ((i2 & 2) != 0) {
            drawable = null;
        }
        if ((i2 & 4) != 0) {
            shapeDrawable = null;
        }
        return b(i, drawable, shapeDrawable);
    }

    public static RippleDrawable d(kbc kbcVar, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = ((fn8) kbcVar.u().c.b).c;
        }
        return new RippleDrawable(ColorStateList.valueOf(i2), new ColorDrawable(i), new ColorDrawable(-65536));
    }

    public static RippleDrawable e(kbc kbcVar, Drawable drawable, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = ((fn8) kbcVar.u().c.b).c;
        }
        return new RippleDrawable(ColorStateList.valueOf(i), drawable, new ColorDrawable(-65536));
    }
}
