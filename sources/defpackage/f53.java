package defpackage;

import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f53 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ f53(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
                l63 l63VarU1 = chatMediaViewerScreen.U1();
                zv8[] zv8VarArr2 = l63.O1;
                l63VarU1.W(R.id.oneme_chatmedia_viewer_toolbar_action_save_gallery, null);
                break;
            default:
                zv8[] zv8VarArr3 = ChatMediaViewerScreen.Z;
                l63 l63VarU2 = chatMediaViewerScreen.U1();
                zv8[] zv8VarArr4 = l63.O1;
                l63VarU2.W(R.id.oneme_chatmedia_viewer_toolbar_action_edit, null);
                break;
        }
        return sbiVar;
    }
}
