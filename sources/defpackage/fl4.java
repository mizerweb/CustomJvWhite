package defpackage;

import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class fl4 extends dtb {
    public final /* synthetic */ ContactListWidget d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl4(ContactListWidget contactListWidget) {
        super(false);
        this.d = contactListWidget;
    }

    @Override // defpackage.dtb
    public final void b() {
        zv8[] zv8VarArr = ContactListWidget.o1;
        t7c searchView = this.d.s1().getSearchView();
        if (searchView != null) {
            searchView.b();
        }
    }
}
