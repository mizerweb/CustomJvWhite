package defpackage;

import one.me.contactlist.ContactListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class al4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ al4(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        jcc jccVar;
        int i = this.a;
        ContactListWidget contactListWidget = this.b;
        switch (i) {
            case 0:
                vv vvVar = contactListWidget.Y;
                zv8[] zv8VarArr = ContactListWidget.o1;
                if (contactListWidget.getView() != null) {
                    zv8[] zv8VarArr2 = ContactListWidget.o1;
                    zv8 zv8Var = zv8VarArr2[6];
                    if (((Boolean) vvVar.a(contactListWidget)).booleanValue()) {
                        ((k96) contactListWidget.C.m(contactListWidget, zv8VarArr2[1])).w0(0);
                        zv8 zv8Var2 = zv8VarArr2[6];
                        vvVar.b(contactListWidget, Boolean.FALSE);
                    }
                }
                return sbi.a;
            case 1:
                ca2 ca2Var = contactListWidget.a;
                ap0 ap0Var = (ap0) ca2Var.getAccessor().c(936);
                cl4 cl4Var = contactListWidget.t1().c;
                cl4Var.getClass();
                return ap0Var.a(cl4Var == cl4.a ? ca2Var.getAccessor().d(932) : ca2Var.getAccessor().d(931), ((Boolean) contactListWidget.z.getValue()).booleanValue(), new al4(contactListWidget, 5));
            case 2:
                return vd7.o(contactListWidget.b, new ifh(new al4(contactListWidget, 3)), contactListWidget);
            case 3:
                zv8[] zv8VarArr3 = ContactListWidget.o1;
                return contactListWidget.getRouter();
            case 4:
                return new uj4(contactListWidget.a.getAccessor().d(97));
            case 5:
                zv8[] zv8VarArr4 = ContactListWidget.o1;
                return Boolean.valueOf(((vj4) contactListWidget.t1().u.a.getValue()).b());
            case 6:
                zv8[] zv8VarArr5 = ContactListWidget.o1;
                int iOrdinal = contactListWidget.t1().c.ordinal();
                if (iOrdinal == 0) {
                    return y3f.CALL_NEW_CALL;
                }
                if (iOrdinal == 1) {
                    return y3f.CONTACTS_TAB;
                }
                if (iOrdinal == 2) {
                    return null;
                }
                ore.o();
                return null;
            case 7:
                zv8[] zv8VarArr6 = ContactListWidget.o1;
                return new jed((xed) contactListWidget.t1().F.getValue());
            case 8:
                return contactListWidget.h.a();
            case 9:
                z8 z8Var = contactListWidget.i;
                z8Var.getClass();
                return new y8(z8Var.a, z8Var.b, z8Var.c);
            case 10:
                zv8[] zv8VarArr7 = ContactListWidget.o1;
                rcc rccVar = new rcc(contactListWidget.getContext());
                rccVar.setId(R.id.oneme_contactlist_toolbar);
                int iOrdinal2 = contactListWidget.t1().c.ordinal();
                gcc gccVar = gcc.Compact;
                if (iOrdinal2 == 0) {
                    rccVar.setForm(gccVar);
                    rccVar.setTitle(R.string.contact_list_call_contact_title);
                } else if (iOrdinal2 == 1) {
                    rccVar.setForm(gccVar);
                    rccVar.setTitle(R.string.contacts);
                } else {
                    if (iOrdinal2 != 2) {
                        ore.o();
                        return null;
                    }
                    rccVar.setForm(gcc.Main);
                    rccVar.setTitle(R.string.contacts);
                }
                int iOrdinal3 = contactListWidget.t1().c.ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                    rccVar.setLeftActions(new wbc(new bl4(contactListWidget, 2)));
                }
                kcc kccVar = new kcc(new uik(8, contactListWidget));
                int iOrdinal4 = contactListWidget.t1().c.ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                    jccVar = null;
                } else {
                    if (iOrdinal4 != 2) {
                        ore.o();
                        return null;
                    }
                    jccVar = new jcc(R.drawable.icon_plus, null, null, null, 0.0f, new bl4(contactListWidget, 1), 254);
                }
                rccVar.setRightActions(new acc(kccVar, jccVar, null));
                t7c searchView = rccVar.getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(np4.q(rccVar.getContext(), R.string.contact_list_search_hint));
                    if (contactListWidget.u1()) {
                        searchView.setExpandWithAnimation(false);
                        searchView.d();
                        searchView.setExpandWithAnimation(true);
                        searchView.setSearchText(contactListWidget.q1());
                    }
                }
                return rccVar;
            default:
                zv8[] zv8VarArr8 = ContactListWidget.o1;
                return new fl4(contactListWidget);
        }
    }
}
