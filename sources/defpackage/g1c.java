package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g1c extends View {
    public static final /* synthetic */ zv8[] d;
    public final int a;
    public final qj0 b;
    public final Paint c;

    static {
        z8b z8bVar = new z8b(g1c.class, "appearance", "getAppearance()Lone/me/common/dot/OneMeDot$Appearance;");
        zfe.a.getClass();
        d = new zv8[]{z8bVar};
    }

    public g1c(Context context) {
        int i;
        super(context, null);
        this.a = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.b = new qj0(this);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        f1c appearance = getAppearance();
        kbc kbcVarH = pq3.j.h(this);
        int iOrdinal = appearance.ordinal();
        if (iOrdinal == 0) {
            i = kbcVarH.h().a;
        } else if (iOrdinal == 1) {
            i = -1;
        } else if (iOrdinal == 2) {
            i = kbcVarH.h().b;
        } else {
            if (iOrdinal != 3) {
                ore.o();
                throw null;
            }
            i = kbcVarH.h().d;
        }
        paint.setColor(i);
        this.c = paint;
    }

    public final f1c getAppearance() {
        zv8 zv8Var = d[0];
        return (f1c) this.b.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        int i = this.a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i / 2.0f, i / 2.0f, this.c);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(f1c f1cVar) {
        this.b.B(this, d[0], f1cVar);
    }
}
