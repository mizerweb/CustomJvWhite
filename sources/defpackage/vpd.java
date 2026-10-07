package defpackage;

import java.util.Collections;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vpd implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpd b;

    public /* synthetic */ vpd(wpd wpdVar, int i) {
        this.a = i;
        this.b = wpdVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        wpd wpdVar = this.b;
        switch (i) {
            case 0:
                dqd dqdVarO1 = wpdVar.f.o1();
                ic6 ic6Var = dqdVarO1.z;
                String strD = dqdVarO1.D();
                if (strD != null) {
                    a8j.x(ic6Var, new npd(strD));
                    if (it3.b()) {
                        rt2 rt2VarC = dqdVarO1.C();
                        a8j.x(ic6Var, new qpd(R.drawable.icon_copy_fill, new tnh((rt2VarC == null || !rt2VarC.x0()) ? R.string.profile_invite_copy_private_link_success : R.string.profile_invite_copy_public_link_success)));
                    }
                }
                break;
            default:
                a8j.x(wpdVar.f.o1().z, new ppd(Collections.singletonList(new rp4(R.id.profile_invite_chatlinkview_refresh_button, new tnh(R.string.profile_invite_chat_link_refresh), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_redo), Integer.valueOf(R.attr.icon_negative)))));
                break;
        }
        return sbiVar;
    }
}
