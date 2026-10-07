package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class nnh extends ks0 implements Handler.Callback {
    public po2 A;
    public po2 B;
    public int C;
    public final Handler D;
    public final inh E;
    public final v2a F;
    public boolean G;
    public boolean H;
    public b87 I;
    public long J;
    public long K;
    public boolean X;
    public final cy5 s;
    public final u55 t;
    public az4 u;
    public final x7h v;
    public boolean w;
    public int x;
    public w7h y;
    public a8h z;

    public nnh(inh inhVar, Looper looper, x7h x7hVar) {
        Handler handler;
        super(3);
        this.E = inhVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = vqi.a;
            handler = new Handler(looper, this);
        }
        this.D = handler;
        this.v = x7hVar;
        this.s = new cy5(16);
        this.t = new u55(1);
        this.F = new v2a(28, false);
        this.K = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.X = false;
    }

    @Override // defpackage.ks0
    public final int D(b87 b87Var) {
        if (Objects.equals(b87Var.n, "application/x-media3-cues") || this.v.a(b87Var)) {
            return ks0.b(b87Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return uya.l(b87Var.n) ? ks0.b(1, 0, 0, 0) : ks0.b(0, 0, 0, 0);
    }

    public final void G() {
        boolean z = this.X || Objects.equals(this.I.n, "application/cea-608") || Objects.equals(this.I.n, "application/x-mp4-cea-608") || Objects.equals(this.I.n, "application/cea-708");
        String str = this.I.n;
        if (z) {
            return;
        }
        ore.k(qe7.z("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long H() {
        if (this.C == -1) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        this.A.getClass();
        return this.C >= this.A.o() ? BuildConfig.MAX_TIME_TO_UPLOAD : this.A.m(this.C);
    }

    public final long I(long j) {
        lvb.b0(j != -9223372036854775807L);
        return j - this.k;
    }

    public final void J() {
        this.z = null;
        this.C = -1;
        po2 po2Var = this.A;
        if (po2Var != null) {
            po2Var.r();
            this.A = null;
        }
        po2 po2Var2 = this.B;
        if (po2Var2 != null) {
            po2Var2.r();
            this.B = null;
        }
    }

    @Override // defpackage.ks0
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            c.t();
            return false;
        }
        zy4 zy4Var = (zy4) message.obj;
        ghe gheVar = zy4Var.a;
        inh inhVar = this.E;
        inhVar.b(gheVar);
        inhVar.k(zy4Var);
        return true;
    }

    @Override // defpackage.ks0
    public final boolean j() {
        return this.H;
    }

    @Override // defpackage.ks0
    public final boolean l() {
        b87 b87Var = this.I;
        if (b87Var != null) {
            if (Objects.equals(b87Var.n, "application/x-media3-cues")) {
                az4 az4Var = this.u;
                az4Var.getClass();
                if (az4Var.o(this.J) == Long.MIN_VALUE) {
                    try {
                        xye xyeVar = this.i;
                        xyeVar.getClass();
                        xyeVar.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.H) {
                    return false;
                }
                if (this.G) {
                    po2 po2Var = this.A;
                    long j = this.J;
                    if (po2Var == null || po2Var.o() <= 0 || po2Var.m(po2Var.o() - 1) <= j) {
                        po2 po2Var2 = this.B;
                        long j2 = this.J;
                        if ((po2Var2 == null || po2Var2.o() <= 0 || po2Var2.m(po2Var2.o() - 1) <= j2) && this.z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.ks0
    public final void m() {
        this.I = null;
        this.K = -9223372036854775807L;
        zy4 zy4Var = new zy4(I(this.J), ghe.e);
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, zy4Var).sendToTarget();
        } else {
            ghe gheVar = zy4Var.a;
            inh inhVar = this.E;
            inhVar.b(gheVar);
            inhVar.k(zy4Var);
        }
        this.J = -9223372036854775807L;
        if (this.y != null) {
            J();
            w7h w7hVar = this.y;
            w7hVar.getClass();
            w7hVar.release();
            this.y = null;
            this.x = 0;
        }
    }

    @Override // defpackage.ks0
    public final void p(long j, boolean z, boolean z2) {
        this.J = j;
        az4 az4Var = this.u;
        if (az4Var != null) {
            az4Var.clear();
        }
        zy4 zy4Var = new zy4(I(this.J), ghe.e);
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, zy4Var).sendToTarget();
        } else {
            ghe gheVar = zy4Var.a;
            inh inhVar = this.E;
            inhVar.b(gheVar);
            inhVar.k(zy4Var);
        }
        this.G = false;
        this.H = false;
        this.K = -9223372036854775807L;
        b87 b87Var = this.I;
        if (b87Var == null || Objects.equals(b87Var.n, "application/x-media3-cues")) {
            return;
        }
        if (this.x == 0) {
            J();
            w7h w7hVar = this.y;
            w7hVar.getClass();
            w7hVar.flush();
            w7hVar.d(this.l);
            return;
        }
        J();
        w7h w7hVar2 = this.y;
        w7hVar2.getClass();
        w7hVar2.release();
        this.y = null;
        this.x = 0;
        this.w = true;
        b87 b87Var2 = this.I;
        b87Var2.getClass();
        w7h w7hVarE = this.v.e(b87Var2);
        this.y = w7hVarE;
        w7hVarE.d(this.l);
    }

    @Override // defpackage.ks0
    public final void u(b87[] b87VarArr, long j, long j2, x4a x4aVar) {
        b87 b87Var = b87VarArr[0];
        this.I = b87Var;
        if (Objects.equals(b87Var.n, "application/x-media3-cues")) {
            this.u = this.I.L == 1 ? new yca() : new xva(24);
            return;
        }
        G();
        if (this.y != null) {
            this.x = 1;
            return;
        }
        this.w = true;
        b87 b87Var2 = this.I;
        b87Var2.getClass();
        w7h w7hVarE = this.v.e(b87Var2);
        this.y = w7hVarE;
        w7hVarE.d(this.l);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    @Override // defpackage.ks0
    public final void y(long j, long j2) {
        boolean z;
        String str;
        long jM;
        if (this.n) {
            long j3 = this.K;
            if (j3 != -9223372036854775807L && j >= j3) {
                J();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        b87 b87Var = this.I;
        b87Var.getClass();
        boolean zEquals = Objects.equals(b87Var.n, "application/x-media3-cues");
        inh inhVar = this.E;
        Handler handler = this.D;
        v2a v2aVar = this.F;
        boolean zC = false;
        if (zEquals) {
            this.u.getClass();
            if (!this.G) {
                u55 u55Var = this.t;
                if (w(v2aVar, u55Var, 0) == -4) {
                    if (u55Var.d(4)) {
                        this.G = true;
                    } else {
                        u55Var.t();
                        ByteBuffer byteBuffer = u55Var.d;
                        byteBuffer.getClass();
                        long j4 = u55Var.f;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.s.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(DatabaseHelper.COMPRESSED_COLUMN_NAME);
                        parcelableArrayList.getClass();
                        bz4 bz4Var = new bz4(j4, bundle.getLong("d"), l51.a(new hs4(10), parcelableArrayList));
                        u55Var.q();
                        zC = this.u.c(bz4Var, j);
                    }
                }
            }
            long jO = this.u.o(this.J);
            if (jO == Long.MIN_VALUE && this.G && !zC) {
                this.H = true;
            }
            if (jO != Long.MIN_VALUE && jO <= j) {
                zC = true;
            }
            if (zC) {
                c98 c98VarK = this.u.k(j);
                long jL = this.u.l(j);
                zy4 zy4Var = new zy4(I(jL), c98VarK);
                if (handler != null) {
                    handler.obtainMessage(1, zy4Var).sendToTarget();
                } else {
                    inhVar.b(zy4Var.a);
                    inhVar.k(zy4Var);
                }
                this.u.x(jL);
            }
            this.J = j;
            return;
        }
        G();
        this.J = j;
        po2 po2Var = this.B;
        x7h x7hVar = this.v;
        if (po2Var == null) {
            w7h w7hVar = this.y;
            w7hVar.getClass();
            w7hVar.a(j);
            try {
                w7h w7hVar2 = this.y;
                w7hVar2.getClass();
                this.B = (po2) w7hVar2.b();
            } catch (SubtitleDecoderException e) {
                lvb.l0("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, e);
                zy4 zy4Var2 = new zy4(I(this.J), ghe.e);
                if (handler != null) {
                    handler.obtainMessage(1, zy4Var2).sendToTarget();
                } else {
                    inhVar.b(zy4Var2.a);
                    inhVar.k(zy4Var2);
                }
                J();
                w7h w7hVar3 = this.y;
                w7hVar3.getClass();
                w7hVar3.release();
                this.y = null;
                this.x = 0;
                this.w = true;
                b87 b87Var2 = this.I;
                b87Var2.getClass();
                w7h w7hVarE = x7hVar.e(b87Var2);
                this.y = w7hVarE;
                w7hVarE.d(this.l);
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.A != null) {
            long jH = H();
            z = false;
            while (jH <= j) {
                this.C++;
                jH = H();
                z = true;
            }
        } else {
            z = false;
        }
        po2 po2Var2 = this.B;
        if (po2Var2 == null) {
            str = "Subtitle decoding failed. streamFormat=";
        } else if (!po2Var2.d(4)) {
            str = "Subtitle decoding failed. streamFormat=";
            if (po2Var2.b <= j) {
                po2 po2Var3 = this.A;
                if (po2Var3 != null) {
                    po2Var3.r();
                }
                this.C = po2Var2.e(j);
                this.A = po2Var2;
                this.B = null;
                z = true;
            }
        } else if (z || H() != BuildConfig.MAX_TIME_TO_UPLOAD) {
            str = "Subtitle decoding failed. streamFormat=";
        } else if (this.x == 2) {
            J();
            w7h w7hVar4 = this.y;
            w7hVar4.getClass();
            w7hVar4.release();
            this.y = null;
            this.x = 0;
            this.w = true;
            b87 b87Var3 = this.I;
            b87Var3.getClass();
            w7h w7hVarE2 = x7hVar.e(b87Var3);
            this.y = w7hVarE2;
            str = "Subtitle decoding failed. streamFormat=";
            w7hVarE2.d(this.l);
        } else {
            str = "Subtitle decoding failed. streamFormat=";
            J();
            this.H = true;
        }
        if (z) {
            this.A.getClass();
            int iE = this.A.e(j);
            if (iE == 0 || this.A.o() == 0) {
                jM = this.A.b;
            } else {
                po2 po2Var4 = this.A;
                jM = iE == -1 ? po2Var4.m(po2Var4.o() - 1) : po2Var4.m(iE - 1);
            }
            zy4 zy4Var3 = new zy4(I(jM), this.A.h(j));
            if (handler != null) {
                handler.obtainMessage(1, zy4Var3).sendToTarget();
            } else {
                inhVar.b(zy4Var3.a);
                inhVar.k(zy4Var3);
            }
        }
        if (this.x == 2) {
            return;
        }
        while (!this.G) {
            try {
                a8h a8hVar = this.z;
                if (a8hVar == null) {
                    w7h w7hVar5 = this.y;
                    w7hVar5.getClass();
                    a8hVar = (a8h) w7hVar5.e();
                    if (a8hVar == null) {
                        return;
                    } else {
                        this.z = a8hVar;
                    }
                }
                if (this.x == 1) {
                    a8hVar.a = 4;
                    w7h w7hVar6 = this.y;
                    w7hVar6.getClass();
                    w7hVar6.c(a8hVar);
                    this.z = null;
                    this.x = 2;
                    return;
                }
                int iW = w(v2aVar, a8hVar, 0);
                if (iW == -4) {
                    if (a8hVar.d(4)) {
                        this.G = true;
                        this.w = false;
                    } else {
                        b87 b87Var4 = (b87) v2aVar.c;
                        if (b87Var4 == null) {
                            return;
                        }
                        a8hVar.i = b87Var4.s;
                        a8hVar.t();
                        this.w &= !a8hVar.d(1);
                    }
                    if (!this.w) {
                        w7h w7hVar7 = this.y;
                        w7hVar7.getClass();
                        w7hVar7.c(a8hVar);
                        this.z = null;
                    }
                } else if (iW == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                lvb.l0("TextRenderer", str + this.I, e2);
                zy4 zy4Var4 = new zy4(I(this.J), ghe.e);
                if (handler != null) {
                    handler.obtainMessage(1, zy4Var4).sendToTarget();
                } else {
                    inhVar.b(zy4Var4.a);
                    inhVar.k(zy4Var4);
                }
                J();
                w7h w7hVar8 = this.y;
                w7hVar8.getClass();
                w7hVar8.release();
                this.y = null;
                this.x = 0;
                this.w = true;
                b87 b87Var5 = this.I;
                b87Var5.getClass();
                w7h w7hVarE3 = x7hVar.e(b87Var5);
                this.y = w7hVarE3;
                w7hVarE3.d(this.l);
                return;
            }
        }
    }
}
