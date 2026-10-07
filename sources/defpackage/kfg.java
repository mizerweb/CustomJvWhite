package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class kfg extends Drawable {
    public static final Paint d;
    public final lfg a;
    public final Rect b;
    public final Paint c;

    static {
        Paint paint = new Paint();
        paint.setColor(0);
        d = paint;
    }

    public kfg(lfg lfgVar) {
        this.a = lfgVar;
        this.b = new Rect();
        this.c = new Paint(2);
        int i = lfgVar.b;
        setBounds(0, 0, i, i);
        a();
    }

    public final void a() {
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        int i = this.a.b / 2;
        this.b.set(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        lfg lfgVar = this.a;
        Bitmap bitmapO = lfgVar.e.o(lfgVar.a);
        Rect rect = this.b;
        if (bitmapO == null) {
            canvas.drawRect(rect, d);
        } else {
            Rect rect2 = n56.e;
            canvas.drawBitmap(bitmapO, n56.e, rect, this.c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfg) && cqk.d(this.a, ((kfg) obj).a);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.b = i4;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final String toString() {
        return "SpriteEmojiDrawable(state=" + this.a + ")";
    }

    public kfg(w56 w56Var, int i, c46 c46Var) {
        this(new lfg(new y46(w56Var.b, w56Var.c, w56Var.d), i, 0, 0, c46Var));
    }
}
