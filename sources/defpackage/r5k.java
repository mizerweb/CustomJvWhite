package defpackage;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r5k implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        l5k l5kVarH;
        r5k r5kVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((s5k) obj2).c = (hfk) obj;
                break;
            case 1:
                y5k y5kVar = (y5k) obj2;
                pbk pbkVar = (pbk) obj;
                long j = y5kVar.b;
                long j2 = y5kVar.d;
                long j3 = y5kVar.b;
                if (j >= j2) {
                    y5kVar.b = ((1200 * ((long) pbkVar.q())) / y5kVar.b) + j3;
                } else {
                    y5kVar.b = j3 + ((long) pbkVar.q());
                }
                break;
            case 2:
                zak zakVar = (zak) obj2;
                zakVar.getClass();
                boolean z = ((l5k) ((o8k) obj)).b;
                z7k z7kVar = zakVar.b;
                if (z) {
                    l5kVarH = zakVar.i(Integer.MAX_VALUE);
                    r5kVar = new r5k(2, zakVar);
                } else {
                    l5kVarH = zakVar.h(Integer.MAX_VALUE);
                    r5kVar = new r5k(2, zakVar);
                }
                z7kVar.h(l5kVarH, r5kVar, false);
                break;
            case 3:
                ((xdk) obj2).b((hek) obj);
                break;
            default:
                Map.Entry entry = (Map.Entry) obj;
                ((jek) obj2).a.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
                break;
        }
    }
}
