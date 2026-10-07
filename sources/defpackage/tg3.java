package defpackage;

import android.view.View;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class tg3 extends s7g implements med {
    public long u;
    public ozg v;

    public static vu2 J(v73 v73Var) {
        int iOrdinal = v73Var.ordinal();
        if (iOrdinal == 0) {
            return vu2.a;
        }
        if (iOrdinal == 1) {
            return vu2.b;
        }
        if (iOrdinal == 2) {
            return vu2.c;
        }
        if (iOrdinal == 3) {
            return vu2.d;
        }
        if (iOrdinal == 4) {
            return vu2.e;
        }
        ore.o();
        return null;
    }

    public static void K(xu2 xu2Var, w73 w73Var) {
        dnh dnhVar = w73Var.h;
        boolean z = w73Var.l;
        if (dnhVar == null) {
            dnhVar = w73Var.e;
        }
        if (dnhVar != null && !z) {
            xu2Var.setSubtitle(dnhVar);
            return;
        }
        CharSequence charSequence = w73Var.g;
        if (charSequence == null || r5h.X0(charSequence)) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = w73Var.f;
        }
        xu2Var.g(charSequence, z);
    }

    @Override // defpackage.s7g
    public final void E() {
        ((xu2) this.a).start();
    }

    @Override // defpackage.s7g
    public final void F() {
        ((xu2) this.a).stop();
    }

    @Override // defpackage.s7g
    public final void G() {
        ((xu2) this.a).stop();
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(w73 w73Var) {
        long j = w73Var.u;
        ozg ozgVar = w73Var.x;
        this.v = ozgVar;
        xu2 xu2Var = (xu2) this.a;
        int id = xu2Var.getId();
        xu2Var.setId(Long.hashCode(w73Var.a));
        xu2Var.setTitle(w73Var.c);
        K(xu2Var, w73Var);
        dnh dnhVar = w73Var.k;
        int i = w73Var.j;
        boolean z = w73Var.l;
        if (dnhVar == null || z) {
            xu2Var.i(i, w73Var.i, z);
        } else {
            xu2Var.j(dnhVar, i);
        }
        xu2Var.setPinned(w73Var.C());
        xu2Var.setMuted(gm0.C(j));
        xu2Var.setOnline(w73Var.z());
        xu2Var.setCallBadge(w73Var.q());
        xu2Var.setLiveStreamBadge(w73Var.r());
        xu2Var.setVerified((j & 4) != 0);
        xu2Var.setMention(w73Var.x());
        xu2Var.setReaction(w73Var.w());
        xu2Var.setTime(w73Var.m);
        xu2Var.m(w73Var.p, id == xu2Var.getId());
        xu2Var.setStatus(J(w73Var.o));
        xu2Var.e(w73Var.b, w73Var.t, Long.valueOf(w73Var.s));
        xu2Var.setTrailingButton(w73Var.y);
        Long l = w73Var.r;
        this.u = l != null ? l.longValue() : 0L;
        xu2Var.setContentDescription(w73Var.w);
        xu2Var.a.z(ozgVar != null ? ozgVar.c : (short) 0, ozgVar != null ? ozgVar.d : (short) 0);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void C(w73 w73Var, Object obj) {
        CharSequence charSequence = w73Var.w;
        u73 u73Var = obj instanceof u73 ? (u73) obj : null;
        if (u73Var == null) {
            B(w73Var);
            return;
        }
        BitSet bitSet = (BitSet) u73Var.b;
        boolean z = bitSet.get(1);
        View view = this.a;
        if (z) {
            ((xu2) view).e(w73Var.b, w73Var.t, Long.valueOf(w73Var.s));
        }
        if (bitSet.get(0)) {
            ((xu2) view).setOnline(w73Var.z());
        }
        if (bitSet.get(2)) {
            ((xu2) view).setTitle(w73Var.c);
        }
        if (bitSet.get(4) || bitSet.get(15) || bitSet.get(17)) {
            xu2 xu2Var = (xu2) view;
            K(xu2Var, w73Var);
            xu2Var.setContentDescription(charSequence);
        }
        if (bitSet.get(5) || bitSet.get(16)) {
            xu2 xu2Var2 = (xu2) view;
            dnh dnhVar = w73Var.k;
            int i = w73Var.j;
            boolean z2 = w73Var.l;
            if (dnhVar == null || z2) {
                xu2Var2.i(i, w73Var.i, z2);
            } else {
                xu2Var2.j(dnhVar, i);
            }
        }
        if (bitSet.get(6)) {
            ((xu2) view).setTime(w73Var.m);
        }
        if (bitSet.get(8)) {
            ((xu2) view).setStatus(J(w73Var.o));
        }
        if (bitSet.get(9)) {
            ((xu2) view).m(w73Var.p, true);
        }
        if (bitSet.get(10)) {
            ((xu2) view).setMuted(gm0.C(w73Var.u));
        }
        if (bitSet.get(11)) {
            ((xu2) view).setReaction(w73Var.w());
        }
        if (bitSet.get(12)) {
            ((xu2) view).setMention(w73Var.x());
        }
        if (bitSet.get(13)) {
            ((xu2) view).setPinned(w73Var.C());
        }
        if (bitSet.get(14)) {
            ((xu2) view).setCallBadge(w73Var.q());
        }
        if (bitSet.get(18)) {
            ((xu2) view).setLiveStreamBadge(w73Var.r());
        }
        if (bitSet.get(19)) {
            ((xu2) view).setContentDescription(charSequence);
        }
        if (bitSet.get(20)) {
            ozg ozgVar = w73Var.x;
            this.v = ozgVar;
            ((xu2) view).a.z(ozgVar != null ? ozgVar.c : (short) 0, ozgVar != null ? ozgVar.d : (short) 0);
        }
        if (bitSet.get(21)) {
            ((xu2) view).setTrailingButton(w73Var.y);
        }
    }

    @Override // defpackage.med
    public final long c() {
        return this.u;
    }
}
