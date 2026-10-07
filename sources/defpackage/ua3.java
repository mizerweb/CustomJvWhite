package defpackage;

import java.util.function.BooleanSupplier;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ua3 implements BooleanSupplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ ua3(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                ou7 ou7Var = ChatScreen.L1;
                return ((Boolean) ((ChatScreen) widget).N1().p.getValue()).booleanValue();
            default:
                zv8[] zv8VarArr = UserStoriesScreen.x1;
                return ((Boolean) ((UserStoriesScreen) widget).C1().n.a.getValue()).booleanValue();
        }
    }
}
