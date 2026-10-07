package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class l90 implements c3j {
    public final /* synthetic */ m90 a;

    public l90(m90 m90Var) {
        this.a = m90Var;
    }

    @Override // defpackage.c3j
    public final void i() {
        m90 m90Var = this.a;
        m90Var.a();
        m90Var.c.a(h90.a);
    }

    @Override // defpackage.c3j
    public final void j(rui ruiVar) {
        m90 m90Var = this.a;
        Long l = m90Var.g;
        long jK = ruiVar.k();
        if (l != null && l.longValue() == jK) {
            gm0.n(l90.class.getName(), "media is equals");
            return;
        }
        if (m90Var.g == null) {
            m90Var.g = Long.valueOf(ruiVar.k());
        }
        if (m90Var.f) {
            return;
        }
        m90Var.c.a(new i90(new tnh(R.string.audio_onboarding_intro)));
        m90Var.a();
    }

    @Override // defpackage.c3j
    public final void o(Throwable th) {
        this.a.a();
    }
}
