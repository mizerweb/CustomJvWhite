package defpackage;

import android.view.View;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ib3 extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib3(ChatScreen chatScreen, int i, int i2) {
        super(0);
        this.a = i2;
        this.b = chatScreen;
        this.c = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = this.c;
        ChatScreen chatScreen = this.b;
        switch (i) {
            case 0:
                View view = chatScreen.getView();
                if (view != null) {
                    n7j.c(view, 300L, new hb3(chatScreen, i2));
                }
                break;
            default:
                yab.i0(chatScreen.getViewLifecycleScope(), null, 0, new jb3(chatScreen, i2, null, 0), 3);
                break;
        }
        return sbiVar;
    }
}
