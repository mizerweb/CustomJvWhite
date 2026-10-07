package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 {
    public final Context a;
    public final ku6 b;
    public final v2a c;
    public final w4 d;
    public u89 e;
    public qt3 f;
    public u70 g;
    public x70 h;
    public Looper i;
    public Context j;

    public jc0(gvb gvbVar) {
        Context context = (Context) gvbVar.b;
        this.a = context;
        v2a v2aVar = (v2a) gvbVar.c;
        v2aVar.getClass();
        this.c = v2aVar;
        this.b = (ku6) gvbVar.d;
        this.g = (u70) gvbVar.a;
        this.d = context == null ? null : new w4(this);
        this.f = qt3.a;
    }

    public final ic0 a(ta0 ta0Var) throws AudioOutputProvider$InitializationException {
        Context context;
        Context context2;
        try {
            int i = ta0Var.h;
            int i2 = ta0Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(ta0Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ta0Var.g.c()).setAudioFormat(new AudioFormat.Builder().setSampleRate(ta0Var.b).setChannelMask(ta0Var.c).setEncoding(ta0Var.a).build()).setTransferMode(1).setBufferSizeInBytes(ta0Var.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(ta0Var.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new ic0(audioTrackBuild, ta0Var, this.d, this.f);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new AudioOutputProvider$InitializationException();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new AudioOutputProvider$InitializationException(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final ra0 b(pa0 pa0Var) {
        d(pa0Var);
        b87 b87Var = (b87) pa0Var.a;
        p70 p70Var = (p70) pa0Var.b;
        oa0 oa0VarG = this.c.G(b87Var, p70Var);
        qa0 qa0Var = new qa0();
        String str = b87Var.n;
        int i = b87Var.H;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.g.d(b87Var, p70Var) != null : i == 2) {
            i2 = 2;
        }
        qa0Var.b(i2);
        qa0Var.c(oa0VarG.a);
        qa0Var.d(oa0VarG.b);
        qa0Var.e(oa0VarG.c);
        return qa0Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    public final ta0 c(pa0 pa0Var) throws AudioOutputProvider$ConfigurationException {
        int iIntValue;
        char c;
        int iV;
        boolean z;
        boolean z2;
        int i;
        int iMax;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int iJ;
        int iB;
        boolean z5;
        int i2;
        int iB2;
        boolean z6;
        int iB3;
        boolean z7;
        boolean z8;
        b87 b87Var = (b87) pa0Var.a;
        boolean z9 = pa0Var.d;
        p70 p70Var = (p70) pa0Var.b;
        d(pa0Var);
        String str = b87Var.n;
        int i3 = b87Var.G;
        int iIntValue2 = b87Var.H;
        int i4 = b87Var.F;
        if (!Objects.equals(str, "audio/raw")) {
            oa0 oa0VarG = z9 ? this.c.G(b87Var, p70Var) : oa0.d;
            if (z9 && oa0VarG.a) {
                str.getClass();
                int iC = uya.c(str, b87Var.k);
                int iU = vqi.u(i4);
                boolean z10 = oa0VarG.b;
                iIntValue2 = iC;
                iIntValue = iU;
                z = z10;
                iV = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairD = this.g.d(b87Var, p70Var);
                if (pairD == null) {
                    throw new AudioOutputProvider$ConfigurationException("Unable to configure passthrough for: " + b87Var);
                }
                iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                c = 2;
                iV = -1;
                z = false;
            }
            i = b87Var.j;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            iMax = pa0Var.h;
            if (iMax != -1) {
                z4 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                lvb.b0(z3);
                if (iV == -1) {
                    iV = 1;
                }
                if (z2) {
                    d = 8.0d;
                } else {
                    d = 1.0d;
                }
                this.b.getClass();
                if (c != 0) {
                    z4 = true;
                    long j = i3;
                    long j2 = 250000 * j;
                    long j3 = iV;
                    iJ = vqi.j(minBufferSize * 4, k4m.b((j2 * j3) / 1000000), k4m.b(((750000 * j) * j3) / 1000000));
                } else if (c != 1) {
                    z4 = true;
                    iB = gxl.b(iIntValue2);
                    if (iB != -2147483647) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    lvb.b0(z5);
                    iJ = k4m.b((50000000 * ((long) iB)) / 1000000);
                } else {
                    if (c == 2) {
                        ore.a();
                        return null;
                    }
                    if (iIntValue2 == 5) {
                        i2 = 500000;
                    } else if (iIntValue2 == 8) {
                        i2 = 1000000;
                    } else {
                        i2 = 250000;
                    }
                    if (i != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iB3 = g4m.b(i, 8);
                    } else {
                        iB2 = gxl.b(iIntValue2);
                        if (iB2 != -2147483647) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        lvb.b0(z6);
                        iB3 = iB2;
                    }
                    z4 = true;
                    iJ = k4m.b((((long) i2) * ((long) iB3)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iV) - 1) / iV) * iV;
            }
            sa0 sa0Var = new sa0();
            sa0Var.i(i3);
            sa0Var.e(iIntValue);
            sa0Var.f(iIntValue2);
            sa0Var.d(iMax);
            sa0Var.c(pa0Var.e);
            sa0Var.b(p70Var);
            z7 = z4;
            if (c == z7) {
                z8 = z7;
            } else {
                z8 = false;
            }
            sa0Var.g(z8);
            sa0Var.h(pa0Var.g);
            sa0Var.k(z2);
            sa0Var.j(z);
            sa0Var.l(pa0Var.f);
            return sa0Var.a();
        }
        lvb.R(vqi.O(iIntValue2));
        iIntValue = vqi.u(i4);
        iV = vqi.v(iIntValue2) * i4;
        z = false;
        c = 0;
        z2 = false;
        i = b87Var.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        iMax = pa0Var.h;
        if (iMax != -1) {
            z4 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            lvb.b0(z3);
            if (iV == -1) {
                iV = 1;
            }
            if (z2) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            this.b.getClass();
            if (c != 0) {
                z4 = true;
                long j4 = i3;
                long j5 = 250000 * j4;
                long j6 = iV;
                iJ = vqi.j(minBufferSize * 4, k4m.b((j5 * j6) / 1000000), k4m.b(((750000 * j4) * j6) / 1000000));
            } else if (c != 1) {
                z4 = true;
                iB = gxl.b(iIntValue2);
                if (iB != -2147483647) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                lvb.b0(z5);
                iJ = k4m.b((50000000 * ((long) iB)) / 1000000);
            } else {
                if (c == 2) {
                    ore.a();
                    return null;
                }
                if (iIntValue2 == 5) {
                    i2 = 500000;
                } else if (iIntValue2 == 8) {
                    i2 = 1000000;
                } else {
                    i2 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iB3 = g4m.b(i, 8);
                } else {
                    iB2 = gxl.b(iIntValue2);
                    if (iB2 != -2147483647) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    lvb.b0(z6);
                    iB3 = iB2;
                }
                z4 = true;
                iJ = k4m.b((((long) i2) * ((long) iB3)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iV) - 1) / iV) * iV;
        }
        sa0 sa0Var2 = new sa0();
        sa0Var2.i(i3);
        sa0Var2.e(iIntValue);
        sa0Var2.f(iIntValue2);
        sa0Var2.d(iMax);
        sa0Var2.c(pa0Var.e);
        sa0Var2.b(p70Var);
        z7 = z4;
        if (c == z7) {
            z8 = z7;
        } else {
            z8 = false;
        }
        sa0Var2.g(z8);
        sa0Var2.h(pa0Var.g);
        sa0Var2.k(z2);
        sa0Var2.j(z);
        sa0Var2.l(pa0Var.f);
        return sa0Var2.a();
    }

    public final void d(pa0 pa0Var) {
        Context context;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) pa0Var.c;
        p70 p70Var = (p70) pa0Var.b;
        e();
        x70 x70Var = this.h;
        if (x70Var == null && (context = this.a) != null) {
            x70 x70Var2 = new x70(context, new ot4(5, this), p70Var, audioDeviceInfo);
            this.h = x70Var2;
            this.g = x70Var2.i();
        } else if (x70Var != null) {
            if (audioDeviceInfo != null) {
                x70Var.m(audioDeviceInfo);
            }
            this.h.l(p70Var);
        }
        this.g.getClass();
    }

    public final void e() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.i = looperMyLooper;
        } else {
            ore.k(qe7.z("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
