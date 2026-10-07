package defpackage;

import one.me.profile.screens.media.ChatMediaListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y23 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaListWidget b;

    public /* synthetic */ y23(ChatMediaListWidget chatMediaListWidget, int i) {
        this.a = i;
        this.b = chatMediaListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i;
        int i2 = this.a;
        int i3 = 2;
        ChatMediaListWidget chatMediaListWidget = this.b;
        switch (i2) {
            case 0:
                return vd7.o(chatMediaListWidget.e, new ifh(new y23(chatMediaListWidget, i3)), chatMediaListWidget);
            case 1:
                zv8[] zv8VarArr = ChatMediaListWidget.m;
                p23 p23Var = new p23(chatMediaListWidget.getContext());
                p23Var.setTitle(R.string.profile_chat_media_empty_tab_title);
                int iOrdinal = chatMediaListWidget.p1().ordinal();
                if (iOrdinal == 0) {
                    i = R.drawable.icon_media;
                } else if (iOrdinal == 1) {
                    i = R.drawable.icon_file;
                } else if (iOrdinal == 2) {
                    i = R.drawable.icon_link;
                } else {
                    if (iOrdinal != 3) {
                        ore.o();
                        return null;
                    }
                    i = R.drawable.icon_microphone;
                }
                p23Var.setIcon(i);
                return p23Var;
            default:
                zv8[] zv8VarArr2 = ChatMediaListWidget.m;
                return chatMediaListWidget.getRouter();
        }
    }
}
