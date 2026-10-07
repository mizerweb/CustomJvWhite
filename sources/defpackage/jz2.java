package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jz2 implements fdd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fdd
    public final boolean test(Object obj) {
        int i = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                long j = ((gda) obj).a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            if (((o3b) ((tjh) it.next()).f).i == j) {
                                z = true;
                            }
                        } catch (Throwable th) {
                            qr7.o(th);
                            return false;
                        }
                    }
                }
                return !z;
            case 1:
                return ((List) obj2).contains(Long.valueOf(((vg4) obj).w()));
            default:
                return ((rtc) obj).e == ((vg4) obj2).w();
        }
    }
}
