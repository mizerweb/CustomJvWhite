package defpackage;

import one.me.chats.picker.chats.PickerChatsTabWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lyc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsTabWidget b;

    public /* synthetic */ lyc(PickerChatsTabWidget pickerChatsTabWidget, int i) {
        this.a = i;
        this.b = pickerChatsTabWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        PickerChatsTabWidget pickerChatsTabWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickerChatsTabWidget.p;
                aac aacVar = new aac(pickerChatsTabWidget.getContext());
                aacVar.setId(R.id.chats_list_folders_tabs);
                aacVar.setTabMode(0);
                return aacVar;
            case 1:
                zv8[] zv8VarArr2 = PickerChatsTabWidget.p;
                y8j y8jVar = new y8j(pickerChatsTabWidget.getContext());
                y8jVar.setId(R.id.chats_list_folders_pager);
                lvb.m0(y8jVar);
                return y8jVar;
            default:
                ca2 ca2Var = pickerChatsTabWidget.f;
                return new kyc(ca2Var.getAccessor().d(226), (q2c) ca2Var.getAccessor().c(981), (xhh) ((ifh) ca2Var.e()).getValue(), (r2c) ca2Var.getAccessor().d(674).getValue());
        }
    }
}
