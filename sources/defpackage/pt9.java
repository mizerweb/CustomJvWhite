package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class pt9 extends ks0 {
    public static final byte[] f2 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ut0 A;
    public long A1;
    public final MediaCodec.BufferInfo B;
    public int B1;
    public final ArrayDeque C;
    public int C1;
    public final bsb D;
    public ByteBuffer D1;
    public final AtomicInteger E;
    public boolean E1;
    public b87 F;
    public boolean F1;
    public b87 G;
    public boolean G1;
    public xu5 H;
    public boolean H1;
    public xu5 I;
    public boolean I1;
    public eg6 J;
    public int J1;
    public MediaCrypto K;
    public int K1;
    public int L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public long P1;
    public boolean Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public ExoPlaybackException U1;
    public t55 V1;
    public ot9 W1;
    public final long X;
    public long X1;
    public float Y;
    public boolean Y1;
    public float Z;
    public boolean Z1;
    public boolean a2;
    public long b2;
    public pu3 c2;
    public pu3 d2;
    public u98 e2;
    public kt9 n1;
    public b87 o1;
    public MediaFormat p1;
    public boolean q1;
    public float r1;
    public final Context s;
    public ArrayDeque s1;
    public final jt9 t;
    public MediaCodecRenderer$DecoderInitializationException t1;
    public final qt9 u;
    public nt9 u1;
    public final boolean v;
    public boolean v1;
    public final float w;
    public boolean w1;
    public final u55 x;
    public boolean x1;
    public final u55 y;
    public boolean y1;
    public final u55 z;
    public long z1;

    public pt9(Context context, int i, jt9 jt9Var, qt9 qt9Var, boolean z, float f) {
        super(i);
        this.s = context.getApplicationContext();
        this.t = jt9Var;
        this.u = qt9Var;
        this.v = z;
        this.w = f;
        this.E = new AtomicInteger();
        this.x = new u55(0);
        this.y = new u55(0);
        this.z = new u55(2);
        ut0 ut0Var = new ut0(2);
        ut0Var.k = 32;
        this.A = ut0Var;
        this.B = new MediaCodec.BufferInfo();
        this.Y = 1.0f;
        this.Z = 1.0f;
        this.X = -9223372036854775807L;
        this.C = new ArrayDeque();
        this.W1 = ot9.f;
        ut0Var.s(0);
        ut0Var.d.order(ByteOrder.nativeOrder());
        bsb bsbVar = new bsb();
        bsbVar.c = fb0.a;
        bsbVar.b = 0;
        bsbVar.a = 2;
        this.D = bsbVar;
        this.r1 = -1.0f;
        this.J1 = 0;
        this.B1 = -1;
        this.C1 = -1;
        this.A1 = -9223372036854775807L;
        this.P1 = -9223372036854775807L;
        this.X1 = -9223372036854775807L;
        this.z1 = -9223372036854775807L;
        this.K1 = 0;
        this.L1 = 0;
        this.V1 = new t55();
        this.a2 = false;
        this.b2 = 0L;
        int i2 = u98.c;
        this.e2 = nhe.j;
        pu3 pu3Var = pu3.b;
        this.c2 = pu3Var;
        this.d2 = pu3Var;
    }

    public abstract int A0(qt9 qt9Var, b87 b87Var);

    public final boolean B0(b87 b87Var) throws ExoPlaybackException {
        if (this.n1 != null && this.L1 != 3 && this.h != 0) {
            float f = this.Z;
            b87Var.getClass();
            b87[] b87VarArr = this.j;
            b87VarArr.getClass();
            float fQ = Q(f, b87Var, b87VarArr);
            float f3 = this.r1;
            if (f3 != fQ) {
                if (fQ == -1.0f) {
                    if (this.M1) {
                        this.K1 = 1;
                        this.L1 = 3;
                        return false;
                    }
                    o0();
                    Y();
                    return false;
                }
                if (f3 != -1.0f || fQ > this.w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fQ);
                    kt9 kt9Var = this.n1;
                    kt9Var.getClass();
                    kt9Var.setParameters(bundle);
                    this.r1 = fQ;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ks0
    public void C(float f, float f3) throws ExoPlaybackException {
        this.Y = f;
        this.Z = f3;
        B0(this.o1);
    }

    public final void C0() throws ExoPlaybackException {
        xu5 xu5Var = this.I;
        xu5Var.getClass();
        cd7 cd7VarD = xu5Var.d();
        if (cd7VarD != null) {
            try {
                MediaCrypto mediaCrypto = this.K;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(cd7VarD.b);
            } catch (MediaCryptoException e) {
                throw d(e, this.F, false, 6006);
            }
        }
        t0(this.I);
        this.K1 = 0;
        this.L1 = 0;
    }

    @Override // defpackage.ks0
    public final int D(b87 b87Var) throws ExoPlaybackException {
        try {
            return A0(this.u, b87Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw d(e, b87Var, false, 4002);
        }
    }

    public final void D0(long j) {
        b87 b87Var = (b87) this.W1.d.d(j);
        if (b87Var == null && this.Y1 && this.p1 != null) {
            b87Var = (b87) this.W1.d.c();
        }
        if (b87Var != null) {
            this.G = b87Var;
        } else if (!this.q1 || this.G == null) {
            return;
        }
        b87 b87Var2 = this.G;
        b87Var2.getClass();
        g0(b87Var2, this.p1);
        this.q1 = false;
        this.Y1 = false;
    }

    @Override // defpackage.ks0
    public final int E() {
        return 8;
    }

    public final void G(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.c2.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02cc  */
    public final boolean H(long j, long j2) throws ExoPlaybackException {
        ut0 ut0Var;
        int length;
        ByteBuffer byteBuffer;
        lvb.b0(!this.R1);
        ut0 ut0Var2 = this.A;
        if (ut0Var2.v()) {
            ByteBuffer byteBuffer2 = ut0Var2.d;
            int i = this.C1;
            int i2 = ut0Var2.j;
            long j3 = ut0Var2.f;
            boolean zX = X(this.l, ut0Var2.i);
            boolean zD = ut0Var2.d(4);
            b87 b87Var = this.G;
            b87Var.getClass();
            ut0Var = ut0Var2;
            if (!m0(j, j2, null, byteBuffer2, i, 0, i2, j3, zX, zD, b87Var)) {
                return false;
            }
            i0(ut0Var.i);
            ut0Var.q();
        } else {
            ut0Var = ut0Var2;
        }
        if (this.Q1) {
            this.R1 = true;
            return false;
        }
        boolean z = this.G1;
        u55 u55Var = this.z;
        if (z) {
            lvb.b0(ut0Var.u(u55Var));
            this.G1 = false;
        }
        if (this.H1) {
            if (ut0Var.v()) {
                return true;
            }
            this.F1 = false;
            q0();
            this.H1 = false;
            Y();
            if (!this.F1) {
                return false;
            }
        }
        lvb.b0(!this.Q1);
        v2a v2aVar = this.c;
        v2aVar.k();
        u55Var.q();
        while (true) {
            u55Var.q();
            int iW = w(v2aVar, u55Var, 0);
            if (iW == -5) {
                f0(v2aVar);
                break;
            }
            if (iW != -4) {
                if (iW != -3) {
                    c.t();
                    return false;
                }
                if (!i()) {
                    break;
                }
                T().e = this.P1;
                break;
            }
            if (u55Var.d(4)) {
                this.Q1 = true;
                T().e = this.P1;
                break;
            }
            this.P1 = Math.max(this.P1, u55Var.f);
            if (i() || this.y.d(536870912)) {
                T().e = this.P1;
            }
            byte[] bArr = null;
            if (this.S1) {
                b87 b87Var2 = this.F;
                b87Var2.getClass();
                this.G = b87Var2;
                if (Objects.equals(b87Var2.n, "audio/opus") && !this.G.q.isEmpty()) {
                    int iD = uel.d((byte[]) this.G.q.get(0));
                    a87 a87VarA = this.G.a();
                    a87VarA.f(iD);
                    this.G = a87VarA.a();
                }
                g0(this.G, null);
                this.S1 = false;
            }
            u55Var.t();
            b87 b87Var3 = this.G;
            if (b87Var3 == null || !Objects.equals(b87Var3.n, "audio/opus")) {
                ut0Var = ut0Var;
            } else {
                if (u55Var.d(268435456)) {
                    u55Var.b = this.G;
                    V(u55Var);
                }
                if (uel.e(this.l, u55Var.f)) {
                    List list = this.G.q;
                    bsb bsbVar = this.D;
                    bsbVar.getClass();
                    u55Var.d.getClass();
                    if (u55Var.d.limit() - u55Var.d.position() == 0) {
                        ut0Var = ut0Var;
                    } else {
                        if (bsbVar.a == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = u55Var.d;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i3 = iLimit - iPosition;
                        int i4 = (i3 + 255) / 255;
                        int i5 = i4 + 27 + i3;
                        if (bsbVar.a == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i5 = length + 44 + i5;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) bsbVar.c).capacity() < i5) {
                            bsbVar.c = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) bsbVar.c).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) bsbVar.c;
                        if (bsbVar.a == 2) {
                            if (bArr != null) {
                                bsb.b(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(l0m.a(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, vqi.o(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(bsb.d);
                            }
                            byteBuffer.put(bsb.e);
                        } else {
                            ut0Var = ut0Var;
                            byteBuffer = byteBuffer4;
                        }
                        int iG = bsbVar.b + uel.g(byteBuffer3);
                        bsbVar.b = iG;
                        bsb.b(byteBuffer, iG, bsbVar.a, i4, false);
                        for (int i6 = 0; i6 < i4; i6++) {
                            if (i3 >= 255) {
                                byteBuffer.put((byte) -1);
                                i3 -= 255;
                            } else {
                                byteBuffer.put((byte) i3);
                                i3 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (bsbVar.a == 2) {
                            byteBuffer.putInt(length + 66, vqi.o(byteBuffer.arrayOffset() + length + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                        } else {
                            byteBuffer.putInt(22, vqi.o(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                        }
                        bsbVar.a++;
                        bsbVar.c = byteBuffer;
                        u55Var.q();
                        u55Var.s(((ByteBuffer) bsbVar.c).remaining());
                        u55Var.d.put((ByteBuffer) bsbVar.c);
                        u55Var.t();
                    }
                } else {
                    ut0Var = ut0Var;
                }
            }
            if (ut0Var.v()) {
                long j4 = this.l;
                ut0Var = ut0Var;
                if (X(j4, ut0Var.i) == X(j4, u55Var.f)) {
                }
                this.G1 = true;
                break;
            }
            ut0Var = ut0Var;
            if (!ut0Var.u(u55Var)) {
                this.G1 = true;
                break;
            }
        }
        if (ut0Var.v()) {
            ut0Var.t();
        }
        return ut0Var.v() || this.Q1 || this.H1;
    }

    public abstract w55 I(nt9 nt9Var, b87 b87Var, b87 b87Var2);

    public MediaCodecDecoderException J(IllegalStateException illegalStateException, nt9 nt9Var) {
        return new MediaCodecDecoderException(illegalStateException, nt9Var);
    }

    public final boolean K() throws ExoPlaybackException {
        if (!this.M1) {
            C0();
            return true;
        }
        this.K1 = 1;
        this.L1 = 2;
        return true;
    }

    public final boolean L(long j, long j2) throws ExoPlaybackException {
        kt9 kt9Var = this.n1;
        kt9Var.getClass();
        int i = this.C1;
        MediaCodec.BufferInfo bufferInfo = this.B;
        if (i < 0) {
            int iR = kt9Var.r(bufferInfo);
            if (iR < 0) {
                if (iR != -2) {
                    if (this.y1 && (this.Q1 || this.K1 == 2)) {
                        l0();
                    }
                    long j3 = this.z1;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.g.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            l0();
                            return false;
                        }
                    }
                    return false;
                }
                this.O1 = true;
                kt9 kt9Var2 = this.n1;
                kt9Var2.getClass();
                MediaFormat outputFormat = kt9Var2.getOutputFormat();
                if (Build.VERSION.SDK_INT >= 29 && !this.e2.isEmpty()) {
                    u98<String> u98Var = this.e2;
                    pu3 pu3Var = pu3.b;
                    HashMap map = new HashMap();
                    for (String str : u98Var) {
                        if (outputFormat.containsKey(str)) {
                            int valueTypeForKey = outputFormat.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(outputFormat.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(outputFormat.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(outputFormat.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, outputFormat.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = outputFormat.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    pu3 pu3Var2 = new pu3(map);
                    if (!pu3Var2.equals(this.d2)) {
                        this.d2 = pu3Var2;
                        d0(pu3Var2);
                    }
                }
                this.p1 = outputFormat;
                this.q1 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.b2;
            if (this.x1) {
                this.x1 = false;
                kt9Var.m(iR);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                l0();
                return false;
            }
            this.C1 = iR;
            ByteBuffer outputBuffer = kt9Var.getOutputBuffer(iR);
            this.D1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.D1.limit(bufferInfo.offset + bufferInfo.size);
            }
            D0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.a2 || bufferInfo.presentationTimeUs < this.l;
        long j5 = this.W1.e;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.E1 = z2;
        ByteBuffer byteBuffer2 = this.D1;
        int i2 = this.C1;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        b87 b87Var = this.G;
        b87Var.getClass();
        if (!m0(j, j2, kt9Var, byteBuffer2, i2, i3, 1, j6, z, z2, b87Var)) {
            return false;
        }
        i0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.N1 && this.E1) {
            this.g.getClass();
            this.z1 = System.currentTimeMillis();
        }
        this.C1 = -1;
        this.D1 = null;
        if (!z3) {
            return true;
        }
        l0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    public final boolean M() throws ExoPlaybackException {
        int iPosition;
        v2a v2aVar;
        int i;
        long j;
        boolean zD;
        int iP;
        long j2;
        int i2;
        long j3;
        ty4 ty4Var;
        int i3;
        b87 b87Var;
        kt9 kt9Var = this.n1;
        if (kt9Var != null && this.K1 != 2 && !this.Q1) {
            int i4 = this.B1;
            u55 u55Var = this.y;
            if (i4 < 0) {
                int iQ = kt9Var.q();
                this.B1 = iQ;
                if (iQ >= 0) {
                    u55Var.d = kt9Var.getInputBuffer(iQ);
                    u55Var.q();
                    if (this.K1 == 1) {
                        if (!this.y1) {
                            this.N1 = true;
                            kt9Var.h(0L, this.B1, 0, 4);
                            this.B1 = -1;
                            u55Var.d = null;
                        }
                        this.K1 = 2;
                        return false;
                    }
                    if (this.w1) {
                        this.w1 = false;
                        ByteBuffer byteBuffer = u55Var.d;
                        byteBuffer.getClass();
                        byteBuffer.put(f2);
                        kt9Var.h(0L, this.B1, 38, 0);
                        this.B1 = -1;
                        u55Var.d = null;
                        this.M1 = true;
                        return true;
                    }
                    if (this.J1 == 1) {
                        i3 = 0;
                        while (true) {
                            b87Var = this.o1;
                            b87Var.getClass();
                            if (i3 < b87Var.q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.o1.q.get(i3);
                            ByteBuffer byteBuffer2 = u55Var.d;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.J1 = 2;
                    }
                    ByteBuffer byteBuffer3 = u55Var.d;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    v2aVar = this.c;
                    v2aVar.k();
                    try {
                        kt9Var.s(new su6(this, 15, v2aVar));
                        i = this.E.get();
                        if (i == -3) {
                            if (i()) {
                                T().e = this.P1;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.J1 == 2) {
                                    u55Var.q();
                                    this.J1 = 1;
                                }
                                f0(v2aVar);
                                return true;
                            }
                            if (u55Var.d(4)) {
                                if (!this.M1 || u55Var.d(1)) {
                                    j = u55Var.f;
                                    if (!v0(u55Var)) {
                                        zD = u55Var.d(1073741824);
                                        if (zD) {
                                            ty4Var = u55Var.c;
                                            if (iPosition == 0) {
                                                ty4Var.getClass();
                                            } else {
                                                if (ty4Var.d == null) {
                                                    int[] iArr = new int[1];
                                                    ty4Var.d = iArr;
                                                    ty4Var.i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = ty4Var.d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.S1) {
                                            i0g i0gVar = T().d;
                                            b87 b87Var2 = this.F;
                                            b87Var2.getClass();
                                            i0gVar.a(j, b87Var2);
                                            this.S1 = false;
                                        }
                                        this.P1 = Math.max(this.P1, j);
                                        if (i() || u55Var.d(536870912)) {
                                            T().e = this.P1;
                                        }
                                        u55Var.t();
                                        if (u55Var.d(268435456)) {
                                            V(u55Var);
                                        }
                                        if (this.a2) {
                                            j3 = this.P1;
                                            if (j <= j3) {
                                                this.b2 = (j3 - j) + 1 + this.b2;
                                            }
                                            this.P1 = j;
                                            this.a2 = false;
                                        }
                                        k0(u55Var);
                                        iP = P(u55Var);
                                        j2 = j + this.b2;
                                        i2 = this.B1;
                                        if (zD) {
                                            kt9Var.e(i2, u55Var.c, j2, iP);
                                        } else {
                                            ByteBuffer byteBuffer4 = u55Var.d;
                                            byteBuffer4.getClass();
                                            kt9Var.h(j2, i2, byteBuffer4.limit(), iP);
                                        }
                                        this.B1 = -1;
                                        u55Var.d = null;
                                        this.M1 = true;
                                        this.J1 = 0;
                                        this.V1.c++;
                                        return true;
                                    }
                                } else {
                                    u55Var.q();
                                    if (this.J1 == 2) {
                                        this.J1 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            T().e = this.P1;
                            if (this.J1 == 2) {
                                u55Var.q();
                                this.J1 = 1;
                            }
                            this.Q1 = true;
                            if (!this.M1) {
                                l0();
                                return false;
                            }
                            if (!this.y1) {
                                this.N1 = true;
                                kt9Var.h(0L, this.B1, 0, 4);
                                this.B1 = -1;
                                u55Var.d = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e) {
                        b0(e);
                        n0(0);
                        N();
                        return true;
                    }
                }
            } else {
                if (this.K1 == 1) {
                    if (!this.y1) {
                        this.N1 = true;
                        kt9Var.h(0L, this.B1, 0, 4);
                        this.B1 = -1;
                        u55Var.d = null;
                    }
                    this.K1 = 2;
                    return false;
                }
                if (this.w1) {
                    this.w1 = false;
                    ByteBuffer byteBuffer5 = u55Var.d;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f2);
                    kt9Var.h(0L, this.B1, 38, 0);
                    this.B1 = -1;
                    u55Var.d = null;
                    this.M1 = true;
                    return true;
                }
                if (this.J1 == 1) {
                    i3 = 0;
                    while (true) {
                        b87Var = this.o1;
                        b87Var.getClass();
                        if (i3 < b87Var.q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.o1.q.get(i3);
                        ByteBuffer byteBuffer6 = u55Var.d;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.J1 = 2;
                }
                ByteBuffer byteBuffer7 = u55Var.d;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                v2aVar = this.c;
                v2aVar.k();
                kt9Var.s(new su6(this, 15, v2aVar));
                i = this.E.get();
                if (i == -3) {
                    if (i()) {
                        T().e = this.P1;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.J1 == 2) {
                            u55Var.q();
                            this.J1 = 1;
                        }
                        f0(v2aVar);
                        return true;
                    }
                    if (u55Var.d(4)) {
                        if (this.M1) {
                            j = u55Var.f;
                            if (!v0(u55Var)) {
                                zD = u55Var.d(1073741824);
                                if (zD) {
                                    ty4Var = u55Var.c;
                                    if (iPosition == 0) {
                                        ty4Var.getClass();
                                    } else {
                                        if (ty4Var.d == null) {
                                            int[] iArr3 = new int[1];
                                            ty4Var.d = iArr3;
                                            ty4Var.i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = ty4Var.d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.S1) {
                                    i0g i0gVar2 = T().d;
                                    b87 b87Var3 = this.F;
                                    b87Var3.getClass();
                                    i0gVar2.a(j, b87Var3);
                                    this.S1 = false;
                                }
                                this.P1 = Math.max(this.P1, j);
                                if (i()) {
                                    T().e = this.P1;
                                } else {
                                    T().e = this.P1;
                                }
                                u55Var.t();
                                if (u55Var.d(268435456)) {
                                    V(u55Var);
                                }
                                if (this.a2) {
                                    j3 = this.P1;
                                    if (j <= j3) {
                                        this.b2 = (j3 - j) + 1 + this.b2;
                                    }
                                    this.P1 = j;
                                    this.a2 = false;
                                }
                                k0(u55Var);
                                iP = P(u55Var);
                                j2 = j + this.b2;
                                i2 = this.B1;
                                if (zD) {
                                    kt9Var.e(i2, u55Var.c, j2, iP);
                                } else {
                                    ByteBuffer byteBuffer8 = u55Var.d;
                                    byteBuffer8.getClass();
                                    kt9Var.h(j2, i2, byteBuffer8.limit(), iP);
                                }
                                this.B1 = -1;
                                u55Var.d = null;
                                this.M1 = true;
                                this.J1 = 0;
                                this.V1.c++;
                                return true;
                            }
                        } else {
                            j = u55Var.f;
                            if (!v0(u55Var)) {
                                zD = u55Var.d(1073741824);
                                if (zD) {
                                    ty4Var = u55Var.c;
                                    if (iPosition == 0) {
                                        ty4Var.getClass();
                                    } else {
                                        if (ty4Var.d == null) {
                                            int[] iArr5 = new int[1];
                                            ty4Var.d = iArr5;
                                            ty4Var.i.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = ty4Var.d;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.S1) {
                                    i0g i0gVar3 = T().d;
                                    b87 b87Var4 = this.F;
                                    b87Var4.getClass();
                                    i0gVar3.a(j, b87Var4);
                                    this.S1 = false;
                                }
                                this.P1 = Math.max(this.P1, j);
                                if (i()) {
                                    T().e = this.P1;
                                } else {
                                    T().e = this.P1;
                                }
                                u55Var.t();
                                if (u55Var.d(268435456)) {
                                    V(u55Var);
                                }
                                if (this.a2) {
                                    j3 = this.P1;
                                    if (j <= j3) {
                                        this.b2 = (j3 - j) + 1 + this.b2;
                                    }
                                    this.P1 = j;
                                    this.a2 = false;
                                }
                                k0(u55Var);
                                iP = P(u55Var);
                                j2 = j + this.b2;
                                i2 = this.B1;
                                if (zD) {
                                    kt9Var.e(i2, u55Var.c, j2, iP);
                                } else {
                                    ByteBuffer byteBuffer9 = u55Var.d;
                                    byteBuffer9.getClass();
                                    kt9Var.h(j2, i2, byteBuffer9.limit(), iP);
                                }
                                this.B1 = -1;
                                u55Var.d = null;
                                this.M1 = true;
                                this.J1 = 0;
                                this.V1.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                    T().e = this.P1;
                    if (this.J1 == 2) {
                        u55Var.q();
                        this.J1 = 1;
                    }
                    this.Q1 = true;
                    if (!this.M1) {
                        l0();
                        return false;
                    }
                    if (!this.y1) {
                        this.N1 = true;
                        kt9Var.h(0L, this.B1, 0, 4);
                        this.B1 = -1;
                        u55Var.d = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void N() {
        try {
            kt9 kt9Var = this.n1;
            kt9Var.getClass();
            kt9Var.flush();
        } finally {
            r0();
        }
    }

    public final List O(boolean z) {
        b87 b87Var = this.F;
        b87Var.getClass();
        qt9 qt9Var = this.u;
        ArrayList arrayListR = R(qt9Var, b87Var, z);
        if (!arrayListR.isEmpty() || !z) {
            return arrayListR;
        }
        ArrayList arrayListR2 = R(qt9Var, b87Var, false);
        if (!arrayListR2.isEmpty()) {
            lvb.G0("MediaCodecRenderer", "Drm session requires secure decoder for " + b87Var.n + ", but no secure decoder available. Trying to proceed with " + arrayListR2 + ".");
        }
        return arrayListR2;
    }

    public int P(u55 u55Var) {
        return 0;
    }

    public abstract float Q(float f, b87 b87Var, b87[] b87VarArr);

    public abstract ArrayList R(qt9 qt9Var, b87 b87Var, boolean z);

    public long S(long j, long j2) {
        return super.f(j, j2);
    }

    public final ot9 T() {
        ArrayDeque arrayDeque = this.C;
        return !arrayDeque.isEmpty() ? (ot9) arrayDeque.getLast() : this.W1;
    }

    public abstract yfj U(nt9 nt9Var, b87 b87Var, MediaCrypto mediaCrypto, float f);

    public abstract void V(u55 u55Var);

    public final void W(nt9 nt9Var, MediaCrypto mediaCrypto) {
        this.u1 = nt9Var;
        b87 b87Var = this.F;
        b87Var.getClass();
        String str = nt9Var.a;
        float f = this.Z;
        b87[] b87VarArr = this.j;
        b87VarArr.getClass();
        float fQ = Q(f, b87Var, b87VarArr);
        if (fQ <= this.w) {
            fQ = -1.0f;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        yfj yfjVarU = U(nt9Var, b87Var, mediaCrypto, fQ);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            z3d z3dVar = this.f;
            z3dVar.getClass();
            hrk.a(yfjVarU, z3dVar);
        }
        try {
            iyl.b("createCodec:" + str);
            kt9 kt9VarP = this.t.p(yfjVarU);
            this.n1 = kt9VarP;
            kt9VarP.o(new due(this));
            iyl.c();
            this.g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!nt9Var.e(this.s, b87Var)) {
                String strE = b87.e(b87Var);
                Locale locale = Locale.US;
                lvb.G0("MediaCodecRenderer", nbh.w("Format exceeds selected codec's capabilities [", strE, ", ", str, "]"));
            }
            this.r1 = fQ;
            this.o1 = b87Var;
            boolean z = false;
            this.v1 = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = nt9Var.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && nt9Var.g)) {
                z = true;
            }
            this.y1 = z;
            this.n1.getClass();
            if (this.h == 2) {
                this.g.getClass();
                this.A1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.V1.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i >= 31 && !this.e2.isEmpty()) {
                kt9 kt9Var = this.n1;
                kt9Var.getClass();
                kt9Var.t(new ArrayList(this.e2));
            }
            c0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            iyl.c();
            throw th;
        }
    }

    public final boolean X(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        b87 b87Var = this.G;
        return (b87Var != null && Objects.equals(b87Var.n, "audio/opus") && uel.e(j, j2)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7 A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00b7, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00b7, blocks: (B:47:0x00a3, B:49:0x00a7, B:51:0x00ae, B:56:0x00b9, B:60:0x00c6), top: B:72:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void Y() throws ExoPlaybackException {
        b87 b87Var;
        xu5 xu5Var;
        if (this.n1 != null || this.F1 || (b87Var = this.F) == null) {
            return;
        }
        String str = b87Var.n;
        boolean z = true;
        if (this.I == null && z0(b87Var)) {
            this.F1 = false;
            q0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            ut0 ut0Var = this.A;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                ut0Var.getClass();
                ut0Var.k = 32;
            } else {
                ut0Var.getClass();
                ut0Var.k = 1;
            }
            this.F1 = true;
            return;
        }
        t0(this.I);
        if (this.H == null) {
            try {
                xu5Var = this.H;
                if (xu5Var == null && (xu5Var.getState() == 3 || this.H.getState() == 4)) {
                    xu5 xu5Var2 = this.H;
                    str.getClass();
                    if (!xu5Var2.h(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                Z(this.K, z);
            } catch (MediaCodecRenderer$DecoderInitializationException e) {
                throw d(e, b87Var, false, 4001);
            }
        } else {
            lvb.b0(this.K == null);
            xu5 xu5Var3 = this.H;
            cd7 cd7VarD = xu5Var3.d();
            if (!cd7.c || cd7VarD == null) {
                if (cd7VarD == null) {
                    try {
                        this.K = new MediaCrypto(cd7VarD.a, cd7VarD.b);
                    } catch (MediaCryptoException e2) {
                        throw d(e2, this.F, false, 6006);
                    }
                } else if (xu5Var3.c() != null) {
                }
                xu5Var = this.H;
                if (xu5Var == null) {
                    z = false;
                } else {
                    z = false;
                }
                Z(this.K, z);
            } else {
                int state = xu5Var3.getState();
                if (state == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionC = xu5Var3.c();
                    drmSession$DrmSessionExceptionC.getClass();
                    throw d(drmSession$DrmSessionExceptionC, this.F, false, drmSession$DrmSessionExceptionC.a);
                }
                if (state == 4) {
                    if (cd7VarD == null) {
                        this.K = new MediaCrypto(cd7VarD.a, cd7VarD.b);
                    } else if (xu5Var3.c() != null) {
                    }
                    xu5Var = this.H;
                    if (xu5Var == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    Z(this.K, z);
                }
            }
        }
        MediaCrypto mediaCrypto = this.K;
        if (mediaCrypto == null || this.n1 != null) {
            return;
        }
        mediaCrypto.release();
        this.K = null;
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        b87 b87Var = this.F;
        b87Var.getClass();
        if (this.s1 == null) {
            try {
                List listO = O(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.s1 = arrayDeque;
                if (this.v) {
                    arrayDeque.addAll(listO);
                } else {
                    ArrayList arrayList = (ArrayList) listO;
                    if (!arrayList.isEmpty()) {
                        this.s1.add((nt9) arrayList.get(0));
                    }
                }
                this.t1 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(b87Var, e, z, -49998);
            }
        }
        if (this.s1.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(b87Var, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.s1;
        arrayDeque2.getClass();
        while (this.n1 == null) {
            nt9 nt9Var = (nt9) arrayDeque2.peekFirst();
            nt9Var.getClass();
            if (!a0(b87Var) || !x0(nt9Var)) {
                return;
            }
            try {
                W(nt9Var, mediaCrypto);
            } catch (Exception e2) {
                lvb.H0("MediaCodecRenderer", "Failed to initialize decoder: " + nt9Var, e2);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + nt9Var.a + ", " + b87Var, e2, b87Var.n, z, nt9Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                b0(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.t1;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.t1 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.t1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.t1;
                }
            }
        }
        this.s1 = null;
    }

    @Override // defpackage.ks0, defpackage.e4d
    public void a(int i, Object obj) {
        int i2;
        if (i == 11) {
            eg6 eg6Var = (eg6) obj;
            eg6Var.getClass();
            this.J = eg6Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                u98 u98Var = (u98) obj;
                if (this.e2.equals(u98Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(u98Var);
                    HashSet hashSet2 = new HashSet();
                    pci it = this.e2.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    kt9 kt9Var = this.n1;
                    if (kt9Var != null) {
                        if (!hashSet2.isEmpty()) {
                            kt9Var.v(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            kt9Var.t(new ArrayList(hashSet));
                        }
                    }
                }
                this.e2 = u98Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            pu3 pu3Var = (pu3) obj;
            this.c2 = pu3Var;
            kt9 kt9Var2 = this.n1;
            if (kt9Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : pu3Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                kt9Var2.setParameters(bundle);
            }
        }
    }

    public boolean a0(b87 b87Var) {
        return true;
    }

    public abstract void b0(Exception exc);

    public abstract void c0(long j, long j2, String str);

    public abstract void d0(pu3 pu3Var);

    public abstract void e0(String str);

    @Override // defpackage.ks0
    public final long f(long j, long j2) {
        return S(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (r5.h(r4) != false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.w55 f0(defpackage.v2a r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt9.f0(v2a):w55");
    }

    public abstract void g0(b87 b87Var, MediaFormat mediaFormat);

    public void h0() {
    }

    public void i0(long j) {
        this.X1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j < ((ot9) arrayDeque.peek()).a) {
                return;
            }
            ot9 ot9Var = (ot9) arrayDeque.poll();
            ot9Var.getClass();
            u0(ot9Var);
            j0();
        }
    }

    public abstract void j0();

    public void k0(u55 u55Var) {
    }

    public final void l0() throws ExoPlaybackException {
        int i = this.L1;
        if (i == 1) {
            N();
            return;
        }
        if (i == 2) {
            N();
            C0();
        } else if (i != 3) {
            this.R1 = true;
            p0();
        } else {
            o0();
            Y();
        }
    }

    @Override // defpackage.ks0
    public void m() {
        this.F = null;
        u0(ot9.f);
        this.C.clear();
        if (this.F1) {
            this.F1 = false;
            q0();
        } else {
            if (this.n1 == null) {
                return;
            }
            if (y0()) {
                o0();
            } else if (w0()) {
                N();
            } else {
                this.a2 = true;
            }
        }
    }

    public abstract boolean m0(long j, long j2, kt9 kt9Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b87 b87Var);

    public final boolean n0(int i) throws ExoPlaybackException {
        v2a v2aVar = this.c;
        v2aVar.k();
        u55 u55Var = this.x;
        u55Var.q();
        int iW = w(v2aVar, u55Var, i | 4);
        if (iW == -5) {
            f0(v2aVar);
            return true;
        }
        if (iW != -4 || !u55Var.d(4)) {
            return false;
        }
        this.Q1 = true;
        l0();
        return false;
    }

    public final void o0() {
        try {
            kt9 kt9Var = this.n1;
            if (kt9Var != null) {
                kt9Var.release();
                this.V1.b++;
                nt9 nt9Var = this.u1;
                nt9Var.getClass();
                e0(nt9Var.a);
            }
            this.n1 = null;
            try {
                MediaCrypto mediaCrypto = this.K;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.K = null;
                t0(null);
                s0();
            }
        } catch (Throwable th) {
            this.n1 = null;
            try {
                MediaCrypto mediaCrypto2 = this.K;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.K = null;
                t0(null);
                s0();
            }
        }
    }

    @Override // defpackage.ks0
    public void p(long j, boolean z, boolean z2) throws ExoPlaybackException {
        ArrayDeque arrayDeque = this.C;
        if (!arrayDeque.isEmpty()) {
            this.W1 = (ot9) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.Q1 = false;
            this.R1 = false;
            this.T1 = false;
            if (this.F1) {
                q0();
            } else if (this.n1 != null) {
                if (y0()) {
                    o0();
                    Y();
                } else if (w0()) {
                    N();
                } else {
                    this.a2 = true;
                }
            }
            if (this.W1.d.f() > 0) {
                this.S1 = true;
            }
            i0g i0gVar = this.W1.d;
            synchronized (i0gVar) {
                i0gVar.a = 0;
                i0gVar.b = 0;
                Arrays.fill((Object[]) i0gVar.d, (Object) null);
            }
        }
    }

    public abstract void p0();

    public final void q0() {
        this.P1 = -9223372036854775807L;
        T().e = -9223372036854775807L;
        this.X1 = -9223372036854775807L;
        this.H1 = false;
        this.A.q();
        this.z.q();
        this.G1 = false;
        bsb bsbVar = this.D;
        bsbVar.getClass();
        bsbVar.c = fb0.a;
        bsbVar.b = 0;
        bsbVar.a = 2;
    }

    public void r0() {
        this.B1 = -1;
        this.y.d = null;
        this.C1 = -1;
        this.D1 = null;
        this.P1 = -9223372036854775807L;
        T().e = -9223372036854775807L;
        this.X1 = -9223372036854775807L;
        this.A1 = -9223372036854775807L;
        this.N1 = false;
        this.z1 = -9223372036854775807L;
        this.M1 = false;
        this.w1 = false;
        this.x1 = false;
        this.E1 = false;
        this.K1 = 0;
        this.L1 = 0;
        this.J1 = this.I1 ? 1 : 0;
        this.a2 = false;
        this.b2 = 0L;
    }

    public final void s0() {
        r0();
        this.U1 = null;
        this.s1 = null;
        this.u1 = null;
        this.o1 = null;
        this.p1 = null;
        this.q1 = false;
        this.O1 = false;
        this.r1 = -1.0f;
        this.v1 = false;
        this.y1 = false;
        this.I1 = false;
        this.J1 = 0;
    }

    public final void t0(xu5 xu5Var) {
        xu5.e(this.H, xu5Var);
        this.H = xu5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.ks0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(defpackage.b87[] r12, long r13, long r15, defpackage.x4a r17) {
        /*
            r11 = this;
            ot9 r12 = r11.W1
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            ot9 r4 = new ot9
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            boolean r12 = r11.Z1
            if (r12 == 0) goto L56
            r11.j0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.C
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.P1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.X1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            ot9 r4 = new ot9
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            ot9 r12 = r11.W1
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.j0()
        L56:
            return
        L57:
            ot9 r0 = new ot9
            long r1 = r11.P1
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt9.u(b87[], long, long, x4a):void");
    }

    public final void u0(ot9 ot9Var) {
        this.W1 = ot9Var;
        if (ot9Var.c != -9223372036854775807L) {
            this.Y1 = true;
            h0();
        }
    }

    public boolean v0(u55 u55Var) {
        return false;
    }

    public boolean w0() {
        return true;
    }

    public boolean x0(nt9 nt9Var) {
        return true;
    }

    @Override // defpackage.ks0
    public void y(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.T1) {
            this.T1 = false;
            l0();
        }
        ExoPlaybackException exoPlaybackException = this.U1;
        if (exoPlaybackException != null) {
            this.U1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.R1) {
                p0();
                return;
            }
            if (this.F != null || n0(2)) {
                Y();
                if (this.F1) {
                    iyl.b("bypassRender");
                    while (H(j, j2)) {
                    }
                    iyl.c();
                } else if (this.n1 != null) {
                    this.g.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iyl.b("drainAndFeed");
                    while (L(j, j2)) {
                        long j3 = this.X;
                        if (j3 != -9223372036854775807L) {
                            this.g.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (M()) {
                        long j4 = this.X;
                        if (j4 != -9223372036854775807L) {
                            this.g.getClass();
                            z = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    iyl.c();
                } else {
                    t55 t55Var = this.V1;
                    int i = t55Var.d;
                    xye xyeVar = this.i;
                    xyeVar.getClass();
                    t55Var.d = i + xyeVar.o(j - this.k);
                    n0(1);
                }
                synchronized (this.V1) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw d(e, this.F, false, vqi.C(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            b0(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                o0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionJ = J(e2, this.u1);
            throw d(mediaCodecDecoderExceptionJ, this.F, z3, mediaCodecDecoderExceptionJ.b == 1101 ? 4006 : 4003);
        }
    }

    public boolean y0() {
        int i = this.L1;
        if (i == 3 || (this.v1 && !this.O1)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            C0();
            return false;
        } catch (ExoPlaybackException e) {
            lvb.H0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean z0(b87 b87Var) {
        return false;
    }
}
