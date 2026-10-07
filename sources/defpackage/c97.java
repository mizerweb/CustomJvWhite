package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c97 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ c97(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ForwardPickerScreen.z;
                ((u87) forwardPickerScreen.x1().d).u.a(null);
                return sbiVar;
            case 1:
                zv8[] zv8VarArr2 = ForwardPickerScreen.z;
                return pq3.j.k(forwardPickerScreen.getContext()).b;
            case 2:
                return forwardPickerScreen.w;
            case 3:
                zv8[] zv8VarArr3 = ForwardPickerScreen.z;
                tha thaVar = new tha(forwardPickerScreen.getContext());
                thaVar.setId(R.id.oneme_picker_input_view);
                thaVar.setInputHint(R.string.forward_message_hint);
                thaVar.setRightOuterIconActionState(jha.a);
                thaVar.setRightOuterIconTouchListener(xzl.a(thaVar.getContext(), new dx4(forwardPickerScreen, 16, thaVar)));
                thaVar.setLeftInnerIconTouchListener(xzl.a(thaVar.getContext(), new c97(forwardPickerScreen, 0)));
                return thaVar;
            case 4:
                return ((fz9) forwardPickerScreen.k.getAccessor().c(354)).a(null);
            default:
                forwardPickerScreen.w.i();
                return sbiVar;
        }
    }
}
