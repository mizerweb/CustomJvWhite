package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kyl {
    public static final l28 a(Context context, int i) {
        StringBuilder sbV = qt4.v("TracerSDK/1.4.0 App/", context.getPackageName(), " ");
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
        }
        sbV.append(property);
        return new l28(i, context, sbV.toString());
    }

    public static List b(List list, int i, Rect rect, Rational rational, int i2, kxa kxaVar) {
        PointF pointF;
        if (list.isEmpty() || i == 0) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ixa ixaVar = (ixa) it.next();
            if (arrayList.size() >= i) {
                break;
            }
            float f = ixaVar.a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = ixaVar.b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    Rational rational3 = ixaVar.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointFJ = kxaVar.j(ixaVar, i2);
                    if (rational3.equals(rational2)) {
                        pointF = new PointF(pointFJ.x, pointFJ.y);
                    } else if (rational3.compareTo(rational2) > 0) {
                        pointF = new PointF(pointFJ.x, pointFJ.y);
                        float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                        pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                    } else {
                        pointF = new PointF(pointFJ.x, pointFJ.y);
                        float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                        pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                    }
                    float f3 = ixaVar.c;
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * f3)) / 2;
                    int iHeight2 = ((int) (f3 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = oc9.v(rect2.left, rect.left, rect.right);
                    rect2.right = oc9.v(rect2.right, rect.left, rect.right);
                    rect2.top = oc9.v(rect2.top, rect.top, rect.bottom);
                    rect2.bottom = oc9.v(rect2.bottom, rect.top, rect.bottom);
                    arrayList.add(new MeteringRectangle(rect2, 1000));
                }
            }
        }
        return arrayList;
    }
}
