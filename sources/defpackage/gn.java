package defpackage;

import android.widget.ImageView;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.rlottie.ImageReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class gn implements ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // one.me.rlottie.ImageReceiver
    public final void invalidate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((hn) obj).a.invalidate();
                break;
            case 1:
                ((ImageView) ((a46) obj).a).invalidate();
                break;
            case 2:
                ((lia) obj).invalidate();
                break;
            case 3:
                ((dka) obj).invalidate();
                break;
            case 4:
                ((v5c) obj).getIconView().invalidate();
                break;
            case 5:
                zv8[] zv8VarArr = ProfileChangeLinkScreen.t;
                ((ProfileChangeLinkScreen) obj).r1().invalidate();
                break;
            case 6:
                ((ImageView) ((h6e) obj).a).invalidate();
                break;
            default:
                ((nuj) obj).invalidate();
                break;
        }
    }
}
