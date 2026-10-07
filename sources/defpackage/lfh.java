package defpackage;

import android.content.res.Resources;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class lfh extends ux8 implements cf7 {
    public static final lfh b;
    public static final lfh c;
    public static final lfh d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new lfh(i, 0);
        c = new lfh(i, 1);
        d = new lfh(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lfh(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 1:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                Object tag = ((View) obj).getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof g19) {
                    return (g19) tag;
                }
                return null;
        }
    }
}
