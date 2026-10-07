package defpackage;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.location.map.pick.PickLocationScreen;
import one.me.location.map.show.ShowLocationScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fz7 extends fg7 implements cf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7(int i, Object obj) {
        super(1, 0, zaa.class, obj, "encodeTopScreens", "encodeTopScreens(Landroidx/collection/ObjectLongMap;)Ljava/lang/String;");
        this.a = i;
        switch (i) {
            case 6:
                super(1, 0, zaa.class, obj, "encodeProcessSplit", "encodeProcessSplit(Landroidx/collection/LongLongMap;)Ljava/lang/String;");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0253  */
    /* JADX WARN: Code duplicated, block: B:105:0x025b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0260  */
    /* JADX WARN: Code duplicated, block: B:110:0x0269  */
    /* JADX WARN: Code duplicated, block: B:113:0x0270  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:215:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:220:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:223:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:225:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:228:0x050d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0527  */
    /* JADX WARN: Code duplicated, block: B:235:0x0533  */
    /* JADX WARN: Code duplicated, block: B:237:0x0552  */
    /* JADX WARN: Code duplicated, block: B:239:0x055c  */
    /* JADX WARN: Code duplicated, block: B:240:0x056a  */
    /* JADX WARN: Code duplicated, block: B:242:0x056e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0592  */
    /* JADX WARN: Code duplicated, block: B:251:0x059c A[LOOP:5: B:236:0x0550->B:251:0x059c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x059f  */
    /* JADX WARN: Code duplicated, block: B:253:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:255:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:264:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:273:0x0627 A[LOOP:7: B:271:0x0621->B:273:0x0627, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x0648  */
    /* JADX WARN: Code duplicated, block: B:377:0x08eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x08ed A[LOOP:10: B:368:0x08a7->B:378:0x08ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:409:0x09c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:410:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:412:0x09ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:413:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:414:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:416:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:420:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:423:0x09fb A[LOOP:13: B:418:0x09e5->B:423:0x09fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:463:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0652 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x09fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x09f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x021c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231  */
    /* JADX WARN: Instruction removed from duplicated block: B:264:0x05cf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        tlg tlgVar;
        long j;
        long j2;
        Iterator it;
        int i2;
        CharSequence text;
        Object eldVar;
        Object obj2;
        LinkedHashSet linkedHashSet;
        int i3;
        ArrayList<eh2> arrayList;
        Iterator it2;
        int i4;
        int size;
        int i5;
        eh2 eh2Var;
        Integer numValueOf;
        String str;
        Set setX1;
        int size2;
        int i6;
        eh2 eh2Var2;
        boolean zContains;
        String str2;
        kle kleVar;
        int i7;
        eh2 eh2Var3;
        i64 i64Var;
        byte b;
        float f;
        float rawY;
        float f2;
        float rawX;
        int iIndexOfChild;
        SwipeWidget swipeWidget;
        ViewGroup viewGroup;
        float translationY;
        float f3;
        int iNextIndex = -1;
        int i8 = 0;
        z = false;
        z = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ((cjf) this.receiver).a.D((String) obj);
                return sbi.a;
            case 1:
                ((gp8) this.receiver).p((Throwable) obj);
                return sbi.a;
            case 2:
                k79 k79Var = (k79) obj;
                d66 d66Var = (d66) this.receiver;
                mjg mjgVar = d66Var.i;
                if (k79Var != null && (k79Var instanceof z46) && (i = ((z46) k79Var).a) != ((c66) mjgVar.getValue()).a) {
                    Iterator it3 = ((b66) d66Var.m.a.getValue()).a.iterator();
                    int i9 = 0;
                    while (it3.hasNext()) {
                        if (((bo2) it3.next()).a == i) {
                            iNextIndex = i9;
                            mjgVar.j(null, new c66(i, 0, iNextIndex, 2));
                            d66Var.D(i, null);
                        } else {
                            i9++;
                        }
                    }
                    mjgVar.j(null, new c66(i, 0, iNextIndex, 2));
                    d66Var.D(i, null);
                }
                return sbi.a;
            case 3:
                k79 k79Var2 = (k79) obj;
                tpg tpgVar = (tpg) this.receiver;
                mjg mjgVar2 = tpgVar.n;
                if (k79Var2 != null && ((((z = k79Var2 instanceof tlg)) || (k79Var2 instanceof omg)) && (!z || ((tlg) k79Var2).b != ((ipg) mjgVar2.getValue()).a))) {
                    boolean z3 = k79Var2 instanceof omg;
                    if (z3) {
                        omg omgVar = (omg) k79Var2;
                        if (omgVar.f == 5 && omgVar.a != ((ipg) mjgVar2.getValue()).a) {
                            if (z3) {
                                j = ((omg) k79Var2).a;
                            } else {
                                if (z) {
                                    tlgVar = (tlg) k79Var2;
                                } else {
                                    tlgVar = null;
                                }
                                if (tlgVar != null) {
                                    j = tlgVar.b;
                                }
                            }
                            j2 = j;
                            it = ((jpg) tpgVar.l.a.getValue()).a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = -1;
                                } else if (((co2) it.next()).b.a == j2) {
                                    i2 = i8;
                                } else {
                                    i8++;
                                }
                            }
                            ipg ipgVar = new ipg(j2, 0, i2, 2);
                            mjgVar2.getClass();
                            mjgVar2.j(null, ipgVar);
                            tpgVar.F(j2, null);
                        }
                    } else {
                        if (z3) {
                            j = ((omg) k79Var2).a;
                        } else {
                            if (z) {
                                tlgVar = (tlg) k79Var2;
                            } else {
                                tlgVar = null;
                            }
                            if (tlgVar != null) {
                                j = tlgVar.b;
                            }
                        }
                        j2 = j;
                        it = ((jpg) tpgVar.l.a.getValue()).a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i2 = -1;
                            } else if (((co2) it.next()).b.a == j2) {
                                i2 = i8;
                            } else {
                                i8++;
                            }
                        }
                        ipg ipgVar2 = new ipg(j2, 0, i2, 2);
                        mjgVar2.getClass();
                        mjgVar2.j(null, ipgVar2);
                        tpgVar.F(j2, null);
                    }
                }
                return sbi.a;
            case 4:
                a8j.x(((MembersListWidget) ((h8a) this.receiver)).q1().f, new j9a(((Number) obj).intValue()));
                return sbi.a;
            case 5:
                v8b v8bVar = (v8b) obj;
                ((zaa) this.receiver).getClass();
                if (v8bVar.e()) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ylc ylcVar : yhf.u0(new rj7(new tw(3, new yaa(v8bVar, null)), 1, new xa8(6)), 3)) {
                }
                return new cu8(linkedHashMap).toString();
            case 6:
                k8b k8bVar = (k8b) obj;
                ((zaa) this.receiver).getClass();
                if (k8bVar.e == 0) {
                    return null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                long[] jArr = k8bVar.b;
                long[] jArr2 = k8bVar.c;
                long[] jArr3 = k8bVar.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr3[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j3) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                }
                                j3 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
                return new cu8(linkedHashMap2).toString();
            case 7:
                long jLongValue = ((Number) obj).longValue();
                qaa qaaVar = (qaa) this.receiver;
                String str3 = qaaVar.D;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str3, zo5.j(jLongValue, "process click on member: "), null);
                    }
                }
                if (jLongValue == ((s7f) qaaVar.h).t()) {
                    a8j.x(qaaVar.A, jaa.a);
                } else {
                    a8j.x(qaaVar.B, wpa.b.k(jLongValue));
                }
                return sbi.a;
            case 8:
                MotionEvent motionEvent = (MotionEvent) obj;
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                zv8[] zv8VarArr = MessageWriteWidget.I;
                if (messageWriteWidget.getView() != null && (((text = messageWriteWidget.t1().getText()) == null || r5h.X0(text)) && (messageWriteWidget.t1().getSendActionState() instanceof iha) && messageWriteWidget.t1().getEmojiExpandableState() == eha.a)) {
                    nma nmaVarA1 = messageWriteWidget.A1();
                    mjg mjgVar3 = nmaVarA1.r1;
                    t73 t73Var = nmaVarA1.d;
                    t73Var.getClass();
                    if (t73Var != t73.e) {
                        mla mlaVar = new mla(fbe.b, motionEvent);
                        mjgVar3.getClass();
                        mjgVar3.j(null, mlaVar);
                        mjgVar3.setValue(null);
                    } else if (motionEvent.getAction() == 1) {
                        a8j.x(nmaVarA1.y, new nla(((Boolean) nmaVarA1.w1.getValue()).booleanValue()));
                    }
                }
                return sbi.a;
            case 9:
                MessagesListWidget.p1((MessagesListWidget) this.receiver, ((Number) obj).longValue());
                return sbi.a;
            case 10:
                una unaVar = (una) obj;
                jsa jsaVar = (jsa) this.receiver;
                ks9 ks9Var = jsaVar.l2;
                zv8 zv8Var = jsa.Z2[2];
                ((zu4) ks9Var.b).a(Collections.singletonList(unaVar), new vx9(jsaVar, 9, unaVar));
                return sbi.a;
            case 11:
                vsa vsaVar = (vsa) this.receiver;
                vsaVar.a = -1;
                vsaVar.b = -1;
                vsaVar.b((RecyclerView) obj, 0, 0);
                return sbi.a;
            case 12:
                ((wsa) this.receiver).c((RecyclerView) obj);
                return sbi.a;
            case 13:
                ((ceb) this.receiver).a((udb) obj);
                return sbi.a;
            case 14:
                udb udbVar = (udb) obj;
                xeb xebVar = (xeb) this.receiver;
                if (udbVar != null) {
                    int i14 = udbVar.c;
                    if (i14 != xebVar.h) {
                        xebVar.h = i14;
                        xebVar.m.a(new zdb(i14, null));
                    }
                } else {
                    xebVar.getClass();
                }
                return sbi.a;
            case 15:
                ((jk1) this.receiver).getClass();
                return jk1.a((fka) obj);
            case 16:
                ((PickLocationScreen) this.receiver).O((po7) obj);
                return sbi.a;
            case 17:
                ((z8d) this.receiver).c(((Number) obj).intValue());
                return sbi.a;
            case 18:
                View view = (View) obj;
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.receiver;
                zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                profileAvatarsScreen.getClass();
                pp4 pp4VarB = opl.b(profileAvatarsScreen, 1);
                ild ildVarJ1 = profileAvatarsScreen.J1();
                List<ekd> listA = ildVarJ1.c.a(profileAvatarsScreen.K1().getCurrentItem() == ildVarJ1.g);
                ArrayList arrayList2 = new ArrayList(yw3.W0(listA, 10));
                for (ekd ekdVar : listA) {
                    arrayList2.add(new rp4(ekdVar.ordinal(), ekdVar.a, (Integer) null, (Integer) null, 28));
                }
                pp4VarB.l(arrayList2).f(view).c().b().build().u(profileAvatarsScreen);
                return sbi.a;
            case 19:
                ikd ikdVar = (ikd) obj;
                ild ildVar = (ild) this.receiver;
                ildVar.getClass();
                if (ikdVar.equals(fkd.a)) {
                    obj2 = bld.a;
                } else {
                    if (ikdVar instanceof gkd) {
                        gkd gkdVar = (gkd) ikdVar;
                        ildVar.g = gkdVar.a;
                        eldVar = new fld(gkdVar.a);
                    } else {
                        if (!(ikdVar instanceof hkd)) {
                            ore.o();
                            return null;
                        }
                        eldVar = new eld(((hkd) ikdVar).a);
                    }
                    obj2 = eldVar;
                }
                a8j.x(ildVar.h, obj2);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                List list = (List) obj;
                ((txd) this.receiver).getClass();
                List<eh2> list2 = list;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((eh2) obj3) instanceof jle) {
                        arrayList3.add(obj3);
                    }
                }
                list.removeAll(arrayList3);
                Iterator it4 = ww3.J1(arrayList3).iterator();
                while (it4.hasNext()) {
                    list.add(0, (eh2) it4.next());
                }
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((eh2) listIterator.previous()) instanceof kle) {
                        iNextIndex = listIterator.nextIndex();
                        if (iNextIndex > 0) {
                            kleVar = (kle) list.get(iNextIndex);
                            for (i7 = 0; i7 < iNextIndex; i7++) {
                                eh2Var3 = (eh2) list.remove(0);
                                if (eh2Var3 instanceof lle) {
                                    i64Var = ((lle) eh2Var3).b;
                                } else if (eh2Var3 instanceof kle) {
                                    i64Var = ((kle) eh2Var3).a;
                                } else {
                                    i64Var = null;
                                }
                                if (i64Var != null) {
                                    kleVar.a.Y(new p7d(11, i64Var));
                                }
                                if (eh2Var3 instanceof lme) {
                                    ((lme) eh2Var3).a.a(null);
                                }
                            }
                        }
                        linkedHashSet = new LinkedHashSet();
                        i3 = 0;
                        for (eh2 eh2Var4 : list2) {
                            i4 = i3 + 1;
                            if (eh2Var4 instanceof lme) {
                                lme lmeVar = (lme) eh2Var4;
                                str = lmeVar.a.a;
                                setX1 = ww3.X1(ww3.H1(new ef2(str), lmeVar.b));
                                size2 = list.size();
                                i6 = i4;
                                while (true) {
                                    if (i6 < size2) {
                                        eh2Var2 = (eh2) list.get(i6);
                                        if (eh2Var2 instanceof lle) {
                                            zContains = setX1.contains(new ef2(((lle) eh2Var2).a));
                                        } else if (eh2Var2 instanceof lme) {
                                            lme lmeVar2 = (lme) eh2Var2;
                                            str2 = lmeVar2.a.a;
                                            Set setX2 = ww3.X1(ww3.H1(new ef2(str2), lmeVar2.b));
                                            if (cqk.d(str, str2) && setX1.equals(setX2)) {
                                                zContains = false;
                                            } else {
                                                zContains = true;
                                            }
                                        } else {
                                            zContains = false;
                                        }
                                        if (zContains) {
                                            numValueOf = Integer.valueOf(i6);
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                            } else if (eh2Var4 instanceof lle) {
                                size = list.size();
                                i5 = i4;
                                while (true) {
                                    if (i5 < size) {
                                        eh2Var = (eh2) list.get(i5);
                                        if ((eh2Var instanceof lle) || !cqk.d(((lle) eh2Var).a, ((lle) eh2Var4).a)) {
                                            i5++;
                                        } else {
                                            numValueOf = Integer.valueOf(i5);
                                        }
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                eh2 eh2Var5 = (eh2) list.get(numValueOf.intValue());
                                Log.d("CXCP", eh2Var4 + " is pruned by " + eh2Var5);
                                linkedHashSet.add(Integer.valueOf(i3));
                                if (!(eh2Var4 instanceof lle) && (eh2Var5 instanceof lle)) {
                                    ((lle) eh2Var5).b.Y(new p7d(12, (lle) eh2Var4));
                                }
                            }
                            i3 = i4;
                        }
                        arrayList = new ArrayList();
                        it2 = ww3.L1(linkedHashSet).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(list.remove(((Number) it2.next()).intValue() - arrayList.size()));
                        }
                        for (eh2 eh2Var6 : arrayList) {
                            if (eh2Var6 instanceof lme) {
                                ((lme) eh2Var6).a.a(null);
                            }
                        }
                        return sbi.a;
                    }
                }
                if (iNextIndex > 0) {
                    kleVar = (kle) list.get(iNextIndex);
                    while (i7 < iNextIndex) {
                        eh2Var3 = (eh2) list.remove(0);
                        if (eh2Var3 instanceof lle) {
                            i64Var = ((lle) eh2Var3).b;
                        } else if (eh2Var3 instanceof kle) {
                            i64Var = ((kle) eh2Var3).a;
                        } else {
                            i64Var = null;
                        }
                        if (i64Var != null) {
                            kleVar.a.Y(new p7d(11, i64Var));
                        }
                        if (eh2Var3 instanceof lme) {
                            ((lme) eh2Var3).a.a(null);
                        }
                    }
                }
                linkedHashSet = new LinkedHashSet();
                i3 = 0;
                while (r0.hasNext()) {
                    i4 = i3 + 1;
                    if (eh2Var4 instanceof lme) {
                        lme lmeVar3 = (lme) eh2Var4;
                        str = lmeVar3.a.a;
                        setX1 = ww3.X1(ww3.H1(new ef2(str), lmeVar3.b));
                        size2 = list.size();
                        i6 = i4;
                        while (true) {
                            if (i6 < size2) {
                                eh2Var2 = (eh2) list.get(i6);
                                if (eh2Var2 instanceof lle) {
                                    zContains = setX1.contains(new ef2(((lle) eh2Var2).a));
                                } else if (eh2Var2 instanceof lme) {
                                    lme lmeVar4 = (lme) eh2Var2;
                                    str2 = lmeVar4.a.a;
                                    Set setX3 = ww3.X1(ww3.H1(new ef2(str2), lmeVar4.b));
                                    if (cqk.d(str, str2)) {
                                    }
                                    zContains = true;
                                } else {
                                    zContains = false;
                                }
                                if (zContains) {
                                    numValueOf = Integer.valueOf(i6);
                                } else {
                                    i6++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else if (eh2Var4 instanceof lle) {
                        size = list.size();
                        i5 = i4;
                        while (true) {
                            if (i5 < size) {
                                eh2Var = (eh2) list.get(i5);
                                if (eh2Var instanceof lle) {
                                }
                                i5++;
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        eh2 eh2Var7 = (eh2) list.get(numValueOf.intValue());
                        Log.d("CXCP", eh2Var4 + " is pruned by " + eh2Var7);
                        linkedHashSet.add(Integer.valueOf(i3));
                        if (!(eh2Var4 instanceof lle)) {
                        }
                    }
                    i3 = i4;
                }
                arrayList = new ArrayList();
                it2 = ww3.L1(linkedHashSet).iterator();
                while (it2.hasNext()) {
                    arrayList.add(list.remove(((Number) it2.next()).intValue() - arrayList.size()));
                }
                while (r0.hasNext()) {
                    if (eh2Var6 instanceof lme) {
                        ((lme) eh2Var6).a.a(null);
                    }
                }
                return sbi.a;
            case 21:
                ChatsListSearchScreen chatsListSearchScreen = ((yi3) this.receiver).a;
                zv8[] zv8VarArr3 = ChatsListSearchScreen.F;
                ml9.b(chatsListSearchScreen);
                fk3 fk3VarR1 = chatsListSearchScreen.r1();
                fk3VarR1.t1.B(fk3VarR1, fk3.y1[1], yab.i0(fk3VarR1.b, null, 2, new k23((s9e) obj, fk3VarR1, null, 18), 1));
                return sbi.a;
            case 22:
                y8f y8fVar = (y8f) obj;
                ChatsListSearchScreen chatsListSearchScreen2 = (ChatsListSearchScreen) ((c8f) this.receiver);
                if (y8fVar instanceof be3) {
                    fk3 fk3VarR2 = chatsListSearchScreen2.r1();
                    be3 be3Var = (be3) y8fVar;
                    if (!((wd4) fk3VarR2.C.getValue()).h()) {
                        fk3VarR2.K();
                    }
                    fk3VarR2.w1.B(fk3VarR2, fk3.y1[4], yab.i0(fk3VarR2.b, ((n0c) fk3VarR2.g).a(), 0, new f00(fk3VarR2, be3Var, (lq4) null, 23), 2));
                } else {
                    chatsListSearchScreen2.getClass();
                }
                return sbi.a;
            case 23:
                ((ShowLocationScreen) this.receiver).O((po7) obj);
                return sbi.a;
            case 24:
                View view2 = (View) obj;
                StickersScreen stickersScreen = (StickersScreen) this.receiver;
                zv8[] zv8VarArr4 = StickersScreen.m;
                kpg kpgVar = (kpg) stickersScreen.r1().t.a.getValue();
                List list3 = kpgVar != null ? kpgVar.d : null;
                if (list3 != null && !list3.isEmpty()) {
                    opl.b(stickersScreen, 1).l(list3).f(view2).b().build().u(stickersScreen);
                }
                return sbi.a;
            case 25:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                oeh oehVar = (oeh) this.receiver;
                int i15 = oehVar.n;
                int i16 = oehVar.n;
                int i17 = oehVar.m;
                xme xmeVar = oehVar.q;
                View view3 = oehVar.d;
                int i18 = oehVar.g;
                if (((Boolean) oehVar.a.invoke()).booleanValue() && ((Boolean) oehVar.b.invoke()).booleanValue()) {
                    if (motionEvent2.getPointerCount() <= 1 || !oehVar.h) {
                        ((VelocityTracker) xmeVar.getValue()).addMovement(motionEvent2);
                        float translationY2 = 0.0f;
                        if (motionEvent2.getAction() != 1 && motionEvent2.getAction() != 3) {
                            boolean z4 = oehVar.h;
                            if (!z4) {
                                ViewGroup viewGroup2 = oehVar.e;
                                c8 c8Var = oehVar.p;
                                if (oehVar.i <= 0.0f || oehVar.j <= 0.0f) {
                                    oehVar.k = motionEvent2.getRawX();
                                    oehVar.l = motionEvent2.getRawY();
                                } else {
                                    if (oehVar.b()) {
                                        f = oehVar.k;
                                        rawY = motionEvent2.getRawX();
                                    } else {
                                        f = oehVar.l;
                                        rawY = motionEvent2.getRawY();
                                    }
                                    float f4 = f - rawY;
                                    if (oehVar.b()) {
                                        f2 = oehVar.l;
                                        rawX = motionEvent2.getRawY();
                                    } else {
                                        f2 = oehVar.k;
                                        rawX = motionEvent2.getRawX();
                                    }
                                    float f5 = f2 - rawX;
                                    int iD = qt4.D(i18);
                                    if (iD == 0) {
                                        if (Math.abs(f4) > ((Number) oehVar.r.getValue()).intValue() && Math.abs(f4) > Math.abs(f5) * 2.0f) {
                                            oehVar.h = true;
                                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                                            iIndexOfChild = viewGroup2.indexOfChild(view3);
                                            if (viewGroup2.indexOfChild(c8Var) != iIndexOfChild) {
                                                ViewParent parent = c8Var.getParent();
                                                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                                if (viewGroup != null) {
                                                    viewGroup.removeView(c8Var);
                                                }
                                            }
                                            if (c8Var.getParent() == null) {
                                                viewGroup2.addView(c8Var, iIndexOfChild);
                                            }
                                            swipeWidget = oehVar.s;
                                            if (swipeWidget != null) {
                                                swipeWidget.b = true;
                                                swipeWidget.x1();
                                            }
                                        }
                                    } else if (iD != 1) {
                                        if (iD != 2) {
                                            ore.o();
                                            return null;
                                        }
                                        if (f4 < 0.0f) {
                                            if (Math.abs(f4) > ((Number) oehVar.r.getValue()).intValue()) {
                                                oehVar.h = true;
                                                view3.getParent().requestDisallowInterceptTouchEvent(true);
                                                iIndexOfChild = viewGroup2.indexOfChild(view3);
                                                if (viewGroup2.indexOfChild(c8Var) != iIndexOfChild) {
                                                    ViewParent parent2 = c8Var.getParent();
                                                    if (parent2 instanceof ViewGroup) {
                                                    }
                                                    if (viewGroup != null) {
                                                        viewGroup.removeView(c8Var);
                                                    }
                                                }
                                                if (c8Var.getParent() == null) {
                                                    viewGroup2.addView(c8Var, iIndexOfChild);
                                                }
                                                swipeWidget = oehVar.s;
                                                if (swipeWidget != null) {
                                                    swipeWidget.b = true;
                                                    swipeWidget.x1();
                                                }
                                            }
                                        }
                                    } else if (f4 < 0.0f) {
                                        if (Math.abs(f4) > ((Number) oehVar.r.getValue()).intValue()) {
                                            oehVar.h = true;
                                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                                            iIndexOfChild = viewGroup2.indexOfChild(view3);
                                            if (viewGroup2.indexOfChild(c8Var) != iIndexOfChild) {
                                                ViewParent parent3 = c8Var.getParent();
                                                if (parent3 instanceof ViewGroup) {
                                                }
                                                if (viewGroup != null) {
                                                    viewGroup.removeView(c8Var);
                                                }
                                            }
                                            if (c8Var.getParent() == null) {
                                                viewGroup2.addView(c8Var, iIndexOfChild);
                                            }
                                            swipeWidget = oehVar.s;
                                            if (swipeWidget != null) {
                                                swipeWidget.b = true;
                                                swipeWidget.x1();
                                            }
                                        }
                                    }
                                }
                                oehVar.i = motionEvent2.getRawX();
                                oehVar.j = motionEvent2.getRawY();
                            } else if (z4) {
                                float f6 = oehVar.b() ? oehVar.i : oehVar.j;
                                if (f6 > 0.0f) {
                                    float rawX2 = f6 - (oehVar.b() ? motionEvent2.getRawX() : motionEvent2.getRawY());
                                    int iD2 = qt4.D(i18);
                                    if (iD2 == 0) {
                                        translationY2 = (view3.getTranslationY() - rawX2) / i15;
                                    } else if (iD2 == 1) {
                                        float translationX = view3.getTranslationX() - rawX2;
                                        translationY2 = (translationX >= 0.0f ? translationX : 0.0f) / i17;
                                    } else {
                                        if (iD2 != 2) {
                                            ore.o();
                                            return null;
                                        }
                                        float translationY3 = (view3.getTranslationY() - rawX2) / i15;
                                        if (translationY3 > 0.0f) {
                                            translationY2 = translationY3;
                                        }
                                    }
                                    oehVar.d(translationY2);
                                    SwipeWidget swipeWidget2 = oehVar.s;
                                    if (swipeWidget2 != null) {
                                        swipeWidget2.w1(translationY2);
                                    }
                                    oehVar.i = motionEvent2.getRawX();
                                    oehVar.j = motionEvent2.getRawY();
                                }
                            }
                        } else if (oehVar.h) {
                            VelocityTracker velocityTracker = (VelocityTracker) xmeVar.getValue();
                            velocityTracker.computeCurrentVelocity(1);
                            float xVelocity = oehVar.b() ? velocityTracker.getXVelocity(motionEvent2.getPointerId(motionEvent2.getActionIndex())) : velocityTracker.getYVelocity(motionEvent2.getPointerId(motionEvent2.getActionIndex()));
                            try {
                                ((VelocityTracker) xmeVar.getValue()).recycle();
                                break;
                            } catch (Throwable unused) {
                            }
                            xmeVar.b = khb.k;
                            int iD3 = qt4.D(i18);
                            if (iD3 == 0) {
                                b = true;
                            } else if (iD3 != 1) {
                                if (iD3 != 2) {
                                    ore.o();
                                    return null;
                                }
                                if (xVelocity > 0.0f) {
                                    b = true;
                                } else {
                                    b = false;
                                }
                            } else if (xVelocity > 0.0f) {
                                b = true;
                            } else {
                                b = false;
                            }
                            float translationX2 = oehVar.b() ? view3.getTranslationX() : view3.getTranslationY();
                            float translationX3 = oehVar.b() ? view3.getTranslationX() / i17 : view3.getTranslationY() / i16;
                            byte b2 = b == true && Math.abs(xVelocity) >= 1.5f;
                            if (!((Boolean) oehVar.c.invoke()).booleanValue() || (!b2 == true && (!oehVar.b() ? Math.abs(translationX2 / i15) <= 0.2f : Math.abs(translationX2 / i17) <= 0.2f))) {
                                oehVar.c(translationX3, false);
                            } else {
                                ValueAnimator valueAnimator = oehVar.v;
                                if (valueAnimator == null || !valueAnimator.isRunning()) {
                                    ValueAnimator duration = ValueAnimator.ofFloat(translationX3, translationX3 < 0.0f ? -1.0f : 1.0f).setDuration(oc9.x(gm0.L((1.0f - Math.abs(translationX3)) * 200.0f), 120L, 200L));
                                    duration.addUpdateListener(new neh(oehVar, 0));
                                    duration.addListener(new li(oehVar, translationX3));
                                    oehVar.v = duration;
                                    duration.start();
                                }
                            }
                            oehVar.h = false;
                            oehVar.i = -1.0f;
                            oehVar.j = -1.0f;
                        } else {
                            oehVar.h = false;
                            oehVar.i = -1.0f;
                            oehVar.j = -1.0f;
                        }
                        z2 = oehVar.h;
                    } else {
                        if (oehVar.b()) {
                            translationY = view3.getTranslationX();
                            f3 = i17;
                        } else {
                            translationY = view3.getTranslationY();
                            f3 = i16;
                        }
                        oehVar.c(translationY / f3, true);
                    }
                }
                return Boolean.valueOf(z2);
            case 26:
                ((zfa) this.receiver).getClass();
                return zfa.a((fka) obj);
            case 27:
                lv lvVar = ((fv) this.receiver).a;
                lvVar.t.B(lvVar, lv.w[0], a8j.t(lvVar, ((n0c) lvVar.H()).b(), new jv(lvVar, (aqh) obj, null), 2));
                return sbi.a;
            case 28:
                View view4 = (View) obj;
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.receiver;
                zv8[] zv8VarArr5 = VideoWebViewScreen.A;
                i6j i6jVarJ1 = videoWebViewScreen.J1();
                i6jVarJ1.getClass();
                c79 c79VarW = yab.w();
                if (i6jVarJ1.d != 0) {
                    c79VarW.add(new rp4(R.id.video_go_to_message, new tnh(R.string.go_to_message), Integer.valueOf(R.drawable.icon_message_forward), (Integer) null, 20));
                }
                c79VarW.add(new rp4(R.id.video_share, new tnh(R.string.forward), Integer.valueOf(R.drawable.icon_forward), (Integer) null, 20));
                c79 c79VarJ = yab.j(c79VarW);
                if (!c79VarJ.isEmpty()) {
                    opl.b(videoWebViewScreen, 1).l(c79VarJ).f(view4).b().c().build().u(videoWebViewScreen);
                }
                return sbi.a;
            default:
                rej rejVarC = ((ioj) this.receiver).C();
                yab.i0(rejVarC.c, ((n0c) rejVarC.e()).a(), 0, new oli(rejVarC, (cx0) obj, null, 10), 2);
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7() {
        super(1, 0, jk1.class, kk1.m, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/calls/CallHistoryItem;");
        this.a = 15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz7(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7(gp8 gp8Var) {
        super(1, 0, gp8.class, gp8Var, "invoke", "invoke(Ljava/lang/Throwable;)V");
        this.a = 1;
    }
}
