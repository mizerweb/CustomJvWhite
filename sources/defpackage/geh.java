package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class geh extends Drawable {
    public final yrh a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public geh(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = 1;
        if (feh.$EnumSwitchMapping$0[qt4.D(1)] != 1) {
            ore.o();
            throw null;
        }
        yrh yrhVar = new yrh(str, i, i2);
        this.a = yrhVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a */
    public final geh mutate() {
        yrh yrhVar = this.a;
        yrhVar.getClass();
        Paint paint = new Paint(yrhVar.g);
        yrh yrhVar2 = new yrh(yrhVar.a, yrhVar.b, yrhVar.c);
        yrhVar2.g = paint;
        yrhVar2.j = true;
        return new geh(this.b, this.c, this.d, this.e, yrhVar2);
    }

    public final void b(float f) {
        this.a.f = f;
    }

    public final void c(Xfermode xfermode) {
        this.a.g.setXfermode(xfermode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        yrh yrhVar = this.a;
        if (!yrhVar.j) {
            gm0.Y(yrh.class.getSimpleName(), "error: cant' render svg, incorrect data!");
            return;
        }
        float f = yrhVar.f;
        int iSave = canvas.save();
        canvas.scale(f, f, 0.0f, 0.0f);
        try {
            canvas.drawPaint(yrhVar.g);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.g.setColorFilter(colorFilter);
    }

    public geh(String str, int i, int i2, int i3, yrh yrhVar) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.a = yrhVar;
    }
}
