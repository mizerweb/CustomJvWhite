package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ha1 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ ha1(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                pw pwVar = (pw) obj;
                if (pwVar.isEmpty()) {
                    return pwVar;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(anc.a(((ConversationParticipant) it.next()).getExternalId()).a));
                }
                pw pwVar2 = new pw(0);
                hw hwVar = new hw(pwVar);
                while (hwVar.hasNext()) {
                    Object next = hwVar.next();
                    if (!arrayList.contains(Long.valueOf(((Number) next).longValue()))) {
                        pwVar2.add(next);
                    }
                }
                return pwVar2;
            case 1:
                return ww3.T1(list);
            default:
                return list;
        }
    }
}
