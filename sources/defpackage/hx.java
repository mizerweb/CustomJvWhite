package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class hx implements Comparator {
    public final RectF a;
    public final Rational b;

    public hx(Rational rational, Rational rational2) {
        this.b = rational2 == null ? new Rational(4, 3) : rational2;
        this.a = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public final RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = this.b;
        if (fFloatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF rectFB = b(rational);
        RectF rectFB2 = b(rational2);
        float fWidth = rectFB.width();
        RectF rectF = this.a;
        boolean z2 = fWidth >= rectF.width() && rectFB.height() >= rectF.height();
        if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
            z = true;
        }
        if (z2 && z) {
            return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
        }
        if (z2) {
            return -1;
        }
        if (z) {
            return 1;
        }
        return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
    }
}
