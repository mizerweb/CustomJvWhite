package defpackage;

import java.util.function.BooleanSupplier;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chats.tab.StoriesAppBarBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho3 implements BooleanSupplier {
    public final /* synthetic */ ChatsTabWidget a;

    public /* synthetic */ ho3(ChatsTabWidget chatsTabWidget) {
        this.a = chatsTabWidget;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        zv8[] zv8VarArr = ChatsTabWidget.B1;
        StoriesAppBarBehavior storiesAppBarBehaviorZ1 = this.a.z1();
        if (storiesAppBarBehaviorZ1 != null) {
            return storiesAppBarBehaviorZ1.A;
        }
        return true;
    }
}
