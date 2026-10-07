package defpackage;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* JADX INFO: loaded from: classes.dex */
public final class tmc implements hu1, q42 {
    public static final gu1 c;
    public static final gni d;
    public static final tmc e;
    public final hu1 a;
    public final q42 b;

    static {
        fu1 fu1Var = fu1.c;
        ParticipantId participantIdC = anc.c(fu1Var);
        p4j p4jVar = new p4j(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantIdC).build(), false);
        p4j p4jVar2 = new p4j(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantIdC).setType(v4j.b).build(), false);
        o0a o0aVar = o0a.a;
        gu1 gu1Var = new gu1(fu1Var, o0aVar, o0aVar, o0aVar, false, false, p4jVar, p4jVar2, false, false, false, false, false, 0L, true, false, false, false, false, false, r66.a, 1, false);
        c = gu1Var;
        gni gniVar = new gni(0L, "", "", null, true, false);
        d = gniVar;
        e = new tmc(gu1Var, gniVar);
    }

    public tmc(hu1 hu1Var, q42 q42Var) {
        this.a = hu1Var;
        this.b = q42Var;
    }

    @Override // defpackage.q42
    public final String a() {
        return this.b.a();
    }

    @Override // defpackage.q42
    public final boolean b() {
        return this.b.b();
    }

    @Override // defpackage.hu1
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.hu1
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.hu1
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmc)) {
            return false;
        }
        tmc tmcVar = (tmc) obj;
        return cqk.d(this.a, tmcVar.a) && this.b.equals(tmcVar.b);
    }

    @Override // defpackage.hu1
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.q42
    public final CharSequence g() {
        return this.b.g();
    }

    @Override // defpackage.hu1
    public final fu1 getId() {
        return this.a.getId();
    }

    @Override // defpackage.q42
    public final CharSequence getName() {
        return this.b.getName();
    }

    @Override // defpackage.hu1
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.hu1
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.hu1
    public final boolean isConnected() {
        return this.a.isConnected();
    }

    @Override // defpackage.hu1
    public final boolean isScreenCaptureEnabled() {
        return this.a.isScreenCaptureEnabled();
    }

    @Override // defpackage.hu1
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.hu1
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.hu1
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.hu1
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.hu1
    public final long n() {
        return this.a.n();
    }

    @Override // defpackage.q42
    public final boolean o() {
        return this.b.o();
    }

    @Override // defpackage.q42
    public final long p() {
        return this.b.p();
    }

    @Override // defpackage.hu1
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.hu1
    public final boolean r() {
        return this.a.r();
    }

    @Override // defpackage.hu1
    public final boolean s() {
        return this.a.s();
    }

    @Override // defpackage.hu1
    public final p4j t() {
        return this.a.t();
    }

    public final String toString() {
        return "ParticipantPair(member=" + this.a + ", user=" + this.b + ")";
    }

    @Override // defpackage.hu1
    public final int u() {
        return this.a.u();
    }

    @Override // defpackage.hu1
    public final p4j v() {
        return this.a.v();
    }

    @Override // defpackage.hu1
    public final boolean w() {
        return this.a.w();
    }
}
