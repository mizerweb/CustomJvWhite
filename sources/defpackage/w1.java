package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends tre {
    public final /* synthetic */ int p = 1;
    public final /* synthetic */ ru8 q;
    public final /* synthetic */ String r;
    public final Object s;

    public w1(ru8 ru8Var, String str) {
        this.q = ru8Var;
        this.r = str;
        this.s = ru8Var.b.b;
    }

    @Override // defpackage.tre, defpackage.u76
    public void A(int i) {
        switch (this.p) {
            case 1:
                K0(Integer.toUnsignedString(i));
                break;
            default:
                super.A(i);
                break;
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public void C(String str) {
        switch (this.p) {
            case 0:
                this.q.K(new vt8(str, false, (fif) this.s), this.r);
                break;
            default:
                super.C(str);
                break;
        }
    }

    public void K0(String str) {
        this.q.K(new vt8(str, false, null), this.r);
    }

    @Override // defpackage.u76
    public final khb b() {
        switch (this.p) {
            case 0:
                return this.q.b.b;
            default:
                return (khb) this.s;
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public void f(byte b) {
        switch (this.p) {
            case 1:
                K0(String.valueOf(b & 255));
                break;
            default:
                super.f(b);
                break;
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public void p(long j) {
        switch (this.p) {
            case 1:
                K0(Long.toUnsignedString(j));
                break;
            default:
                super.p(j);
                break;
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public void u(short s) {
        switch (this.p) {
            case 1:
                K0(String.valueOf(s & 65535));
                break;
            default:
                super.u(s);
                break;
        }
    }

    public w1(ru8 ru8Var, String str, fif fifVar) {
        this.q = ru8Var;
        this.r = str;
        this.s = fifVar;
    }
}
