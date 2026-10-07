package defpackage;

import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ul3 implements i8c {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1g b;

    public /* synthetic */ ul3(s1g s1gVar, int i) {
        this.a = i;
        this.b = s1gVar;
    }

    @Override // defpackage.i8c
    public final void w(j8c j8cVar) {
        int i = this.a;
        s1g s1gVar = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatsListWidget.X;
                s1gVar.b.invoke(j8cVar);
                break;
            default:
                zv8[] zv8VarArr2 = ContactListWidget.o1;
                s1gVar.b.invoke(j8cVar);
                break;
        }
    }
}
