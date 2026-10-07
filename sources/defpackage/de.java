package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class de extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AdminsFromContactsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de(lq4 lq4Var, AdminsFromContactsScreen adminsFromContactsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = adminsFromContactsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AdminsFromContactsScreen adminsFromContactsScreen = this.g;
        switch (i) {
            case 0:
                de deVar = new de(lq4Var, adminsFromContactsScreen, 0);
                deVar.f = obj;
                return deVar;
            default:
                de deVar2 = new de(lq4Var, adminsFromContactsScreen, 1);
                deVar2.f = obj;
                return deVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((de) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((de) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        AdminsFromContactsScreen adminsFromContactsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                zv8[] zv8VarArr = AdminsFromContactsScreen.k;
                boolean zB = ((je) adminsFromContactsScreen.d.getValue()).B();
                if (zB) {
                    RecyclerView recyclerViewP1 = adminsFromContactsScreen.p1();
                    zpg zpgVar = adminsFromContactsScreen.h;
                    if (zpgVar != null) {
                        recyclerViewP1.o0(zpgVar);
                    }
                    adminsFromContactsScreen.h = null;
                } else {
                    RecyclerView recyclerViewP2 = adminsFromContactsScreen.p1();
                    zpg zpgVar2 = adminsFromContactsScreen.h;
                    if (zpgVar2 != null) {
                        recyclerViewP2.o0(zpgVar2);
                    }
                    adminsFromContactsScreen.h = null;
                    adminsFromContactsScreen.o1(adminsFromContactsScreen.p1());
                }
                boolean z = zB && list.isEmpty();
                ((a76) adminsFromContactsScreen.f.m(adminsFromContactsScreen, AdminsFromContactsScreen.k[2])).setVisibility(z ? 0 : 8);
                adminsFromContactsScreen.p1().setVisibility(z ? 8 : 0);
                adminsFromContactsScreen.j.H(list);
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = AdminsFromContactsScreen.k;
                ((je) adminsFromContactsScreen.d.getValue()).h.setValue((String) obj2);
                break;
        }
        return sbiVar;
    }
}
