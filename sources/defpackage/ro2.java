package defpackage;

import android.view.View;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ro2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ro2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zo7 zo7Var = (zo7) ((bt1) obj2).v;
                ((CharSequence) obj).toString();
                ((Number) ((g5d) ((gjf) ((AboutAppSettingsScreen) zo7Var.b).a.getAccessor().c(97))).a.d().i()).intValue();
                a55 a55Var = a55.DISABLED;
                if (3 == 3) {
                    o65.c(l.b.b(), ":settings/dev", null, null, 6);
                }
                return true;
            case 1:
                ((n61) obj2).invoke((u7a) obj);
                return true;
            case 2:
                ((uv2) obj2).invoke(Long.valueOf(((ek4) obj).a), view);
                return true;
            case 3:
                qlg qlgVar = (qlg) obj;
                tlg tlgVar = ((gj9) obj2).w;
                if (tlgVar != null) {
                    qlgVar.M(tlgVar);
                }
                return true;
            case 4:
                ((m20) obj2).invoke(Long.valueOf(((l8a) obj).a), view);
                return true;
            case 5:
                tea teaVar = (tea) obj2;
                ata ataVar = (ata) obj;
                if (!teaVar.K) {
                    long j = teaVar.A;
                    teaVar.l();
                    MessagesListWidget messagesListWidget = ataVar.a;
                    zv8[] zv8VarArr = MessagesListWidget.T1;
                    if (!((Boolean) messagesListWidget.F1().I2.getValue()).booleanValue()) {
                        MessagesListWidget.p1(messagesListWidget, j);
                    }
                }
                return true;
            case 6:
                ((al9) obj2).invoke(Integer.valueOf(((mxb) obj).a.c));
                return true;
            case 7:
                qxc qxcVar = (qxc) obj;
                return ((Boolean) ((rea) obj2).invoke(qxcVar.h, Boolean.valueOf(qxcVar.l))).booleanValue();
            case 8:
                return ((qsf) obj2).U(((psf) obj).getItemId());
            case 9:
                qlg qlgVar2 = (qlg) obj;
                tlg tlgVar2 = ((gj9) obj2).w;
                if (tlgVar2 != null) {
                    qlgVar2.M(tlgVar2);
                }
                return true;
            case 10:
                cf7 cf7Var = (cf7) obj;
                vaf vafVar = ((kmg) obj2).y;
                if (vafVar != null) {
                    cf7Var.invoke(vafVar);
                }
                return true;
            case 11:
                vyg vygVar = (vyg) obj;
                ryg rygVar = ((uyg) obj2).b;
                if (rygVar == null) {
                    return false;
                }
                vygVar.b.invoke(view, rygVar);
                return true;
            default:
                qlg qlgVar3 = (qlg) obj;
                tlg tlgVar3 = ((gj9) obj2).w;
                if (tlgVar3 != null) {
                    qlgVar3.M(tlgVar3);
                }
                return true;
        }
    }
}
