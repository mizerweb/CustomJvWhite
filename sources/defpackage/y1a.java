package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes4.dex */
public final class y1a extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b2a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1a(b2a b2aVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = b2aVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                y1a y1aVar = new y1a(this.g, lq4Var, 0);
                y1aVar.f = obj;
                return y1aVar;
            case 1:
                y1a y1aVar2 = new y1a(this.g, lq4Var, 1);
                y1aVar2.f = obj;
                return y1aVar2;
            default:
                y1a y1aVar3 = new y1a(this.g, lq4Var, 2);
                y1aVar3.f = obj;
                return y1aVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((y1a) create((wz9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((y1a) create((l1j) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((y1a) create((opa) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.e) {
            case 0:
                wz9 wz9Var = (wz9) this.f;
                ch3.d0(obj);
                this.g.r.updateAndGet(new ea1(5, wz9Var));
                return sbi.a;
            case 1:
                l1j l1jVar = (l1j) this.f;
                ch3.d0(obj);
                b2a.a(this.g, new Long(l1jVar.b));
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                opa opaVar = (opa) this.f;
                ch3.d0(obj);
                s1a s1aVar = this.g.n;
                boolean z = s1aVar != null ? s1aVar.c : false;
                String str = this.g.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, s5h.y0("Media playlist. Get result from loader \n                        |size:" + opaVar.a.size() + ", \n                        |hasNext: " + opaVar.b + ", \n                        |hasPrev:" + opaVar.c + ", \n                        |descOrder:" + z), null);
                    }
                }
                if (!opaVar.a.isEmpty()) {
                    this.g.q = z ? opaVar.c : opaVar.b;
                    List listJ1 = opaVar.a;
                    if (z) {
                        listJ1 = ww3.J1(listJ1);
                    }
                    t1a t1aVar = (t1a) this.g.o.getValue();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    b2a b2aVar = this.g;
                    b2aVar.getClass();
                    int size = listJ1.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        MessageModel messageModel = (MessageModel) listJ1.get(i);
                        s1a s1aVar2 = b2aVar.n;
                        if (s1aVar2 != null && messageModel.a == s1aVar2.a) {
                            z2 = true;
                        }
                        if (z2) {
                            linkedHashSet.add(Long.valueOf(messageModel.a));
                        }
                    }
                    mjg mjgVar = this.g.o;
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, t1a.a(t1aVar, 0L, linkedHashSet, null, 5)));
                }
                return sbiVar;
        }
    }
}
