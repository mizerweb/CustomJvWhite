package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vx2 extends View implements eph {
    public final int a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final Drawable e;
    public List f;

    public vx2(Context context) {
        super(context, null);
        this.a = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.b = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        this.c = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        TextPaint textPaint = new TextPaint(1);
        p90.Q(this, textPaint, q9i.k);
        this.d = textPaint;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_check_mini).mutate();
        drawableMutate.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        this.e = drawableMutate;
        this.f = r66.a;
        onThemeChanged(pq3.j.h(this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = this.a;
        int i3 = i + i2;
        int paddingTop = getPaddingTop() + i2;
        for (CharSequence charSequence : this.f) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            float f = fontMetrics.ascent;
            float f2 = paddingTop - f;
            float f3 = ((f + fontMetrics.descent) / 2.0f) + f2;
            int i4 = this.b;
            int paddingLeft = getPaddingLeft();
            int paddingLeft2 = getPaddingLeft() + i4;
            Drawable drawable = this.e;
            drawable.setBounds(paddingLeft, (int) (f3 - (i4 / 2)), paddingLeft2, (int) (f3 + (i4 / 2)));
            drawable.draw(canvas);
            canvas.drawText(string, getPaddingLeft() + i4 + this.c, f2, textPaint);
            paddingTop += i3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Float fValueOf;
        String string;
        TextPaint textPaint = this.d;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (this.f.size() * ((fontMetrics.descent - fontMetrics.ascent) + this.a)));
        List<CharSequence> list = this.f;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        for (CharSequence charSequence : list) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            arrayList.add(Float.valueOf(textPaint.measureText(string)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        setMeasuredDimension(View.resolveSize((int) (getPaddingLeft() + this.b + this.c + (fValueOf != null ? fValueOf.floatValue() : 0.0f) + getPaddingRight()), i), View.resolveSize(paddingBottom, i2));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setColor(kbcVar.getText().c);
        this.e.setTint(kbcVar.getIcon().e);
        invalidate();
    }
}
