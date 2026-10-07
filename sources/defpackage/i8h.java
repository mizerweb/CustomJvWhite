package defpackage;

import java.io.EOFException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class i8h implements kyh {
    public final kyh a;
    public final b8h b;
    public d8h g;
    public b87 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = vqi.b;
    public final nmc c = new nmc();

    public i8h(kyh kyhVar, b8h b8hVar) {
        this.a = kyhVar;
        this.b = b8hVar;
    }

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, jyhVar);
            return;
        }
        lvb.O("DRM on subtitles is not supported", jyhVar == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.k(this.f, i4, i2, c8h.c, new c4a(this, j, i));
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                lvb.H0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(nmcVar, i, i2);
            return;
        }
        h(i);
        nmcVar.k(this.e, this.f, i);
        this.e += i;
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.d(q25Var, i, z);
        }
        h(i);
        int i2 = q25Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        c.n();
        return 0;
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        b87Var.n.getClass();
        String str = b87Var.n;
        lvb.R(uya.h(str) == 3);
        boolean zEquals = b87Var.equals(this.h);
        b8h b8hVar = this.b;
        if (!zEquals) {
            this.h = b87Var;
            this.g = b8hVar.a(b87Var) ? b8hVar.m(b87Var) : null;
        }
        d8h d8hVar = this.g;
        kyh kyhVar = this.a;
        if (d8hVar == null) {
            kyhVar.g(b87Var);
            return;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.m = uya.n("application/x-media3-cues");
        a87VarA.j = str;
        a87VarA.r = BuildConfig.MAX_TIME_TO_UPLOAD;
        a87VarA.K = b8hVar.n(b87Var);
        ewi.n(a87VarA, kyhVar);
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
