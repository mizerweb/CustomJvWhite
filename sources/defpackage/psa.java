package defpackage;

import java.util.List;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class psa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;
    public final /* synthetic */ List c;

    public /* synthetic */ psa(MessagesListWidget messagesListWidget, List list, int i) {
        this.a = i;
        this.b = messagesListWidget;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                List list = this.c;
                String str = messagesListWidget.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.h(list.size(), "New messages submitted (rv null), size="), null);
                    }
                    break;
                }
                break;
            case 1:
                MessagesListWidget messagesListWidget2 = this.b;
                List list2 = this.c;
                MessagesLayoutManager messagesLayoutManager = messagesListWidget2.K1;
                if (messagesLayoutManager != null) {
                    if (messagesLayoutManager.L == null && messagesLayoutManager.I) {
                        z = true;
                    }
                    messagesLayoutManager.G = z;
                }
                messagesListWidget2.H.I(list2, new psa(messagesListWidget2, list2, 4));
                break;
            case 2:
                MessagesListWidget messagesListWidget3 = this.b;
                List list3 = this.c;
                String str2 = messagesListWidget3.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, zo5.h(list3.size(), "WARNING! Can't set new messages, size="), null);
                    }
                    break;
                }
                break;
            case 3:
                MessagesListWidget messagesListWidget4 = this.b;
                List list4 = this.c;
                String str3 = messagesListWidget4.a;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str3, zo5.h(list4.size(), "New messages submitted (lifecycle scope), size="), null);
                    }
                    break;
                }
                break;
            default:
                MessagesListWidget messagesListWidget5 = this.b;
                List list5 = this.c;
                String str4 = messagesListWidget5.a;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar4.b(je9Var4)) {
                        a4cVar4.c(je9Var4, str4, zo5.h(list5.size(), "New messages submitted, size="), null);
                    }
                }
                n09 n09Var = messagesListWidget5.getViewLifecycleOwner().f().d;
                if (n09Var.compareTo(n09.d) < 0) {
                    String str5 = messagesListWidget5.a;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null) {
                        je9 je9Var5 = je9.e;
                        if (a4cVar5.b(je9Var5)) {
                            a4cVar5.c(je9Var5, str5, "Scroll: can't do initial scroll because wrong lifecycle " + n09Var, null);
                        }
                        break;
                    }
                } else {
                    hva hvaVarV1 = messagesListWidget5.v1();
                    String str6 = hvaVarV1.f;
                    if (hvaVarV1.g) {
                        if (hvaVarV1.d.l() != 0) {
                            hvaVarV1.g = false;
                            if (hvaVarV1.c.f() != null) {
                                gm0.n(str6, "Scroll: do initial scroll");
                                hvaVarV1.c();
                            }
                        } else {
                            gm0.x(str6, "Scroll: can't do initial scroll because items.size == 0 in adapter", null);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
