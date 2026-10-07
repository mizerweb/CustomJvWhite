package defpackage;

import android.view.Menu;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tw implements ohf {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bw(0, (float[]) obj);
            case 1:
                return new d29(this);
            case 2:
                return new bw(1, (Menu) obj);
            case 3:
                return oc9.T((qf7) obj);
            default:
                return (Iterator) obj;
        }
    }
}
