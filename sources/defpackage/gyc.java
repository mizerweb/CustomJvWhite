package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gyc extends fg7 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyc(PickerChatsListWidget pickerChatsListWidget, int i) {
        super(1, wk8.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$0$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget;I)Z", 0);
        this.a = i;
        switch (i) {
            case 1:
                this.b = pickerChatsListWidget;
                super(1, wk8.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$0$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget;I)Z", 0);
                break;
            default:
                this.b = pickerChatsListWidget;
                break;
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        PickerChatsListWidget pickerChatsListWidget = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Boolean.valueOf(PickerChatsListWidget.o1(pickerChatsListWidget, ((Number) obj).intValue()));
    }
}
