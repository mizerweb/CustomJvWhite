package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Trace;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import one.video.upload.exceptions.UploadUrlExpiredException;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class tw5 implements d8h, vhi, sah {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public tw5(List list) {
        nmc nmcVar = new nmc((byte[]) list.get(0));
        int iH = nmcVar.H();
        int iH2 = nmcVar.H();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new ui(719, 575, 0, 719, 0, 575);
        this.e = new nw5(0, new int[]{0, -1, -16777216, -8421505}, m(), n());
        this.f = new sw5(iH, iH2);
    }

    public static final sd2 b(tw5 tw5Var, fh2 fh2Var) {
        for (re2 re2Var : fh2Var.a) {
            qh0 qh0Var = re2.a;
            if (!cqk.d(qh0Var, qh0Var)) {
                synchronized (qh6.a) {
                }
            }
        }
        return td2.a;
    }

    public static final int c(tw5 tw5Var) {
        int i2;
        ri2 ri2Var = (ri2) tw5Var.d;
        if (ri2Var != null) {
            jj0 jj0Var = ri2Var.g;
            if (jj0Var != null) {
                je2 je2Var = (je2) jj0Var.e;
                synchronized (je2Var.b) {
                    i2 = je2Var.e;
                }
                return i2;
            }
            ore.k("CameraX not initialized yet.");
        }
        return 0;
    }

    public static final void d(tw5 tw5Var, int i2) {
        dh2 dh2Var;
        ri2 ri2Var = (ri2) tw5Var.d;
        if (ri2Var != null) {
            jj0 jj0Var = ri2Var.g;
            if (jj0Var == null) {
                ore.k("CameraX not initialized yet.");
                return;
            }
            je2 je2Var = (je2) jj0Var.e;
            synchronized (je2Var.b) {
                je2Var.e = i2;
                dh2Var = je2Var.c;
            }
            if (dh2Var == null) {
                return;
            }
            je2Var.f = i2 == 2;
            for (pf2 pf2Var : dh2Var.c()) {
                rf2 rf2Var = pf2Var instanceof rf2 ? (rf2) pf2Var : null;
                if (rf2Var != null) {
                    if (i2 == 1) {
                        kmi kmiVar = rf2Var.a;
                        synchronized (kmiVar.l) {
                            kmiVar.p = true;
                        }
                    } else if (i2 != 2) {
                        continue;
                    } else {
                        kmi kmiVar2 = rf2Var.a;
                        synchronized (kmiVar2.l) {
                            kmiVar2.p = false;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a9 A[Catch: all -> 0x00a6, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, blocks: (B:12:0x0072, B:14:0x0085, B:16:0x0091, B:18:0x0095, B:22:0x00a0, B:23:0x00a3, B:27:0x00a9), top: B:80:0x0072, outer: #0 }] */
    public static o09 f(tw5 tw5Var, g19 g19Var, fh2 fh2Var, ec1 ec1Var) {
        ja jaVarP;
        pf2 pf2VarC;
        o09 o09VarB;
        Collection<o09> collectionUnmodifiableCollection;
        ja jaVar;
        boolean zContains;
        ka kaVar;
        uvc uvcVar = uvc.d;
        cqk.f("CX:bindToLifecycle-internal");
        try {
            wxl.a();
            ylc ylcVar = new ylc(fh2Var, null);
            fh2 fh2Var2 = (fh2) ylcVar.a;
            fh2 fh2Var3 = (fh2) ylcVar.b;
            pf2 pf2VarC2 = fh2Var2.c(((ri2) tw5Var.d).a.c());
            pf2VarC2.q(true);
            ja jaVarP2 = tw5Var.p(fh2Var2);
            boolean z = false;
            if (fh2Var3 != null) {
                pf2VarC = fh2Var3.c(((ri2) tw5Var.d).a.c());
                pf2VarC.q(false);
                jaVarP = tw5Var.p(fh2Var3);
            } else {
                jaVarP = null;
                pf2VarC = null;
            }
            ff2 ff2VarA = ejl.a(jaVarP2.a.g(), jaVarP != null ? jaVarP.a.g() : null, ((sd2) jaVarP2.c).a);
            t09 t09Var = (t09) tw5Var.e;
            synchronized (t09Var.a) {
                try {
                    o09 o09Var = (o09) t09Var.b.get(new xh0(System.identityHashCode(g19Var), ff2VarA));
                    if (o09Var != null) {
                        mi2 mi2Var = o09Var.c;
                        if (mi2Var.a.a.m() || ((kaVar = mi2Var.b) != null && kaVar.a.m())) {
                            z = true;
                        }
                        if (z) {
                            t09Var.l(o09Var);
                            o09VarB = null;
                        } else {
                            o09VarB = o09Var;
                        }
                    } else {
                        o09VarB = o09Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            t09 t09Var2 = (t09) tw5Var.e;
            synchronized (t09Var2.a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(t09Var2.b.values());
            }
            for (cli cliVar : (List) ec1Var.h) {
                for (o09 o09Var2 : collectionUnmodifiableCollection) {
                    synchronized (o09Var2.a) {
                        jaVar = jaVarP;
                        zContains = ((ArrayList) o09Var2.c.y()).contains(cliVar);
                    }
                    if (zContains && !cqk.d(o09Var2.t(), g19Var)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{cliVar}, 1)));
                    }
                    jaVarP = jaVar;
                }
            }
            ja jaVar2 = jaVarP;
            if (o09VarB == null) {
                t09 t09Var3 = (t09) tw5Var.e;
                ljf ljfVar = ((ri2) tw5Var.d).k;
                if (ljfVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                o09VarB = t09Var3.b(g19Var, new mi2(pf2VarC2, pf2VarC, jaVarP2, jaVar2, uvcVar, uvcVar, (je2) ljfVar.c, (h6f) ljfVar.e, (fmi) ljfVar.d), (oue) ((ri2) tw5Var.d).o.getValue());
            }
            if (!((List) ec1Var.h).isEmpty()) {
                t09 t09Var4 = (t09) tw5Var.e;
                jj0 jj0Var = ((ri2) tw5Var.d).g;
                if (jj0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                t09Var4.a(o09VarB, ec1Var, (je2) jj0Var.e);
                ((HashSet) tw5Var.g).add(new xh0(System.identityHashCode(g19Var), ff2VarA));
            }
            Trace.endSection();
            return o09VarB;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static byte[] l(int i2, int i3, mo2 mo2Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) mo2Var.i(i3);
        }
        return bArr;
    }

    public static int[] m() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = q(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = q(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] n() {
        int[] iArr = new int[np0.n];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = q(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = q(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = q(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = q(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = q(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int q(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static final void t(wec wecVar) {
        ((zid) wecVar.f.getValue()).a(8L);
        int i2 = wecVar.g - 1;
        wecVar.g = i2;
        if (i2 == 0) {
            ((h4c) ((c2a) wecVar.d.e.getValue())).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void u(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        mo2 mo2Var = new mo2(bArr.length, bArr);
        int i13 = i3;
        int i14 = i4;
        byte[] bArrL = null;
        byte[] bArrL2 = null;
        byte[] bArrL3 = null;
        while (mo2Var.b() != 0) {
            int i15 = 8;
            int i16 = mo2Var.i(8);
            if (i16 != 240) {
                int i17 = 3;
                int i18 = 2;
                int i19 = 4;
                switch (i16) {
                    case 16:
                        if (i2 == 3) {
                            bArr2 = bArrL == null ? i : bArrL;
                        } else if (i2 == 2) {
                            bArr2 = bArrL3 == null ? h : bArrL3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int i20 = mo2Var.i(2);
                            if (i20 != 0) {
                                i5 = i20;
                                i6 = 1;
                            } else {
                                if (mo2Var.h()) {
                                    int i21 = mo2Var.i(3) + 3;
                                    i5 = mo2Var.i(2);
                                    i6 = i21;
                                } else {
                                    if (mo2Var.h()) {
                                        i6 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int i22 = mo2Var.i(2);
                                        if (i22 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (i22 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            i6 = 2;
                                        } else if (i22 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            i6 = mo2Var.i(4) + 12;
                                            i5 = mo2Var.i(2);
                                            z3 = z3;
                                        } else if (i22 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int i23 = mo2Var.i(8) + 29;
                                            i5 = mo2Var.i(2);
                                            z3 = z3;
                                            i6 = i23;
                                            c2 = 4;
                                        }
                                        i5 = 0;
                                        i6 = 0;
                                    }
                                    i5 = 0;
                                }
                                if (i6 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        i5 = bArr2[i5];
                                    }
                                    paint.setColor(iArr[i5]);
                                    canvas.drawRect(i13, i14, i13 + i6, i14 + 1, paint);
                                }
                                i13 += i6;
                                if (z3) {
                                    mo2Var.c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (i6 == 0) {
                            }
                            i13 += i6;
                            if (z3) {
                                mo2Var.c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i2 == 3 ? bArrL2 == null ? j : bArrL2 : null;
                        boolean z4 = false;
                        while (true) {
                            int i24 = mo2Var.i(i19);
                            if (i24 != 0) {
                                z = z4;
                                i9 = i24;
                                i7 = 1;
                            } else if (mo2Var.h()) {
                                if (mo2Var.h()) {
                                    int i25 = mo2Var.i(i18);
                                    if (i25 == 0) {
                                        z = z4;
                                        i7 = 1;
                                    } else if (i25 != 1) {
                                        if (i25 == i18) {
                                            i7 = mo2Var.i(i19) + 9;
                                            i8 = mo2Var.i(i19);
                                        } else if (i25 != i17) {
                                            z = z4;
                                            i7 = 0;
                                        } else {
                                            i7 = mo2Var.i(i15) + 25;
                                            i8 = mo2Var.i(i19);
                                        }
                                        i9 = i8;
                                    } else {
                                        z = z4;
                                        i7 = i18;
                                    }
                                    i9 = 0;
                                } else {
                                    i7 = mo2Var.i(i18) + 4;
                                    i9 = mo2Var.i(i19);
                                }
                                z = z4;
                            } else {
                                int i26 = mo2Var.i(i17);
                                if (i26 != 0) {
                                    i7 = i26 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    i7 = 0;
                                }
                                i9 = 0;
                            }
                            if (i7 == 0 || paint == 0) {
                                i10 = i17;
                                i11 = i18;
                            } else {
                                if (bArr3 != 0) {
                                    i9 = bArr3[i9];
                                }
                                paint.setColor(iArr[i9]);
                                i10 = i17;
                                i11 = 2;
                                canvas.drawRect(i13, i14, i13 + i7, i14 + 1, paint);
                            }
                            i13 += i7;
                            if (z) {
                                mo2Var.c();
                            } else {
                                z4 = z;
                                i17 = i10;
                                i18 = i11;
                                i19 = 4;
                                i15 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int i27 = mo2Var.i(8);
                            if (i27 != 0) {
                                z2 = z5;
                                i12 = 1;
                            } else if (mo2Var.h()) {
                                z2 = z5;
                                i12 = mo2Var.i(7);
                                i27 = mo2Var.i(8);
                            } else {
                                int i28 = mo2Var.i(7);
                                if (i28 != 0) {
                                    z2 = z5;
                                    i12 = i28;
                                    i27 = 0;
                                } else {
                                    z2 = true;
                                    i27 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i12 != 0 && paint != 0) {
                                paint.setColor(iArr[i27]);
                                canvas.drawRect(i13, i14, i13 + i12, i14 + 1, paint);
                            }
                            i13 += i12;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i16) {
                            case 32:
                                bArrL3 = l(4, 4, mo2Var);
                                break;
                            case 33:
                                bArrL = l(4, 8, mo2Var);
                                break;
                            case 34:
                                bArrL2 = l(16, 8, mo2Var);
                                break;
                        }
                        break;
                }
            } else {
                i14 += 2;
                i13 = i3;
            }
        }
    }

    public static nw5 v(mo2 mo2Var, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 8;
        int i9 = mo2Var.i(8);
        mo2Var.t(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int i12 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM = m();
        int[] iArrN = n();
        while (i11 > 0) {
            int i13 = mo2Var.i(i8);
            int i14 = mo2Var.i(i8);
            if ((i14 & np0.m) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i14 & 64) != 0 ? iArrM : iArrN;
            }
            if ((i14 & 1) != 0) {
                i6 = mo2Var.i(i8);
                i7 = mo2Var.i(i8);
                i3 = mo2Var.i(i8);
                i5 = mo2Var.i(i8);
                i4 = i11 - 6;
            } else {
                int i15 = mo2Var.i(6) << i10;
                int i16 = mo2Var.i(4) << 4;
                i3 = mo2Var.i(4) << 4;
                i4 = i11 - 4;
                i5 = mo2Var.i(i10) << 6;
                i6 = i15;
                i7 = i16;
            }
            if (i6 == 0) {
                i7 = i12;
                i3 = i7;
                i5 = 255;
            }
            double d = i6;
            double d2 = i7 - 128;
            double d3 = i3 - 128;
            iArr[i13] = q((byte) (255 - (i5 & 255)), vqi.j((int) ((1.402d * d2) + d), 0, 255), vqi.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), vqi.j((int) ((d3 * 1.772d) + d), 0, 255));
            i11 = i4;
            i12 = 0;
            i9 = i9;
            iArrN = iArrN;
            i8 = 8;
            i10 = 2;
        }
        return new nw5(i9, iArr2, iArrM, iArrN);
    }

    public static ow5 w(mo2 mo2Var) {
        byte[] bArr;
        int i2 = mo2Var.i(16);
        mo2Var.t(4);
        int i3 = mo2Var.i(2);
        boolean zH = mo2Var.h();
        mo2Var.t(1);
        byte[] bArr2 = vqi.b;
        if (i3 != 1) {
            if (i3 == 0) {
                int i4 = mo2Var.i(16);
                int i5 = mo2Var.i(16);
                if (i4 > 0) {
                    bArr2 = new byte[i4];
                    mo2Var.l(i4, bArr2);
                }
                if (i5 > 0) {
                    bArr = new byte[i5];
                    mo2Var.l(i5, bArr);
                }
            }
            return new ow5(i2, zH, bArr2, bArr);
        }
        mo2Var.t(mo2Var.i(8) * 16);
        bArr = bArr2;
        return new ow5(i2, zH, bArr2, bArr);
    }

    @Override // defpackage.d8h
    public int F() {
        return 2;
    }

    public void a() {
        Context context;
        vzf vzfVar = (vzf) this.c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.g;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f;
        if ((atomicBoolean2.get() && atomicBoolean.get()) || (context = (Context) ((WeakReference) this.a).get()) == null) {
            return;
        }
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
        if (!atomicBoolean2.get()) {
            activeRecordingConfigurations.getClass();
            Iterator<T> it = activeRecordingConfigurations.iterator();
            while (it.hasNext()) {
                if (((AudioRecordingConfiguration) it.next()).isClientSilenced() && atomicBoolean2.compareAndSet(false, true)) {
                    vzfVar.invoke(new d80("record", "run", "audio session is silenced"));
                }
            }
        }
        if (activeRecordingConfigurations.size() <= 1 || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        ArrayList arrayList = new ArrayList(yw3.W0(activeRecordingConfigurations, 10));
        Iterator<T> it2 = activeRecordingConfigurations.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((AudioRecordingConfiguration) it2.next()).getClientAudioSessionId()));
        }
        vzfVar.invoke(new d80("record", "run", "concurrent audio sessions: ".concat(ww3.z1(arrayList, ", ", null, null, null, 62))));
    }

    @Override // defpackage.vhi
    public void e(long j2) {
        ((wze) this.g).f(null);
    }

    @Override // defpackage.vhi
    public void g(iji ijiVar) {
        njd njdVar = (njd) this.c;
        njdVar.c(new ylc(null, ijiVar));
        wec.b((wec) this.a, ijiVar, (uhi) this.f);
        if (ijiVar.equals(hji.a) || (ijiVar instanceof gji)) {
            return;
        }
        if ((ijiVar instanceof eji) || ijiVar.equals(dji.a)) {
            njdVar.i(null);
            return;
        }
        if (!(ijiVar instanceof fji)) {
            ore.o();
            return;
        }
        Throwable httpUrlExpiredException = ((fji) ijiVar).a;
        if (httpUrlExpiredException instanceof UploadUrlExpiredException) {
            httpUrlExpiredException = new HttpUrlExpiredException(null, null, 7);
        }
        njdVar.i(httpUrlExpiredException);
    }

    @Override // defpackage.sah
    public Object get() {
        String str = (String) this.a;
        Size size = (Size) this.d;
        ih0 ih0Var = (ih0) this.e;
        LinkedHashMap linkedHashMap = qui.a;
        n4j n4jVar = (n4j) this.c;
        kl2 kl2VarB = qui.b(n4jVar, (Range) this.g);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i2 = kl2VarB.a;
        sb.append(i2);
        sb.append("fps. Encode frame rate = ");
        int i3 = kl2VarB.b;
        sb.append(i3);
        sb.append("fps.");
        tvj.a("VidEncVdPrflRslvr", sb.toString());
        int iD = n4jVar.b;
        if (iD == 0) {
            tvj.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
            iD = qui.d(ih0Var.c, ((fx5) this.f).b, ih0Var.h, kl2VarB.b, ih0Var.d, size.getWidth(), ih0Var.e, size.getHeight(), ih0Var.f);
        }
        int i4 = ih0Var.g;
        lj0 lj0VarA = qui.a(i4, str);
        jj0 jj0VarD = kj0.d();
        jj0VarD.a = str;
        msh mshVar = (msh) this.b;
        if (mshVar == null) {
            ore.n("Null inputTimebase");
            return null;
        }
        jj0VarD.h = mshVar;
        if (size == null) {
            ore.n("Null resolution");
            return null;
        }
        jj0VarD.i = size;
        jj0VarD.g = Integer.valueOf(iD);
        jj0VarD.d = Integer.valueOf(i2);
        jj0VarD.e = Integer.valueOf(i3);
        jj0VarD.b = Integer.valueOf(i4);
        jj0VarD.j = lj0VarA;
        return jj0VarD.a();
    }

    public qg0 i() {
        String strConcat = ((String) this.a) == null ? " mimeType" : "";
        if (((msh) this.c) == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" captureSampleRate");
        }
        if (((Integer) this.f) == null) {
            strConcat = strConcat.concat(" encodeSampleRate");
        }
        if (((Integer) this.g) == null) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (!strConcat.isEmpty()) {
            ore.k("Missing required properties:".concat(strConcat));
            return null;
        }
        String str = (String) this.a;
        int iIntValue = ((Integer) this.b).intValue();
        qg0 qg0Var = new qg0(str, iIntValue, (msh) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue(), ((Integer) this.g).intValue());
        if (!Objects.equals(str, "audio/mp4a-latm") || iIntValue != -1) {
            return qg0Var;
        }
        ore.p("Encoder mime set to AAC, but no AAC profile was provided.");
        return null;
    }

    public yi0 j() {
        String strConcat = ((Size) this.a) == null ? " resolution" : "";
        if (((Size) this.b) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((fx5) this.c) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.e) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.g) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new yi0((Size) this.a, (Size) this.b, (fx5) this.c, ((Integer) this.d).intValue(), (Range) this.e, (t94) this.f, ((Boolean) this.g).booleanValue());
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0310  */
    /* JADX WARN: Code duplicated, block: B:108:0x0316  */
    /* JADX WARN: Code duplicated, block: B:110:0x0319  */
    /* JADX WARN: Code duplicated, block: B:111:0x031c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0340  */
    /* JADX WARN: Code duplicated, block: B:117:0x036c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0371  */
    /* JADX WARN: Code duplicated, block: B:120:0x0379  */
    /* JADX WARN: Code duplicated, block: B:122:0x037c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0383  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0270  */
    /* JADX WARN: Code duplicated, block: B:94:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f3  */
    @Override // defpackage.d8h
    public void k(byte[] bArr, int i2, int i3, c8h c8hVar, qg4 qg4Var) {
        int i4;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i5;
        bz4 bz4Var;
        qw5 qw5Var;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        nw5 nw5Var;
        SparseArray sparseArray2;
        int i12;
        qw5 qw5Var2;
        int i13;
        int i14;
        char c;
        char c2;
        int i15;
        int i16;
        char c3;
        int i17;
        int iKeyAt;
        rw5 rw5Var;
        ow5 ow5Var;
        ow5 ow5Var2;
        qw5 qw5Var3;
        int i18;
        int i19;
        int i20;
        Paint paint;
        int i21;
        int[] iArr;
        qw5 qw5Var4;
        int i22;
        int i23;
        int i24;
        int i25;
        mo2 mo2Var = new mo2(i2 + i3, bArr);
        mo2Var.q(i2);
        Paint paint2 = (Paint) this.b;
        Canvas canvas = (Canvas) this.c;
        sw5 sw5Var = (sw5) this.f;
        while (mo2Var.b() >= 48 && mo2Var.i(8) == 15) {
            int i26 = mo2Var.i(8);
            int i27 = 16;
            int i28 = mo2Var.i(16);
            int i29 = mo2Var.i(16);
            int iF = mo2Var.f() + i29;
            if (i29 * 8 > mo2Var.b()) {
                lvb.G0("DvbParser", "Data field length exceeds limit");
                mo2Var.t(mo2Var.b());
            } else {
                int i30 = 4;
                switch (i26) {
                    case 16:
                        if (i28 == sw5Var.a) {
                            jrc jrcVar = sw5Var.i;
                            int i31 = 8;
                            mo2Var.i(8);
                            int i32 = mo2Var.i(4);
                            int i33 = mo2Var.i(2);
                            mo2Var.t(2);
                            int i34 = i29 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i34 > 0) {
                                int i35 = mo2Var.i(i31);
                                mo2Var.t(i31);
                                i34 -= 6;
                                sparseArray3.put(i35, new pw5(mo2Var.i(16), mo2Var.i(16)));
                                i31 = 8;
                            }
                            jrc jrcVar2 = new jrc(i32, i33, sparseArray3);
                            if (i33 != 0) {
                                sw5Var.i = jrcVar2;
                                sw5Var.c.clear();
                                sw5Var.d.clear();
                                sw5Var.e.clear();
                            } else if (jrcVar != null && jrcVar.b != i32) {
                                sw5Var.i = jrcVar2;
                            }
                        }
                        break;
                    case 17:
                        jrc jrcVar3 = sw5Var.i;
                        SparseArray sparseArray4 = sw5Var.c;
                        if (i28 == sw5Var.a && jrcVar3 != null) {
                            int i36 = mo2Var.i(8);
                            mo2Var.t(4);
                            boolean zH = mo2Var.h();
                            mo2Var.t(3);
                            int i37 = mo2Var.i(16);
                            int i38 = mo2Var.i(16);
                            mo2Var.i(3);
                            int i39 = mo2Var.i(3);
                            mo2Var.t(2);
                            int i40 = mo2Var.i(8);
                            int i41 = mo2Var.i(8);
                            int i42 = mo2Var.i(4);
                            int i43 = mo2Var.i(2);
                            mo2Var.t(2);
                            int i44 = i29 - 10;
                            SparseArray sparseArray5 = new SparseArray();
                            while (i44 > 0) {
                                int i45 = mo2Var.i(i27);
                                int i46 = mo2Var.i(2);
                                mo2Var.i(2);
                                int i47 = mo2Var.i(12);
                                mo2Var.t(i30);
                                int i48 = mo2Var.i(12);
                                int i49 = i44 - 6;
                                if (i46 == 1 || i46 == 2) {
                                    mo2Var.i(8);
                                    mo2Var.i(8);
                                    i44 -= 8;
                                } else {
                                    i44 = i49;
                                }
                                sparseArray5.put(i45, new rw5(i47, i48));
                                i30 = 4;
                                i27 = 16;
                            }
                            qw5 qw5Var5 = new qw5(i36, zH, i37, i38, i39, i40, i41, i42, i43, sparseArray5);
                            if (jrcVar3.c == 0 && (qw5Var4 = (qw5) sparseArray4.get(i36)) != null) {
                                SparseArray sparseArray6 = qw5Var4.j;
                                for (int i50 = 0; i50 < sparseArray6.size(); i50++) {
                                    qw5Var5.j.put(sparseArray6.keyAt(i50), (rw5) sparseArray6.valueAt(i50));
                                }
                            }
                            sparseArray4.put(qw5Var5.a, qw5Var5);
                        }
                        break;
                    case 18:
                        if (i28 == sw5Var.a) {
                            nw5 nw5VarV = v(mo2Var, i29);
                            sw5Var.d.put(nw5VarV.a, nw5VarV);
                        } else if (i28 == sw5Var.b) {
                            nw5 nw5VarV2 = v(mo2Var, i29);
                            sw5Var.f.put(nw5VarV2.a, nw5VarV2);
                        }
                        break;
                    case 19:
                        if (i28 == sw5Var.a) {
                            ow5 ow5VarW = w(mo2Var);
                            sw5Var.e.put(ow5VarW.a, ow5VarW);
                        } else if (i28 == sw5Var.b) {
                            ow5 ow5VarW2 = w(mo2Var);
                            sw5Var.g.put(ow5VarW2.a, ow5VarW2);
                        }
                        break;
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        if (i28 == sw5Var.a) {
                            mo2Var.t(4);
                            boolean zH2 = mo2Var.h();
                            mo2Var.t(3);
                            int i51 = mo2Var.i(16);
                            int i52 = mo2Var.i(16);
                            if (zH2) {
                                int i53 = mo2Var.i(16);
                                i22 = mo2Var.i(16);
                                i25 = mo2Var.i(16);
                                i23 = mo2Var.i(16);
                                i24 = i53;
                            } else {
                                i22 = i51;
                                i23 = i52;
                                i24 = 0;
                                i25 = 0;
                            }
                            sw5Var.h = new ui(i51, i52, i24, i22, i25, i23);
                        }
                        break;
                }
                mo2Var.u(iF - mo2Var.f());
            }
        }
        jrc jrcVar4 = sw5Var.i;
        if (jrcVar4 == null) {
            a98 a98Var = c98.b;
            bz4Var = new bz4(-9223372036854775807L, -9223372036854775807L, ghe.e);
        } else {
            ui uiVar = sw5Var.h;
            if (uiVar == null) {
                uiVar = (ui) this.d;
            }
            Bitmap bitmap = (Bitmap) this.g;
            if (bitmap != null) {
                i4 = 1;
                if (uiVar.a + 1 != bitmap.getWidth() || uiVar.b + 1 != ((Bitmap) this.g).getHeight()) {
                }
                arrayList = new ArrayList();
                sparseArray = (SparseArray) jrcVar4.d;
                i5 = 0;
                while (i5 < sparseArray.size()) {
                    canvas.save();
                    pw5 pw5Var = (pw5) sparseArray.valueAt(i5);
                    qw5Var = (qw5) sw5Var.c.get(sparseArray.keyAt(i5));
                    i6 = pw5Var.a + uiVar.c;
                    i7 = pw5Var.b + uiVar.e;
                    i8 = qw5Var.c;
                    int i54 = qw5Var.f;
                    i9 = qw5Var.d;
                    i10 = i6 + i8;
                    i11 = i7 + i9;
                    SparseArray sparseArray7 = sparseArray;
                    canvas.clipRect(i6, i7, Math.min(i10, uiVar.d), Math.min(i11, uiVar.f));
                    nw5Var = (nw5) sw5Var.d.get(i54);
                    if (nw5Var == null && (nw5Var = (nw5) sw5Var.f.get(i54)) == null) {
                        nw5Var = (nw5) this.e;
                    }
                    sparseArray2 = qw5Var.j;
                    ui uiVar2 = uiVar;
                    i12 = 0;
                    while (i12 < sparseArray2.size()) {
                        iKeyAt = sparseArray2.keyAt(i12);
                        int i55 = i5;
                        rw5Var = (rw5) sparseArray2.valueAt(i12);
                        SparseArray sparseArray8 = sparseArray2;
                        ow5Var = (ow5) sw5Var.e.get(iKeyAt);
                        if (ow5Var == null) {
                            ow5Var = (ow5) sw5Var.g.get(iKeyAt);
                        }
                        ow5Var2 = ow5Var;
                        if (ow5Var2 != null) {
                            if (ow5Var2.b) {
                                paint = null;
                            } else {
                                paint = (Paint) this.a;
                            }
                            int i56 = i6;
                            i21 = qw5Var.e;
                            int i57 = i56 + rw5Var.a;
                            int i58 = rw5Var.b + i7;
                            if (i21 == 3) {
                                iArr = nw5Var.d;
                            } else if (i21 == 2) {
                                iArr = nw5Var.c;
                            } else {
                                iArr = nw5Var.b;
                            }
                            int i59 = i9;
                            Paint paint3 = paint;
                            qw5 qw5Var6 = qw5Var;
                            int[] iArr2 = iArr;
                            qw5Var3 = qw5Var6;
                            i18 = i56;
                            i19 = i12;
                            i20 = i59;
                            u(ow5Var2.c, iArr2, i21, i57, i58, paint3, canvas);
                            u(ow5Var2.d, iArr2, i21, i57, i58 + 1, paint3, canvas);
                        } else {
                            qw5Var3 = qw5Var;
                            i18 = i6;
                            i19 = i12;
                            i20 = i9;
                        }
                        i12 = i19 + 1;
                        qw5Var = qw5Var3;
                        i6 = i18;
                        sparseArray2 = sparseArray8;
                        i5 = i55;
                        sw5Var = sw5Var;
                        i8 = i8;
                        i9 = i20;
                    }
                    sw5 sw5Var2 = sw5Var;
                    int i60 = i5;
                    qw5Var2 = qw5Var;
                    i13 = i6;
                    int i61 = i8;
                    int i62 = i9;
                    if (qw5Var2.b) {
                        i16 = qw5Var2.e;
                        if (i16 == 3) {
                            i17 = nw5Var.d[qw5Var2.g];
                            c3 = 2;
                        } else {
                            c3 = 2;
                            if (i16 == 2) {
                                i17 = nw5Var.c[qw5Var2.h];
                            } else {
                                i17 = nw5Var.b[qw5Var2.i];
                            }
                        }
                        paint2.setColor(i17);
                        i14 = i13;
                        c2 = c3;
                        i15 = 0;
                        c = 3;
                        canvas.drawRect(i14, i7, i10, i11, paint2);
                    } else {
                        i14 = i13;
                        c = 3;
                        c2 = 2;
                        i15 = 0;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((Bitmap) this.g, i14, i7, i61, i62);
                    float f = uiVar2.a;
                    float f2 = i7;
                    float f3 = uiVar2.b;
                    arrayList.add(new yy4(null, null, null, bitmapCreateBitmap, f2 / f3, 0, 0, i14 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i61 / f, i62 / f3, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                    canvas.drawColor(i15, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    i5 = i60 + 1;
                    uiVar = uiVar2;
                    arrayList = arrayList;
                    sparseArray = sparseArray7;
                    sw5Var = sw5Var2;
                }
                bz4Var = new bz4(-9223372036854775807L, -9223372036854775807L, arrayList);
            } else {
                i4 = 1;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(uiVar.a + i4, uiVar.b + i4, Bitmap.Config.ARGB_8888);
            this.g = bitmapCreateBitmap2;
            canvas.setBitmap(bitmapCreateBitmap2);
            arrayList = new ArrayList();
            sparseArray = (SparseArray) jrcVar4.d;
            i5 = 0;
            while (i5 < sparseArray.size()) {
                canvas.save();
                pw5 pw5Var2 = (pw5) sparseArray.valueAt(i5);
                qw5Var = (qw5) sw5Var.c.get(sparseArray.keyAt(i5));
                i6 = pw5Var2.a + uiVar.c;
                i7 = pw5Var2.b + uiVar.e;
                i8 = qw5Var.c;
                int i510 = qw5Var.f;
                i9 = qw5Var.d;
                i10 = i6 + i8;
                i11 = i7 + i9;
                SparseArray sparseArray9 = sparseArray;
                canvas.clipRect(i6, i7, Math.min(i10, uiVar.d), Math.min(i11, uiVar.f));
                nw5Var = (nw5) sw5Var.d.get(i510);
                if (nw5Var == null) {
                    nw5Var = (nw5) this.e;
                }
                sparseArray2 = qw5Var.j;
                ui uiVar3 = uiVar;
                i12 = 0;
                while (i12 < sparseArray2.size()) {
                    iKeyAt = sparseArray2.keyAt(i12);
                    int i511 = i5;
                    rw5Var = (rw5) sparseArray2.valueAt(i12);
                    SparseArray sparseArray10 = sparseArray2;
                    ow5Var = (ow5) sw5Var.e.get(iKeyAt);
                    if (ow5Var == null) {
                        ow5Var = (ow5) sw5Var.g.get(iKeyAt);
                    }
                    ow5Var2 = ow5Var;
                    if (ow5Var2 != null) {
                        if (ow5Var2.b) {
                            paint = null;
                        } else {
                            paint = (Paint) this.a;
                        }
                        int i512 = i6;
                        i21 = qw5Var.e;
                        int i513 = i512 + rw5Var.a;
                        int i514 = rw5Var.b + i7;
                        if (i21 == 3) {
                            iArr = nw5Var.d;
                        } else if (i21 == 2) {
                            iArr = nw5Var.c;
                        } else {
                            iArr = nw5Var.b;
                        }
                        int i515 = i9;
                        Paint paint4 = paint;
                        qw5 qw5Var7 = qw5Var;
                        int[] iArr3 = iArr;
                        qw5Var3 = qw5Var7;
                        i18 = i512;
                        i19 = i12;
                        i20 = i515;
                        u(ow5Var2.c, iArr3, i21, i513, i514, paint4, canvas);
                        u(ow5Var2.d, iArr3, i21, i513, i514 + 1, paint4, canvas);
                    } else {
                        qw5Var3 = qw5Var;
                        i18 = i6;
                        i19 = i12;
                        i20 = i9;
                    }
                    i12 = i19 + 1;
                    qw5Var = qw5Var3;
                    i6 = i18;
                    sparseArray2 = sparseArray10;
                    i5 = i511;
                    sw5Var = sw5Var;
                    i8 = i8;
                    i9 = i20;
                }
                sw5 sw5Var3 = sw5Var;
                int i63 = i5;
                qw5Var2 = qw5Var;
                i13 = i6;
                int i64 = i8;
                int i65 = i9;
                if (qw5Var2.b) {
                    i16 = qw5Var2.e;
                    if (i16 == 3) {
                        i17 = nw5Var.d[qw5Var2.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        if (i16 == 2) {
                            i17 = nw5Var.c[qw5Var2.h];
                        } else {
                            i17 = nw5Var.b[qw5Var2.i];
                        }
                    }
                    paint2.setColor(i17);
                    i14 = i13;
                    c2 = c3;
                    i15 = 0;
                    c = 3;
                    canvas.drawRect(i14, i7, i10, i11, paint2);
                } else {
                    i14 = i13;
                    c = 3;
                    c2 = 2;
                    i15 = 0;
                }
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap((Bitmap) this.g, i14, i7, i64, i65);
                float f4 = uiVar3.a;
                float f5 = i7;
                float f6 = uiVar3.b;
                arrayList.add(new yy4(null, null, null, bitmapCreateBitmap3, f5 / f6, 0, 0, i14 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i64 / f4, i65 / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(i15, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i5 = i63 + 1;
                uiVar = uiVar3;
                arrayList = arrayList;
                sparseArray = sparseArray9;
                sw5Var = sw5Var3;
            }
            bz4Var = new bz4(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        qg4Var.accept(bz4Var);
    }

    public l81 o(String str) {
        y95 y95Var = (y95) this.e;
        if (y95Var != null) {
            try {
                rp5 rp5VarD = y95Var.d(str);
                if (rp5VarD != null) {
                    return new l81(rp5VarD);
                }
            } catch (Exception e) {
                Log.e("DiskCache", "Failed to read download index.", e);
                return null;
            }
        }
        return null;
    }

    public ja p(fh2 fh2Var) {
        Object jaVar;
        cqk.f("CX:getCameraInfo");
        try {
            nf2 nf2VarJ = fh2Var.c(((ri2) this.d).a.c()).j();
            sd2 sd2VarB = b(this, fh2Var);
            ff2 ff2VarA = ejl.a(nf2VarJ.g(), null, sd2VarB.a);
            synchronized (this.a) {
                jaVar = ((HashMap) this.f).get(ff2VarA);
                if (jaVar == null) {
                    jaVar = new ja(nf2VarJ, sd2VarB);
                    ((HashMap) this.f).put(ff2VarA, jaVar);
                }
            }
            ja jaVar2 = (ja) jaVar;
            Trace.endSection();
            return jaVar2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public j71 r(s25 s25Var, boolean z, ym5 ym5Var) {
        i1m i1mVar;
        j71 j71Var = new j71();
        j6g j6gVar = (j6g) this.d;
        j71Var.a = j6gVar;
        j71Var.d = (o75) this.f;
        if (s25Var == null) {
            s25Var = (s25) ((q36) this.a).c;
        }
        j71Var.f = s25Var;
        j71Var.g = 2;
        if (z) {
            i1mVar = null;
        } else {
            i1mVar = new i1m();
            i1mVar.a = j6gVar;
        }
        j71Var.f(i1mVar);
        return j71Var;
    }

    @Override // defpackage.d8h
    public void reset() {
        sw5 sw5Var = (sw5) this.f;
        sw5Var.c.clear();
        sw5Var.d.clear();
        sw5Var.e.clear();
        sw5Var.f.clear();
        sw5Var.g.clear();
        sw5Var.h = null;
        sw5Var.i = null;
    }

    public void s(ri2 ri2Var, Context context) {
        yg2 yg2Var;
        synchronized (this.a) {
            this.d = ri2Var;
            if (ri2Var != null && (yg2Var = ri2Var.n) != null) {
                us7 us7VarD = zjl.d();
                yg2Var.n.add(new wg2(this, us7VarD));
                us7VarD.execute(new tg2(yg2Var, this));
            }
        }
    }

    public void x(rp5 rp5Var) {
        y95 y95Var = (y95) this.e;
        if (y95Var == null) {
            return;
        }
        synchronized (this.g) {
            try {
                y95Var.i(rp5Var);
            } catch (Exception e) {
                Log.e("DiskCache", "Failed to update index.", e);
            }
        }
    }

    public void y() {
        cqk.f("CX:unbindAll");
        try {
            wxl.a();
            d(this, 0);
            ((t09) this.e).k((HashSet) this.g);
        } finally {
            Trace.endSection();
        }
    }

    public tw5(q36 q36Var, r95 r95Var, ez8 ez8Var) {
        this.a = q36Var;
        this.b = r95Var;
        this.c = ez8Var;
        ConcurrentHashMap concurrentHashMap = k6g.a;
        this.d = k6g.a((File) q36Var.b, ez8Var, r95Var);
        this.e = null;
        this.f = new o75(this);
        this.g = new Object();
    }

    public /* synthetic */ tw5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }
}
