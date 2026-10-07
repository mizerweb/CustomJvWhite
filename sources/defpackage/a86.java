package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m86 b;

    public /* synthetic */ a86(m86 m86Var, int i) {
        this.a = i;
        this.b = m86Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m86 m86Var = this.b;
        switch (i) {
            case 0:
                tvj.a(m86Var.a, "signalEndOfInputStream");
                o9b.a(m86Var.a(), new zo7(14, m86Var), m86Var.h);
                break;
            case 1:
                m86Var.h.execute(new a86(m86Var, 2));
                break;
            case 2:
                if (m86Var.x) {
                    tvj.g(m86Var.a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    m86Var.y = null;
                    m86Var.k();
                    m86Var.x = false;
                }
                break;
            case 3:
                int iD = qt4.D(m86Var.F);
                if (iD == 1) {
                    m86Var.g();
                } else if (iD == 6 || iD == 8) {
                    ore.k("Encoder is released");
                }
                break;
            case 4:
                switch (qt4.D(m86Var.F)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        m86Var.f();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        m86Var.j(7);
                        break;
                    case 6:
                    case 8:
                        break;
                    default:
                        ore.k("Unknown state: ".concat(x05.r(m86Var.F)));
                        break;
                }
                break;
            default:
                m86Var.C = true;
                if (m86Var.B) {
                    if (!m86Var.s) {
                        tvj.a(m86Var.a, "mMediaCodec.stop()");
                        m86Var.e.stop();
                    }
                    m86Var.h();
                }
                break;
        }
    }
}
