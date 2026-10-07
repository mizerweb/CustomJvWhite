package defpackage;

import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b03 implements af7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b03(long j, String str, boolean z) {
        this.b = j;
        this.d = str;
        this.c = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        boolean z = this.c;
        Object obj = this.d;
        long j = this.b;
        switch (i) {
            case 0:
                return ((qw2) ((h03) obj)).e0(j, z);
            default:
                zv8[] zv8VarArr = ContactListWidget.o1;
                wn4.b.j(j, ((String) obj).toString(), z);
                return sbi.a;
        }
    }

    public /* synthetic */ b03(h03 h03Var, long j, boolean z) {
        this.d = h03Var;
        this.b = j;
        this.c = z;
    }
}
