package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class la4 implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ la4(int i, int i2, Context context) {
        this.a = i2;
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Context context = this.c;
        int i2 = this.b;
        Integer num = (Integer) obj;
        Set set = (Set) obj2;
        switch (i) {
            case 0:
                if ((i2 & num.intValue()) != 0) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((oa4) it.next()).a(context);
                    }
                }
                break;
            default:
                if ((i2 & num.intValue()) != 0) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((oa4) it2.next()).a(context);
                    }
                }
                break;
        }
        return sbiVar;
    }
}
