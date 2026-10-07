package defpackage;

import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.profile.screens.invite.ProfileInviteScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class wpd extends g6g {
    public final ProfileInviteScreen f;
    public final pld g;

    public wpd(ExecutorService executorService, ProfileInviteScreen profileInviteScreen) {
        super(executorService);
        this.f = profileInviteScreen;
        this.g = new pld(2, this);
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N */
    public final void u(uud uudVar, int i) {
        lfe lfeVar;
        frd frdVar = (frd) ((k79) F(i));
        uudVar.B(frdVar);
        if (frdVar instanceof uqd) {
            lfeVar = uudVar instanceof kl8 ? (kl8) uudVar : null;
            if (lfeVar != null) {
                qe7.H(lfeVar.a, 300L, new o37(10, new k9d(this, 10, (uqd) frdVar)));
                return;
            }
            return;
        }
        if (!(frdVar instanceof mqd)) {
            if (frdVar instanceof hqd) {
                lfeVar = uudVar instanceof qm8 ? (qm8) uudVar : null;
                if (lfeVar != null) {
                    ((atf) lfeVar.a).setOnSwitchListener(this.g);
                    return;
                }
                return;
            }
            return;
        }
        boolean z = uudVar instanceof q03;
        q03 q03Var = z ? (q03) uudVar : null;
        if (q03Var != null) {
            qe7.H(q03Var.a, 300L, new t8(15, new vpd(this, 0)));
        }
        lfeVar = z ? (q03) uudVar : null;
        if (lfeVar != null) {
            ((n03) lfeVar.a).setOnMoreActionsClickListener(new vpd(this, 1));
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((frd) ((k79) F(i))).getF();
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        uud uudVar = (uud) lfeVar;
        if (list.isEmpty()) {
            u(uudVar, i);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof usd) {
                usd usdVar = (usd) obj;
                qm8 qm8Var = uudVar instanceof qm8 ? (qm8) uudVar : null;
                if (qm8Var != null) {
                    ((atf) qm8Var.a).setChecked(usdVar.a);
                }
            }
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = 268435455 & i;
        if (i2 == 8192) {
            return new kl8(new atf(viewGroup.getContext()));
        }
        if (i2 == 4) {
            return new h70(viewGroup.getContext());
        }
        if (i2 == 16384) {
            return new q03(new n03(viewGroup.getContext()));
        }
        if (i2 == 2048) {
            return new qm8(new atf(viewGroup.getContext()));
        }
        ore.k(nbh.q(i, "unknown item viewType: "));
        return null;
    }
}
