package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class fm0 implements x26 {
    public final Drawable a;
    public final Rect b = new Rect();
    public int c;
    public int d;
    public final int e;

    public fm0(int i, Drawable drawable) {
        this.e = 0;
        this.a = drawable;
        this.c = drawable.getIntrinsicWidth();
        this.d = drawable.getIntrinsicHeight();
        this.e = i;
    }

    public final void a(int i, int i2, Rect rect) {
        int i3;
        int i4 = this.e;
        if (i4 <= 0) {
            int i5 = this.d;
            int i6 = this.c;
            int i7 = (int) ((i5 / i6) * i);
            if (i7 > i2) {
                i3 = (int) ((i6 / i5) * i2);
                i7 = i2;
            } else {
                i3 = i;
            }
            int i8 = (int) ((i2 - i7) / 2.0f);
            int i9 = (int) ((i - i3) / 2.0f);
            rect.set(i9, i8, i3 + i9, i7 + i8);
            return;
        }
        int iB = yl5.b(24);
        int i10 = iB * 2;
        int i11 = i - i10;
        int i12 = (i2 - i4) - i10;
        int i13 = this.c;
        int i14 = this.d;
        if (i13 == 0 || i14 == 0) {
            Log.w("fm0", "Division by zero prevented: getWidth()=" + i13 + ", getHeight()=" + i14);
            return;
        }
        float f = i14;
        float f2 = i13;
        int i15 = (int) ((f / f2) * i11);
        if (i15 > i12) {
            i11 = (int) ((f2 / f) * i12);
            i15 = i12;
        }
        int i16 = (i - i11) / 2;
        int i17 = ((i12 - i15) / 2) + iB;
        rect.set(i16, i17, i11 + i16, i15 + i17);
    }

    @Override // defpackage.x26
    public final void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect rect = this.b;
        a(width, height, rect);
        Drawable drawable = this.a;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
