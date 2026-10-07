package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class jy5 implements tw8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ jy5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.tw8
    public final void i() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = EditAndReplyScreen.w;
                ((EditAndReplyScreen) widget).r1().h(false);
                break;
            case 1:
                ow0 ow0Var = ((ForwardPickerScreen) widget).r;
                if (ow0Var.d()) {
                    ((tha) ow0Var.getValue()).h(false);
                }
                break;
            case 2:
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = ((MediaBarWidget) widget).s1;
                if (selectedMediaBottomBarWidget != null) {
                    selectedMediaBottomBarWidget.q1().h(false);
                }
                break;
            case 3:
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = (SelectedMediaBottomBarWidget) widget;
                if (selectedMediaBottomBarWidget2.getView() != null) {
                    zv8[] zv8VarArr2 = SelectedMediaBottomBarWidget.C;
                    selectedMediaBottomBarWidget2.q1().h(false);
                }
                break;
            default:
                ow0 ow0Var2 = ((ShareDataPickerScreen) widget).r;
                if (ow0Var2.d()) {
                    ((tha) ow0Var2.getValue()).h(false);
                }
                break;
        }
    }
}
