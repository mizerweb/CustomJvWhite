package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zpe implements s70, vo, ra2, k74, qbi, kxa, plh, sxh, kq4, oca, jw0, b71, ut4, bn7, y3j, qg6, an7, rg4 {
    public static final zpe b = new zpe(1);
    public static final zpe c = new zpe(2);
    public static final zpe d = new zpe(3);
    public static final zpe e = new zpe(4);
    public static final zpe f = new zpe(5);
    public static final zpe g = new zpe(6);
    public static final zpe h = new zpe(7);
    public static final zpe i = new zpe(8);
    public static final zpe j = new zpe(9);
    public static final zpe k = new zpe(10);
    public static final zpe l = new zpe(11);
    public static final zpe m = new zpe(12);
    public static final zpe n = new zpe(13);
    public static final /* synthetic */ zpe o = new zpe(14);
    public final /* synthetic */ int a;

    public /* synthetic */ zpe(int i2) {
        this.a = i2;
    }

    public static int[] p(gs7 gs7Var) {
        int i2 = hs7.$EnumSwitchMapping$0[gs7Var.ordinal()];
        if (i2 == 1) {
            return new int[]{-16749825, -10285313, -13092609, -5616385, -12940805, -6710785, -4886057};
        }
        if (i2 == 2) {
            return new int[]{-13312, -24818, -935615, -1472760, -26036, -37120, -939190};
        }
        if (i2 == 3) {
            return new int[]{-13908412, -13908282, -14051636, -14037975, -14572724, -15734734, -10816574};
        }
        if (i2 == 4) {
            return new int[]{-1, -1, -1, -1, -1, -1, -1};
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (defpackage.r5h.n1(r4, "system_", true) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dqe t(java.lang.String r4) {
        /*
            java.lang.String r0 = "custom_"
            bqe r1 = defpackage.bqe.a
            if (r4 == 0) goto L61
            boolean r2 = defpackage.r5h.X0(r4)     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto Ld
            goto L61
        Ld:
            java.lang.String r2 = "default_"
            r3 = 1
            boolean r2 = defpackage.r5h.n1(r4, r2, r3)     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L17
            goto L61
        L17:
            java.lang.String r2 = "systemdefault_"
            boolean r2 = defpackage.r5h.n1(r4, r2, r3)     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L20
            goto L53
        L20:
            boolean r2 = defpackage.r5h.n1(r4, r0, r3)     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L4b
            aqe r2 = new aqe     // Catch: java.lang.Exception -> L49
            r3 = 0
            boolean r0 = defpackage.r5h.n1(r4, r0, r3)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L39
            int r0 = r4.length()     // Catch: java.lang.Exception -> L49
            r3 = 7
            java.lang.CharSequence r4 = r4.subSequence(r3, r0)     // Catch: java.lang.Exception -> L49
            goto L41
        L39:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L49
            java.lang.CharSequence r4 = r4.subSequence(r3, r0)     // Catch: java.lang.Exception -> L49
        L41:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L49
            r2.<init>(r4)     // Catch: java.lang.Exception -> L49
            return r2
        L49:
            r4 = move-exception
            goto L56
        L4b:
            java.lang.String r0 = "system_"
            boolean r4 = defpackage.r5h.n1(r4, r0, r3)     // Catch: java.lang.Exception -> L49
            if (r4 == 0) goto L61
        L53:
            cqe r4 = defpackage.cqe.a
            return r4
        L56:
            java.lang.Class<zpe> r0 = defpackage.zpe.class
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "can't load ringtone path from settings, use default instead"
            defpackage.gm0.V(r0, r2, r4)
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.t(java.lang.String):dqe");
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return ch3.m((Executor) ((g85) h74Var).i(new x0e(k19.class, Executor.class)));
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
    }

    @Override // defpackage.plh
    public Map b(pme pmeVar) {
        return s66.a;
    }

    @Override // defpackage.b71
    public byte[] d(int i2, byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.oca
    public void f(yba ybaVar, boolean z) {
    }

    @Override // defpackage.jw0
    public long g(long j2) {
        return j2;
    }

    @Override // defpackage.ra2
    public String getDescription() {
        return "other";
    }

    @Override // defpackage.kq4
    public Object h(Task task) {
        Intent intent = (Intent) ((Bundle) task.h()).getParcelable("notification_data");
        if (intent != null) {
            return new eu3(intent);
        }
        return null;
    }

    @Override // defpackage.kxa
    public PointF j(ixa ixaVar, int i2) {
        float f2 = ixaVar.b;
        float f3 = ixaVar.a;
        return i2 == 1 ? new PointF(1.0f - f3, f2) : new PointF(f3, f2);
    }

    @Override // defpackage.vo
    public uo l(uo uoVar, Object obj) {
        switch (this.a) {
            case 3:
                for (xtj xtjVar : ((tt0) obj).a) {
                    Object obj2 = xtjVar.b;
                    if (!(obj2 instanceof tp)) {
                        uoVar = ((zo) xtjVar.d).getConfigExtractor().l(uoVar, obj2);
                    }
                }
                break;
        }
        return uoVar;
    }

    @Override // defpackage.oca
    public boolean m(yba ybaVar) {
        return false;
    }

    public Object n(Object obj) throws Throwable {
        UnsupportedOperationException unsupportedOperationException;
        Throwable th;
        Bitmap bitmapCreateBitmap;
        hi0 hi0Var = (hi0) obj;
        int i2 = hi0Var.c;
        Object obj2 = hi0Var.a;
        int i3 = hi0Var.f;
        ls9 ls9Var = null;
        try {
            try {
                if (i2 == 35) {
                    l78 l78Var = (l78) obj2;
                    boolean z = i3 % 180 != 0;
                    ls9 ls9Var2 = new ls9(d3m.a(z ? l78Var.getHeight() : l78Var.getWidth(), z ? l78Var.getWidth() : l78Var.getHeight(), 1, 2));
                    try {
                        a58 a58VarD = ImageProcessingUtil.d(l78Var, ls9Var2, ByteBuffer.allocateDirect(l78Var.getWidth() * l78Var.getHeight() * 4), i3, false);
                        l78Var.close();
                        if (a58VarD == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = f3m.a(a58VarD);
                        a58VarD.close();
                        ls9Var = ls9Var2;
                    } catch (UnsupportedOperationException e2) {
                        unsupportedOperationException = e2;
                        throw new ImageCaptureException(0, "Can't convert " + (i2 == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException);
                    } catch (Throwable th2) {
                        th = th2;
                        ls9Var = ls9Var2;
                        if (ls9Var == null) {
                            throw th;
                        }
                        ls9Var.close();
                        throw th;
                    }
                } else {
                    if (i2 != 256 && i2 != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i2);
                    }
                    l78 l78Var2 = (l78) obj2;
                    Bitmap bitmapA = f3m.a(l78Var2);
                    l78Var2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i3);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (ls9Var != null) {
                    ls9Var.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e3) {
                unsupportedOperationException = e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.qg6
    public rg6[] u(pg6[] pg6VarArr, ko0 ko0Var) {
        rg6[] rg6VarArr = new rg6[pg6VarArr.length];
        for (int i2 = 0; i2 < pg6VarArr.length; i2++) {
            pg6 pg6Var = pg6VarArr[i2];
            rg6VarArr[i2] = pg6Var == null ? null : new ds5(0, pg6Var.a, pg6Var.b);
        }
        return rg6VarArr;
    }

    public List x() {
        return xw3.P0(new rbi("centers1Radius", 1), new rbi("centers2Radius", 1), new rbi("circle1Radius", 1), new rbi("circle2Radius", 1), new rbi("circle3Radius", 1), new rbi("alpha1", 1), new rbi("alpha2", 1), new rbi("alpha3", 1), new rbi("centers1Angle", 1), new rbi("centers2Angle", 1), new rbi("blur1", 1), new rbi("blur2", 1), new rbi("blur3", 1), new rbi("falloff", 1), new rbi("vignetteScale", 2), new rbi("c1", 3), new rbi("c2", 3), new rbi("c3", 3), new rbi("c4", 3), new rbi("c5", 3), new rbi("c6", 3), new rbi("c7", 3), new rbi("bgColor", 3));
    }
}
