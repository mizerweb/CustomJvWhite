package defpackage;

import android.view.View;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class yw8 implements xee {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yw8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void c(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    @Override // defpackage.xee
    public final void b(View view) {
        int i = this.a;
    }

    @Override // defpackage.xee
    public final void d(View view) {
        dj9 dj9Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dj9 dj9Var2 = ((KeyboardStickersWidget) obj).e;
                if (dj9Var2 != null) {
                    fj9 fj9Var = view instanceof fj9 ? (fj9) view : null;
                    if (fj9Var != null) {
                        fj9Var.b(dj9Var2);
                    }
                    ouj oujVar = view instanceof ouj ? (ouj) view : null;
                    if (oujVar != null) {
                        oujVar.b(dj9Var2);
                    }
                }
                break;
            case 1:
                iea ieaVar = view instanceof iea ? (iea) view : null;
                View contentView$message_list = ieaVar != null ? ieaVar.getContentView$message_list() : null;
                if ((contentView$message_list instanceof rlg) && (dj9Var = ((MessagesListWidget) obj).q1) != null) {
                    ((rlg) contentView$message_list).c(dj9Var);
                    break;
                }
                break;
            case 2:
                dj9 dj9Var3 = ((StickerSetBottomSheet) obj).p;
                if (dj9Var3 != null) {
                    fj9 fj9Var2 = view instanceof fj9 ? (fj9) view : null;
                    if (fj9Var2 != null) {
                        fj9Var2.b(dj9Var3);
                    }
                    ouj oujVar2 = view instanceof ouj ? (ouj) view : null;
                    if (oujVar2 != null) {
                        oujVar2.b(dj9Var3);
                    }
                }
                break;
            case 3:
                dj9 dj9Var4 = ((StickersScreen) obj).k;
                fj9 fj9Var3 = view instanceof fj9 ? (fj9) view : null;
                if (fj9Var3 != null) {
                    fj9Var3.b(dj9Var4);
                }
                ouj oujVar3 = view instanceof ouj ? (ouj) view : null;
                if (oujVar3 != null) {
                    oujVar3.b(dj9Var4);
                }
                break;
            case 4:
                dj9 dj9Var5 = ((StickersSearchScreen) obj).f;
                fj9 fj9Var4 = view instanceof fj9 ? (fj9) view : null;
                if (fj9Var4 != null) {
                    fj9Var4.b(dj9Var5);
                }
                ouj oujVar4 = view instanceof ouj ? (ouj) view : null;
                if (oujVar4 != null) {
                    oujVar4.b(dj9Var5);
                }
                break;
            default:
                dj9 dj9Var6 = (dj9) obj;
                fj9 fj9Var5 = view instanceof fj9 ? (fj9) view : null;
                if (fj9Var5 != null) {
                    fj9Var5.b(dj9Var6);
                }
                ouj oujVar5 = view instanceof ouj ? (ouj) view : null;
                if (oujVar5 != null) {
                    oujVar5.b(dj9Var6);
                }
                break;
        }
    }
}
