package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.chats.list.ChatsListWidget;
import one.me.folders.edit.FolderEditScreen;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.media.ChatMediaListWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m20 extends fg7 implements qf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(aj5 aj5Var) {
        super(2, 0, aj5.class, aj5Var, "enrichContacts", "enrichContacts(Landroidx/collection/LongSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.a = 16;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x031b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cc  */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Object objO;
        Object objO2;
        y26 y26VarB;
        y26 y26Var;
        vt4 vt4Var;
        int size;
        int size2;
        int i;
        int i2;
        vo8 vo8Var;
        switch (this.a) {
            case 0:
                tga tgaVar = (tga) obj;
                lq4 lq4Var = (lq4) obj2;
                p20 p20Var = (p20) this.receiver;
                m3 m3Var = p20Var.p;
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                qg7 qg7Var = p20Var.A;
                if (qg7Var != null) {
                    qg7Var.r("Got new event=" + tgaVar);
                }
                if (tgaVar instanceof iga) {
                    Object objI = p20Var.I((iga) tgaVar, lq4Var);
                    if (objI == hu4Var) {
                        return objI;
                    }
                } else if (tgaVar instanceof rga) {
                    Object objJ = p20Var.J((rga) tgaVar, lq4Var);
                    if (objJ == hu4Var) {
                        return objJ;
                    }
                } else if (tgaVar instanceof mga) {
                    m3Var.g(new tc((mga) tgaVar, 5, p20Var));
                    p20Var.H();
                } else if (tgaVar instanceof lga) {
                    m3Var.g(new tc((lga) tgaVar, 6, p20Var));
                    p20Var.H();
                } else if (tgaVar instanceof kga) {
                    long jE = p20Var.e();
                    Object obj3 = (jE <= 0 || (objO2 = y10.o(p20Var, jE, false, false, lq4Var, 12)) != hu4Var) ? sbiVar : objO2;
                    if (obj3 == hu4Var) {
                        return obj3;
                    }
                } else if (tgaVar instanceof jga) {
                    if (p20Var.H() && p20Var.e() != -1 && (objO = y10.o(p20Var, p20Var.e(), false, false, lq4Var, 14)) == hu4Var) {
                        return objO;
                    }
                } else if (!(tgaVar instanceof pga)) {
                    ore.o();
                    return null;
                }
                return sbiVar;
            case 1:
                return ((f9b) this.receiver).emit((List) obj, (lq4) obj2);
            case 2:
                return z01.J((z01) this.receiver, (hl5) obj, (lq4) obj2);
            case 3:
                vfi vfiVar = (vfi) obj;
                lq4 lq4Var2 = (lq4) obj2;
                ar2 ar2Var = (ar2) this.receiver;
                ar2Var.getClass();
                sbi sbiVar2 = sbi.a;
                if (!vfiVar.a()) {
                    return sbiVar2;
                }
                String str = vfiVar.h.a;
                long j = ar2Var.d;
                String str2 = ar2Var.g;
                if (j != 0) {
                    gm0.n(str2, "updateChatAvatar");
                    rt2 rt2VarN = ar2Var.c().N(ar2Var.d);
                    if (rt2VarN != null) {
                        ar2Var.b().i(ar2Var.d, rt2VarN.b.a, null, str, ar2Var.e);
                    } else {
                        String str3 = ar2Var.g;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str3, zo5.j(ar2Var.d, "updateChatAvatar: chat not found, chatId="), null);
                            }
                        }
                    }
                } else {
                    gm0.n(str2, "updateProfileAvatar");
                    ar2Var.b().B(str, ar2Var.e, null, 0L, 2);
                }
                Object objM = ar2Var.v().m(ar2Var.b, lq4Var2);
                hu4 hu4Var2 = hu4.a;
                if (objM != hu4Var2) {
                    objM = sbiVar2;
                }
                return objM == hu4Var2 ? objM : sbiVar2;
            case 4:
                return ((lv2) this.receiver).z((cq2) obj, (lq4) obj2);
            case 5:
                ((ChatMediaListWidget) ((w23) this.receiver)).q1((x7a) obj, (View) obj2);
                return sbi.a;
            case 6:
                ((ChatMediaListWidget) ((w23) this.receiver)).q1((x7a) obj, (View) obj2);
                return sbi.a;
            case 7:
                ((ChatMediaListWidget) ((w23) this.receiver)).q1((x7a) obj, (View) obj2);
                return sbi.a;
            case 8:
                ((ChatMediaListWidget) ((w23) this.receiver)).q1((x7a) obj, (View) obj2);
                return sbi.a;
            case 9:
                ((ChatMediaListWidget) ((w23) this.receiver)).q1((x7a) obj, (View) obj2);
                return sbi.a;
            case 10:
                s23 s23Var = (s23) obj;
                lq4 lq4Var3 = (lq4) obj2;
                x43 x43Var = (x43) this.receiver;
                hu4 hu4Var3 = hu4.a;
                mjg mjgVar = x43Var.I;
                sbi sbiVar3 = sbi.a;
                if (s23Var instanceof q23) {
                    i8b i8bVar = (i8b) mjgVar.getValue();
                    long j2 = ((q23) s23Var).a;
                    long[] jArr = i8bVar.a;
                    int i3 = i8bVar.b;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            i4 = -1;
                        } else if (j2 != jArr[i4]) {
                            i4++;
                        }
                    }
                    if (i4 >= 0) {
                        i8bVar.c(i4);
                        Object objK0 = yab.K0(((n0c) x43Var.H()).c(), new r43(x43Var, null, 0), lq4Var3);
                        if (objK0 == hu4Var3) {
                            return objK0;
                        }
                    }
                } else {
                    int i5 = 0;
                    if (!(s23Var instanceof r23)) {
                        ore.o();
                        return null;
                    }
                    i8b i8bVar2 = (i8b) mjgVar.getValue();
                    long j3 = ((r23) s23Var).a;
                    long[] jArr2 = i8bVar2.a;
                    int i6 = i8bVar2.b;
                    while (true) {
                        if (i5 >= i6) {
                            i5 = -1;
                        } else if (j3 != jArr2[i5]) {
                            i5++;
                        }
                    }
                    if (i5 >= 0) {
                        i8bVar2.c(i5);
                        Object objK1 = yab.K0(((n0c) x43Var.H()).c(), new r43(x43Var, null, 1), lq4Var3);
                        if (objK1 == hu4Var3) {
                            return objK1;
                        }
                    }
                }
                return sbiVar3;
            case 11:
                return l63.B((l63) this.receiver, (tga) obj, (lq4) obj2);
            case 12:
                return y34.a((y34) this.receiver, (r34) obj, (lq4) obj2);
            case 13:
                return ConfirmPhoneScreen.o1((ConfirmPhoneScreen) this.receiver, (tbg) obj, (lq4) obj2);
            case 14:
                return ((xh4) this.receiver).o((cq2) obj, (lq4) obj2);
            case 15:
                return vl4.J((vl4) this.receiver, (hl5) obj, (lq4) obj2);
            case 16:
                return ((aj5) this.receiver).d((m8b) obj, (lq4) obj2);
            case 17:
                List list = (List) obj;
                Rect rect = (Rect) obj2;
                p26 p26Var = (p26) this.receiver;
                xk2 xk2Var = p26Var.i;
                gg1 gg1Var = xk2Var.c;
                gg1Var.getClass();
                if (rect.isEmpty() || (list.isEmpty() && ((List) gg1Var.e).isEmpty())) {
                    y26VarB = null;
                } else {
                    gg1Var.c = new Rect(rect);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((lu5) it.next()).a));
                    }
                    gg1Var.d = arrayList;
                    gg1Var.e = list;
                    ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((lu5) it2.next()).b);
                    }
                    y26VarB = gg1.b(arrayList2, (Rect) gg1Var.c, gg1Var.a);
                    gg1Var.f = y26VarB;
                }
                if (y26VarB == null) {
                    y26Var = null;
                } else {
                    xk2Var.d(list);
                    y26Var = y26VarB;
                }
                if (y26Var != null) {
                    p26Var.h.c(p26Var.c, y26Var);
                }
                return sbi.a;
            case 18:
                ((ChatsListWidget) ((ok6) this.receiver)).v1(((Number) obj).longValue(), (View) obj2);
                return sbi.a;
            case 19:
                ((ChatsListWidget) ((ok6) this.receiver)).v1(((Number) obj).longValue(), (View) obj2);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                long jLongValue = ((Number) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                f37 f37VarP1 = ((FolderEditScreen) ((g27) this.receiver)).p1();
                String str4 = f37VarP1.i;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    vt4Var = null;
                } else {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        vt4Var = null;
                        a4cVar2.c(je9Var2, str4, bc1.l(jLongValue, "itemId:", ", ", zBooleanValue), null);
                    } else {
                        vt4Var = null;
                    }
                }
                f37VarP1.A.B(f37VarP1, f37.D[3], a8j.t(f37VarP1, vt4Var, new c03(jLongValue, f37VarP1, zBooleanValue, null), 1));
                return sbi.a;
            case 21:
                ((pn7) this.receiver).N((qn7) obj, ((Boolean) obj2).booleanValue());
                return sbi.a;
            case 22:
                List list3 = (List) obj;
                lq4 lq4Var4 = (lq4) obj2;
                xp7 xp7Var = (xp7) this.receiver;
                xp7Var.getClass();
                hu4 hu4Var4 = hu4.a;
                kp7 kp7Var = kp7.c;
                kp7 kp7Var2 = kp7.b;
                sbi sbiVar4 = sbi.a;
                kp7 kp7Var3 = kp7.a;
                kp7 kp7Var4 = kp7.d;
                if (list3.size() == 1) {
                    size = 0;
                } else {
                    List list4 = list3;
                    size = list4.size() - 1;
                    if (size >= 0) {
                        int i7 = -1;
                        while (true) {
                            int i8 = size - 1;
                            rp7 rp7Var = (rp7) list3.get(size);
                            if (!cqk.d(rp7Var, kp7Var3) && !cqk.d(rp7Var, kp7Var2) && !cqk.d(rp7Var, kp7Var4) && !cqk.d(rp7Var, kp7Var)) {
                                if ((rp7Var instanceof pp7) && i7 < 0) {
                                    i7 = size;
                                }
                                if (i8 < 0) {
                                    size = i7;
                                } else {
                                    size = i8;
                                }
                            }
                        }
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        int size3 = list4.size();
                        size = -1;
                        int i9 = -1;
                        for (int i10 = 0; i10 < size3; i10++) {
                            rp7 rp7Var2 = (rp7) list3.get(i10);
                            if (rp7Var2 instanceof np7) {
                                size = i10;
                            } else if (rp7Var2 instanceof mp7) {
                                i9 = i10;
                            } else if (!(rp7Var2 instanceof op7)) {
                                if (size < 0) {
                                    if (i9 >= 0) {
                                        size = i9;
                                    } else if (xp7Var.n == null && xp7Var.m.b()) {
                                        int size4 = list4.size();
                                        size = 0;
                                        while (true) {
                                            if (size < size4) {
                                                rp7 rp7Var3 = (rp7) list3.get(size);
                                                if (!(rp7Var3 instanceof lp7) && !(rp7Var3 instanceof qp7)) {
                                                    size++;
                                                }
                                            } else {
                                                size2 = list4.size();
                                                i2 = -1;
                                                while (i < size2) {
                                                    i2 = i;
                                                }
                                                if (i2 >= 0) {
                                                    size = i2;
                                                } else {
                                                    size = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        size2 = list4.size();
                                        i2 = -1;
                                        for (i = 0; i < size2 && (((rp7) list3.get(i)) instanceof op7); i++) {
                                            i2 = i;
                                        }
                                        if (i2 >= 0) {
                                            size = i2;
                                        } else {
                                            size = 0;
                                        }
                                    }
                                }
                            }
                        }
                        if (size < 0) {
                            if (i9 >= 0) {
                                size = i9;
                            } else if (xp7Var.n == null) {
                                size2 = list4.size();
                                i2 = -1;
                                while (i < size2) {
                                    i2 = i;
                                }
                                if (i2 >= 0) {
                                    size = i2;
                                } else {
                                    size = 0;
                                }
                            } else {
                                size2 = list4.size();
                                i2 = -1;
                                while (i < size2) {
                                    i2 = i;
                                }
                                if (i2 >= 0) {
                                    size = i2;
                                } else {
                                    size = 0;
                                }
                            }
                        }
                    }
                }
                rp7 rp7Var4 = (rp7) list3.get(size);
                if (cqk.d(rp7Var4, kp7Var2)) {
                    list3.remove(size);
                } else if (cqk.d(rp7Var4, kp7Var)) {
                    Object objI2 = xp7Var.I(list3, lq4Var4);
                    if (objI2 == hu4Var4) {
                        return objI2;
                    }
                } else if (cqk.d(rp7Var4, kp7Var3)) {
                    j28 j28Var = xp7Var.s;
                    if (j28Var != null) {
                        j28Var.h();
                    }
                    xp7Var.n = null;
                    list3.remove(size);
                    int i11 = 0;
                    while (i11 < size) {
                        rp7 rp7Var5 = (rp7) list3.get(i11);
                        if (!cqk.d(rp7Var5, kp7Var4) && !cqk.d(rp7Var5, kp7Var3) && !(rp7Var5 instanceof op7) && !(rp7Var5 instanceof qp7)) {
                            if (rp7Var5 instanceof lp7) {
                                xp7Var.b(((lp7) rp7Var5).a);
                            } else {
                                i11++;
                            }
                        }
                        list3.remove(i11);
                        size--;
                    }
                } else if (cqk.d(rp7Var4, kp7Var4)) {
                    j28 j28Var2 = xp7Var.s;
                    if (j28Var2 != null) {
                        j28Var2.B();
                    }
                    xp7Var.n = null;
                    list3.remove(size);
                    int i12 = 0;
                    while (i12 < size) {
                        rp7 rp7Var6 = (rp7) list3.get(i12);
                        if (cqk.d(rp7Var6, kp7Var4) || (rp7Var6 instanceof op7)) {
                            list3.remove(i12);
                            size--;
                        } else {
                            i12++;
                        }
                    }
                } else if (rp7Var4 instanceof pp7) {
                    Object objE = xp7Var.E(list3, size, (pp7) rp7Var4, lq4Var4);
                    if (objE == hu4Var4) {
                        return objE;
                    }
                } else if (rp7Var4 instanceof lp7) {
                    xp7Var.y(list3, size, (lp7) rp7Var4, true);
                } else if (rp7Var4 instanceof qp7) {
                    xp7Var.K(list3, size, (qp7) rp7Var4);
                } else if (rp7Var4 instanceof np7) {
                    np7 np7Var = (np7) rp7Var4;
                    Map mapB = xp7Var.c;
                    xp7Var.o = np7Var.a;
                    Map map = np7Var.b;
                    xp7Var.p = map;
                    if (!map.isEmpty()) {
                        ul9 ul9Var = new ul9();
                        ul9Var.putAll(map);
                        ul9Var.putAll(mapB);
                        mapB = ul9Var.b();
                    }
                    xp7Var.q = mapB;
                    list3.remove(size);
                    int i13 = 0;
                    while (i13 < size) {
                        if (((rp7) list3.get(i13)) instanceof np7) {
                            list3.remove(i13);
                            size--;
                        } else {
                            i13++;
                        }
                    }
                    xp7Var.P();
                } else {
                    if (rp7Var4 instanceof mp7) {
                        throw null;
                    }
                    if (!(rp7Var4 instanceof op7)) {
                        ore.o();
                        return null;
                    }
                    xp7Var.A(list3, size, true);
                }
                return sbiVar4;
            case 23:
                return cr7.a((cr7) this.receiver, (ylc) obj, (lq4) obj2);
            case 24:
                return ((daf) ((bw7) this.receiver).a.getValue()).c((String) obj, (List) obj2);
            case 25:
                return ((daf) ((bw7) this.receiver).a.getValue()).c((String) obj, (List) obj2);
            case 26:
                fif fifVar = (fif) obj;
                int iIntValue = ((Number) obj2).intValue();
                lt8 lt8Var = (lt8) this.receiver;
                lt8Var.getClass();
                boolean z = !fifVar.j(iIntValue) && fifVar.h(iIntValue).b();
                lt8Var.b = z;
                return Boolean.valueOf(z);
            case 27:
                return i99.a((i99) this.receiver, (rt2) obj, (lq4) obj2);
            case 28:
                ((xb9) this.receiver).e((String) obj, (String) obj2);
                return sbi.a;
            default:
                long jLongValue2 = ((Number) obj).longValue();
                View view = (View) obj2;
                MembersListWidget membersListWidget = (MembersListWidget) ((b9a) this.receiver);
                vv vvVar = membersListWidget.h;
                p3c p3cVar = membersListWidget.f;
                zv8[] zv8VarArr = MembersListWidget.t;
                zv8 zv8Var = zv8VarArr[2];
                if (((Long) vvVar.a(membersListWidget)) == null && (((vo8Var = (vo8) p3cVar.m(membersListWidget, zv8VarArr[1])) == null || !vo8Var.isActive()) && !membersListWidget.q1().C())) {
                    p3cVar.B(membersListWidget, zv8VarArr[1], yab.i0(membersListWidget.getViewLifecycleScope(), null, 2, new zw9(membersListWidget, jLongValue2, view, (lq4) null, 8), 1));
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m20(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(xb9 xb9Var) {
        super(2, 0, xb9.class, xb9Var, "putString", "putString(Ljava/lang/String;Ljava/lang/String;)V");
        this.a = 28;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(ChatsListWidget chatsListWidget) {
        super(2, 0, ok6.class, chatsListWidget, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V");
        this.a = 19;
    }
}
