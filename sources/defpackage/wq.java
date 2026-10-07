package defpackage;

import java.util.Collections;
import java.util.Map;
import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final class wq extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(xq xqVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = xqVar;
        this.f = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new wq((xq) obj2, this.f, lq4Var);
            case 1:
                wq wqVar = new wq((ChatsTabWidget) obj2, lq4Var, 1);
                wqVar.f = ((Number) obj).longValue();
                return wqVar;
            default:
                wq wqVar2 = new wq((hgh) obj2, lq4Var, 2);
                wqVar2.f = ((Number) obj).longValue();
                return wqVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((wq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wq) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((wq) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                String str = ((xq) this.g).b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onAppGoesForeground: clearing background update", null);
                    }
                }
                ((xq) this.g).a(new Long(this.f), true);
                break;
            case 1:
                long j = this.f;
                ch3.d0(obj);
                if (j > 0) {
                    ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.g;
                    zv8[] zv8VarArr = ChatsTabWidget.B1;
                }
                break;
            default:
                long j2 = this.f;
                ch3.d0(obj);
                hgh hghVar = (hgh) this.g;
                try {
                    if (j2 == -1) {
                        ((bu) hghVar.g()).getClass();
                        if (((swh) bu.g.getValue()) != null) {
                            snf snfVar = swh.e;
                            if (snfVar == null) {
                                snfVar = null;
                            }
                            snfVar.getClass();
                            snfVar.e(Collections.singletonMap("userId", null));
                        }
                    } else {
                        iv4 iv4VarG = hghVar.g();
                        String strValueOf = String.valueOf(j2);
                        ((bu) iv4VarG).getClass();
                        if (((swh) bu.g.getValue()) != null) {
                            try {
                                snf snfVar2 = swh.e;
                                if (snfVar2 == null) {
                                    snfVar2 = null;
                                }
                                snfVar2.getClass();
                                snfVar2.e(Collections.singletonMap("userId", strValueOf));
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        iv4 iv4VarG2 = hghVar.g();
                        String strValueOf2 = String.valueOf(((int) j2) & 255);
                        ((bu) iv4VarG2).getClass();
                        if (((swh) bu.g.getValue()) != null) {
                            swh swhVar = swh.a;
                            Map mapSingletonMap = Collections.singletonMap("p", strValueOf2);
                            if (!swh.b) {
                                khh khhVar = swh.f;
                                (khhVar != null ? khhVar : null).b(mapSingletonMap);
                            }
                        }
                    }
                    break;
                } catch (Exception unused2) {
                }
                break;
        }
        return sbi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
