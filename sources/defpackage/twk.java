package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class twk {
    public static boolean a(cb0 cb0Var) {
        if (cb0Var.a == -1 || cb0Var.b == -1) {
            return false;
        }
        int i = cb0Var.c;
        return i == 2 || i == 4;
    }

    public static float b(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return vqi.i(f * (f < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s < 0 ? 32768 : 32767);
    }

    public static fgd c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        udb udbVar = null;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            geb gebVar = (geb) it.next();
            linkedHashMap.put(Integer.valueOf(i), gebVar.a);
            for (tdb tdbVar : gebVar.b) {
                long j = tdbVar.a;
                String str = tdbVar.b;
                boolean zBooleanValue = tdbVar.c.booleanValue();
                udb udbVar2 = new udb(i, j, str, zBooleanValue);
                arrayList.add(udbVar2);
                if (zBooleanValue && udbVar == null) {
                    udbVar = udbVar2;
                }
            }
            i = i2;
        }
        return new fgd(linkedHashMap, arrayList, udbVar);
    }

    public static void d(ByteBuffer byteBuffer, cb0 cb0Var, ByteBuffer byteBuffer2, cb0 cb0Var2, xr2 xr2Var, int i, boolean z) {
        int i2 = xr2Var.b;
        boolean z2 = cb0Var.c == 2;
        boolean z3 = cb0Var2.c == 2;
        int i3 = xr2Var.a;
        float[] fArr = new float[i3];
        float[] fArr2 = new float[i2];
        for (int i4 = 0; i4 < i; i4++) {
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i5 = 0; i5 < i2; i5++) {
                    fArr2[i5] = b(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i6 = 0; i6 < i3; i6++) {
                fArr[i6] = b(byteBuffer, z2, z3);
            }
            for (int i7 = 0; i7 < i2; i7++) {
                for (int i8 = 0; i8 < i3; i8++) {
                    fArr2[i7] = (xr2Var.c[(i8 * i2) + i7] * fArr[i8]) + fArr2[i7];
                }
                if (z3) {
                    byteBuffer2.putShort((short) vqi.i(fArr2[i7], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(vqi.i(fArr2[i7], -1.0f, 1.0f));
                }
                fArr2[i7] = 0.0f;
            }
        }
    }
}
