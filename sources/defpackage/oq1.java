package defpackage;

import android.widget.LinearLayout;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oq1 implements qq {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll6 b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ oq1(ll6 ll6Var, Widget widget, int i) {
        this.a = i;
        this.b = ll6Var;
        this.c = widget;
    }

    @Override // defpackage.oq
    public final void R0(rq rqVar, int i) {
        int i2 = this.a;
        Widget widget = this.c;
        ll6 ll6Var = this.b;
        switch (i2) {
            case 0:
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) widget;
                ldf ldfVar = CallLinkInfoScreen.t;
                float interpolation = ll6Var.getInterpolation(Math.abs(i) / rqVar.getTotalScrollRange());
                float f = 1.0f - interpolation;
                j8e j8eVar = callLinkInfoScreen.h;
                zv8[] zv8VarArr = CallLinkInfoScreen.u;
                ((LinearLayout) j8eVar.m(callLinkInfoScreen, zv8VarArr[0])).setAlpha(f);
                LinearLayout linearLayout = (LinearLayout) j8eVar.m(callLinkInfoScreen, zv8VarArr[0]);
                int i3 = f <= 0.1f ? 4 : 0;
                if (linearLayout.getVisibility() != i3) {
                    linearLayout.setVisibility(i3);
                }
                callLinkInfoScreen.s1().setTitleAlpha(interpolation);
                break;
            case 1:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) widget;
                zv8[] zv8VarArr2 = CallOpponentsListWidget.v;
                float interpolation2 = ll6Var.getInterpolation(Math.abs(i) / rqVar.getTotalScrollRange());
                float f2 = 1.0f - interpolation2;
                j8e j8eVar2 = callOpponentsListWidget.j;
                zv8[] zv8VarArr3 = CallOpponentsListWidget.v;
                ((LinearLayout) j8eVar2.m(callOpponentsListWidget, zv8VarArr3[1])).setAlpha(f2);
                o7j.i((LinearLayout) j8eVar2.m(callOpponentsListWidget, zv8VarArr3[1]), f2 > 0.1f);
                callOpponentsListWidget.o1().setTitleAlpha(interpolation2);
                break;
            case 2:
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) widget;
                zv8[] zv8VarArr4 = ProfileEditScreen.p;
                float interpolation3 = ll6Var.getInterpolation(Math.abs(i) / rqVar.getTotalScrollRange());
                ((LinearLayout) profileEditScreen.k.m(profileEditScreen, ProfileEditScreen.p[3])).setAlpha(1.0f - interpolation3);
                profileEditScreen.r1().setTitleAlpha(interpolation3);
                break;
            default:
                ProfileScreen profileScreen = (ProfileScreen) widget;
                ku8 ku8Var = ProfileScreen.B;
                float interpolation4 = ll6Var.getInterpolation(Math.abs(i) / rqVar.getTotalScrollRange());
                ((LinearLayout) profileScreen.l.m(profileScreen, ProfileScreen.C[3])).setAlpha(1.0f - interpolation4);
                profileScreen.t1().setTitleAlpha(interpolation4);
                break;
        }
    }
}
