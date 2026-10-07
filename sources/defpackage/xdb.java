package defpackage;

import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class xdb implements sgh {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xdb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rgh
    public final void a(ugh ughVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = NeuroAvatarPickerBottomSheet.E;
                ((NeuroAvatarPickerBottomSheet) obj).G1().I(ughVar.a);
                break;
            case 1:
                NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) obj;
                if (ughVar.a > 0) {
                    zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                    neuroAvatarsScreen.o1().setExpanded(false);
                }
                zv8[] zv8VarArr3 = NeuroAvatarsScreen.B;
                neuroAvatarsScreen.s1().I(ughVar.a);
                break;
            default:
                ((y8j) obj).h(ughVar.a, true);
                break;
        }
    }
}
