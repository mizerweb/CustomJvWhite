package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class wl3 extends EdgeEffect {
    public final /* synthetic */ ChatsListWidget a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl3(ChatsListWidget chatsListWidget, Context context) {
        super(context);
        this.a = chatsListWidget;
    }

    public final boolean a() {
        ChatsListWidget chatsListWidget = this.a;
        return (((Boolean) ((e5d) ((ifh) chatsListWidget.a.d()).getValue()).B().i()).booleanValue() && ((iug) chatsListWidget.l.getValue()).l.e.getValue() == bsg.e) ? false : true;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        if (a()) {
            super.onAbsorb(i);
        }
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        if (a()) {
            super.onPull(f);
        }
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        if (a()) {
            super.onPull(f, f2);
        }
    }
}
