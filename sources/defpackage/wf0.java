package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wf0 implements qf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ wf0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01da  */
    /* JADX WARN: Code duplicated, block: B:181:0x0296  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        nx2 nx2Var;
        nx2 nx2Var2;
        nx2 nx2Var3;
        nx2 nx2Var4;
        boolean z2;
        boolean z3;
        int i = 1;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                String strConcat = "dg0".concat("");
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, strConcat, str, null);
                    }
                }
                return sbi.a;
            case 1:
                return ((dj4) obj).a((dj4) obj2);
            case 2:
                return Boolean.valueOf(((enc) obj).a.a.u() == ((enc) obj2).a.a.u());
            case 3:
                rt2 rt2Var = (rt2) obj;
                rt2 rt2Var2 = (rt2) obj2;
                if (cqk.d((rt2Var == null || (nx2Var4 = rt2Var.b) == null) ? null : Integer.valueOf(nx2Var4.b()), (rt2Var2 == null || (nx2Var3 = rt2Var2.b) == null) ? null : Integer.valueOf(nx2Var3.b()))) {
                    if (cqk.d((rt2Var == null || (nx2Var2 = rt2Var.b) == null) ? null : Integer.valueOf(nx2Var2.m), (rt2Var2 == null || (nx2Var = rt2Var2.b) == null) ? null : Integer.valueOf(nx2Var.m))) {
                        z = cqk.d(rt2Var != null ? rt2Var.F() : null, rt2Var2 != null ? rt2Var2.F() : null);
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                ((oh1) obj).getClass();
                return sbi.a;
            case 5:
                be1 be1Var = (be1) obj;
                be1 be1Var2 = (be1) obj2;
                return Boolean.valueOf(cqk.d(be1Var.i, be1Var2.i) && TextUtils.equals(be1Var.d, be1Var2.d) && TextUtils.equals(be1Var.c, be1Var2.c));
            case 6:
                String str2 = (String) obj;
                tt4 tt4Var = (tt4) obj2;
                if (str2.length() == 0) {
                    return tt4Var.toString();
                }
                return str2 + ", " + tt4Var;
            case 7:
                be1 be1Var3 = (be1) obj;
                be1 be1Var4 = (be1) obj2;
                if (cqk.d(be1Var3.e, be1Var4.e) && cqk.d(be1Var3.a, be1Var4.a) && cqk.d(be1Var3.b, be1Var4.b)) {
                    CharSequence charSequence = be1Var3.c;
                    String string = charSequence != null ? charSequence.toString() : null;
                    CharSequence charSequence2 = be1Var4.c;
                    z2 = cqk.d(string, charSequence2 != null ? charSequence2.toString() : null);
                }
                return Boolean.valueOf(z2);
            case 8:
                return Boolean.valueOf(((hii) obj2).a <= ((hii) obj).a);
            case 9:
                return c8a.a;
            case 10:
                m8b m8bVar = (m8b) obj;
                m8b m8bVar2 = (m8b) obj2;
                m8b m8bVar3 = new m8b(m8bVar.d + m8bVar2.d);
                m8bVar3.b(m8bVar);
                m8bVar3.b(m8bVar2);
                return m8bVar3;
            case 11:
                vg4 vg4Var = (vg4) obj;
                vg4 vg4Var2 = (vg4) obj2;
                return Boolean.valueOf(cqk.d(vg4Var != null ? vg4Var.s() : null, vg4Var2 != null ? vg4Var2.s() : null));
            case 12:
                vg4 vg4Var3 = (vg4) obj;
                vg4 vg4Var4 = (vg4) obj2;
                if (cqk.d(vg4Var3 != null ? vg4Var3.a.b.v : null, vg4Var4 != null ? vg4Var4.a.b.v : null)) {
                    z3 = cqk.d(vg4Var3 != null ? Boolean.valueOf(vg4Var3.h()) : null, vg4Var4 != null ? Boolean.valueOf(vg4Var4.h()) : null);
                }
                return Boolean.valueOf(z3);
            case 13:
                return OneLogDirect.send_PCEVtD0$lambda$0((OneLogItem) obj, (Exception) obj2);
            case 14:
                return Boolean.valueOf(((hii) obj2).a <= ((hii) obj).a);
            case 15:
                return ((dj4) obj).a((dj4) obj2);
            case 16:
                return (Conversation) obj2;
            case 17:
                rt2 rt2Var3 = (rt2) obj;
                rt2 rt2Var4 = (rt2) obj2;
                return Boolean.valueOf(rt2Var3.d0() == rt2Var4.d0() && rt2Var3.z0() == rt2Var4.z0() && rt2Var3.b.r0 == rt2Var4.b.r0 && rt2Var3.A() == rt2Var4.A());
            case 18:
                zv8[] zv8VarArr = PickerChatsTabWidget.p;
                return sbi.a;
            case 19:
                rt2 rt2Var5 = (rt2) obj;
                rt2 rt2Var6 = (rt2) obj2;
                return Boolean.valueOf(rt2Var5.P() == rt2Var6.P() && rt2Var5.b.M == rt2Var6.b.M);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Boolean.valueOf(((rt2) obj).b.j0 == ((rt2) obj2).b.j0);
            case 21:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((vo8) it.next()).b(null);
                }
                concurrentHashMap.clear();
                return concurrentHashMap;
            case 22:
                return ((dj4) obj).a((dj4) obj2);
            case 23:
                return sbi.a;
            case 24:
                zv8[] zv8VarArr2 = nef.h;
                return sbi.a;
            case 25:
                return new ylc(obj, obj2);
            case 26:
                long j = ((dmf) obj).a;
                long j2 = ((dmf) obj2).a;
                if (j > j2) {
                    i = -1;
                } else if (j == j2) {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 27:
                Integer num = (Integer) obj2;
                return Integer.valueOf((num != null ? num.intValue() : 0) + 1);
            default:
                n1i n1iVar = (n1i) obj2;
                return n1iVar instanceof m1i ? l1i.a : n1iVar;
        }
    }
}
