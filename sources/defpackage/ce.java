package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ce extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ RecyclerView f;
    public final /* synthetic */ zpg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce(zpg zpgVar, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = zpgVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        zpg zpgVar = this.g;
        RecyclerView recyclerView = (RecyclerView) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ce ceVar = new ce(zpgVar, lq4Var, 0);
                ceVar.f = recyclerView;
                ceVar.invokeSuspend(sbiVar);
                break;
            case 1:
                ce ceVar2 = new ce(zpgVar, lq4Var, 1);
                ceVar2.f = recyclerView;
                ceVar2.invokeSuspend(sbiVar);
                break;
            case 2:
                ce ceVar3 = new ce(zpgVar, lq4Var, 2);
                ceVar3.f = recyclerView;
                ceVar3.invokeSuspend(sbiVar);
                break;
            case 3:
                ce ceVar4 = new ce(zpgVar, lq4Var, 3);
                ceVar4.f = recyclerView;
                ceVar4.invokeSuspend(sbiVar);
                break;
            case 4:
                ce ceVar5 = new ce(zpgVar, lq4Var, 4);
                ceVar5.f = recyclerView;
                ceVar5.invokeSuspend(sbiVar);
                break;
            default:
                ce ceVar6 = new ce(zpgVar, lq4Var, 5);
                ceVar6.f = recyclerView;
                ceVar6.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        zpg zpgVar = this.g;
        RecyclerView recyclerView = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zpgVar.j();
                recyclerView.X();
                break;
            case 1:
                ch3.d0(obj);
                zpgVar.j();
                recyclerView.X();
                break;
            case 2:
                ch3.d0(obj);
                zpgVar.j();
                recyclerView.X();
                break;
            case 3:
                ch3.d0(obj);
                zpgVar.j();
                recyclerView.X();
                break;
            case 4:
                ch3.d0(obj);
                zpgVar.j();
                recyclerView.X();
                break;
            default:
                ch3.d0(obj);
                zpgVar.j();
                recyclerView.X();
                break;
        }
        return sbiVar;
    }
}
