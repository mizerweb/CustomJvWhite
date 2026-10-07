package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import defpackage.as8;
import defpackage.b50;
import defpackage.bne;
import defpackage.bu3;
import defpackage.dba;
import defpackage.gm0;
import defpackage.i68;
import defpackage.iue;
import defpackage.kb5;
import defpackage.oc9;
import defpackage.p76;
import defpackage.tab;
import defpackage.ww6;
import defpackage.x78;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class NativeJpegTranscoder implements x78 {
    public final boolean a;
    public final int b;
    public final boolean c;

    public NativeJpegTranscoder(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        if (z3) {
            tab.q();
        }
    }

    public static void e(InputStream inputStream, dba dbaVar, int i, int i2, int i3) throws IOException {
        tab.q();
        oc9.i(Boolean.valueOf(i2 >= 1));
        oc9.i(Boolean.valueOf(i2 <= 16));
        oc9.i(Boolean.valueOf(i3 >= 0));
        oc9.i(Boolean.valueOf(i3 <= 100));
        b50 b50Var = as8.a;
        oc9.i(Boolean.valueOf(i >= 0 && i <= 270 && i % 90 == 0));
        oc9.j("no transformation requested", (i2 == 8 && i == 0) ? false : true);
        nativeTranscodeJpeg(inputStream, dbaVar, i, i2, i3);
    }

    public static void f(InputStream inputStream, dba dbaVar, int i, int i2, int i3) throws IOException {
        boolean z;
        tab.q();
        oc9.i(Boolean.valueOf(i2 >= 1));
        oc9.i(Boolean.valueOf(i2 <= 16));
        oc9.i(Boolean.valueOf(i3 >= 0));
        oc9.i(Boolean.valueOf(i3 <= 100));
        b50 b50Var = as8.a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        oc9.i(Boolean.valueOf(z));
        oc9.j("no transformation requested", (i2 == 8 && i == 1) ? false : true);
        nativeTranscodeJpegWithExifOrientation(inputStream, dbaVar, i, i2, i3);
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // defpackage.x78
    public final String a() {
        return "NativeJpegTranscoder";
    }

    @Override // defpackage.x78
    public final boolean b(p76 p76Var, iue iueVar, bne bneVar) {
        if (iueVar == null) {
            iueVar = iue.c;
        }
        return as8.c(iueVar, bneVar, p76Var, this.a) < 8;
    }

    @Override // defpackage.x78
    public final ww6 c(p76 p76Var, dba dbaVar, iue iueVar, bne bneVar, ColorSpace colorSpace) {
        Integer num = 85;
        if (iueVar == null) {
            iueVar = iue.c;
        }
        int iP = gm0.p(iueVar, bneVar, p76Var, this.b);
        try {
            int iC = as8.c(iueVar, bneVar, p76Var, this.a);
            int iMax = Math.max(1, 8 / iP);
            if (this.c) {
                iC = iMax;
            }
            InputStream inputStreamA = p76Var.A();
            b50 b50Var = as8.a;
            p76Var.Y();
            if (b50Var.contains(Integer.valueOf(p76Var.d))) {
                int iA = as8.a(p76Var, iueVar);
                oc9.q(inputStreamA, "Cannot transcode from null input stream!");
                f(inputStreamA, dbaVar, iA, iC, num.intValue());
            } else {
                int iB = as8.b(p76Var, iueVar);
                oc9.q(inputStreamA, "Cannot transcode from null input stream!");
                e(inputStreamA, dbaVar, iB, iC, num.intValue());
            }
            bu3.b(inputStreamA);
            return new ww6(iP != 1 ? 0 : 1, 10, (byte) 0);
        } catch (Throwable th) {
            bu3.b(null);
            throw th;
        }
    }

    @Override // defpackage.x78
    public final boolean d(i68 i68Var) {
        return i68Var == kb5.a;
    }
}
