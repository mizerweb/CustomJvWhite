package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class vp1 implements ComponentCallbacks {
    public final /* synthetic */ ufe a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;
    public final /* synthetic */ wf4 c;
    public final /* synthetic */ wf4 d;

    public vp1(ufe ufeVar, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, wf4 wf4Var, wf4 wf4Var2) {
        this.a = ufeVar;
        this.b = callJoinLinkPreviewWidget;
        this.c = wf4Var;
        this.d = wf4Var2;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        j8e j8eVar = callJoinLinkPreviewWidget.l;
        j8e j8eVar2 = callJoinLinkPreviewWidget.k;
        j8e j8eVar3 = callJoinLinkPreviewWidget.n;
        j8e j8eVar4 = callJoinLinkPreviewWidget.m;
        j8e j8eVar5 = callJoinLinkPreviewWidget.i;
        j8e j8eVar6 = callJoinLinkPreviewWidget.g;
        j8e j8eVar7 = callJoinLinkPreviewWidget.h;
        int i = configuration.orientation;
        ufe ufeVar = this.a;
        if (i == ufeVar.a || i == 0) {
            return;
        }
        ufeVar.a = i;
        j8e j8eVar8 = callJoinLinkPreviewWidget.j;
        if (i == 1) {
            zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
            CallJoinLinkPreviewWidget.q1(this.c, (View) j8eVar8.m(callJoinLinkPreviewWidget, zv8VarArr[3]), (View) j8eVar7.m(callJoinLinkPreviewWidget, zv8VarArr[1]), (s52) j8eVar6.m(callJoinLinkPreviewWidget, zv8VarArr[0]), (TextView) j8eVar5.m(callJoinLinkPreviewWidget, zv8VarArr[2]), (wue) j8eVar4.m(callJoinLinkPreviewWidget, zv8VarArr[6]), (q9c) j8eVar3.m(callJoinLinkPreviewWidget, zv8VarArr[7]), (wue) j8eVar2.m(callJoinLinkPreviewWidget, zv8VarArr[4]), (wue) j8eVar.m(callJoinLinkPreviewWidget, zv8VarArr[5]));
            return;
        }
        zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
        CallJoinLinkPreviewWidget.p1(this.d, (View) j8eVar8.m(callJoinLinkPreviewWidget, zv8VarArr2[3]), (View) j8eVar7.m(callJoinLinkPreviewWidget, zv8VarArr2[1]), (s52) j8eVar6.m(callJoinLinkPreviewWidget, zv8VarArr2[0]), (TextView) j8eVar5.m(callJoinLinkPreviewWidget, zv8VarArr2[2]), (wue) j8eVar4.m(callJoinLinkPreviewWidget, zv8VarArr2[6]), (q9c) j8eVar3.m(callJoinLinkPreviewWidget, zv8VarArr2[7]), (wue) j8eVar2.m(callJoinLinkPreviewWidget, zv8VarArr2[4]), (wue) j8eVar.m(callJoinLinkPreviewWidget, zv8VarArr2[5]));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
