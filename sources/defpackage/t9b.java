package defpackage;

import android.util.SparseArray;
import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.MuxerWrapper$AppendTrackFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class t9b {
    public static final long t = vqi.X(500);
    public final String a;
    public final p9b b;
    public final vog c;
    public final SparseArray d;
    public final b87 e;
    public boolean f;
    public boolean g;
    public int h;
    public long i;
    public long j;
    public long k;
    public q9b l;
    public int m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public volatile int r;
    public volatile int s;

    public t9b(String str, p9b p9bVar, vog vogVar, int i, b87 b87Var) {
        this.a = str;
        this.b = p9bVar;
        this.c = vogVar;
        boolean z = false;
        lvb.R(i == 0 || i == 1);
        this.m = i;
        if ((i == 0 && b87Var == null) || (i == 1 && b87Var != null)) {
            z = true;
        }
        lvb.O("appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.", z);
        this.e = b87Var;
        this.d = new SparseArray();
        this.h = -2;
        this.p = -9223372036854775807L;
        this.j = BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static s9b c(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        s9b s9bVar = (s9b) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            s9b s9bVar2 = (s9b) sparseArray.valueAt(i);
            if (s9bVar2.f < s9bVar.f) {
                s9bVar = s9bVar2;
            }
        }
        return s9bVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[EDGE_INSN: B:27:0x0072->B:59:0x00bf BREAK  A[LOOP:0: B:35:0x008b->B:41:0x0097]] */
    public final void a(b87 b87Var) throws MuxerWrapper$AppendTrackFormatException {
        int i;
        String str = b87Var.n;
        int iH = uya.h(str);
        int i2 = 0;
        lvb.S(iH == 1 || iH == 2, "Unsupported track format: %s", str);
        if (iH == 2) {
            a87 a87VarA = b87Var.a();
            a87VarA.y = (b87Var.z + this.r) % 360;
            b87Var = new b87(a87VarA);
            if (this.m == 1) {
                b87 b87Var2 = this.e;
                b87Var2.getClass();
                boolean zC = b87Var.c(b87Var2);
                List list = b87Var.q;
                List list2 = b87Var2.q;
                if (!zC) {
                    if (!Objects.equals(b87Var2.n, "video/avc") || !Objects.equals(b87Var.n, "video/avc") || list2.size() != 2 || list.size() != 2 || !Arrays.equals((byte[]) list2.get(1), (byte[]) list.get(1))) {
                        list = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list2.get(0);
                    byte[] bArr2 = (byte[]) list.get(0);
                    if (7 >= bArr.length || bArr.length != bArr2.length) {
                        list = null;
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bArr.length) {
                            int i4 = 0;
                            while (true) {
                                byte[] bArr3 = xsg.a;
                                if (i4 >= 4) {
                                    if ((bArr[4] & 31) == 7 && bArr[5] != 0) {
                                        if (bArr2[7] >= bArr[7]) {
                                            break;
                                        }
                                        list = list2;
                                        break;
                                    }
                                } else if (bArr[i4] == bArr3[i4]) {
                                    i4++;
                                }
                            }
                        } else if (i3 == 7 || bArr[i3] == bArr2[i3]) {
                            i3++;
                        }
                        list = null;
                        break;
                    }
                }
                if (list == null) {
                    throw new MuxerWrapper$AppendTrackFormatException("Switching to MUXER_MODE_APPEND will fail.");
                }
                a87 a87VarA2 = b87Var.a();
                a87VarA2.p = list;
                b87Var = new b87(a87VarA2);
            }
        }
        if (this.m != 2) {
            int i5 = this.s;
            lvb.Z("The track count should be set before the formats are added.", i5 > 0);
            lvb.Z("All track formats have already been added.", this.d.size() < i5);
            lvb.a0("There is already a track of type %s", iH, !vqi.l(this.d, iH));
            if (this.l == null) {
                this.l = this.b.c(this.a);
            }
            s9b s9bVar = new s9b(this.l.b0(b87Var), b87Var);
            if (iH == 1 && (i = b87Var.I) > 0) {
                this.q = vqi.i0(i, 1000000L, b87Var.G, RoundingMode.FLOOR);
            }
            this.d.put(iH, s9bVar);
            vqi.K(iH);
            LinkedHashMap linkedHashMap = g55.a;
            synchronized (g55.class) {
            }
            if (b87Var.l != null) {
                while (true) {
                    jwa[] jwaVarArr = b87Var.l.a;
                    if (i2 >= jwaVarArr.length) {
                        break;
                    }
                    this.l.k(jwaVarArr[i2]);
                    i2++;
                }
            }
            if (this.d.size() == i5) {
                this.f = true;
                return;
            }
            return;
        }
        if (iH != 2) {
            if (iH == 1) {
                lvb.b0(vqi.l(this.d, 1));
                b87 b87Var3 = ((s9b) this.d.get(1)).a;
                if (!Objects.equals(b87Var3.n, b87Var.n)) {
                    throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - sampleMimeType: " + b87Var3.n + " != " + b87Var.n);
                }
                if (b87Var3.F != b87Var.F) {
                    throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - channelCount: " + b87Var3.F + " != " + b87Var.F);
                }
                if (b87Var3.G == b87Var.G) {
                    if (!b87Var3.c(b87Var)) {
                        throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - initializationData.");
                    }
                    return;
                }
                throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - sampleRate: " + b87Var3.G + " != " + b87Var.G);
            }
            return;
        }
        lvb.b0(vqi.l(this.d, 2));
        b87 b87Var4 = ((s9b) this.d.get(2)).a;
        if (!Objects.equals(b87Var4.n, b87Var.n)) {
            throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - sampleMimeType: " + b87Var4.n + " != " + b87Var.n);
        }
        if (b87Var4.u != b87Var.u) {
            throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - width: " + b87Var4.u + " != " + b87Var.u);
        }
        if (b87Var4.v != b87Var.v) {
            throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - height: " + b87Var4.v + " != " + b87Var.v);
        }
        if (b87Var4.z == b87Var.z) {
            b87 b87Var5 = this.e;
            b87Var5.getClass();
            if (!b87Var.c(b87Var5)) {
                throw new MuxerWrapper$AppendTrackFormatException("The initialization data of the newly added track format doesn't match appendVideoFormat.");
            }
            return;
        }
        throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - rotationDegrees: " + b87Var4.z + " != " + b87Var.z);
    }

    public final void b(int i) throws Exception {
        if (i == 0 && this.m == 1) {
            return;
        }
        this.f = false;
        q9b q9bVar = this.l;
        if (q9bVar != null) {
            try {
                q9bVar.close();
            } catch (MuxerException e) {
                if (i == 1) {
                    String message = e.getMessage();
                    message.getClass();
                    if (message.equals("Failed to stop the MediaMuxer")) {
                        return;
                    }
                }
                throw e;
            }
        }
    }

    public final boolean d(String str) {
        return this.b.a(uya.h(str)).contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(int i, ByteBuffer byteBuffer, boolean z, long j) {
        byte b;
        lvb.R(vqi.l(this.d, i));
        s9b s9bVar = (s9b) this.d.get(i);
        SparseArray sparseArray = this.d;
        if (this.f) {
            if (sparseArray.size() != 1) {
                long j2 = j - ((s9b) sparseArray.get(i)).f;
                long j3 = t;
                if (j2 > j3) {
                    s9b s9bVarC = c(sparseArray);
                    s9bVarC.getClass();
                    if (uya.h(s9bVarC.a.n) != i) {
                        if (i != this.h) {
                            s9b s9bVarC2 = c(sparseArray);
                            s9bVarC2.getClass();
                            this.i = s9bVarC2.f;
                        }
                        if (j - this.i <= j3) {
                            b = false;
                        }
                    }
                } else {
                    if (i != this.h) {
                        s9b s9bVarC3 = c(sparseArray);
                        s9bVarC3.getClass();
                        this.i = s9bVarC3.f;
                    }
                    if (j - this.i <= j3) {
                        b = false;
                    }
                }
            }
            b = true;
        } else {
            b = false;
        }
        vqi.K(i);
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        if (i == 2) {
            if (this.p == -9223372036854775807L) {
                this.p = j;
            }
        } else if (i == 1) {
            j -= this.q;
        }
        if (b != true) {
            return false;
        }
        if (s9bVar.e == 0) {
            if (i == 2 && vqi.l(this.d, 1) && j > 0) {
                lvb.b0(this.p != -9223372036854775807L);
                lvb.G0("MuxerWrapper", "Shifting first video timestamp from " + j + " to zero.");
                j = 0L;
            }
            s9bVar.c = j;
        }
        s9bVar.e++;
        s9bVar.d += (long) byteBuffer.remaining();
        s9bVar.f = Math.max(s9bVar.f, j);
        g2i g2iVar = (g2i) this.c.a;
        q36 q36Var = g2iVar.z;
        if (q36Var != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) q36Var.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            q36Var.d = ((ScheduledExecutorService) q36Var.c).schedule(new f4g(28, (vuf) q36Var.b), q36Var.a, TimeUnit.MILLISECONDS);
        } else {
            lvb.b0(g2iVar.e == -9223372036854775807L);
        }
        this.l.getClass();
        this.l.w0(s9bVar.b, byteBuffer, new u31(byteBuffer.remaining(), z ? 1 : 0, j));
        vqi.K(i);
        synchronized (g55.class) {
        }
        this.h = i;
        return true;
    }
}
