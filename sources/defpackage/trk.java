package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class trk {
    /* JADX WARN: Multi-variable type inference failed */
    public static b87 a(MediaFormat mediaFormat) {
        b87 b87Var;
        String string;
        int i;
        int i2;
        byte[] bArr;
        a87 a87Var = new a87();
        a87Var.m = uya.n(mediaFormat.getString("mime"));
        a87Var.d = mediaFormat.getString("language");
        a87Var.i = mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1;
        a87Var.h = mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1;
        int i3 = 0;
        if (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("profile");
            int integer2 = mediaFormat.getInteger("level");
            byte[] bArr2 = qu3.a;
            String str = vqi.a;
            Locale locale = Locale.US;
            string = qt4.l("s263.", integer, integer2, ".");
            b87Var = null;
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer3 = mediaFormat.getInteger("profile");
            byte[] bArr3 = qu3.a;
            if (integer3 == 1) {
                b87Var = null;
                i = 0;
            } else if (integer3 == 2) {
                b87Var = null;
                i = 1;
            } else if (integer3 == 4) {
                b87Var = null;
                i = 2;
            } else if (integer3 != 8) {
                b87Var = null;
                if (integer3 == 16) {
                    i = 4;
                } else if (integer3 == 32) {
                    i = 5;
                } else if (integer3 == 64) {
                    i = 6;
                } else if (integer3 == 128) {
                    i = 7;
                } else if (integer3 == 256) {
                    i = 8;
                } else if (integer3 == 512) {
                    i = 9;
                } else {
                    if (integer3 != 1024) {
                        ore.p(zo5.h(integer3, "Unknown Dolby Vision profile: "));
                        return null;
                    }
                    i = 10;
                }
            } else {
                b87Var = null;
                i = 3;
            }
            int integer4 = mediaFormat.getInteger("level");
            if (integer4 == 1) {
                i2 = 1;
            } else if (integer4 != 2) {
                switch (integer4) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case np0.m /* 128 */:
                        i2 = 8;
                        break;
                    case np0.n /* 256 */:
                        i2 = 9;
                        break;
                    case np0.o /* 512 */:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case np0.q /* 2048 */:
                        i2 = 12;
                        break;
                    case np0.r /* 4096 */:
                        i2 = 13;
                        break;
                    default:
                        ore.p(zo5.h(integer4, "Unknown Dolby Vision level: "));
                        return b87Var;
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = vqi.a;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = vqi.a;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = vqi.a;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            b87Var = null;
            string = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        a87Var.j = string;
        a87Var.x = d(mediaFormat, "frame-rate", -1.0f);
        a87Var.t = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1;
        a87Var.u = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1;
        a87Var.z = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        a87Var.n = mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1;
        a87Var.y = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
        int integer5 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
        int integer6 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
        int integer7 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr4 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr4);
            bArr = bArr4;
        } else {
            bArr = b87Var;
        }
        if (integer5 != 2 && integer5 != 1 && integer5 != 6 && integer5 != -1) {
            integer5 = -1;
        }
        if (integer6 != 2 && integer6 != 1 && integer6 != -1) {
            integer6 = -1;
        }
        if (integer7 != 1 && integer7 != 3 && integer7 != 2 && integer7 != 6 && integer7 != 7 && integer7 != -1) {
            integer7 = -1;
        }
        a87Var.C = (integer5 == -1 && integer6 == -1 && integer7 == -1 && bArr == 0) ? b87Var : new ex3(integer5, integer6, integer7, bArr, -1, -1);
        a87Var.F = mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1;
        a87Var.E = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1;
        a87Var.G = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1;
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                a87Var.p = c98.j(objArrCopyOf, i4);
                if (mediaFormat.containsKey("track-id")) {
                    a87Var.a = Integer.toString(mediaFormat.getInteger("track-id"));
                }
                return new b87(a87Var);
            }
            byte[] bArr5 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr5);
            byteBuffer2.rewind();
            int i5 = i4 + 1;
            int iB = r88.b(objArrCopyOf.length, i5);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i4] = bArr5;
            i3++;
            i4 = i5;
        }
    }

    public static MediaFormat b(b87 b87Var) {
        int i;
        MediaFormat mediaFormat = new MediaFormat();
        g(mediaFormat, "bitrate", b87Var.j);
        g(mediaFormat, "max-bitrate", b87Var.i);
        int i2 = b87Var.F;
        g(mediaFormat, "channel-count", i2);
        int iU = vqi.u(i2);
        if (iU != 0) {
            mediaFormat.setInteger("channel-mask", iU);
        }
        e(mediaFormat, b87Var.D);
        String str = b87Var.n;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = b87Var.k;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        f(mediaFormat, b87Var.y);
        g(mediaFormat, "width", b87Var.u);
        g(mediaFormat, "height", b87Var.v);
        h(mediaFormat, b87Var.q);
        int i3 = b87Var.H;
        if (i3 != -1) {
            g(mediaFormat, "exo-pcm-encoding-int", i3);
            if (i3 == 0) {
                i = 0;
            } else if (i3 != 2) {
                i = 3;
                if (i3 != 3) {
                    i = 4;
                    if (i3 != 4) {
                        i = 21;
                        if (i3 != 21) {
                            i = 22;
                            if (i3 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = b87Var.d;
        if (str3 != null) {
            mediaFormat.setString("language", str3);
        }
        g(mediaFormat, "max-input-size", b87Var.o);
        g(mediaFormat, "sample-rate", b87Var.G);
        g(mediaFormat, "caption-service-number", b87Var.K);
        mediaFormat.setInteger("rotation-degrees", b87Var.z);
        int i4 = b87Var.e;
        int i5 = 1;
        mediaFormat.setInteger("is-autoselect", (i4 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i4 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i4 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", b87Var.I);
        mediaFormat.setInteger("encoder-padding", b87Var.J);
        float f = b87Var.A;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f);
        int i6 = 1073741824;
        if (f < 1.0f) {
            i5 = (int) (f * 1.0737418E9f);
        } else if (f > 1.0f) {
            i6 = (int) (1.0737418E9f / f);
            i5 = 1073741824;
        } else {
            i6 = 1;
        }
        mediaFormat.setInteger("sar-width", i5);
        mediaFormat.setInteger("sar-height", i6);
        String str4 = b87Var.a;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static oe c(int i) {
        Object next;
        Iterator it = oe.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((oe) next).a == i) {
                return (oe) next;
            }
        }
        next = null;
        return (oe) next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        r1 = r1.getInteger(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float d(android.media.MediaFormat r1, java.lang.String r2, float r3) {
        /*
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L1f
            int r3 = defpackage.ht6.a(r2, r1)
            r0 = 3
            if (r3 != r0) goto L19
            float r1 = r1.getFloat(r2)
            return r1
        L19:
            int r1 = r1.getInteger(r2)
        L1d:
            float r1 = (float) r1
            return r1
        L1f:
            float r1 = r1.getFloat(r2)     // Catch: java.lang.ClassCastException -> L24
            return r1
        L24:
            int r1 = r1.getInteger(r2)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trk.d(android.media.MediaFormat, java.lang.String, float):float");
    }

    public static void e(MediaFormat mediaFormat, ex3 ex3Var) {
        if (ex3Var != null) {
            g(mediaFormat, "color-transfer", ex3Var.c);
            g(mediaFormat, "color-standard", ex3Var.a);
            g(mediaFormat, "color-range", ex3Var.b);
            byte[] bArr = ex3Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void f(MediaFormat mediaFormat, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
    }

    public static void g(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void h(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(zo5.h(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
