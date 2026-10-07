package defpackage;

import android.view.View;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aah implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aah(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) obj;
                zv8[] zv8VarArr = SuggestionsWidget.F;
                mjg mjgVar = suggestionsWidget.J1().y;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, null));
                suggestionsWidget.v1(true);
                break;
            case 1:
                y yVarO1 = ((AboutAppSettingsScreen) ((zo7) ((bt1) obj).v).b).o1();
                yab.i0(yVarO1.b, null, 0, new jhc(yVarO1, null, 1), 3);
                break;
            case 2:
                ((icc) obj).b.invoke(view);
                break;
            case 3:
                ((jcc) obj).h.invoke(view);
                break;
            case 4:
                ((mvh) obj).dismiss();
                break;
            case 5:
                zv8[] zv8VarArr2 = TwoFAOnboardingScreen.g;
                x7i x7iVar = (x7i) ((TwoFAOnboardingScreen) obj).e.getValue();
                if (x7iVar.c != v7i.b) {
                    sgg sggVar = x7iVar.h;
                    if (sggVar == null || !sggVar.isActive()) {
                        a8j.x(x7iVar.f, new l7i(true));
                        x7iVar.h = a8j.t(x7iVar, ((n0c) ((xhh) x7iVar.e.getValue())).b(), new ryf(x7iVar, null, 24), 2);
                    }
                } else {
                    ic6 ic6Var = x7iVar.g;
                    n7i.b.getClass();
                    a8j.x(ic6Var, new i65(":settings/privacy"));
                }
                break;
            case 6:
                ((rni) obj).invoke();
                break;
            case 7:
                UserStoriesScreen userStoriesScreen = (UserStoriesScreen) obj;
                zv8[] zv8VarArr3 = UserStoriesScreen.x1;
                if (userStoriesScreen.getView() != null) {
                    userStoriesScreen.I1().D();
                }
                break;
            case 8:
                vvi vviVar = (vvi) obj;
                t50 t50Var = vviVar.e;
                Long l = vviVar.f;
                if (t50Var != null && l != null) {
                    long jLongValue = l.longValue();
                    qf7 qf7Var = vviVar.c;
                    if (qf7Var != null) {
                        qf7Var.invoke(t50Var, Long.valueOf(jLongValue));
                    }
                    break;
                }
                break;
            case 9:
                izi.g((izi) obj);
                break;
            case 10:
                zv8[] zv8VarArr4 = VideoMessageWidget.B;
                a8j.x(((VideoMessageWidget) obj).y1().j, iyi.a);
                break;
            case 11:
                zv8[] zv8VarArr5 = VideoWebViewScreen.A;
                i6j i6jVarJ1 = ((VideoWebViewScreen) obj).J1();
                i6jVarJ1.getClass();
                i6jVarJ1.p.B(i6jVarJ1, i6j.u[0], a8j.t(i6jVarJ1, null, new hpf(i6jVarJ1, null, 23), 1));
                break;
            case 12:
                ((hbj) ((VpnPanelWidget) obj).c.getValue()).c.m(vmi.c);
                break;
            case 13:
                xcj xcjVar = ((ycj) obj).c;
                if (xcjVar != null) {
                    RecordControlsWidget recordControlsWidget = (RecordControlsWidget) ((ft0) xcjVar).a;
                    zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                    recordControlsWidget.I1().J().e();
                }
                break;
            default:
                zv8[] zv8VarArr7 = WebAppRootScreen.G;
                ((WebAppRootScreen) obj).J1().H();
                break;
        }
    }
}
