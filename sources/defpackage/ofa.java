package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ofa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MessageContextMenuBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofa(lq4 lq4Var, MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = messageContextMenuBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.g;
        switch (i) {
            case 0:
                ofa ofaVar = new ofa(lq4Var, messageContextMenuBottomSheet, 0);
                ofaVar.f = obj;
                return ofaVar;
            case 1:
                ofa ofaVar2 = new ofa(lq4Var, messageContextMenuBottomSheet, 1);
                ofaVar2.f = obj;
                return ofaVar2;
            default:
                ofa ofaVar3 = new ofa(lq4Var, messageContextMenuBottomSheet, 2);
                ofaVar3.f = obj;
                return ofaVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ofa) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ofa) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ofa) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                zv8[] zv8VarArr = MessageContextMenuBottomSheet.w1;
                Bundle bundle = messageContextMenuBottomSheet.getArgs().getBundle("actions");
                Collection collectionB = bundle != null ? mpl.b(bundle) : null;
                if (collectionB == null) {
                    collectionB = r66.a;
                }
                messageContextMenuBottomSheet.t1.H(ww3.G1(list, Collections.singletonList(new sp4(collectionB))));
                return sbiVar;
            case 1:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                if (!cqk.d((jaa) obj2, jaa.a)) {
                    ore.o();
                    return null;
                }
                h8c h8cVar = new h8c(messageContextMenuBottomSheet);
                h8cVar.n(np4.q(messageContextMenuBottomSheet.getContext(), R.string.self_profile_click));
                h8cVar.p();
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr3 = MessageContextMenuBottomSheet.w1;
                if (rbbVar instanceof i65) {
                    messageContextMenuBottomSheet.v1(true);
                    ln5 ln5Var = new ln5(messageContextMenuBottomSheet, new nfa(messageContextMenuBottomSheet, rbbVar));
                    if (messageContextMenuBottomSheet.getRouter() != null) {
                        messageContextMenuBottomSheet.getRouter().a(ln5Var);
                    } else {
                        messageContextMenuBottomSheet.addLifecycleListener(new bb(messageContextMenuBottomSheet, ln5Var, 9));
                    }
                }
                return sbiVar;
        }
    }
}
