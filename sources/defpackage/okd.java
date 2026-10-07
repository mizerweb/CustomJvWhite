package defpackage;

import java.util.List;
import one.me.profile.screens.avatars.ProfileAvatarWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class okd extends mz4 {
    public final br4 k;
    public final ha9 l;
    public List m;

    public okd(br4 br4Var, ha9 ha9Var) {
        super(br4Var);
        this.k = br4Var;
        this.l = ha9Var;
        this.m = r66.a;
    }

    @Override // defpackage.mz4
    public final void G(hve hveVar, int i) {
        ckd ckdVar;
        if (hveVar.o() || (ckdVar = (ckd) ww3.u1(i, this.m)) == null) {
            return;
        }
        ProfileAvatarWidget profileAvatarWidget = new ProfileAvatarWidget(ckdVar, this.l);
        profileAvatarWidget.setTargetController(this.k);
        hveVar.T(new lve(profileAvatarWidget, null, null, null, false, -1));
    }

    @Override // defpackage.nee
    public final int l() {
        return this.m.size();
    }

    @Override // defpackage.mz4, defpackage.nee
    public final long m(int i) {
        ckd ckdVar = (ckd) ww3.u1(i, this.m);
        return ckdVar != null ? ckdVar.a() : i;
    }
}
