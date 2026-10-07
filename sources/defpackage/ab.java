package defpackage;

import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ab extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ AddChatMembersScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(lq4 lq4Var, AddChatMembersScreen addChatMembersScreen) {
        super(2, lq4Var);
        this.g = addChatMembersScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AddChatMembersScreen addChatMembersScreen = this.g;
        switch (i) {
            case 0:
                ab abVar = new ab(addChatMembersScreen, lq4Var);
                abVar.f = obj;
                return abVar;
            default:
                ab abVar2 = new ab(lq4Var, addChatMembersScreen);
                abVar2.f = obj;
                return abVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ab) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((ab) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        AddChatMembersScreen addChatMembersScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                long[] jArrG0 = rx8.g0((m8b) obj2);
                vv vvVar = addChatMembersScreen.l;
                zv8 zv8Var = AddChatMembersScreen.r[2];
                vvVar.b(addChatMembersScreen, jArrG0);
                break;
            default:
                ch3.d0(obj);
                if (((rbb) obj2) instanceof rt3) {
                    addChatMembersScreen.getRouter().D();
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(AddChatMembersScreen addChatMembersScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = addChatMembersScreen;
    }
}
