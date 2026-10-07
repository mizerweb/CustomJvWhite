package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cp2 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp2(int i, Class cls, String str) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((ir3) obj).h);
            case 6:
                return Float.valueOf(((ir3) obj).i);
            default:
                return Float.valueOf(((xt5) obj).b());
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((fp2) obj).b((PointF) obj2);
                break;
            case 1:
                ((fp2) obj).a((PointF) obj2);
                break;
            case 2:
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                q9j.c(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF2 = (PointF) obj2;
                q9j.c(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int iRound = Math.round(pointF3.x);
                int iRound2 = Math.round(pointF3.y);
                q9j.c(view3, iRound, iRound2, view3.getWidth() + iRound, view3.getHeight() + iRound2);
                break;
            case 5:
                ir3 ir3Var = (ir3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                ir3Var.h = fFloatValue;
                int i = (int) (fFloatValue * 5400.0f);
                ll6 ll6Var = ir3Var.e;
                ArrayList arrayList = (ArrayList) ir3Var.b;
                gu5 gu5Var = (gu5) arrayList.get(0);
                float f = ir3Var.h * 1520.0f;
                gu5Var.a = (-20.0f) + f;
                gu5Var.b = f;
                for (int i2 = 0; i2 < 4; i2++) {
                    gu5Var.b = (ll6Var.getInterpolation(f2.f(i, ir3.k[i2], 667)) * 250.0f) + gu5Var.b;
                    gu5Var.a = (ll6Var.getInterpolation(f2.f(i, ir3.l[i2], 667)) * 250.0f) + gu5Var.a;
                }
                float f2 = gu5Var.a;
                float f3 = gu5Var.b;
                gu5Var.a = (((f3 - f2) * ir3Var.i) + f2) / 360.0f;
                gu5Var.b = f3 / 360.0f;
                for (int i3 = 0; i3 < 4; i3++) {
                    float f4 = f2.f(i, ir3.m[i3], 333);
                    if (f4 >= 0.0f && f4 <= 1.0f) {
                        int i4 = i3 + ir3Var.g;
                        int[] iArr = ir3Var.f.c;
                        int length = i4 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i5 = iArr[length];
                        int i6 = iArr[length2];
                        ((gu5) arrayList.get(0)).c = uv.a(ll6Var.getInterpolation(f4), Integer.valueOf(i5), Integer.valueOf(i6)).intValue();
                        ((yc8) ir3Var.a).invalidateSelf();
                    }
                    break;
                }
                ((yc8) ir3Var.a).invalidateSelf();
                break;
            case 6:
                ((ir3) obj).i = ((Float) obj2).floatValue();
                break;
            default:
                xt5 xt5Var = (xt5) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (xt5Var.h != fFloatValue2) {
                    xt5Var.h = fFloatValue2;
                    xt5Var.invalidateSelf();
                }
                break;
        }
    }
}
