package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.muxer.MuxerException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class fd7 implements q9b {
    public static final String f;
    public static final ghe g;
    public static final ghe h;
    public final MediaMuxer a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public boolean d;
    public boolean e;

    static {
        StringBuilder sb = new StringBuilder("android.media:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        f = sb.toString();
        z88 z88Var = new z88(4);
        z88Var.d("video/avc", "video/3gpp", "video/mp4v-es");
        z88Var.c("video/hevc");
        if (i >= 33) {
            z88Var.c("video/dolby-vision");
        }
        if (i >= 34) {
            z88Var.c("video/av01");
        }
        if (i >= 36) {
            z88Var.c("video/apv");
        }
        g = z88Var.h();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        ch3.e(objArr, 3);
        h = c98.j(objArr, 3);
    }

    public fd7(MediaMuxer mediaMuxer) {
        this.a = mediaMuxer;
    }

    public static void b(MediaMuxer mediaMuxer) {
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (Build.VERSION.SDK_INT < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(mediaMuxer);
                    String str = vqi.a;
                    num.getClass();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) throws MuxerException {
        MediaFormat mediaFormatCreateAudioFormat;
        String str = b87Var.n;
        int i = b87Var.z;
        int i2 = b87Var.v;
        int i3 = b87Var.u;
        str.getClass();
        boolean zM = uya.m(str);
        MediaMuxer mediaMuxer = this.a;
        if (zM) {
            mediaFormatCreateAudioFormat = MediaFormat.createVideoFormat(str, i3, i2);
            trk.e(mediaFormatCreateAudioFormat, b87Var.D);
            if (str.equals("video/dolby-vision") && Build.VERSION.SDK_INT >= 33) {
                int iIntValue = np0.n;
                mediaFormatCreateAudioFormat.setInteger("profile", np0.n);
                if (b87Var.k != null) {
                    Pair pairB = qu3.b(b87Var);
                    pairB.getClass();
                    iIntValue = ((Integer) pairB.second).intValue();
                } else {
                    int iMax = Integer.max(i3, i2);
                    lvb.b0(iMax <= 7680);
                    float f2 = i3 * i2 * b87Var.y;
                    if (iMax <= 1280) {
                        iIntValue = f2 <= 2.21184E7f ? 1 : 2;
                    } else if (iMax <= 1920 && f2 <= 4.97664E7f) {
                        iIntValue = 4;
                    } else if (iMax <= 2560 && f2 <= 6.2208E7f) {
                        iIntValue = 8;
                    } else if (iMax <= 3840) {
                        if (f2 <= 1.24416E8f) {
                            iIntValue = 16;
                        } else if (f2 <= 1.990656E8f) {
                            iIntValue = 32;
                        } else if (f2 <= 2.48832E8f) {
                            iIntValue = 64;
                        } else if (f2 <= 3.981312E8f) {
                            iIntValue = np0.m;
                        } else if (f2 > 4.97664E8f) {
                            iIntValue = np0.o;
                        }
                    } else if (iMax <= 7680) {
                        iIntValue = f2 <= 9.95328E8f ? 1024 : np0.q;
                    } else {
                        iIntValue = -1;
                    }
                }
                mediaFormatCreateAudioFormat.setInteger("level", iIntValue);
            }
            try {
                mediaMuxer.setOrientationHint(i);
            } catch (RuntimeException e) {
                throw new MuxerException(zo5.h(i, "Failed to set orientation hint with rotationDegrees="), e);
            }
        } else {
            mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, b87Var.G, b87Var.F);
            String str2 = b87Var.d;
            if (str2 != null) {
                mediaFormatCreateAudioFormat.setString("language", str2);
            }
        }
        trk.h(mediaFormatCreateAudioFormat, b87Var.q);
        try {
            return mediaMuxer.addTrack(mediaFormatCreateAudioFormat);
        } catch (RuntimeException e2) {
            throw new MuxerException("Failed to add track with format=" + b87Var, e2);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        if (this.e) {
            return;
        }
        boolean z = this.d;
        MediaMuxer mediaMuxer = this.a;
        if (!z) {
            try {
                mediaMuxer.start();
                this.d = true;
            } catch (RuntimeException e) {
                throw new MuxerException("Failed to start the muxer", e);
            }
        }
        this.d = false;
        try {
            try {
                b(mediaMuxer);
                mediaMuxer.release();
                this.e = true;
            } catch (RuntimeException e2) {
                throw new MuxerException("Failed to stop the MediaMuxer", e2);
            }
        } catch (Throwable th) {
            mediaMuxer.release();
            this.e = true;
            throw th;
        }
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        if (jwaVar instanceof r2b) {
            r2b r2bVar = (r2b) jwaVar;
            this.a.setLocation(r2bVar.a, r2bVar.b);
        }
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) throws MuxerException {
        long j = u31Var.a;
        boolean z = this.d;
        MediaMuxer mediaMuxer = this.a;
        SparseArray sparseArray = this.c;
        if (!z) {
            if (Build.VERSION.SDK_INT < 30 && j < 0) {
                sparseArray.put(i, Long.valueOf(-j));
            }
            try {
                mediaMuxer.start();
                this.d = true;
            } catch (RuntimeException e) {
                throw new MuxerException("Failed to start the muxer", e);
            }
        }
        long jLongValue = ((Long) sparseArray.get(i, 0L)).longValue();
        long j2 = j + jLongValue;
        SparseArray sparseArray2 = this.b;
        if (vqi.l(sparseArray2, i)) {
            ((Long) sparseArray2.get(i)).getClass();
        }
        sparseArray2.put(i, Long.valueOf(j2));
        boolean z2 = jLongValue == 0 || j2 >= 0;
        Locale locale = Locale.US;
        StringBuilder sbS = qt4.s(j2 - jLongValue, "Sample presentation time (", ") < first sample presentation time (");
        sbS.append(-jLongValue);
        sbS.append("). Ensure the first sample has the smallest timestamp when using the negative PTS workaround.");
        lvb.Z(sbS.toString(), z2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iPosition = byteBuffer.position();
        int i2 = u31Var.b;
        int i3 = u31Var.c;
        int i4 = (i3 & 1) != 1 ? 0 : 1;
        if ((i3 & 4) == 4) {
            i4 |= 4;
        }
        bufferInfo.set(iPosition, i2, j2, i4);
        try {
            mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        } catch (RuntimeException e2) {
            StringBuilder sbS2 = qt4.s(j2, "Failed to write sample for presentationTimeUs=", ", size=");
            sbS2.append(u31Var.b);
            throw new MuxerException(sbS2.toString(), e2);
        }
    }
}
