package defpackage;

import one.me.calls.impl.service.telecom.TelecomCallService;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xni implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xni(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                h8c h8cVar = (h8c) obj;
                UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
                h8cVar.n(np4.q(userStoriesScreen.getContext(), R.string.oneme_stories_delete_failed));
                h8cVar.j(new e9c(new tnh(R.string.try_again)));
                h8cVar.e(new rj5(29, userStoriesScreen));
                break;
            default:
                String str = ((z02) obj).a;
                gm0.n(((TelecomCallService) this.b).a, "showing notification");
                TelecomCallService telecomCallService = (TelecomCallService) this.b;
                je9 je9Var = je9.d;
                if (str.equals(((x02) telecomCallService.a().i.a.getValue()).s())) {
                    x02 x02VarI = telecomCallService.a().i(str);
                    if (x02VarI == null) {
                        x02VarI = (x02) telecomCallService.a().i.a.getValue();
                    }
                    y02 y02VarP = telecomCallService.a().p(x02VarI.s());
                    if (y02VarP == null) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "CallServiceTag", c0a.o("TelecomCallService onCreateIncomingConnection: no live session (id=", x02VarI.s(), "). cancel creating connection"), null);
                        }
                    } else {
                        ue1 ue1VarH = y02VarP.h();
                        hs1 hs1Var = (hs1) y02VarP.getAccessor().c(729);
                        yab.i0((wmi) hs1Var.e.getValue(), ((n0c) ((xhh) hs1Var.f.getValue())).c().S0(), 0, new t20(hs1Var, x02VarI.s(), (dz4) x02VarI.z().getValue(), (be1) x02VarI.b().getValue(), new os1(telecomCallService, ue1VarH, x02VarI, 21), null, 4), 2);
                    }
                } else {
                    String str2 = telecomCallService.a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, c0a.o("showIncomingCallNotification: parallel session=", str, ", manager shows notification"), null);
                    }
                }
                break;
        }
        return sbi.a;
    }
}
