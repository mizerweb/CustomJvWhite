package defpackage;

import android.text.style.ClickableSpan;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class sea implements o59 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sea(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.o59
    public final void a(String str, t59 t59Var, ClickableSpan clickableSpan) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MessagesListWidget.G1(((ata) obj2).a, str, t59Var, Long.valueOf(((tea) obj).A), null, 8);
                break;
            case 1:
                MessagesListWidget.G1(((qpa) obj2).f.a, str, t59Var, Long.valueOf(((MessageModel) obj).a), null, 8);
                break;
            default:
                MessagesListWidget.G1((MessagesListWidget) obj2, str, t59Var, null, ((d76) obj).h, 4);
                break;
        }
    }

    @Override // defpackage.o59
    public final void b(cga cgaVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                long j = ((tea) obj).A;
                MessagesListWidget messagesListWidget = ((ata) obj2).a;
                zv8[] zv8VarArr = MessagesListWidget.T1;
                messagesListWidget.F1().l0(cgaVar, j);
                break;
            case 1:
                ata ataVar = ((qpa) obj2).f;
                long j2 = ((MessageModel) obj).a;
                MessagesListWidget messagesListWidget2 = ataVar.a;
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                messagesListWidget2.F1().l0(cgaVar, j2);
                break;
            default:
                zv8[] zv8VarArr3 = MessagesListWidget.T1;
                ((MessagesListWidget) obj2).F1().l0(cgaVar, 0L);
                break;
        }
    }
}
