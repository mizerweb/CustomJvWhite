package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class u1i {
    public final /* synthetic */ ny8 a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ifh c;
    public final /* synthetic */ ny8 d;
    public final /* synthetic */ ny8 e;
    public final /* synthetic */ ny8 f;
    public final /* synthetic */ ny8 g;

    public u1i(ny8 ny8Var, ny8 ny8Var2, ifh ifhVar, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ifhVar;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
    }

    public final int a() {
        wd4 wd4Var = (wd4) this.b.getValue();
        if (wd4Var.h()) {
            return wd4Var.a().a;
        }
        return 1;
    }

    public final we4 b() {
        return ((wd4) this.b.getValue()).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zui zuiVar, nq4 nq4Var) {
        s1i s1iVar;
        if (nq4Var instanceof s1i) {
            s1iVar = (s1i) nq4Var;
            int i = s1iVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s1iVar.f = i - Integer.MIN_VALUE;
            } else {
                s1iVar = new s1i(this, nq4Var);
            }
        } else {
            s1iVar = new s1i(this, nq4Var);
        }
        Object objA = s1iVar.d;
        int i2 = s1iVar.f;
        if (i2 == 0) {
            ch3.d0(objA);
            xui xuiVarA = m3m.a(zuiVar);
            ovi oviVar = (ovi) this.f.getValue();
            s1iVar.f = 1;
            objA = oviVar.a(xuiVarA, s1iVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        wui wuiVar = (wui) objA;
        return wuiVar == null ? Boolean.FALSE : Boolean.valueOf(m3m.c(wuiVar, (et3) this.g.getValue()));
    }

    public final boolean d(String str, String str2) {
        Bitmap bitmapCreateScaledBitmap;
        g5d g5dVar = (g5d) ((h4c) ((c2a) this.e.getValue())).c;
        b5d b5dVar = g5dVar.a.W;
        zv8[] zv8VarArr = e5d.S6;
        int iIntValue = ((Number) b5dVar.a(zv8VarArr[42]).i()).intValue();
        int iIntValue2 = ((Number) g5dVar.a.X.a(zv8VarArr[43]).i()).intValue();
        int i = sb8.j;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        int height = bitmapDecodeFile.getHeight();
        int width = bitmapDecodeFile.getWidth();
        if (height >= iIntValue && height <= iIntValue2 && width >= iIntValue && width <= iIntValue2) {
            return false;
        }
        int height2 = bitmapDecodeFile.getHeight();
        int width2 = bitmapDecodeFile.getWidth();
        if (height2 < iIntValue || height2 > iIntValue2 || width2 < iIntValue || width2 > iIntValue2) {
            bitmapCreateScaledBitmap = (height2 < iIntValue || width2 < iIntValue) ? Bitmap.createScaledBitmap(bitmapDecodeFile, iIntValue, iIntValue, false) : Bitmap.createScaledBitmap(bitmapDecodeFile, iIntValue2, iIntValue2, false);
        } else {
            bitmapCreateScaledBitmap = bitmapDecodeFile;
        }
        int iD = new se6(str).d(1, "Orientation");
        try {
            sb8.l0(str2, bitmapCreateScaledBitmap, 100, Bitmap.CompressFormat.PNG);
            bitmapCreateScaledBitmap.recycle();
            bitmapDecodeFile.recycle();
            se6 se6Var = new se6(str2);
            se6Var.G("Orientation", String.valueOf(iD));
            se6Var.C();
            return true;
        } catch (Throwable th) {
            if (bitmapCreateScaledBitmap != null) {
                bitmapCreateScaledBitmap.recycle();
            }
            bitmapDecodeFile.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r0.b(r1, r2) == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.zui r24, defpackage.vzh r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1i.e(zui, vzh, nq4):java.lang.Object");
    }
}
