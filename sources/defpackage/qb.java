package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.stories.edit.link.AddStoryLinkBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class qb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AddStoryLinkBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb(lq4 lq4Var, AddStoryLinkBottomSheet addStoryLinkBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = addStoryLinkBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AddStoryLinkBottomSheet addStoryLinkBottomSheet = this.g;
        switch (i) {
            case 0:
                qb qbVar = new qb(lq4Var, addStoryLinkBottomSheet, 0);
                qbVar.f = obj;
                return qbVar;
            default:
                qb qbVar2 = new qb(lq4Var, addStoryLinkBottomSheet, 1);
                qbVar2.f = obj;
                return qbVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((qb) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((qb) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        AddStoryLinkBottomSheet addStoryLinkBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                CharSequence charSequenceB = ((ub) obj2).c.b(addStoryLinkBottomSheet.getContext());
                if (charSequenceB == null || charSequenceB.length() == 0) {
                    addStoryLinkBottomSheet.D1().j();
                } else {
                    addStoryLinkBottomSheet.D1().m(charSequenceB.toString(), gac.a);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                tb tbVar = (tb) obj2;
                if (cqk.d(tbVar, sb.a)) {
                    zv8[] zv8VarArr = AddStoryLinkBottomSheet.s;
                    p0m.a(addStoryLinkBottomSheet.D1(), mt7.REJECT);
                    return sbiVar;
                }
                if (!(tbVar instanceof rb)) {
                    ore.o();
                    return null;
                }
                p26 p26Var = (p26) addStoryLinkBottomSheet.n.getValue();
                rb rbVar = (rb) tbVar;
                String str = rbVar.a;
                String str2 = rbVar.b;
                oyg oygVar = p26Var.s;
                int i2 = oygVar.c;
                g59 g59Var = new g59(wk2.a.incrementAndGet(), str, str2, l59.d, i2, i2 / 2.0f, oygVar.d / 2.0f, 1.0f, 0.0f);
                xk2 xk2Var = p26Var.i;
                ArrayList<g59> arrayListH1 = ww3.H1(g59Var, xk2Var.b());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (g59 g59Var2 : arrayListH1) {
                    linkedHashMap.put(Long.valueOf(g59Var2.a), new tk2(g59Var2));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size() + xk2Var.b.size());
                for (vk2 vk2Var : xk2Var.b) {
                    if (vk2Var instanceof tk2) {
                        vk2 vk2Var2 = (vk2) linkedHashMap.remove(Long.valueOf(((tk2) vk2Var).a.a));
                        if (vk2Var2 != null) {
                            arrayList.add(vk2Var2);
                        }
                    } else {
                        arrayList.add(vk2Var);
                    }
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.add((vk2) it.next());
                }
                xk2Var.b = ww3.M1(arrayList, new lv5(15));
                xk2Var.a();
                mjg mjgVar = xk2Var.d;
                List list = xk2Var.b;
                mjgVar.getClass();
                mjgVar.j(null, list);
                xk2Var.f(Long.valueOf(g59Var.a));
                addStoryLinkBottomSheet.v1(true);
                return sbiVar;
        }
    }
}
