package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class ow8 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ RecyclerView f;
    public final /* synthetic */ KeyboardEmojiWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow8(KeyboardEmojiWidget keyboardEmojiWidget, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = keyboardEmojiWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        KeyboardEmojiWidget keyboardEmojiWidget = this.g;
        RecyclerView recyclerView = (RecyclerView) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ow8 ow8Var = new ow8(keyboardEmojiWidget, lq4Var, 0);
                ow8Var.f = recyclerView;
                ow8Var.invokeSuspend(sbiVar);
                break;
            default:
                ow8 ow8Var2 = new ow8(keyboardEmojiWidget, lq4Var, 1);
                ow8Var2.f = recyclerView;
                ow8Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.e;
        sbi sbiVar = sbi.a;
        KeyboardEmojiWidget keyboardEmojiWidget = this.g;
        a8g a8gVar = pq3.j;
        RecyclerView recyclerView = this.f;
        switch (i2) {
            case 0:
                ch3.d0(obj);
                kbc kbcVarM = keyboardEmojiWidget.j;
                if (kbcVarM == null) {
                    kbcVarM = a8gVar.e(keyboardEmojiWidget.getContext()).m();
                }
                recyclerView.setBackgroundColor(kbcVarM.k().b);
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr = KeyboardEmojiWidget.k;
                boolean zP1 = keyboardEmojiWidget.p1();
                kbc kbcVarM2 = keyboardEmojiWidget.j;
                if (zP1) {
                    if (kbcVarM2 == null) {
                        kbcVarM2 = a8gVar.e(keyboardEmojiWidget.getContext()).m();
                    }
                    i = kbcVarM2.k().b;
                } else {
                    if (kbcVarM2 == null) {
                        kbcVarM2 = a8gVar.e(keyboardEmojiWidget.getContext()).m();
                    }
                    i = kbcVarM2.p().c;
                }
                recyclerView.setBackgroundColor(i);
                break;
        }
        return sbiVar;
    }
}
