package defpackage;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hcm {
    public static hcm g(Iterable iterable, int i, int i2, float f) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i;
        int iMin2 = i2;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f2 = i;
        float f3 = i2;
        return new acm((iMin + 0.0f) / f2, (iMin2 + 0.0f) / f3, (iMax + 0.0f) / f2, (iMax2 + 0.0f) / f3, 0.0f);
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract float e();

    public final float f() {
        if (!h()) {
            return 0.0f;
        }
        return (d() - e()) * (b() - c());
    }

    public final boolean h() {
        return c() >= 0.0f && c() < b() && b() <= 1.0f && e() >= 0.0f && e() < d() && d() <= 1.0f;
    }
}
