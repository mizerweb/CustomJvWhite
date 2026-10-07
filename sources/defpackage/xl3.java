package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final class xl3 extends ree {
    public final /* synthetic */ ChatsListWidget a;

    public xl3(ChatsListWidget chatsListWidget) {
        this.a = chatsListWidget;
    }

    @Override // defpackage.ree
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        if (i != 1) {
            return new EdgeEffect(recyclerView.getContext());
        }
        return new wl3(this.a, recyclerView.getContext());
    }
}
