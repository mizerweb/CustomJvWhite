package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.profile.screens.members.ChatMembersScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class w62 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w62(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean z = true;
        String str = null;
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) this.b;
                zv8[] zv8VarArr = CallWaitingRoomEventsWidget.m;
                ((ya1) ((da1) ((r62) callWaitingRoomEventsWidget.c.getValue()).c.getValue())).e(((p62) ((q62) this.c)).a, !zBooleanValue);
                return sbi.a;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) this.c;
                if (iIntValue == 10101 && !((Set) this.b).isEmpty()) {
                    zv8[] zv8VarArr2 = ChatMembersScreen.k;
                    Object obj2 = (Set) chatMembersScreen.q1().i.a.getValue();
                    if (obj2 == null) {
                        obj2 = c76.a;
                    }
                    l73 l73VarP1 = chatMembersScreen.p1();
                    a8j.t(l73VarP1, ((n0c) ((xhh) l73VarP1.i.getValue())).b(), new in1(obj2, l73VarP1, null, 24), 2);
                }
                return sbi.a;
            case 2:
                ((wd4) this.b).g((ar5) this.c);
                return sbi.a;
            case 3:
                ((wd4) this.b).g((ar5) this.c);
                return sbi.a;
            case 4:
                ((wd4) this.b).g((ar5) this.c);
                return sbi.a;
            case 5:
                i64 i64Var = (i64) this.b;
                kj9 kj9Var = (kj9) this.c;
                if (i64Var == kj9Var.h) {
                    kj9Var.h = null;
                }
                return sbi.a;
            case 6:
                udb udbVarN = ((zsj) this.b).N(((Number) obj).intValue());
                if (udbVarN != null) {
                    int i = udbVarN.c;
                    NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) this.c;
                    zv8[] zv8VarArr3 = NeuroAvatarPickerBottomSheet.E;
                    str = (String) ((Map) neuroAvatarPickerBottomSheet.G1().p.getValue()).get(Integer.valueOf(i));
                }
                return str == null ? "" : str;
            case 7:
                udb udbVarN2 = ((zsj) this.b).N(((Number) obj).intValue());
                if (udbVarN2 != null) {
                    str = (String) ((Map) ((xeb) this.c).p.getValue()).get(Integer.valueOf(udbVarN2.c));
                }
                return str == null ? "" : str;
            case 8:
                ek4 ek4Var = (ek4) obj;
                if (!((dyc) this.b).z.d(ek4Var.a) && !ek4Var.k) {
                    List list = ek4Var.d;
                    if (list != null) {
                        List list2 = list;
                        Long l = (Long) this.c;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                long jLongValue = ((Number) it.next()).longValue();
                                if (l != null && jLongValue == l.longValue()) {
                                }
                            }
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                dme dmeVar = (dme) this.b;
                aq aqVar = (aq) this.c;
                String str2 = dmeVar.s;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "cancelTask " + aqVar, null);
                    }
                }
                hih hihVar = aqVar.b;
                if (hihVar != null) {
                    dmeVar.j().d(hihVar);
                }
                dmeVar.r.add(Long.valueOf(aqVar.a));
                if (aqVar instanceof btc) {
                    yab.i0(dmeVar.k(), (xt4) dmeVar.l.getValue(), 0, new gce(dmeVar, aqVar, null, 3), 2);
                }
                return sbi.a;
            case 10:
                ((wd4) this.b).g((ar5) this.c);
                return sbi.a;
            case 11:
                ((rnf) ((onf) this.b)).d((pnf) this.c);
                return sbi.a;
            case 12:
                ((wd4) this.b).g((ar5) this.c);
                return sbi.a;
            default:
                ((wd4) this.b).g((ar5) this.c);
                return sbi.a;
        }
    }
}
