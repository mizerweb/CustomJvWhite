package defpackage;

import android.os.Bundle;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class zw8 {
    public final /* synthetic */ KeyboardStickersWidget a;
    public final /* synthetic */ Bundle b;

    public zw8(KeyboardStickersWidget keyboardStickersWidget, Bundle bundle) {
        this.a = keyboardStickersWidget;
        this.b = bundle;
    }

    public final void a() {
        zv8[] zv8VarArr = KeyboardStickersWidget.l;
        tpg tpgVarQ1 = this.a.q1();
        tpgVarQ1.s.B(tpgVarQ1, tpg.u[3], yab.h0(tpgVarQ1.b, ((n0c) tpgVarQ1.c).b(), 2, new qpg(tpgVarQ1, null, 1)));
    }

    public final void b(tlg tlgVar) {
        KeyboardStickersWidget keyboardStickersWidget = this.a;
        g4b g4bVarJ = ((h4b) keyboardStickersWidget.b.getValue()).J(2);
        ez9 ez9Var = (ez9) keyboardStickersWidget.d.getValue();
        a8j.x(ez9Var.f, new bz9(tlgVar.a, g4bVarJ, tlgVar.l));
        a8j.x(ez9Var.f, az9.a);
    }

    public final void c(tlg tlgVar) {
        KeyboardStickersWidget keyboardStickersWidget = this.a;
        a8j.x(((ez9) keyboardStickersWidget.d.getValue()).f, az9.a);
        rw8 rw8Var = rw8.b;
        long j = tlgVar.a;
        long j2 = this.b.getLong("arg_key_chat_id");
        String str = keyboardStickersWidget.getA().a;
        o65 o65VarB = rw8Var.b();
        StringBuilder sbS = qt4.s(j, ":stickers/preview?sticker_id=", "&chat_id=");
        sbS.append(j2);
        sbS.append("&chat_scope_id=");
        sbS.append(str);
        o65.c(o65VarB, sbS.toString(), null, null, 6);
    }
}
