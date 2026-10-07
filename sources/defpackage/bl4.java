package defpackage;

import android.view.View;
import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bl4 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ bl4(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ContactListWidget contactListWidget = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iL = contactListWidget.p.l() + contactListWidget.r.l();
                zsj zsjVar = contactListWidget.l;
                int iL2 = zsjVar.l() + iL;
                zsj zsjVar2 = contactListWidget.n;
                int iL3 = zsjVar2.l() + iL2;
                int iL4 = contactListWidget.o.l();
                CharSequence charSequenceQ1 = contactListWidget.q1();
                if ((charSequenceQ1 == null || charSequenceQ1.length() == 0) && iIntValue >= iL && iIntValue >= iL4) {
                    if (iIntValue < iL2) {
                        return ((ek4) ((k79) zsjVar.F(iIntValue - iL))).b;
                    }
                    if (iIntValue < iL3) {
                        return ((ek4) ((k79) zsjVar2.F(iIntValue - iL2))).b;
                    }
                }
                return null;
            case 1:
                ((sm8) contactListWidget.g.getValue()).a("show", "plus", "invite_friends");
                opl.b(contactListWidget, 1).f((View) obj).l(contactListWidget.E).b().build().u(contactListWidget);
                return sbiVar;
            default:
                zv8[] zv8VarArr = ContactListWidget.o1;
                contactListWidget.getRouter().C(contactListWidget);
                return sbiVar;
        }
    }
}
