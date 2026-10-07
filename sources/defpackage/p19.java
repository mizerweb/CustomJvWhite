package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p19 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p19(int i, Class cls, String str) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((q19) obj).h);
            case 1:
                return Float.valueOf(((s19) obj).i);
            case 2:
                return Float.valueOf(((weh) obj).z);
            case 3:
                return Float.valueOf(q9j.a.a((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q19 q19Var = (q19) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                q19Var.h = fFloatValue;
                ArrayList arrayList = (ArrayList) q19Var.b;
                ((gu5) arrayList.get(0)).a = 0.0f;
                float f = f2.f((int) (fFloatValue * 333.0f), 0, 667);
                gu5 gu5Var = (gu5) arrayList.get(0);
                gu5 gu5Var2 = (gu5) arrayList.get(1);
                ll6 ll6Var = q19Var.d;
                float interpolation = ll6Var.getInterpolation(f);
                gu5Var2.a = interpolation;
                gu5Var.b = interpolation;
                gu5 gu5Var3 = (gu5) arrayList.get(1);
                gu5 gu5Var4 = (gu5) arrayList.get(2);
                float interpolation2 = ll6Var.getInterpolation(f + 0.49925038f);
                gu5Var4.a = interpolation2;
                gu5Var3.b = interpolation2;
                ((gu5) arrayList.get(2)).b = 1.0f;
                if (q19Var.g && ((gu5) arrayList.get(1)).b < 1.0f) {
                    ((gu5) arrayList.get(2)).c = ((gu5) arrayList.get(1)).c;
                    ((gu5) arrayList.get(1)).c = ((gu5) arrayList.get(0)).c;
                    ((gu5) arrayList.get(0)).c = q19Var.e.c[q19Var.f];
                    q19Var.g = false;
                }
                ((yc8) q19Var.a).invalidateSelf();
                break;
            case 1:
                s19 s19Var = (s19) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                s19Var.i = fFloatValue2;
                int i = (int) (fFloatValue2 * 1800.0f);
                Interpolator[] interpolatorArr = s19Var.e;
                ArrayList arrayList2 = (ArrayList) s19Var.b;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    gu5 gu5Var5 = (gu5) arrayList2.get(i2);
                    int[] iArr = s19.l;
                    int i3 = i2 * 2;
                    int i4 = iArr[i3];
                    int[] iArr2 = s19.k;
                    gu5Var5.a = np4.e(interpolatorArr[i3].getInterpolation(f2.f(i, i4, iArr2[i3])), 0.0f, 1.0f);
                    int i5 = i3 + 1;
                    gu5Var5.b = np4.e(interpolatorArr[i5].getInterpolation(f2.f(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
                }
                if (s19Var.h) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((gu5) it.next()).c = s19Var.f.c[s19Var.g];
                    }
                    s19Var.h = false;
                }
                ((yc8) s19Var.a).invalidateSelf();
                break;
            case 2:
                ((weh) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 3:
                q9j.d((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
