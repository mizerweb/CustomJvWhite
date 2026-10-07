package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fc implements mt4 {
    public final mt4 a;
    public final float b;

    public fc(float f, mt4 mt4Var) {
        while (mt4Var instanceof fc) {
            mt4Var = ((fc) mt4Var).a;
            f += ((fc) mt4Var).b;
        }
        this.a = mt4Var;
        this.b = f;
    }

    @Override // defpackage.mt4
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return this.a.equals(fcVar.a) && this.b == fcVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
