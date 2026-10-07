package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nea implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ata b;
    public final /* synthetic */ tea c;

    public /* synthetic */ nea(tea teaVar, ata ataVar) {
        this.c = teaVar;
        this.b = ataVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        tea teaVar = this.c;
        ata ataVar = this.b;
        switch (i) {
            case 0:
                teaVar.P(ataVar, (String) obj);
                break;
            default:
                s5e s5eVar = (s5e) obj;
                long j = teaVar.A;
                MessagesListWidget messagesListWidget = ataVar.a;
                zv8[] zv8VarArr = MessagesListWidget.T1;
                jsa jsaVarF1 = messagesListWidget.F1();
                yab.i0(jsaVarF1.b, ((n0c) jsaVarF1.j).a(), 0, new f1j(jsaVarF1, j, s5eVar, (lq4) null, 9), 2);
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ nea(ata ataVar, tea teaVar) {
        this.b = ataVar;
        this.c = teaVar;
    }
}
