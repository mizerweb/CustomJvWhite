package defpackage;

import one.me.stories.viewer.viewer.UserStoriesScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oni implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ UserStoriesScreen c;

    public /* synthetic */ oni(boolean z, UserStoriesScreen userStoriesScreen, int i) {
        this.a = i;
        this.b = z;
        this.c = userStoriesScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        lp5 lp5Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        UserStoriesScreen userStoriesScreen = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                h8c h8cVar = (h8c) obj;
                zv8[] zv8VarArr = UserStoriesScreen.x1;
                if (!z) {
                    h8cVar.n(np4.q(userStoriesScreen.getContext(), R.string.common_error));
                } else {
                    h8cVar.n(np4.q(userStoriesScreen.getContext(), R.string.saved_to_gallery));
                    h8cVar.h(new w8c(R.drawable.icon_check_round_fill));
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zv8[] zv8VarArr2 = UserStoriesScreen.x1;
                if (!zBooleanValue && !z && (lp5Var = userStoriesScreen.o1) != null) {
                    lp5Var.g = null;
                    lp5Var.invalidate();
                }
                break;
        }
        return sbiVar;
    }
}
