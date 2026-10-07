package defpackage;

import android.content.res.Resources;
import one.me.chatscreen.ChatScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hb3 implements cf7 {
    public final /* synthetic */ ChatScreen a;
    public final /* synthetic */ int b;

    public hb3(ChatScreen chatScreen, int i) {
        this.a = chatScreen;
        this.b = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        ChatScreen chatScreen = this.a;
        Resources resources = chatScreen.getContext().getResources();
        int i = this.b;
        ChatScreen.q2(chatScreen, null, resources.getQuantityString(R.plurals.chat_screen_share_contact_snackbar_title, i, Integer.valueOf(i)), null, Integer.valueOf(R.drawable.done_fill_round_animated), 5);
        return sbi.a;
    }
}
