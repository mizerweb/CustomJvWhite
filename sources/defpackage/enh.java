package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class enh {
    public float a;
    public float b;
    public final float c;
    public final Path d;
    public final Path e;
    public final RectF f;

    public enh(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = new Path();
        this.e = new Path();
        this.f = new RectF();
    }

    public static boolean a(Layout layout, CharSequence charSequence, int i, int i2, int i3) {
        int iMin = Math.min(i2, layout.getLineVisibleEnd(i3));
        if (iMin > i && charSequence.charAt(iMin - 1) == '\n') {
            iMin--;
        }
        while (i < iMin && tre.l0(charSequence.charAt(i))) {
            i++;
        }
        while (iMin > i && tre.l0(charSequence.charAt(iMin - 1))) {
            iMin--;
        }
        return iMin > i;
    }

    public final void b(Layout layout, CharSequence charSequence) {
        Path path = this.d;
        path.reset();
        Path path2 = this.e;
        path2.reset();
        int lineCount = layout.getLineCount();
        int i = 0;
        while (i < lineCount) {
            if (a(layout, charSequence, layout.getLineStart(i), layout.getLineEnd(i), i)) {
                float lineLeft = layout.getLineLeft(i);
                float lineRight = layout.getLineRight(i);
                float f = lineRight - lineLeft;
                int i2 = i + 1;
                while (i2 < lineCount && a(layout, charSequence, layout.getLineStart(i2), layout.getLineEnd(i2), i2)) {
                    float lineLeft2 = layout.getLineLeft(i2);
                    float lineRight2 = layout.getLineRight(i2);
                    float f2 = lineRight2 - lineLeft2;
                    if (Math.abs(f2 - f) >= 32.0f) {
                        break;
                    }
                    lineLeft = Math.min(lineLeft, lineLeft2);
                    lineRight = Math.max(lineRight, lineRight2);
                    i2++;
                    f = f2;
                }
                float f3 = lineLeft - this.a;
                float f4 = this.c;
                float f5 = f3 - f4;
                float lineTop = (layout.getLineTop(i) - this.b) - f4;
                float f6 = lineRight + this.a + f4;
                float lineBottom = layout.getLineBottom(i2 - 1) + this.b + f4;
                RectF rectF = this.f;
                rectF.set(f5, lineTop, f6, lineBottom);
                if (!rectF.isEmpty()) {
                    path2.reset();
                    path2.addRect(rectF, Path.Direction.CW);
                    if (path.isEmpty()) {
                        path.set(path2);
                    } else {
                        path.op(path2, Path.Op.UNION);
                    }
                }
                i = i2;
            } else {
                i++;
            }
        }
    }

    public /* synthetic */ enh(float f, float f2) {
        this(f, f2, 0.0f);
    }
}
