package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eyc implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    public /* synthetic */ eyc(PickerChatsListWidget pickerChatsListWidget, int i) {
        this.a = i;
        this.b = pickerChatsListWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        xyc xycVar;
        int i = this.a;
        int i2 = 0;
        zD = false;
        boolean zD = false;
        i2 = 0;
        PickerChatsListWidget pickerChatsListWidget = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                qxc qxcVar = (qxc) pickerChatsListWidget.s.J(iIntValue);
                if (qxcVar != null && (xycVar = qxcVar.h) != null) {
                    i2 = xycVar.c;
                }
                CharSequence charSequence = (CharSequence) pickerChatsListWidget.v1().l.a.getValue();
                if (charSequence == null || charSequence.length() == 0) {
                    if (i2 == 6) {
                        return pickerChatsListWidget.getContext().getText(R.string.chat_list_folders_picker_entity_sticky_header_filters);
                    }
                    if (i2 != 0) {
                        return pickerChatsListWidget.getContext().getText(R.string.chat_list_folders_picker_entity_sticky_header_chats);
                    }
                }
                return null;
            default:
                nee neeVar = (nee) ww3.r1(pickerChatsListWidget.r.F());
                oxc oxcVar = pickerChatsListWidget.s;
                if (neeVar != oxcVar) {
                    oxcVar = pickerChatsListWidget.t;
                }
                if (oxcVar.l() > iIntValue && iIntValue >= 0) {
                    zD = ((m8b) pickerChatsListWidget.v1().i.a.getValue()).d(((qxc) ((k79) oxcVar.F(iIntValue))).h.a);
                }
                return Boolean.valueOf(zD);
        }
    }
}
