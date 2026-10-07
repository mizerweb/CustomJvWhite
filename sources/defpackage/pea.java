package defpackage;

import java.util.Collections;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pea implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ata b;
    public final /* synthetic */ tea c;

    public /* synthetic */ pea(ata ataVar, tea teaVar, int i) {
        this.a = i;
        this.b = ataVar;
        this.c = teaVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        tea teaVar = this.c;
        ata ataVar = this.b;
        switch (i) {
            case 0:
                long j = teaVar.A;
                MessagesListWidget messagesListWidget = ataVar.a;
                zv8[] zv8VarArr = MessagesListWidget.T1;
                jsa jsaVarF1 = messagesListWidget.F1();
                if (!jsaVarF1.c0().h()) {
                    sgg sggVar = jsaVarF1.t2;
                    if (sggVar == null || !sggVar.isActive()) {
                        jsaVarF1.t2 = yab.i0(jsaVarF1.b, ((n0c) jsaVarF1.j).a(), 0, new h99(jsaVarF1, j, (lq4) null, 1), 2);
                    }
                } else {
                    jsaVarF1.c0().i(j);
                }
                break;
            case 1:
                long j2 = teaVar.A;
                MessagesListWidget messagesListWidget2 = ataVar.a;
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                if (!messagesListWidget2.F1().c0().h()) {
                    messagesListWidget2.F1().S(Collections.singletonList(Long.valueOf(j2)), true);
                }
                break;
            case 2:
                ataVar.b(teaVar.A);
                break;
            case 3:
                ataVar.a(teaVar.A);
                break;
            default:
                ataVar.a(teaVar.A);
                break;
        }
        return sbiVar;
    }
}
