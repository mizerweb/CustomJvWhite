package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class xa3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ xa3(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ChatScreen chatScreen = this.b;
        switch (i) {
            case 0:
                ou7 ou7Var = ChatScreen.L1;
                a8j.x(chatScreen.W1().i, ypa.a);
                break;
            case 1:
                if (chatScreen.getView() != null) {
                    ou7 ou7Var2 = ChatScreen.L1;
                    rcc rccVarG2 = chatScreen.g2();
                    rccVarG2.setLeftActions(chatScreen.h2());
                    rccVarG2.setForm(chatScreen.f2());
                }
                break;
            default:
                View view = chatScreen.getView();
                if (view != null) {
                    okl.a(view);
                    ou7 ou7Var3 = ChatScreen.L1;
                    lvb.H(chatScreen.M1(), new oi8(5, 0, 5, new j11(5, 1, true)), null);
                    chatScreen.G1(chatScreen.J1());
                    chatScreen.p1();
                }
                break;
        }
        return sbiVar;
    }
}
