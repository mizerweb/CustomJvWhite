package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sw implements ohf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new y1(1, (Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new aif(obj);
            case 3:
                return new c29((String) obj);
            default:
                return new y1(2, (ViewGroup) obj);
        }
    }
}
