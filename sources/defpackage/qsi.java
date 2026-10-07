package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qsi extends ImageSpan implements eph {
    public final Context a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final nsi e;
    public osi f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public qsi(Context context, int i, boolean z, nsi nsiVar) {
        int i2;
        a4c a4cVar;
        int i3 = psi.$EnumSwitchMapping$0[qt4.D(i)];
        if (i3 == 1) {
            i2 = R.drawable.verification_mark_12;
        } else {
            if (i3 != 2 && i3 != 3) {
                ore.o();
                throw null;
            }
            i2 = R.drawable.verification_mark_16;
        }
        super(context, i2);
        this.a = context;
        this.b = i;
        this.c = true;
        this.d = z;
        this.e = nsiVar;
        this.f = new osi(context, i, nsiVar);
        String name = qsi.class.getName();
        this.g = name;
        onThemeChanged(pq3.j.e(context).m());
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        if (f == f2 || (a4cVar = gm0.f) == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "Density mismatch: context=" + f + " system=" + f2, null);
        }
    }

    public static final qsi a(Context context, boolean z) {
        return new qsi(context, 1, false, new sc8(z, 2));
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iSave = canvas.save();
        try {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = fontMetricsInt.descent;
            canvas.translate(f, ((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2.0f)) - ((this.f.getBounds().bottom - this.f.getBounds().top) / 2.0f));
            this.f.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return this.f;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iI0 = oc9.i0(paint.getTextSize() / this.a.getResources().getDisplayMetrics().density);
        if (iI0 != this.b) {
            this.f = new osi(this.a, iI0, this.e);
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    int i3 = this.b;
                    a4cVar.c(je9Var, str, "[getSize] size changed: " + nbh.J(i3) + " -> " + nbh.J(iI0) + ", textSizePx=" + paint.getTextSize(), null);
                }
            }
        }
        int iK = gm0.K(nbh.e(iI0) * yl5.d().getDisplayMetrics().density);
        int i4 = this.c ? iK : 0;
        if (!this.d) {
            iK = 0;
        }
        this.f.setBounds(i4, 0, zo5.b(nbh.h(iI0), yl5.d().getDisplayMetrics().density, i4), gm0.K(nbh.h(iI0) * yl5.d().getDisplayMetrics().density));
        return c0a.e(nbh.h(iI0), yl5.d().getDisplayMetrics().density, i4, iK);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.f.onThemeChanged(kbcVar);
    }
}
