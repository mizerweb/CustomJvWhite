package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class epa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ epa(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i = this.b;
                RecyclerView recyclerView = (RecyclerView) this.d;
                int iIntValue = ((Integer) obj).intValue();
                messagesLayoutManager.I = false;
                String str = messagesLayoutManager.E;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        nee adapter = recyclerView.getAdapter();
                        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.l()) : null;
                        StringBuilder sbP = qv1.p("LM smooth scroll finished by pos:", i, ", target:", iIntValue, ", curSize:");
                        sbP.append(numValueOf);
                        a4cVar.c(je9Var, str, sbP.toString(), null);
                    }
                }
                messagesLayoutManager.L = null;
                return sbi.a;
            case 1:
                ((njd) this.c).c(new dfg((this.b + ((Float) obj).floatValue()) / ((u8b) this.d).b));
                return sbi.a;
            default:
                Long l = (Long) this.c;
                int i2 = this.b;
                hoh hohVar = (hoh) this.d;
                List<umh> list = (List) obj;
                ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                for (umh umhVar : list) {
                    long j = umhVar.a;
                    if (l != null && j == l.longValue()) {
                        umh umhVarA = umh.a(umhVar, hohVar.a, hohVar.b, hohVar.c, hohVar.e, hohVar.f, i2 > 0 ? i2 : umhVar.g, 0.0f, 0.0f, 0.0f, 0.0f, 1921);
                        umhVarA.l = umhVar.l;
                        umhVarA.m = umhVar.m;
                        umhVarA.n.set(umhVar.n);
                        umhVar = umhVarA;
                    }
                    arrayList.add(umhVar);
                }
                return arrayList;
        }
    }
}
