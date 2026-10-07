package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.view.View;
import java.io.File;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class zi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedFileDrawable b;

    public /* synthetic */ zi(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.a = i;
        this.b = animatedFileDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01e9 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0212 A[Catch: all -> 0x00ad, TRY_ENTER, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0218 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0220 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0224 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bb A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:37:0x008e, B:39:0x0094, B:41:0x0098, B:44:0x00a2, B:47:0x00b0, B:48:0x00bc, B:50:0x00c2, B:51:0x00ca, B:53:0x00e8, B:55:0x00f0, B:57:0x00fd, B:60:0x0102, B:62:0x010a, B:63:0x010c, B:65:0x0139, B:68:0x0144, B:69:0x014b, B:70:0x0152, B:72:0x0158, B:74:0x0160, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:82:0x0178, B:92:0x01aa, B:93:0x01b3, B:95:0x01bb, B:96:0x01cc, B:99:0x01d2, B:103:0x01e2, B:104:0x01e3, B:106:0x01e9, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:115:0x0226, B:97:0x01cd, B:98:0x01d1, B:84:0x017c, B:87:0x0186, B:90:0x0193), top: B:192:0x008e, inners: #0, #1 }] */
    @Override // java.lang.Runnable
    public final void run() {
        AnimatedFileDrawable animatedFileDrawable;
        int videoFrame;
        AnimatedFileDrawable animatedFileDrawable2;
        int i;
        AnimatedFileDrawable animatedFileDrawable3;
        File file;
        boolean z;
        boolean z2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                AnimatedFileDrawable.a(this.b);
                AnimatedFileDrawable animatedFileDrawable4 = this.b;
                animatedFileDrawable4.e = null;
                if (animatedFileDrawable4.u >= 0 && this.b.t == -1) {
                    this.b.u = -1L;
                    this.b.c = 0;
                }
                this.b.e();
                this.b.invalidateInternal();
                return;
            case 1:
                if (this.b.Z) {
                    return;
                }
                AnimatedFileDrawable animatedFileDrawable5 = this.b;
                if (animatedFileDrawable5.l || animatedFileDrawable5.H1 || animatedFileDrawable5.I1 != null) {
                    return;
                }
                animatedFileDrawable5.p1 = System.currentTimeMillis();
                if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                    RLottieDrawable.createCacheGenQueue();
                }
                AnimatedFileDrawable animatedFileDrawable6 = this.b;
                animatedFileDrawable6.H1 = true;
                animatedFileDrawable6.e = null;
                uy0.B++;
                nn5 nn5Var = RLottieDrawable.lottieCacheGenerateQueue;
                aj ajVar = new aj(this, 0);
                animatedFileDrawable6.I1 = ajVar;
                nn5Var.b(ajVar);
                return;
            case 2:
                AnimatedFileDrawable.a(this.b);
                AnimatedFileDrawable animatedFileDrawable7 = this.b;
                if (animatedFileDrawable7.p) {
                    animatedFileDrawable7.p = false;
                } else {
                    animatedFileDrawable7.o = true;
                }
                animatedFileDrawable7.e = null;
                long j = animatedFileDrawable7.u;
                AnimatedFileDrawable animatedFileDrawable8 = this.b;
                Bitmap bitmap = animatedFileDrawable8.j;
                if (j >= 0) {
                    animatedFileDrawable8.h = bitmap;
                    animatedFileDrawable8.i = animatedFileDrawable8.k;
                    int i3 = 0;
                    while (true) {
                        AnimatedFileDrawable animatedFileDrawable9 = this.b;
                        BitmapShader[] bitmapShaderArr = animatedFileDrawable9.D;
                        if (i3 < bitmapShaderArr.length) {
                            animatedFileDrawable9.B[i3] = bitmapShaderArr[i3];
                            animatedFileDrawable9.C[i3] = null;
                            i3++;
                        }
                    }
                } else {
                    animatedFileDrawable8.h = bitmap;
                    animatedFileDrawable8.i = animatedFileDrawable8.k;
                    int i4 = 0;
                    while (true) {
                        AnimatedFileDrawable animatedFileDrawable10 = this.b;
                        BitmapShader[] bitmapShaderArr2 = animatedFileDrawable10.D;
                        if (i4 < bitmapShaderArr2.length) {
                            animatedFileDrawable10.B[i4] = bitmapShaderArr2[i4];
                            i4++;
                        }
                    }
                }
                this.b.j = null;
                int i5 = 0;
                while (true) {
                    AnimatedFileDrawable animatedFileDrawable11 = this.b;
                    BitmapShader[] bitmapShaderArr3 = animatedFileDrawable11.D;
                    if (i5 >= bitmapShaderArr3.length) {
                        if (animatedFileDrawable11.v) {
                            animatedFileDrawable11.v = false;
                            animatedFileDrawable11.repeatCount++;
                            animatedFileDrawable11.start();
                        }
                        AnimatedFileDrawable animatedFileDrawable12 = this.b;
                        int i6 = animatedFileDrawable12.d[3];
                        if (i6 < animatedFileDrawable12.b) {
                            float f = animatedFileDrawable12.p1;
                            animatedFileDrawable12.b = f > 0.0f ? (int) (f * 1000.0f) : 0;
                        }
                        int i7 = i6 - animatedFileDrawable12.b;
                        if (i7 != 0) {
                            animatedFileDrawable12.c = i7;
                            if (animatedFileDrawable12.D1 && i7 < 32) {
                                animatedFileDrawable12.c = 32;
                            }
                        }
                        if (animatedFileDrawable12.u >= 0 && this.b.t == -1) {
                            this.b.u = -1L;
                            this.b.c = 0;
                        }
                        AnimatedFileDrawable animatedFileDrawable13 = this.b;
                        animatedFileDrawable13.b = animatedFileDrawable13.d[3];
                        if (!animatedFileDrawable13.z1.isEmpty()) {
                            int size = this.b.z1.size();
                            while (i2 < size) {
                                ((View) this.b.z1.get(i2)).invalidate();
                                i2++;
                            }
                        }
                        this.b.invalidateInternal();
                        this.b.e();
                        return;
                    }
                    bitmapShaderArr3[i5] = null;
                    i5++;
                }
                break;
            default:
                if (!this.b.Z) {
                    AnimatedFileDrawable animatedFileDrawable14 = this.b;
                    if (!animatedFileDrawable14.m && animatedFileDrawable14.nativePtr == 0 && (file = (animatedFileDrawable3 = this.b).q) != null) {
                        animatedFileDrawable3.nativePtr = AnimatedFileDrawable.createDecoder(file.getAbsolutePath(), this.b.d);
                        AnimatedFileDrawable animatedFileDrawable15 = this.b;
                        if (animatedFileDrawable15.nativePtr == 0) {
                            AnimatedFileDrawable animatedFileDrawable16 = this.b;
                            if (!animatedFileDrawable16.isWebmSticker || animatedFileDrawable16.L1 > 15) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        animatedFileDrawable15.n1 = z;
                        if (this.b.nativePtr != 0) {
                            AnimatedFileDrawable animatedFileDrawable17 = this.b;
                            int[] iArr = animatedFileDrawable17.d;
                            if (iArr[0] > 3840 || iArr[1] > 3840) {
                                AnimatedFileDrawable.destroyDecoder(animatedFileDrawable17.nativePtr);
                                this.b.nativePtr = 0L;
                            }
                        }
                        this.b.g();
                        AnimatedFileDrawable animatedFileDrawable18 = this.b;
                        if (animatedFileDrawable18.isWebmSticker && animatedFileDrawable18.nativePtr == 0) {
                            AnimatedFileDrawable animatedFileDrawable19 = this.b;
                            int i8 = animatedFileDrawable19.L1;
                            animatedFileDrawable19.L1 = i8 + 1;
                            if (i8 > 15) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = true;
                        }
                        animatedFileDrawable18.m = z2;
                    }
                    try {
                        AnimatedFileDrawable animatedFileDrawable20 = this.b;
                        if (animatedFileDrawable20.E1 != null) {
                            if (animatedFileDrawable20.j == null) {
                                boolean zIsEmpty = animatedFileDrawable20.E.isEmpty();
                                AnimatedFileDrawable animatedFileDrawable21 = this.b;
                                if (zIsEmpty) {
                                    animatedFileDrawable21.j = Bitmap.createBitmap(animatedFileDrawable21.s1, animatedFileDrawable21.r1, Bitmap.Config.ARGB_8888);
                                } else {
                                    animatedFileDrawable21.j = (Bitmap) animatedFileDrawable21.E.remove(0);
                                }
                            }
                            AnimatedFileDrawable animatedFileDrawable22 = this.b;
                            if (animatedFileDrawable22.F1 == null) {
                                animatedFileDrawable22.F1 = new ww6(5);
                            }
                            animatedFileDrawable22.y = System.currentTimeMillis();
                            AnimatedFileDrawable animatedFileDrawable23 = this.b;
                            ww6 ww6Var = animatedFileDrawable23.F1;
                            int i9 = ww6Var.b;
                            uy0 uy0Var = animatedFileDrawable23.E1;
                            int iF = uy0Var.f(animatedFileDrawable23.j, uy0Var.i);
                            ww6Var.b = uy0Var.i;
                            if (uy0Var.s && !uy0Var.e.isEmpty()) {
                                int i10 = uy0Var.i + 1;
                                uy0Var.i = i10;
                                if (i10 >= uy0Var.e.size()) {
                                    uy0Var.i = 0;
                                }
                            }
                            if (iF != -1) {
                                AnimatedFileDrawable animatedFileDrawable24 = this.b;
                                if (animatedFileDrawable24.F1.b < i9) {
                                    animatedFileDrawable24.v = true;
                                }
                            }
                            AnimatedFileDrawable animatedFileDrawable25 = this.b;
                            int[] iArr2 = animatedFileDrawable25.d;
                            int iMax = animatedFileDrawable25.F1.b * Math.max(16, iArr2[4] / Math.max(1, animatedFileDrawable25.E1.e.size()));
                            animatedFileDrawable25.k = iMax;
                            iArr2[3] = iMax;
                            if (this.b.E1.g()) {
                                di.d(this.b.J1);
                            }
                            AnimatedFileDrawable animatedFileDrawable26 = this.b;
                            if (iF == -1) {
                                di.d(animatedFileDrawable26.G1);
                                return;
                            } else {
                                di.d(animatedFileDrawable26.K1);
                                return;
                            }
                        }
                        if (animatedFileDrawable20.nativePtr == 0) {
                            AnimatedFileDrawable animatedFileDrawable27 = this.b;
                            int[] iArr3 = animatedFileDrawable27.d;
                            if (iArr3[0] != 0 && iArr3[1] != 0) {
                                di.d(animatedFileDrawable27.G1);
                                return;
                            }
                        }
                        AnimatedFileDrawable animatedFileDrawable28 = this.b;
                        if (animatedFileDrawable28.j == null) {
                            int[] iArr4 = animatedFileDrawable28.d;
                            if (iArr4[0] <= 0 || iArr4[1] <= 0) {
                                if (this.b.t >= 0) {
                                    AnimatedFileDrawable animatedFileDrawable29 = this.b;
                                    animatedFileDrawable29.d[3] = (int) animatedFileDrawable29.t;
                                    long j2 = this.b.t;
                                    synchronized (this.b.w) {
                                        this.b.t = -1L;
                                        break;
                                    }
                                    AnimatedFileDrawable.seekToMs(this.b.nativePtr, j2, this.b.d, true);
                                    i2 = 1;
                                }
                                animatedFileDrawable = this.b;
                                if (animatedFileDrawable.j != null) {
                                    animatedFileDrawable.y = System.currentTimeMillis();
                                    long j3 = this.b.nativePtr;
                                    AnimatedFileDrawable animatedFileDrawable30 = this.b;
                                    Bitmap bitmap2 = animatedFileDrawable30.j;
                                    int[] iArr5 = animatedFileDrawable30.d;
                                    int rowBytes = bitmap2.getRowBytes();
                                    AnimatedFileDrawable animatedFileDrawable31 = this.b;
                                    videoFrame = AnimatedFileDrawable.getVideoFrame(j3, bitmap2, iArr5, rowBytes, false, animatedFileDrawable31.p1, animatedFileDrawable31.q1, true);
                                    animatedFileDrawable2 = this.b;
                                    if (videoFrame == 0) {
                                        di.d(animatedFileDrawable2.G1);
                                        return;
                                    }
                                    i = animatedFileDrawable2.d[3];
                                    if (i < animatedFileDrawable2.b) {
                                        animatedFileDrawable2.v = true;
                                    }
                                    if (i2 != 0) {
                                        animatedFileDrawable2.b = i;
                                    }
                                    animatedFileDrawable2.k = i;
                                }
                            } else {
                                try {
                                    boolean zIsEmpty2 = animatedFileDrawable28.E.isEmpty();
                                    AnimatedFileDrawable animatedFileDrawable32 = this.b;
                                    if (zIsEmpty2) {
                                        int[] iArr6 = animatedFileDrawable32.d;
                                        float f2 = iArr6[0];
                                        float f3 = animatedFileDrawable32.v1;
                                        animatedFileDrawable32.j = Bitmap.createBitmap((int) (f2 * f3), (int) (iArr6[1] * f3), Bitmap.Config.ARGB_8888);
                                    } else {
                                        animatedFileDrawable32.j = (Bitmap) animatedFileDrawable32.E.remove(0);
                                    }
                                } catch (Throwable th) {
                                    float[] fArr = AnimatedFileDrawable.V1;
                                    gm0.V("one.me.sdk.media.ffmpeg.AnimatedFileDrawable", "Fail create background bitmap", th);
                                }
                                if (this.b.t >= 0) {
                                    AnimatedFileDrawable animatedFileDrawable210 = this.b;
                                    animatedFileDrawable210.d[3] = (int) animatedFileDrawable210.t;
                                    long j4 = this.b.t;
                                    synchronized (this.b.w) {
                                        this.b.t = -1L;
                                        AnimatedFileDrawable.seekToMs(this.b.nativePtr, j4, this.b.d, true);
                                        i2 = 1;
                                    }
                                }
                                animatedFileDrawable = this.b;
                                if (animatedFileDrawable.j != null) {
                                    animatedFileDrawable.y = System.currentTimeMillis();
                                    long j5 = this.b.nativePtr;
                                    AnimatedFileDrawable animatedFileDrawable33 = this.b;
                                    Bitmap bitmap3 = animatedFileDrawable33.j;
                                    int[] iArr7 = animatedFileDrawable33.d;
                                    int rowBytes2 = bitmap3.getRowBytes();
                                    AnimatedFileDrawable animatedFileDrawable34 = this.b;
                                    videoFrame = AnimatedFileDrawable.getVideoFrame(j5, bitmap3, iArr7, rowBytes2, false, animatedFileDrawable34.p1, animatedFileDrawable34.q1, true);
                                    animatedFileDrawable2 = this.b;
                                    if (videoFrame == 0) {
                                        di.d(animatedFileDrawable2.G1);
                                        return;
                                    }
                                    i = animatedFileDrawable2.d[3];
                                    if (i < animatedFileDrawable2.b) {
                                        animatedFileDrawable2.v = true;
                                    }
                                    if (i2 != 0) {
                                        animatedFileDrawable2.b = i;
                                    }
                                    animatedFileDrawable2.k = i;
                                }
                            }
                        } else {
                            if (this.b.t >= 0) {
                                AnimatedFileDrawable animatedFileDrawable211 = this.b;
                                animatedFileDrawable211.d[3] = (int) animatedFileDrawable211.t;
                                long j6 = this.b.t;
                                synchronized (this.b.w) {
                                    this.b.t = -1L;
                                    AnimatedFileDrawable.seekToMs(this.b.nativePtr, j6, this.b.d, true);
                                    i2 = 1;
                                }
                            }
                            animatedFileDrawable = this.b;
                            if (animatedFileDrawable.j != null) {
                                animatedFileDrawable.y = System.currentTimeMillis();
                                long j7 = this.b.nativePtr;
                                AnimatedFileDrawable animatedFileDrawable35 = this.b;
                                Bitmap bitmap4 = animatedFileDrawable35.j;
                                int[] iArr8 = animatedFileDrawable35.d;
                                int rowBytes3 = bitmap4.getRowBytes();
                                AnimatedFileDrawable animatedFileDrawable36 = this.b;
                                videoFrame = AnimatedFileDrawable.getVideoFrame(j7, bitmap4, iArr8, rowBytes3, false, animatedFileDrawable36.p1, animatedFileDrawable36.q1, true);
                                animatedFileDrawable2 = this.b;
                                if (videoFrame == 0) {
                                    di.d(animatedFileDrawable2.G1);
                                    return;
                                }
                                i = animatedFileDrawable2.d[3];
                                if (i < animatedFileDrawable2.b) {
                                    animatedFileDrawable2.v = true;
                                }
                                if (i2 != 0) {
                                    animatedFileDrawable2.b = i;
                                }
                                animatedFileDrawable2.k = i;
                            }
                        }
                    } catch (Throwable th2) {
                        float[] fArr2 = AnimatedFileDrawable.V1;
                        gm0.V("one.me.sdk.media.ffmpeg.AnimatedFileDrawable", "Fail load frame", th2);
                    }
                    break;
                }
                di.d(this.b.K1);
                return;
        }
    }
}
