package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class po3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ po3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.g;
                a4c a4cVar = gm0.f;
                lq4 lq4Var = null;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.s("ONEME-6453|chats_list_lf | tabs view attached to window. Scope isActive: ", cqk.x(chatsTabWidget.getLifecycleScope())), null);
                    }
                }
                ChatsTabWidget chatsTabWidget2 = (ChatsTabWidget) this.b;
                chatsTabWidget2.v1 = e9i.j0(new fz6(n1g.v(chatsTabWidget2.D1().r, chatsTabWidget2.getViewLifecycleOwner().f(), n09.d), new io3(lq4Var, (ChatsTabWidget) this.b, 2), 3), chatsTabWidget2.getViewLifecycleScope());
                if (((Boolean) ((ChatsTabWidget) this.b).y1().x6.a(e5d.S6[389]).i()).booleanValue()) {
                    ChatsTabWidget chatsTabWidget3 = (ChatsTabWidget) this.b;
                    chatsTabWidget3.w1.B(chatsTabWidget3, ChatsTabWidget.B1[9], yab.i0(chatsTabWidget3.getLifecycleScope(), null, 2, new qn6((ChatsTabWidget) this.b, lq4Var, 11), 1));
                }
                ChatsTabWidget chatsTabWidget4 = (ChatsTabWidget) this.b;
                int iIntValue = ((Number) chatsTabWidget4.D1().p.a.getValue()).intValue();
                chatsTabWidget4.w1().h(iIntValue, false);
                chatsTabWidget4.v1().o(iIntValue, 0.0f, true, true, true);
                break;
            case 1:
                bpe bpeVar = (bpe) this.b;
                if (!bpeVar.g && (recyclerView = (RecyclerView) bpeVar.e.get()) != null) {
                    bpeVar.a(recyclerView);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws IllegalAccessException, InvocationTargetException {
        rs2 rs2Var;
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.s("ONEME-6453|chats_list_lf | tabs view detached from window. Scope isActive: ", cqk.x(chatsTabWidget.getLifecycleScope())), null);
                    }
                }
                ChatsTabWidget chatsTabWidget2 = (ChatsTabWidget) this.b;
                if (chatsTabWidget2.getView() != null && (rs2Var = chatsTabWidget2.X) != null) {
                    rs2Var.b(false);
                }
                sgg sggVar = ((ChatsTabWidget) this.b).v1;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                ((ChatsTabWidget) this.b).v1 = null;
                break;
            case 1:
                bpe bpeVar = (bpe) this.b;
                if (!bpeVar.g && (recyclerView = (RecyclerView) bpeVar.e.get()) != null) {
                    bpeVar.b(recyclerView);
                    break;
                }
                break;
            default:
                String strT = np4.t((Widget) this.b);
                Widget widget = (Widget) this.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, strT, "lifecycle: preAttach invoke onViewDetachedFromWindow viewState=" + widget._viewLifecycleOwner.a.d, null);
                    }
                }
                view.removeOnAttachStateChangeListener(this);
                Widget widget2 = (Widget) this.b;
                widget2.finalizeCleanActions(widget2);
                break;
        }
    }
}
