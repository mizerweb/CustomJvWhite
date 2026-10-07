package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class k90 implements t7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void c() {
    }

    @Override // defpackage.t7b
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((m90) obj).a();
                break;
            default:
                ka0 ka0Var = (ka0) obj;
                xte xteVar = ka0Var.a.a;
                iu9 iu9Var = xteVar.g;
                if (cqk.d(iu9Var != null ? iu9Var.M() : null, xteVar.u)) {
                    xteVar.u = null;
                }
                iu9 iu9Var2 = xteVar.g;
                if (iu9Var2 != null) {
                    int iF = iu9Var2.F();
                    Integer numValueOf = iF >= 0 ? Integer.valueOf(iF) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        iu9 iu9Var3 = xteVar.g;
                        if (iu9Var3 != null) {
                            iu9Var3.R(iIntValue);
                        }
                    }
                }
                ka0.e(ka0Var);
                break;
        }
    }

    @Override // defpackage.t7b
    public final void d(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m90 m90Var = (m90) obj;
                m90Var.a();
                m90Var.c.a(h90.a);
                break;
            default:
                ka0 ka0Var = (ka0) obj;
                xte xteVar = ka0Var.a.a;
                iu9 iu9Var = xteVar.g;
                if (cqk.d(iu9Var != null ? iu9Var.M() : null, xteVar.u)) {
                    xteVar.u = null;
                }
                iu9 iu9Var2 = xteVar.g;
                if (iu9Var2 != null) {
                    int iF = iu9Var2.F();
                    Integer numValueOf = iF >= 0 ? Integer.valueOf(iF) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        iu9 iu9Var3 = xteVar.g;
                        if (iu9Var3 != null) {
                            iu9Var3.R(iIntValue);
                        }
                    }
                }
                ka0.e(ka0Var);
                break;
        }
    }

    @Override // defpackage.t7b
    public final void g() {
        switch (this.a) {
            case 0:
                break;
            default:
                ka0.e((ka0) this.b);
                break;
        }
    }

    @Override // defpackage.t7b
    public final void i() {
        switch (this.a) {
            case 0:
                break;
            default:
                ka0.e((ka0) this.b);
                break;
        }
    }

    @Override // defpackage.t7b
    public final void j() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((m90) obj).a();
                break;
            default:
                ka0.e((ka0) obj);
                break;
        }
    }

    @Override // defpackage.t7b
    public final void k() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m90 m90Var = (m90) obj;
                w7b w7bVar = m90Var.a;
                if (!w7bVar.a.k() && !w7bVar.a.l()) {
                    Long l = m90Var.g;
                    long jG = w7bVar.a.g();
                    if (l == null || l.longValue() != jG) {
                        if (m90Var.g == null) {
                            m90Var.g = Long.valueOf(w7bVar.a.g());
                        }
                        if (!m90Var.f) {
                            m90Var.c.a(new i90(new tnh(R.string.audio_onboarding_intro)));
                            m90Var.a();
                            break;
                        }
                    } else {
                        gm0.n(k90.class.getName(), "media is equals");
                        break;
                    }
                } else {
                    gm0.n(k90.class.getName(), "Skip onboarding for audio draft/record");
                    break;
                }
                break;
            default:
                ka0.e((ka0) obj);
                break;
        }
    }

    @Override // defpackage.t7b
    public final void n() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((m90) obj).a();
                break;
            default:
                ka0.e((ka0) obj);
                break;
        }
    }
}
