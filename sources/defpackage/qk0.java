package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class qk0 extends Drawable {
    public final Drawable a;
    public final dwb b;
    public final Integer c;
    public final Paint d;
    public final ny8 e;

    public qk0(Drawable drawable, dwb dwbVar, Context context, cf7 cf7Var, cf7 cf7Var2, Integer num) {
        this.a = drawable;
        this.b = dwbVar;
        this.c = num;
        a8g a8gVar = pq3.j;
        drawable.setTint(((Number) cf7Var.invoke(a8gVar.e(context).m())).intValue());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) cf7Var2.invoke(a8gVar.e(context).m())).intValue());
        this.d = paint;
        ny8 ny8VarP = rx8.P(3, new va(12));
        this.e = ny8VarP;
        if (dwbVar instanceof cwb) {
            jxf.a((Path) ny8VarP.getValue(), 2.8d, getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iJ;
        int iMin = Math.min(getBounds().width(), getBounds().height());
        dwb dwbVar = this.b;
        boolean z = dwbVar instanceof awb;
        Paint paint = this.d;
        if (z) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, paint);
        } else if (dwbVar instanceof cwb) {
            canvas.drawPath((Path) this.e.getValue(), paint);
        } else if (!cqk.d(dwbVar, bwb.a)) {
            ore.o();
            return;
        }
        Integer num = this.c;
        if (num != null) {
            iJ = num.intValue();
        } else {
            kwb.r1.getClass();
            iJ = ghb.j(iMin);
        }
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iJ, iJ);
        canvas.save();
        float f = iJ / 2.0f;
        canvas.translate(getBounds().exactCenterX() - f, getBounds().exactCenterY() - f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof cwb) {
            jxf.a((Path) this.e.getValue(), 2.8d, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ qk0(Drawable drawable, dwb dwbVar, Context context, cf7 cf7Var, cf7 cf7Var2, int i) {
        this(drawable, dwbVar, context, (i & 8) != 0 ? new pk0(context, 0) : cf7Var, (i & 16) != 0 ? new pk0(context, 1) : cf7Var2, (Integer) null);
    }
}
