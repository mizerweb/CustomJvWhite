package defpackage;

import android.widget.PopupWindow;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.stories.edit.EditStoryScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nc1 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nc1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((af7) obj).invoke();
                break;
            case 1:
                ((a42) obj).u = null;
                break;
            case 2:
                ((ChatScreen) obj).n = null;
                break;
            case 3:
                ((EditStoryScreen) obj).I = null;
                break;
            case 4:
                ((ForwardPickerScreen) obj).y = null;
                break;
            case 5:
                ((MessagesListWidget) obj).p1 = null;
                break;
            default:
                f7e f7eVar = ((h7e) obj).l;
                if (f7eVar != null) {
                    f7eVar.onDismiss();
                }
                break;
        }
    }
}
