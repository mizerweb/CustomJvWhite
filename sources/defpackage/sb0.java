package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class sb0 extends tye {
    public final i95 e;
    public final cb0 f;
    public final u55 g;
    public final u55 h;
    public final a90 i;
    public final c90 j;
    public final b87 k;
    public boolean l;
    public long m;
    public u55 n;

    public sb0(b87 b87Var, b87 b87Var2, b2i b2iVar, s26 s26Var, c98 c98Var, so2 so2Var, iu3 iu3Var, t9b t9bVar, g85 g85Var, LogSessionId logSessionId) throws ExportException {
        c90 c90VarC;
        super(b87Var, t9bVar);
        fdg fdgVar = new fdg(false);
        z88 z88Var = new z88(4);
        z88Var.f(c98Var);
        z88Var.c(fdgVar);
        a90 a90Var = new a90(so2Var, z88Var.h());
        this.i = a90Var;
        this.k = b87Var2;
        c90 c90VarC2 = a90Var.c(s26Var, b87Var2);
        bb0 bb0Var = a90Var.c;
        cb0 cb0Var = bb0Var.d;
        boolean zEquals = cb0Var.equals(cb0.e);
        int i = cb0Var.a;
        lvb.b0(!zEquals);
        a87 a87Var = new a87();
        b2i b2iVarC = b2iVar;
        String str = b2iVarC.b;
        if (str == null) {
            str = b87Var.n;
            str.getClass();
        }
        a87Var.m = uya.n(str);
        a87Var.F = i;
        a87Var.E = cb0Var.b;
        a87Var.G = cb0Var.c;
        a87Var.j = b87Var2.k;
        b87 b87Var3 = new b87(a87Var);
        a87 a87VarA = b87Var3.a();
        a87VarA.m = uya.n(tye.h(b87Var3, t9bVar.b.a(1)));
        i95 i95VarC = iu3Var.c(new b87(a87VarA), logSessionId);
        b87 b87Var4 = i95VarC.c;
        this.e = i95VarC;
        try {
            int i2 = new cb0(i95.a(i95VarC.d.getInputFormat(), i95VarC.g, b87Var4.l)).a;
            if (i2 != i) {
                a90Var.d();
                lvb.R(i2 == -1 || i2 > 0);
                fdgVar.c = i2;
                c90VarC = a90Var.c(s26Var, b87Var2);
                cb0Var = bb0Var.d;
            } else {
                c90VarC = c90VarC2;
            }
            this.j = c90VarC;
            this.f = cb0Var;
            this.g = new u55(0);
            this.h = new u55(0);
            if (!Objects.equals(b87Var3.n, b87Var4.n)) {
                p21 p21VarA = b2iVarC.a();
                p21VarA.d(b87Var4.n);
                b2iVarC = p21VarA.c();
            }
            g85Var.M(b2iVarC);
        } catch (RuntimeException e) {
            lvb.h0("DefaultCodec", "MediaCodec error", e);
            throw i95VarC.b(e);
        }
    }

    @Override // defpackage.tye
    public final sp7 i(s26 s26Var, b87 b87Var, int i) {
        if (this.l) {
            return this.i.c(s26Var, b87Var);
        }
        this.l = true;
        lvb.b0(b87Var.equals(this.k));
        return this.j;
    }

    @Override // defpackage.tye
    public final u55 j() {
        i95 i95Var = this.e;
        ByteBuffer byteBufferD = i95Var.d();
        u55 u55Var = this.h;
        u55Var.d = byteBufferD;
        if (byteBufferD == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = i95Var.g(false) ? i95Var.a : null;
        bufferInfo.getClass();
        u55Var.f = bufferInfo.presentationTimeUs;
        u55Var.a = 1;
        return u55Var;
    }

    @Override // defpackage.tye
    public final b87 k() throws ExportException {
        i95 i95Var = this.e;
        i95Var.g(false);
        return i95Var.j;
    }

    @Override // defpackage.tye
    public final boolean l() {
        return this.e.e();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // defpackage.tye
    public final boolean m() throws ExportException {
        boolean z;
        u55 u55Var = this.n;
        u55 u55Var2 = this.g;
        i95 i95Var = this.e;
        if (u55Var == null && !i95Var.f(u55Var2)) {
            return false;
        }
        a90 a90Var = this.i;
        bb0 bb0Var = a90Var.c;
        if (!(bb0Var.g() ? bb0Var.f() : a90Var.b())) {
            return p();
        }
        if (this.n != null) {
            p();
        }
        g55.a();
        if (this.n == null) {
            ByteBuffer byteBuffer = u55Var2.d;
            byteBuffer.getClass();
            if (byteBuffer.position() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        lvb.b0(z);
        long j = this.m;
        cb0 cb0Var = this.f;
        u55Var2.f = ((j / ((long) cb0Var.d)) * 1000000) / ((long) cb0Var.a);
        u55Var2.a(4);
        u55Var2.t();
        i95Var.h(u55Var2);
        return false;
    }

    @Override // defpackage.tye
    public final void n() {
        this.i.d();
        this.e.i();
    }

    @Override // defpackage.tye
    public final void o() throws ExportException {
        this.e.j();
    }

    public final boolean p() throws ExportException {
        a90 a90Var;
        u55 u55Var = this.n;
        if (u55Var == null) {
            u55Var = this.g;
        }
        ByteBuffer byteBuffer = u55Var.d;
        byteBuffer.getClass();
        while (true) {
            a90Var = this.i;
            bb0 bb0Var = a90Var.c;
            if ((bb0Var.g() ? bb0Var.f() : a90Var.b()) || !a90Var.a().hasRemaining() || byteBuffer.remaining() <= 0) {
                break;
            }
            ByteBuffer byteBufferA = a90Var.a();
            int iMin = Math.min(byteBufferA.remaining(), byteBuffer.remaining());
            int iLimit = byteBufferA.limit();
            byteBufferA.limit(byteBufferA.position() + iMin);
            byteBuffer.put(byteBufferA);
            byteBufferA.limit(iLimit);
        }
        if (byteBuffer.remaining() != 0) {
            bb0 bb0Var2 = a90Var.c;
            if (!(bb0Var2.g() ? bb0Var2.f() : a90Var.b())) {
                this.n = u55Var;
                return false;
            }
        }
        long j = this.m;
        cb0 cb0Var = this.f;
        u55Var.f = ((j / ((long) cb0Var.d)) * 1000000) / ((long) cb0Var.a);
        this.m = j + ((long) byteBuffer.position());
        u55Var.a = 0;
        u55Var.t();
        this.e.h(u55Var);
        this.n = null;
        return true;
    }
}
