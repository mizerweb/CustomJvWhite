package defpackage;

import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class eg1 implements t65 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ha9 e;
    public final /* synthetic */ c32 f;

    public eg1(long j, String str, boolean z, boolean z2, ha9 ha9Var, c32 c32Var) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = ha9Var;
        this.f = c32Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        CallScreen.D1.getClass();
        ylc ylcVar = new ylc("type", "ONE_TO_ONE");
        ylc ylcVar2 = new ylc("opponent_id", Long.valueOf(this.a));
        ylc ylcVar3 = new ylc("conversation_id", this.b);
        ylc ylcVar4 = new ylc("video_enabled", Boolean.valueOf(this.c));
        ylc ylcVar5 = new ylc("microphone_enabled", Boolean.valueOf(this.d));
        c32 c32Var = this.f;
        return new CallScreen(n1g.i(ylcVar, ylcVar2, ylcVar3, ylcVar4, ylcVar5, new ylc("call_start_source", c32Var != null ? c32Var.a : null), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(this.e.a))));
    }
}
