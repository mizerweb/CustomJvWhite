package defpackage;

import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class fg1 implements t65 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ha9 d;
    public final /* synthetic */ c32 e;

    public fg1(long j, boolean z, boolean z2, ha9 ha9Var, c32 c32Var) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = ha9Var;
        this.e = c32Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        CallScreen.D1.getClass();
        ylc ylcVar = new ylc("type", "CHAT");
        ylc ylcVar2 = new ylc("chat_id", Long.valueOf(this.a));
        ylc ylcVar3 = new ylc("video_enabled", Boolean.valueOf(this.b));
        ylc ylcVar4 = new ylc("microphone_enabled", Boolean.valueOf(this.c));
        c32 c32Var = this.e;
        return new CallScreen(n1g.i(ylcVar, ylcVar2, ylcVar3, ylcVar4, new ylc("call_start_source", c32Var != null ? c32Var.a : null), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(this.d.a))));
    }
}
