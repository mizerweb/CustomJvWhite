package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class i95 {
    public final MediaCodec.BufferInfo a;
    public final MediaFormat b;
    public final b87 c;
    public final MediaCodec d;
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public b87 j;
    public ByteBuffer k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006f, B:29:0x0078, B:34:0x0084, B:35:0x0088), top: B:69:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006f, B:29:0x0078, B:34:0x0084, B:35:0x0088), top: B:69:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006f, B:29:0x0078, B:34:0x0084, B:35:0x0088), top: B:69:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    public i95(Context context, b87 b87Var, MediaFormat mediaFormat, String str, boolean z, Surface surface) throws ExportException {
        int i;
        boolean z2;
        byte b;
        Surface surfaceCreateInputSurface;
        MediaCodec mediaCodecCreateByCodecName;
        MediaFormat inputFormat;
        int integer;
        int integer2;
        this.c = b87Var;
        this.b = mediaFormat;
        this.g = z;
        String str2 = b87Var.n;
        str2.getClass();
        boolean zM = uya.m(str2);
        this.h = zM;
        this.a = new MediaCodec.BufferInfo();
        this.l = -1;
        this.m = -1;
        this.i = new AtomicBoolean();
        LinkedHashMap linkedHashMap = g55.a;
        try {
            try {
                synchronized (g55.class) {
                    synchronized (g55.class) {
                    }
                    i = Build.VERSION.SDK_INT;
                    z2 = false;
                    if (i < 31) {
                        b = false;
                    } else {
                        if (mediaFormat.containsKey("color-transfer-request")) {
                            integer2 = mediaFormat.getInteger("color-transfer-request");
                        } else {
                            integer2 = 0;
                        }
                        if (integer2 == 3) {
                            b = true;
                        } else {
                            b = false;
                        }
                    }
                    surfaceCreateInputSurface = null;
                    mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                    Trace.beginSection("configureCodec");
                    mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                    Trace.endSection();
                    if (b != false) {
                        inputFormat = mediaCodecCreateByCodecName.getInputFormat();
                        if (i >= 31) {
                            if (inputFormat.containsKey("color-transfer-request")) {
                                integer = inputFormat.getInteger("color-transfer-request");
                            } else {
                                integer = 0;
                            }
                            if (integer == 3) {
                                z2 = true;
                            }
                        }
                        lvb.O("Tone-mapping requested but not supported by the decoder.", z2);
                    }
                    if (zM && !z) {
                        surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                    }
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName.start();
                    Trace.endSection();
                    this.d = mediaCodecCreateByCodecName;
                    this.e = surfaceCreateInputSurface;
                    this.f = vqi.P(context) ? 1 : 5;
                    return;
                }
                Trace.beginSection("configureCodec");
                mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (b != false) {
                    inputFormat = mediaCodecCreateByCodecName.getInputFormat();
                    if (i >= 31) {
                        if (inputFormat.containsKey("color-transfer-request")) {
                            integer = inputFormat.getInteger("color-transfer-request");
                        } else {
                            integer = 0;
                        }
                        if (integer == 3) {
                            z2 = true;
                        }
                    }
                    lvb.O("Tone-mapping requested but not supported by the decoder.", z2);
                }
                if (zM) {
                    surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                }
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                this.d = mediaCodecCreateByCodecName;
                this.e = surfaceCreateInputSurface;
                this.f = vqi.P(context) ? 1 : 5;
                return;
            } catch (Exception e) {
                e = e;
                lvb.h0("DefaultCodec", "MediaCodec error", e);
                if (surfaceCreateInputSurface != null) {
                    surfaceCreateInputSurface.release();
                }
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw ExportException.c(e, ((e instanceof IOException) || (e instanceof MediaCodec.CodecException)) ? z ? 3001 : 4001 : e instanceof IllegalArgumentException ? z ? 3003 : 4003 : 1001, new lh6(mediaFormat.toString(), str, this.h, z));
            }
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        i = Build.VERSION.SDK_INT;
        z2 = false;
        if (i < 31) {
            b = false;
        } else {
            if (mediaFormat.containsKey("color-transfer-request")) {
                integer2 = mediaFormat.getInteger("color-transfer-request");
            } else {
                integer2 = 0;
            }
            if (integer2 == 3) {
                b = true;
            } else {
                b = false;
            }
        }
        surfaceCreateInputSurface = null;
    }

    public static b87 a(MediaFormat mediaFormat, boolean z, lwa lwaVar) {
        b87 b87VarA = trk.a(mediaFormat);
        a87 a87VarA = b87VarA.a();
        a87VarA.k = lwaVar;
        if (z && b87VarA.H == -1 && Objects.equals(b87VarA.n, "audio/raw")) {
            a87VarA.G = 2;
        }
        return new b87(a87VarA);
    }

    public final ExportException b(RuntimeException runtimeException) {
        boolean z = this.g;
        return ExportException.c(runtimeException, z ? 3002 : 4002, new lh6(this.b.toString(), c(), this.h, z));
    }

    public final String c() {
        int i = Build.VERSION.SDK_INT;
        MediaCodec mediaCodec = this.d;
        return i >= 29 ? mediaCodec.getCanonicalName() : mediaCodec.getName();
    }

    public final ByteBuffer d() {
        if (!g(true)) {
            return null;
        }
        long j = this.a.presentationTimeUs;
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
            synchronized (g55.class) {
            }
            return this.k;
        }
        return this.k;
    }

    public final boolean e() {
        return this.o && this.m == -1;
    }

    public final boolean f(u55 u55Var) throws ExportException {
        MediaCodec mediaCodec = this.d;
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                this.l = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    u55Var.d = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    u55Var.q();
                } catch (RuntimeException e) {
                    lvb.h0("DefaultCodec", "MediaCodec error", e);
                    throw b(e);
                }
            } catch (RuntimeException e2) {
                lvb.h0("DefaultCodec", "MediaCodec error", e2);
                throw b(e2);
            }
        }
        u55Var.d.getClass();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    public final boolean g(boolean z) throws ExportException {
        boolean z2 = this.g;
        b87 b87Var = this.c;
        MediaCodec mediaCodec = this.d;
        MediaCodec.BufferInfo bufferInfo = this.a;
        if (this.m < 0) {
            if (!this.o) {
                try {
                    int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                    this.m = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.o = true;
                            LinkedHashMap linkedHashMap = g55.a;
                            synchronized (g55.class) {
                                synchronized (g55.class) {
                                }
                                if (bufferInfo.size == 0) {
                                    j();
                                    return false;
                                }
                                bufferInfo.flags &= -5;
                            }
                            if (bufferInfo.size == 0) {
                                j();
                                return false;
                            }
                            bufferInfo.flags &= -5;
                        }
                        if ((bufferInfo.flags & 2) != 0) {
                            j();
                            return false;
                        }
                        if (z) {
                            try {
                                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(this.m);
                                outputBuffer.getClass();
                                this.k = outputBuffer;
                                outputBuffer.position(bufferInfo.offset);
                                this.k.limit(bufferInfo.offset + bufferInfo.size);
                                return true;
                            } catch (RuntimeException e) {
                                lvb.h0("DefaultCodec", "MediaCodec error", e);
                                throw b(e);
                            }
                        }
                    } else if (iDequeueOutputBuffer == -2) {
                        this.j = a(mediaCodec.getOutputFormat(), z2, b87Var.l);
                        if (z2) {
                            if (Objects.equals(b87Var.n, "audio/raw")) {
                                a87 a87VarA = this.j.a();
                                a87VarA.E = b87Var.F;
                                a87VarA.G = b87Var.H;
                                this.j = new b87(a87VarA);
                            }
                        } else if (this.h) {
                            this.i.set(true);
                        } else if (Objects.equals(c(), "c2.android.aac.encoder")) {
                            a87 a87VarA2 = this.j.a();
                            a87VarA2.H = 1600;
                            this.j = new b87(a87VarA2);
                        }
                        long j = bufferInfo.presentationTimeUs;
                        LinkedHashMap linkedHashMap2 = g55.a;
                        synchronized (g55.class) {
                            synchronized (g55.class) {
                            }
                            return false;
                        }
                        return false;
                    }
                } catch (RuntimeException e2) {
                    lvb.h0("DefaultCodec", "MediaCodec error", e2);
                    throw b(e2);
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[Catch: all -> 0x0072, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:35:0x0066, B:36:0x0067), top: B:49:0x0066 }] */
    public final void h(u55 u55Var) throws ExportException {
        int iPosition;
        int iRemaining;
        ByteBuffer byteBuffer;
        boolean z = true;
        lvb.Z("Input buffer can not be queued after the input stream has ended.", !this.n);
        ByteBuffer byteBuffer2 = u55Var.d;
        int i = 0;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = u55Var.d.position();
            iRemaining = u55Var.d.remaining();
        }
        long j = u55Var.f;
        int i2 = 4;
        try {
            if (u55Var.d(4)) {
                this.n = true;
                LinkedHashMap linkedHashMap = g55.a;
                synchronized (g55.class) {
                    synchronized (g55.class) {
                    }
                    if (this.g) {
                        byteBuffer = u55Var.d;
                        if (byteBuffer != null && byteBuffer.hasRemaining()) {
                            z = false;
                        }
                        lvb.b0(z);
                        j = 0;
                        iRemaining = 0;
                    }
                    this.d.queueInputBuffer(this.l, i, iRemaining, j, i2);
                    LinkedHashMap linkedHashMap2 = g55.a;
                    synchronized (g55.class) {
                        synchronized (g55.class) {
                        }
                        this.l = -1;
                        u55Var.d = null;
                        return;
                    }
                    this.l = -1;
                    u55Var.d = null;
                    return;
                }
                if (this.g) {
                    byteBuffer = u55Var.d;
                    if (byteBuffer != null) {
                        z = false;
                    }
                    lvb.b0(z);
                    j = 0;
                    iRemaining = 0;
                }
                this.d.queueInputBuffer(this.l, i, iRemaining, j, i2);
                LinkedHashMap linkedHashMap3 = g55.a;
                synchronized (g55.class) {
                    synchronized (g55.class) {
                        this.l = -1;
                        u55Var.d = null;
                        return;
                    }
                }
            }
            i2 = 0;
            this.d.queueInputBuffer(this.l, i, iRemaining, j, i2);
            LinkedHashMap linkedHashMap4 = g55.a;
            synchronized (g55.class) {
                synchronized (g55.class) {
                    this.l = -1;
                    u55Var.d = null;
                    return;
                }
            }
        } catch (RuntimeException e) {
            lvb.h0("DefaultCodec", "MediaCodec error", e);
            throw b(e);
        }
        i = iPosition;
    }

    public final void i() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    public final void j() throws ExportException {
        MediaCodec.BufferInfo bufferInfo = this.a;
        bufferInfo.getClass();
        k(bufferInfo.presentationTimeUs, false);
    }

    public final void k(long j, boolean z) throws ExportException {
        this.k = null;
        MediaCodec mediaCodec = this.d;
        int i = this.m;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(i, j * 1000);
                LinkedHashMap linkedHashMap = g55.a;
                synchronized (g55.class) {
                    try {
                        synchronized (g55.class) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            lvb.h0("DefaultCodec", "MediaCodec error", e);
            throw b(e);
        }
    }
}
