package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bp extends fg7 implements qf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                cf7 cf7Var = (cf7) this.receiver;
                if (cf7Var != null) {
                    cf7Var.invoke(th);
                }
                return sbi.a;
            case 1:
                return b00.J((b00) this.receiver, (sh3) obj, (lq4) obj2);
            case 2:
                return b00.J((b00) this.receiver, (sh3) obj, (lq4) obj2);
            case 3:
                return b00.I((b00) this.receiver, (dj4) obj, (lq4) obj2);
            case 4:
                return ((f9b) this.receiver).emit((wh3) obj, (lq4) obj2);
            case 5:
                View view = (View) obj;
                owb owbVar = (owb) obj2;
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.receiver;
                p3c p3cVar = chatsTabWidget.u1;
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                vo8 vo8Var = (vo8) p3cVar.m(chatsTabWidget, zv8VarArr[8]);
                if (vo8Var == null || !vo8Var.isActive()) {
                    chatsTabWidget.u1.B(chatsTabWidget, zv8VarArr[8], yab.i0(chatsTabWidget.getViewLifecycleScope(), null, 2, new jd3(chatsTabWidget, owbVar, view, (lq4) null, 6), 1));
                } else {
                    String str = chatsTabWidget.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "show context menu already running, skip for " + ((Object) owbVar.b), null);
                        }
                    }
                }
                return sbi.a;
            case 6:
                return ((f9b) this.receiver).emit(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2);
            case 7:
                return ((f9b) this.receiver).emit((vj4) obj, (lq4) obj2);
            case 8:
                Collection collection = (Collection) obj;
                lq4 lq4Var = (lq4) obj2;
                mzb mzbVar = (mzb) this.receiver;
                mzbVar.getClass();
                sbi sbiVar = sbi.a;
                je9 je9Var2 = je9.c;
                m8b m8bVar = new m8b(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    for (cga cgaVar : ((r17) it.next()).f) {
                        if (cgaVar.c == bga.k && ((xm) mzbVar.a.getValue()).h(cgaVar.a) == null) {
                            m8bVar.a(cgaVar.a);
                        }
                    }
                }
                if (m8bVar.i()) {
                    String name = mzb.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 == null || !a4cVar2.b(je9Var2)) {
                        return sbiVar;
                    }
                    a4cVar2.c(je9Var2, name, "animojiIds.isEmpty", null);
                    return sbiVar;
                }
                String name2 = mzb.class.getName();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, name2, "internalVerify ".concat(m8b.k(m8bVar, 31)), null);
                }
                Object objE = ((xm) mzbVar.a.getValue()).e(m8bVar, lq4Var);
                return objE == hu4.a ? objE : sbiVar;
            case 9:
                return vd7.i((lq4) obj2, (cf7) obj, (rre) this.receiver);
            default:
                return vzg.a((vzg) this.receiver, (rzg) obj, (lq4) obj2);
        }
    }
}
