package defpackage;

import java.util.List;
import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class gl4 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ vj4 f;
    public /* synthetic */ List g;
    public final /* synthetic */ ContactListWidget h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl4(int i, lq4 lq4Var, ContactListWidget contactListWidget) {
        super(3, lq4Var);
        this.e = i;
        this.h = contactListWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ContactListWidget contactListWidget = this.h;
        vj4 vj4Var = (vj4) obj;
        List list = (List) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                gl4 gl4Var = new gl4(0, lq4Var, contactListWidget);
                gl4Var.f = vj4Var;
                gl4Var.g = list;
                gl4Var.invokeSuspend(sbiVar);
                break;
            default:
                gl4 gl4Var2 = new gl4(1, lq4Var, contactListWidget);
                gl4Var2.f = vj4Var;
                gl4Var2.g = list;
                gl4Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        ContactListWidget contactListWidget = this.h;
        r66 r66Var = r66.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                vj4 vj4Var = this.f;
                List list = this.g;
                ch3.d0(obj);
                zv8[] zv8VarArr = ContactListWidget.o1;
                CharSequence charSequenceQ1 = contactListWidget.q1();
                if (charSequenceQ1 == null || charSequenceQ1.length() == 0) {
                    contactListWidget.r.H((List) contactListWidget.t1().v.getValue());
                    contactListWidget.l.H(vj4Var.a);
                    contactListWidget.m.H(r66Var);
                    contactListWidget.n.H(vj4Var.c);
                    lp0 lp0Var = contactListWidget.p;
                    if (vj4Var != vj4.d) {
                        lp0Var.H(list);
                    } else {
                        lp0Var.H(r66Var);
                    }
                }
                break;
            default:
                vj4 vj4Var2 = this.f;
                List list2 = this.g;
                ch3.d0(obj);
                zsj zsjVar = contactListWidget.n;
                lp0 lp0Var2 = contactListWidget.m;
                zsj zsjVar2 = contactListWidget.l;
                zsj zsjVar3 = contactListWidget.q;
                pk6 pk6Var = contactListWidget.r;
                zv8[] zv8VarArr2 = ContactListWidget.o1;
                contactListWidget.x1();
                CharSequence charSequenceQ2 = contactListWidget.q1();
                if (charSequenceQ2 == null || charSequenceQ2.length() == 0) {
                    zsjVar3.H(r66Var);
                    pk6Var.H((List) contactListWidget.t1().v.getValue());
                    zsjVar2.H(((vj4) contactListWidget.t1().u.a.getValue()).a);
                    lp0Var2.H(r66Var);
                    zsjVar.H(((vj4) contactListWidget.t1().u.a.getValue()).c);
                } else {
                    pk6Var.H(r66Var);
                    zsjVar3.H(list2);
                    zsjVar2.H(vj4Var2.a);
                    lp0Var2.H(vj4Var2.b);
                    zsjVar.H(vj4Var2.c);
                }
                break;
        }
        return sbiVar;
    }
}
