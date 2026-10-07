package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class cg2 extends ks0 {
    public final u55 s;
    public final nmc t;
    public yf6 u;
    public long v;

    public cg2() {
        super(6);
        this.s = new u55(1);
        this.t = new nmc();
    }

    @Override // defpackage.ks0
    public final int D(b87 b87Var) {
        return "application/x-camera-motion".equals(b87Var.n) ? ks0.b(4, 0, 0, 0) : ks0.b(0, 0, 0, 0);
    }

    @Override // defpackage.ks0, defpackage.e4d
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.u = (yf6) obj;
        }
    }

    @Override // defpackage.ks0
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.ks0
    public final boolean j() {
        return i();
    }

    @Override // defpackage.ks0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.ks0
    public final void m() {
        yf6 yf6Var = this.u;
        if (yf6Var != null) {
            yf6Var.d();
        }
    }

    @Override // defpackage.ks0
    public final void p(long j, boolean z, boolean z2) {
        this.v = Long.MIN_VALUE;
        yf6 yf6Var = this.u;
        if (yf6Var != null) {
            yf6Var.d();
        }
    }

    @Override // defpackage.ks0
    public final void y(long j, long j2) {
        float[] fArr;
        while (!i() && this.v < 100000 + j) {
            u55 u55Var = this.s;
            u55Var.q();
            v2a v2aVar = this.c;
            v2aVar.k();
            if (w(v2aVar, u55Var, 0) != -4 || u55Var.d(4)) {
                return;
            }
            long j3 = u55Var.f;
            this.v = j3;
            boolean z = j3 < this.l;
            if (this.u != null && !z) {
                u55Var.t();
                ByteBuffer byteBuffer = u55Var.d;
                String str = vqi.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    nmc nmcVar = this.t;
                    nmcVar.L(iLimit, bArrArray);
                    nmcVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(nmcVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.u.c();
                }
            }
        }
    }
}
