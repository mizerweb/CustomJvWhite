package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class f4j {
    public final zzf a;
    public final Context b;
    public final xt1 c;
    public final y3e d;
    public final due e;
    public final o3j f;
    public vpc g;
    public int h;
    public int i;
    public int j;
    public int k;

    public f4j(zzf zzfVar, Context context, xt1 xt1Var, y3e y3eVar, due dueVar) {
        context.getClass();
        xt1Var.getClass();
        y3eVar.getClass();
        this.a = zzfVar;
        this.b = context;
        this.c = xt1Var;
        this.d = y3eVar;
        this.e = dueVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o3j o3jVar = new o3j();
        o3jVar.a = linkedHashMap;
        this.f = o3jVar;
    }

    public final List a(Size size, List list, Integer num, t7g t7gVar, int i, Integer num2) {
        int i2;
        List listP0;
        String str;
        List list2;
        u7g u7gVar;
        List list3;
        u7g u7gVar2;
        List list4;
        u7g u7gVar3;
        CropAndScaleParamsProvider cropAndScaleParamsProvider = (CropAndScaleParamsProvider) this.e.a;
        int iMax = Math.max(size.width, size.height);
        char c = iMax < 320 ? (char) 1 : iMax < 960 ? (char) 2 : (char) 3;
        int i3 = size.width;
        int i4 = size.height;
        CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParamsCalculate = cropAndScaleParamsProvider.calculate(i3, i4, i3, i4);
        cropAndScaleParamsCalculate.getClass();
        Size sizeA = r2m.a(cropAndScaleParamsCalculate);
        dkk dkkVar = new dkk(sizeA, due.t(sizeA, list), 1.0d, true, true);
        int i5 = size.width;
        int i6 = size.height;
        CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParamsCalculate2 = cropAndScaleParamsProvider.calculate(i5, i6, i5 / 2, i6 / 2);
        cropAndScaleParamsCalculate2.getClass();
        Size sizeA2 = r2m.a(cropAndScaleParamsCalculate2);
        dkk dkkVar2 = new dkk(sizeA2, due.t(sizeA2, list), 2.0d, true, true);
        int i7 = size.width;
        int i8 = size.height;
        CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParamsCalculate3 = cropAndScaleParamsProvider.calculate(i7, i8, i7 / 4, i8 / 4);
        cropAndScaleParamsCalculate3.getClass();
        Size sizeA3 = r2m.a(cropAndScaleParamsCalculate3);
        dkk dkkVar3 = new dkk(sizeA3, due.t(sizeA3, list), 4.0d, false, true);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        List listP1 = xw3.P0(dkkVar, dkkVar2);
        if ((listP1 instanceof Collection) && listP1.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = listP1.iterator();
            i2 = 0;
            while (it.hasNext()) {
                Size size2 = ((dkk) it.next()).a;
                if (Math.max(size2.width, size2.height) > iIntValue && (i2 = i2 + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        if (c == 2) {
            listP0 = i2 == 0 ? xw3.P0(dkkVar2, dkkVar, dkk.a(dkkVar)) : xw3.P0(dkkVar2, dkk.a(dkkVar), dkk.a(dkkVar));
        } else if (c != 3) {
            listP0 = xw3.P0(dkkVar, dkk.a(dkkVar), dkk.a(dkkVar));
        } else if (i2 != 0) {
            listP0 = i2 != 1 ? xw3.P0(dkkVar3, dkk.a(dkkVar2), dkk.a(dkkVar)) : xw3.P0(dkkVar3, dkkVar2, dkk.a(dkkVar));
        } else {
            listP0 = xw3.P0(dkkVar3, dkkVar2, dkkVar);
        }
        ArrayList arrayList = new ArrayList(yw3.W0(listP0, 10));
        int i9 = 0;
        for (Object obj : listP0) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                xw3.V0();
                throw null;
            }
            dkk dkkVar4 = (dkk) obj;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (t7gVar == null || (list4 = t7gVar.b) == null || (u7gVar3 = (u7g) ww3.u1(2, list4)) == null || (str = u7gVar3.a) == null) {
                        str = "h";
                    }
                } else if (t7gVar == null || (list3 = t7gVar.b) == null || (u7gVar2 = (u7g) ww3.u1(1, list3)) == null || (str = u7gVar2.a) == null) {
                    str = "m";
                }
            } else if (t7gVar == null || (list2 = t7gVar.b) == null || (u7gVar = (u7g) ww3.u1(0, list2)) == null || (str = u7gVar.a) == null) {
                str = "l";
            }
            String str2 = str;
            boolean z = dkkVar4.e;
            double d = dkkVar4.c;
            int i11 = dkkVar4.b;
            Size size3 = dkkVar4.a;
            arrayList.add(new u7g(str2, 1, z, d, i11, 0, i, size3.width, size3.height, 32));
            i9 = i10;
        }
        return arrayList;
    }
}
