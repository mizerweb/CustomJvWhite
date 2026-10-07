package defpackage;

import android.os.Parcelable;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.multiselectbottomwidget.MultiSelectBottomWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class yma implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ yma(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (i) {
            case 0:
                Object objF0 = tre.f0(messageWriteWidget.getArgs(), "arg_scope_id", t3f.class);
                if (objF0 != null) {
                    return new MultiSelectBottomWidget((t3f) ((Parcelable) objF0), true);
                }
                c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
                return null;
            default:
                p3c p3cVar = messageWriteWidget.F;
                zv8[] zv8VarArr = MessageWriteWidget.I;
                vo8 vo8Var = (vo8) p3cVar.m(messageWriteWidget, zv8VarArr[7]);
                if (vo8Var != null) {
                    vo8Var.b(null);
                }
                p3cVar.B(messageWriteWidget, zv8VarArr[7], null);
                return sbi.a;
        }
    }
}
