package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class m5c extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] f = {new z8b(m5c.class, "size", "getSize()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Size;"), zo5.e(zfe.a, m5c.class, "mode", "getMode()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Mode;")};
    public final l5c a;
    public final l5c b;
    public final z7c c;
    public final ShapeDrawable d;
    public final RippleDrawable e;

    public m5c(Context context) {
        super(context, null);
        this.a = new l5c(this, 0);
        this.b = new l5c(this, 1);
        z7c z7cVar = new z7c(context);
        z7cVar.setId(R.id.oneme_button_start_imageview_id);
        this.c = z7cVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.d = shapeDrawable;
        this.e = col.e(pq3.j.h(this), shapeDrawable, 0, 6);
        addView(z7cVar);
        c();
        d();
    }

    public final void a(float f2, int i, String str) {
        Drawable drawableO = wk8.o(getContext(), i);
        if (drawableO == null) {
            return;
        }
        b(drawableO, str, f2);
    }

    public final void b(Drawable drawable, String str, float f2) {
        z7c z7cVar = this.c;
        z7cVar.setImageDrawable(drawable);
        if (str != null) {
            z7cVar.getClass();
            z7cVar.b = qyj.r(str);
            z7cVar.a = f2;
        } else {
            z7cVar.b = null;
            z7cVar.a = 0.0f;
        }
        z7cVar.invalidate();
    }

    public final void c() {
        int i;
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        this.c.setImageTintList(ColorStateList.valueOf(-1));
        int iOrdinal = getMode().ordinal();
        if (iOrdinal == 0) {
            i = a8gVar.h(this).h().i;
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            i = 0;
        }
        this.d.getPaint().setColor(i);
        a8gVar.h(this);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1728053248);
        RippleDrawable rippleDrawable = this.e;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void d() {
        int i;
        int i2;
        int iOrdinal = getSize().ordinal();
        if (iOrdinal == 0) {
            i = 24;
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            i = 32;
        }
        int iK = gm0.K(i * yl5.d().getDisplayMetrics().density);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(iK, iK));
        int iOrdinal2 = getSize().ordinal();
        if (iOrdinal2 == 0) {
            i2 = 8;
        } else {
            if (iOrdinal2 != 1) {
                ore.o();
                return;
            }
            i2 = 10;
        }
        int iK2 = gm0.K(i2 * yl5.d().getDisplayMetrics().density);
        setPadding(iK2, iK2, iK2, iK2);
        setOutlineProvider(new nt4(iK));
        requestLayout();
        invalidate();
    }

    public final j5c getMode() {
        zv8 zv8Var = f[1];
        return (j5c) this.b.b;
    }

    public final k5c getSize() {
        zv8 zv8Var = f[0];
        return (k5c) this.a.b;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        c();
    }

    public final void setMode(j5c j5cVar) {
        this.b.B(this, f[1], j5cVar);
    }

    public final void setSize(k5c k5cVar) {
        this.a.B(this, f[0], k5cVar);
    }
}
