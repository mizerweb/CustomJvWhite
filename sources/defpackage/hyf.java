package defpackage;

import one.me.sharedata.ShareDataPickerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hyf implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ hyf(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ShareDataPickerScreen.C;
                ((vxf) shareDataPickerScreen.x1().d).t.a(null);
                return sbiVar;
            case 1:
                zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                tha thaVar = new tha(shareDataPickerScreen.getContext());
                thaVar.setId(R.id.oneme_picker_input_view);
                thaVar.setInputHint(R.string.share_message_hint);
                thaVar.setRightOuterIconActionState(jha.a);
                thaVar.setRightOuterIconTouchListener(xzl.a(thaVar.getContext(), new xre(shareDataPickerScreen, 12, thaVar)));
                thaVar.setLeftInnerIconTouchListener(xzl.a(thaVar.getContext(), new hyf(shareDataPickerScreen, 0)));
                return thaVar;
            case 2:
                return ((fz9) shareDataPickerScreen.m.getAccessor().c(354)).a(null);
            case 3:
                zv8[] zv8VarArr3 = ShareDataPickerScreen.C;
                if (((iyf) shareDataPickerScreen.o.getValue()) == iyf.DEFAULT) {
                    shareDataPickerScreen.x.i();
                }
                return sbiVar;
            default:
                return shareDataPickerScreen.x;
        }
    }
}
