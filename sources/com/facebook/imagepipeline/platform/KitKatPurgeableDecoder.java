package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import defpackage.au3;
import defpackage.cba;
import defpackage.g95;
import defpackage.mx6;
import defpackage.oc9;

/* JADX INFO: loaded from: classes2.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final mx6 c;

    public KitKatPurgeableDecoder(mx6 mx6Var) {
        this.c = mx6Var;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(au3 au3Var, BitmapFactory.Options options) {
        cba cbaVar = (cba) au3Var.K();
        int I = cbaVar.I();
        g95 g95VarA = this.c.a(I);
        try {
            byte[] bArr = (byte[]) g95VarA.K();
            cbaVar.E(0, 0, I, bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, I, options);
            oc9.q(bitmapDecodeByteArray, "BitmapFactory returned null");
            g95VarA.close();
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            au3.E(g95VarA);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(au3 au3Var, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(i, au3Var) ? null : DalvikPurgeableDecoder.b;
        cba cbaVar = (cba) au3Var.K();
        oc9.i(Boolean.valueOf(i <= cbaVar.I()));
        int i2 = i + 2;
        g95 g95VarA = this.c.a(i2);
        try {
            byte[] bArr2 = (byte[]) g95VarA.K();
            cbaVar.E(0, 0, i, bArr2);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            oc9.q(bitmapDecodeByteArray, "BitmapFactory returned null");
            g95VarA.close();
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            au3.E(g95VarA);
            throw th;
        }
    }
}
