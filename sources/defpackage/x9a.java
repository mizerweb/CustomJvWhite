package defpackage;

import one.me.members.list.MembersListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x9a implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MembersListWidget b;

    public /* synthetic */ x9a(MembersListWidget membersListWidget, int i) {
        this.a = i;
        this.b = membersListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        MembersListWidget membersListWidget = this.b;
        switch (i) {
            case 0:
                w9a w9aVar = (w9a) membersListWidget.a.getAccessor().c(758);
                return new v9a(membersListWidget.c, membersListWidget.d, new ifh(new x9a(membersListWidget, 2)), membersListWidget.e, new x9a(membersListWidget, 3), membersListWidget.q1().d, w9aVar.a, w9aVar.b, w9aVar.c);
            case 1:
                zv8[] zv8VarArr = MembersListWidget.t;
                return so2.F(membersListWidget.p1().getContext(), 6);
            case 2:
                caa caaVar = (caa) membersListWidget.a.getAccessor().c(759);
                long j = membersListWidget.c;
                p63 p63Var = membersListWidget.d;
                Integer num = membersListWidget.e;
                return caaVar.a(j, p63Var, num != null ? num.intValue() : Integer.MAX_VALUE);
            default:
                zv8[] zv8VarArr2 = MembersListWidget.t;
                return membersListWidget.q1().e;
        }
    }
}
