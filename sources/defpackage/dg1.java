package defpackage;

import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class dg1 implements t65 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ha9 g;
    public final /* synthetic */ c32 h;

    public dg1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ha9 ha9Var, c32 c32Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = ha9Var;
        this.h = c32Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        CallScreen.D1.getClass();
        ylc ylcVar = new ylc("type", "LINK");
        ylc ylcVar2 = new ylc("link", this.a);
        ylc ylcVar3 = new ylc("is_video_call", Boolean.valueOf(this.b));
        ylc ylcVar4 = new ylc("video_enabled", Boolean.valueOf(this.c));
        ylc ylcVar5 = new ylc("microphone_enabled", Boolean.valueOf(this.d));
        ylc ylcVar6 = new ylc("front_camera_enabled", Boolean.valueOf(this.e));
        ylc ylcVar7 = new ylc("is_new", Boolean.valueOf(this.f));
        c32 c32Var = this.h;
        return new CallScreen(n1g.i(ylcVar, ylcVar2, ylcVar3, ylcVar4, ylcVar5, ylcVar6, ylcVar7, new ylc("call_start_source", c32Var != null ? c32Var.a : null), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(this.g.a))));
    }
}
