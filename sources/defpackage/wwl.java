package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wwl {
    public static xm8 a(Handler handler) {
        return new xm8(1, handler);
    }

    public static void b(Canvas canvas, umh umhVar, Context context, float f, float f2, f66 f66Var) {
        Layout.Alignment alignment;
        int i = umhVar.d;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setColor(umhVar.c);
        textPaint.setTypeface(h9i.a(context, Typeface.create("roboto", 0), v0h.b(umhVar.f)));
        textPaint.setTextSize(28.0f * f);
        CharSequence charSequence = umhVar.e;
        Spannable spannableF = f66Var.f((int) textPaint.getTextSize(), charSequence);
        if (spannableF != null) {
            charSequence = spannableF;
        }
        int iOrdinal = umhVar.b.ordinal();
        if (iOrdinal == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (iOrdinal == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        int i2 = umhVar.g;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) (i2 > 0 ? i2 * f2 : 24.0f * f)).setIncludePad(false).setAlignment(alignment).setBreakStrategy(0).setHyphenationFrequency(0).build();
        float f3 = 4.0f * f;
        float f4 = f * 8.0f;
        if (Color.alpha(i) != 0) {
            enh enhVar = new enh(f3, 0.0f);
            enhVar.b(staticLayoutBuild, charSequence);
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(i);
            paint.setPathEffect(new CornerPathEffect(f4));
            canvas.drawPath(enhVar.d, paint);
        }
        staticLayoutBuild.draw(canvas);
    }
}
