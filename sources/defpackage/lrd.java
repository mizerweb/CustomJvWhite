package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class lrd extends g6g {
    public final ProfileMemberPermissionsScreen f;
    public final ks9 g;

    public lrd(ExecutorService executorService, ProfileMemberPermissionsScreen profileMemberPermissionsScreen) {
        super(executorService);
        this.f = profileMemberPermissionsScreen;
        this.g = new ks9(24, this);
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(wod wodVar, int i) {
        vnd vndVar = (vnd) ((k79) F(i));
        wodVar.B(vndVar);
        if (vndVar instanceof f8) {
            e8 e8Var = wodVar instanceof e8 ? (e8) wodVar : null;
            if (e8Var != null) {
                ((atf) e8Var.a).setOnSwitchListener(this.g);
            }
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((vnd) ((k79) F(i))).getF();
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (i2 == 1024) {
            return new e8(viewGroup.getContext());
        }
        if (i2 == 2048) {
            return new v1d(viewGroup.getContext());
        }
        ore.k(nbh.q(i, "unknown item viewType: "));
        return null;
    }
}
