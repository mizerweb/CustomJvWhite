package defpackage;

import java.util.Collections;
import java.util.Set;
import one.me.profile.screens.members.ChatMembersScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b73 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatMembersScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b73(lq4 lq4Var, ChatMembersScreen chatMembersScreen) {
        super(2, lq4Var);
        this.e = 2;
        this.g = chatMembersScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatMembersScreen chatMembersScreen = this.g;
        switch (i) {
            case 0:
                b73 b73Var = new b73(chatMembersScreen, lq4Var, 0);
                b73Var.f = obj;
                return b73Var;
            case 1:
                b73 b73Var2 = new b73(chatMembersScreen, lq4Var, 1);
                b73Var2.f = obj;
                return b73Var2;
            default:
                b73 b73Var3 = new b73(lq4Var, chatMembersScreen);
                b73Var3.f = obj;
                return b73Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((b73) create((u63) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((b73) create((m9a) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((b73) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ChatMembersScreen chatMembersScreen = this.g;
        int i2 = 1;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                u63 u63Var = (u63) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr = ChatMembersScreen.k;
                chatMembersScreen.r1().setTitle(u63Var.a);
                chatMembersScreen.r1().s(u63Var.b.b(chatMembersScreen.getContext()), false);
                chatMembersScreen.r1().setRightActions(u63Var.c ? new acc(new kcc(chatMembersScreen), new hcc(R.drawable.icon_edit, new a73(chatMembersScreen, 1)), null) : new acc(null, new kcc(chatMembersScreen), null));
                String str = (String) chatMembersScreen.q1().k.a.getValue();
                if (str != null) {
                    t7c searchView = chatMembersScreen.r1().getSearchView();
                    if (searchView != null) {
                        searchView.setExpandWithAnimation(false);
                    }
                    t7c searchView2 = chatMembersScreen.r1().getSearchView();
                    if (searchView2 != null && searchView2.j) {
                        searchView2.c(true);
                        ny8 ny8Var = searchView2.q;
                        if (ny8Var.d()) {
                            ((p1c) ny8Var.getValue()).setText(str);
                        }
                    }
                    t7c searchView3 = chatMembersScreen.r1().getSearchView();
                    if (searchView3 != null) {
                        searchView3.setExpandWithAnimation(true);
                    }
                }
                return sbiVar;
            case 1:
                m9a m9aVar = (m9a) obj2;
                ch3.d0(obj);
                if (m9aVar instanceof i9a) {
                    trd.b.o(((i9a) m9aVar).a);
                } else if (m9aVar instanceof g9a) {
                    g9a g9aVar = (g9a) m9aVar;
                    int i3 = g9aVar.a;
                    long j = g9aVar.b;
                    zv8[] zv8VarArr2 = ChatMembersScreen.k;
                    lq4 lq4Var = null;
                    if (i3 == R.id.profile_members_list_action_select) {
                        n9a n9aVarQ1 = chatMembersScreen.q1();
                        Set setSingleton = Collections.singleton(Long.valueOf(j));
                        mjg mjgVar = n9aVarQ1.h;
                        mjgVar.getClass();
                        mjgVar.j(null, setSingleton);
                    } else if (i3 == R.id.profile_members_list_action_delete_from_chat || i3 == R.id.profile_members_list_action_delete_from_channel) {
                        l73 l73VarP1 = chatMembersScreen.p1();
                        a8j.t(l73VarP1, ((n0c) ((xhh) l73VarP1.i.getValue())).b(), new tl1(l73VarP1, j, lq4Var, 2), 2);
                    }
                } else if (m9aVar instanceof j9a) {
                    int i4 = ((j9a) m9aVar).a;
                    if (i4 == R.id.profile_members_list_add_to_chat_action) {
                        trd trdVar = trd.b;
                        zv8[] zv8VarArr3 = ChatMembersScreen.k;
                        trdVar.j(chatMembersScreen.o1(), true);
                    } else if (i4 == R.id.profile_members_list_add_to_channel_action) {
                        trd trdVar2 = trd.b;
                        zv8[] zv8VarArr4 = ChatMembersScreen.k;
                        trdVar2.j(chatMembersScreen.o1(), false);
                    } else if (i4 == R.id.profile_members_list_invite_by_link_action) {
                        trd trdVar3 = trd.b;
                        zv8[] zv8VarArr5 = ChatMembersScreen.k;
                        trdVar3.m(chatMembersScreen.o1());
                    }
                } else if (m9aVar instanceof k9a) {
                    trd.b.o(((k9a) m9aVar).a);
                } else if (m9aVar instanceof l9a) {
                    h8c h8cVar = new h8c(chatMembersScreen);
                    h8cVar.n(np4.q(chatMembersScreen.getContext(), R.string.self_profile_click));
                    h8cVar.p();
                } else if (!(m9aVar instanceof h9a)) {
                    ore.o();
                    return null;
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                Set set = (Set) obj2;
                if (set != null) {
                    zv8[] zv8VarArr6 = ChatMembersScreen.k;
                    chatMembersScreen.r1().c(String.valueOf(set.size()), Collections.singletonList(new mcc(10101, R.string.menu_delete, R.drawable.icon_delete, false, null, 56)), new qq2(11, chatMembersScreen), new w62(set, i2, chatMembersScreen));
                } else {
                    zv8[] zv8VarArr7 = ChatMembersScreen.k;
                    if (chatMembersScreen.r1().b()) {
                        chatMembersScreen.r1().a();
                    }
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b73(ChatMembersScreen chatMembersScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatMembersScreen;
    }
}
