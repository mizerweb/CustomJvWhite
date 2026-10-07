package defpackage;

import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pld implements wsf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pld(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wsf
    public final void j(long j, boolean z) {
        rt2 rt2VarC;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ProfileChangeLinkScreen) ((lp0) obj).g).s1().c.j(j, z);
                break;
            case 1:
                ((ProfileEditScreen) ((lp0) obj).g).s1().c.getClass();
                break;
            case 2:
                dqd dqdVarO1 = ((wpd) obj).f.o1();
                dqdVarO1.getClass();
                if (j == c6c.a && (rt2VarC = dqdVarO1.C()) != null) {
                    if (!z) {
                        dqdVarO1.B(rt2VarC);
                        a8j.x(dqdVarO1.z, new opd(new tnh(R.string.join_request_disable_confirmation_title), new tnh(R.string.join_request_disable_confirmation_description), xw3.P0(new kc4(R.id.profile_invite_join_request_disable_confirm, new tnh(R.string.join_request_disable_confirmation_confirm), 3, true, 3, 4), new kc4(R.id.profile_invite_join_request_disable_cancel, new tnh(R.string.join_request_disable_confirmation_cancel), 2, 32))));
                    } else {
                        dqdVarO1.F(true);
                    }
                    break;
                }
                break;
            default:
                ((qf7) obj).invoke(Long.valueOf(j), Boolean.valueOf(z));
                break;
        }
    }
}
