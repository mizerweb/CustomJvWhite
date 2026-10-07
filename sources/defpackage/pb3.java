package defpackage;

import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class pb3 implements p7c {
    public final /* synthetic */ ChatScreen a;

    public pb3(ChatScreen chatScreen) {
        this.a = chatScreen;
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        ou7 ou7Var = ChatScreen.L1;
        o73 o73Var = this.a.b2().e;
        if (charSequence != null) {
            o73Var.getClass();
            charSequence.toString();
        }
        q73 q73Var = (q73) o73Var.a;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        String str = string;
        gm0.n("q73", "Search text changed ".concat(str));
        q73Var.b();
        q73Var.c = str;
        if (str.length() != 0) {
            yab.i0(q73Var.e, null, 0, new me1(q73Var, str, 0L, (lq4) null), 3);
            return;
        }
        o73 o73Var2 = q73Var.g;
        if (o73Var2 != null) {
            o73Var2.e();
        }
    }

    @Override // defpackage.p7c
    public final void X() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            if (chatScreen.g2().b()) {
                chatScreen.g2().postDelayed(new jj2(3, chatScreen), 125L);
            } else {
                chatScreen.g2().i(true);
            }
            chatScreen.b2().B();
        }
    }

    @Override // defpackage.p7c
    public final void f() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            ou7 ou7Var = ChatScreen.L1;
            chatScreen.g2().i(false);
        }
    }

    @Override // defpackage.p7c
    public final void n() {
        ou7 ou7Var = ChatScreen.L1;
        this.a.b2().C(true);
    }
}
