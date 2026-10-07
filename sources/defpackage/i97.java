package defpackage;

import android.view.ViewGroup;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sharedata.ShareDataPickerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class i97 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i97(ViewGroup viewGroup, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = viewGroup;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ViewGroup viewGroup = this.f;
        switch (i) {
            case 0:
                return new i97(viewGroup, lq4Var, 0);
            default:
                return new i97(viewGroup, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((i97) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((i97) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ViewGroup viewGroup = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                lvb.H(viewGroup, ForwardPickerScreen.A, null);
                break;
            default:
                ch3.d0(obj);
                lvb.H(viewGroup, ShareDataPickerScreen.D, null);
                break;
        }
        return sbiVar;
    }
}
