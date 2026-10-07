package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import one.me.android.root.RootController;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n61 extends fg7 implements cf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(int i) {
        super(1, 0, jk1.class, kk1.m, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/calls/CallHistoryItem;");
        this.a = i;
        switch (i) {
            case 14:
                super(1, 0, g54.class, h54.c, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/ComplainReason;");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x030c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0329  */
    /* JADX WARN: Code duplicated, block: B:128:0x033e A[LOOP:6: B:126:0x0338->B:128:0x033e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0365 A[LOOP:7: B:130:0x035f->B:132:0x0365, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0794  */
    /* JADX WARN: Code duplicated, block: B:376:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:380:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:451:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x02af  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        rt2 rt2VarB;
        int i;
        int iU;
        String strX;
        Object value;
        List list;
        int i2;
        gg1 gg1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Iterator it2;
        int i3 = this.a;
        List listJ = r66.a;
        int i4 = 0;
        boolean z = false;
        z = false;
        boolean z2 = false;
        int i5 = 1;
        y26VarB = null;
        y26VarB = null;
        y26 y26VarB = null;
        sbi sbiVar = sbi.a;
        switch (i3) {
            case 0:
                kw8 kw8Var = (kw8) obj;
                o61 o61Var = (o61) this.receiver;
                o61Var.i = kw8Var;
                Iterator it3 = ((kg8) kw8Var).a.iterator();
                while (it3.hasNext()) {
                    for (c61 c61Var : (h61) it3.next()) {
                        if (i4 > o61Var.h.size() - i5) {
                            o61Var.postDelayed(new c3(18, o61Var), 300L);
                            return sbiVar;
                        }
                        s01 s01Var = (s01) o61Var.h.get(i4);
                        if (c61Var != s01Var.a) {
                            ArrayList arrayList4 = o61Var.h;
                            s01 s01Var2 = new s01(c61Var, s01Var.b, s01Var.c, s01Var.d, s01Var.e, s01Var.f, s01Var.g, s01Var.h);
                            s01Var2.i = s01Var.i;
                            arrayList4.set(i4, s01Var2);
                        }
                        i4++;
                        i5 = 1;
                    }
                }
                o61Var.postDelayed(new c3(18, o61Var), 300L);
                return sbiVar;
            case 1:
                ((jk1) this.receiver).getClass();
                return jk1.a((fka) obj);
            case 2:
                ((a22) this.receiver).i((String) obj, Boolean.TRUE);
                return sbiVar;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                gu2 gu2Var = (gu2) this.receiver;
                rt2 rt2VarB2 = gu2Var.B();
                Long lM = rt2VarB2 != null ? rt2VarB2.m(jLongValue) : null;
                if (lM == null) {
                    rt2VarB = gu2Var.B();
                    if (rt2VarB != null) {
                        z2 = true;
                    }
                } else if (lM.longValue() != ((s7f) ((et3) gu2Var.h.getValue())).t()) {
                    rt2VarB = gu2Var.B();
                    if (rt2VarB != null && rt2VarB.B0()) {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                v63 v63Var = gu2Var.j;
                if (z2) {
                    return Collections.singletonList((rp4) v63Var.d.getValue());
                }
                v63Var.getClass();
                return listJ;
            case 4:
                ((ChatMediaListWidget) ((w23) this.receiver)).o1().K((x7a) obj);
                return sbiVar;
            case 5:
                ((ChatMediaListWidget) ((w23) this.receiver)).o1().K((x7a) obj);
                return sbiVar;
            case 6:
                ((ChatMediaListWidget) ((w23) this.receiver)).o1().K((x7a) obj);
                return sbiVar;
            case 7:
                u7a u7aVar = (u7a) obj;
                ChatMediaListWidget chatMediaListWidget = (ChatMediaListWidget) ((w23) this.receiver);
                chatMediaListWidget.getClass();
                if (!u7aVar.h) {
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(new xnh(u7aVar.e), n1g.i(new ylc("selected_message_id", Long.valueOf(u7aVar.b)), new ylc("selected_attach_id", Long.valueOf(u7aVar.c))), null, 4);
                    jc4VarA.g(new xnh(String.valueOf(u7aVar.g)));
                    jc4VarA.a(new kc4(R.id.profile_media_action_open_link, new tnh(R.string.profile_media_action_goto_link), 2, 56));
                    jc4VarA.a(new kc4(R.id.profile_media_action_copy_link, new tnh(R.string.profile_media_action_copy_link), 2, 56));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(chatMediaListWidget);
                    confirmationBottomSheetF.setTargetController(chatMediaListWidget);
                    br4 parentController = chatMediaListWidget;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                }
                return sbiVar;
            case 8:
                ((ChatMediaListWidget) ((w23) this.receiver)).o1().K((x7a) obj);
                return sbiVar;
            case 9:
                ((ChatMediaListWidget) ((w23) this.receiver)).o1().K((x7a) obj);
                return sbiVar;
            case 10:
                View view = (View) obj;
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.receiver;
                zv8[] zv8VarArr2 = ChatMediaViewerScreen.Z;
                l63 l63VarU1 = chatMediaViewerScreen.U1();
                mg5 mg5Var = l63VarU1.d;
                qy9 qy9VarL = l63VarU1.L();
                if (!(qy9VarL instanceof ky9)) {
                    if (qy9VarL instanceof py9) {
                        i = R.string.oneme_chatmedia_viewer_toolbar_action_forward_video;
                    }
                    if (!listJ.isEmpty()) {
                        opl.b(chatMediaViewerScreen, 1).l(listJ).f(view).b().c().build().u(chatMediaViewerScreen);
                    }
                    return sbiVar;
                }
                i = R.string.oneme_chatmedia_viewer_toolbar_action_forward_photo;
                if (!(qy9VarL instanceof ey9)) {
                    Object value2 = l63VarU1.K().k(l63VarU1.c).a.getValue();
                    if (value2 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    boolean zK0 = ((rt2) value2).k0(l63VarU1.o);
                    c79 c79VarW = yab.w();
                    if (!zK0) {
                        c79VarW.add(new rp4(R.id.oneme_chatmedia_viewer_toolbar_action_share, new tnh(R.string.oneme_chatmedia_viewer_toolbar_action_share), Integer.valueOf(R.drawable.icon_share_android), (Integer) null, 20));
                    }
                    if (!mg5Var.a()) {
                        c79VarW.add(new rp4(R.id.oneme_chatmedia_viewer_toolbar_action_goto_message, new tnh(R.string.oneme_chatmedia_viewer_toolbar_action_goto_message), Integer.valueOf(R.drawable.icon_message_forward), (Integer) null, 20));
                    }
                    if (qy9VarL.k() > 0 && !l63VarU1.h && !mg5Var.a() && !zK0) {
                        c79VarW.add(new rp4(R.id.oneme_chatmedia_viewer_toolbar_action_forward_attach, new tnh(i), Integer.valueOf(R.drawable.icon_image_send), (Integer) null, 20));
                    }
                    listJ = yab.j(c79VarW);
                }
                if (!listJ.isEmpty()) {
                    opl.b(chatMediaViewerScreen, 1).l(listJ).f(view).b().c().build().u(chatMediaViewerScreen);
                }
                return sbiVar;
            case 11:
                return ((l73) this.receiver).C(((Number) obj).longValue());
            case 12:
                MotionEvent motionEvent = (MotionEvent) obj;
                va3 va3Var = (va3) this.receiver;
                View viewFindViewById = va3Var.findViewById(R.id.messages_list_scroll_btn);
                boolean z3 = viewFindViewById != null && va3Var.a(viewFindViewById, motionEvent);
                ChatScreen chatScreen = va3Var.d;
                ou7 ou7Var = ChatScreen.L1;
                return Boolean.valueOf(z3 || va3Var.a(chatScreen.J1(), motionEvent));
            case 13:
                va3 va3Var2 = (va3) this.receiver;
                ChatScreen chatScreen2 = va3Var2.d;
                ou7 ou7Var2 = ChatScreen.L1;
                boolean zA = va3Var2.a(chatScreen2.g2(), (MotionEvent) obj);
                ChatScreen chatScreen3 = va3Var2.d;
                if (zA) {
                    rt2 rt2Var = (rt2) chatScreen3.k2().G1.a.getValue();
                    if (rt2Var != null) {
                        tb3 tb3Var = tb3.b;
                        long j = rt2Var.a;
                        boolean zK = chatScreen3.k2().K();
                        tb3Var.getClass();
                        o65.c(tb3Var.b(), bc1.l(j, ":profile?id=", "&type=local_chat&is_opened_from_dialog=", zK), null, null, 6);
                    }
                } else {
                    mjg mjgVar = chatScreen3.N1().p;
                    Boolean bool = Boolean.FALSE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                }
                return sbiVar;
            case 14:
                fka fkaVar = (fka) obj;
                ((g54) this.receiver).getClass();
                try {
                    iU = ch3.U(fkaVar);
                } catch (Throwable th) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                    Iterator it4 = fjf.a.iterator();
                    while (it4.hasNext()) {
                        AccountInitializer accountInitializer = ((n6) it4.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th);
                            accountInitializer.d().i().g().a(null, th);
                        } catch (Throwable th2) {
                            gm0.V("Payload", "failed to collect exception", th2);
                        }
                    }
                    int iD = qt4.D(pye.a);
                    if (iD != 0) {
                        if (iD == 1) {
                            throw th;
                        }
                        ore.o();
                        return null;
                    }
                    iU = 0;
                }
                Byte bO = null;
                String strX2 = null;
                for (int i6 = 0; i6 < iU; i6++) {
                    try {
                        strX = ch3.X(fkaVar, null);
                    } catch (Throwable th3) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it5 = fjf.a.iterator();
                        while (it5.hasNext()) {
                            AccountInitializer accountInitializer2 = ((n6) it5.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th3);
                                accountInitializer2.d().i().g().a(null, th3);
                            } catch (Throwable th4) {
                                gm0.V("Payload", "failed to collect exception", th4);
                            }
                        }
                        int iD2 = qt4.D(pye.a);
                        if (iD2 != 0) {
                            if (iD2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            if (strX.equals("reasonId")) {
                                try {
                                    bO = ch3.O(fkaVar);
                                } catch (Throwable th5) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                    Iterator it6 = fjf.a.iterator();
                                    while (it6.hasNext()) {
                                        AccountInitializer accountInitializer3 = ((n6) it6.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th5);
                                            accountInitializer3.d().i().g().a(null, th5);
                                        } catch (Throwable th6) {
                                            gm0.V("Payload", "failed to collect exception", th6);
                                        }
                                    }
                                    int iD3 = qt4.D(pye.a);
                                    if (iD3 != 0) {
                                        if (iD3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th5;
                                    }
                                    bO = null;
                                }
                            } else if (strX.equals("reasonTitle")) {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
                                } catch (Throwable th7) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                    Iterator it7 = fjf.a.iterator();
                                    while (it7.hasNext()) {
                                        AccountInitializer accountInitializer4 = ((n6) it7.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th7);
                                            accountInitializer4.d().i().g().a(null, th7);
                                        } catch (Throwable th8) {
                                            gm0.V("Payload", "failed to collect exception", th8);
                                        }
                                    }
                                    int iD4 = qt4.D(pye.a);
                                    if (iD4 != 0) {
                                        if (iD4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th7;
                                    }
                                    strX2 = null;
                                }
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th9) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                    Iterator it8 = fjf.a.iterator();
                                    while (it8.hasNext()) {
                                        AccountInitializer accountInitializer5 = ((n6) it8.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th9);
                                            accountInitializer5.d().i().g().a(null, th9);
                                        } catch (Throwable th10) {
                                            gm0.V("Payload", "failed to collect exception", th10);
                                        }
                                    }
                                    int iD5 = qt4.D(pye.a);
                                    if (iD5 != 0) {
                                        if (iD5 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th9;
                                    }
                                }
                            }
                        } catch (Throwable th11) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                Iterator it9 = fjf.a.iterator();
                                while (it9.hasNext()) {
                                    AccountInitializer accountInitializer6 = ((n6) it9.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th11);
                                        accountInitializer6.d().i().g().a(null, th11);
                                    } catch (Throwable th12) {
                                        gm0.V("Payload", "failed to collect exception", th12);
                                    }
                                }
                                int iD6 = qt4.D(pye.a);
                                if (iD6 != 0) {
                                    if (iD6 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th11;
                                }
                            } catch (Throwable th13) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                Iterator it10 = fjf.a.iterator();
                                while (it10.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it10.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th13);
                                        accountInitializer7.d().i().g().a(null, th13);
                                    } catch (Throwable th14) {
                                        gm0.V("Payload", "failed to collect exception", th14);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 == 1) {
                                        throw th13;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                if (bO == null || strX2 == null || strX2.length() == 0) {
                    return null;
                }
                return new h54(bO.byteValue(), strX2);
            case 15:
                ((y85) this.receiver).X((Throwable) obj);
                return sbiVar;
            case 16:
                h4c h4cVar = (h4c) ((c2a) this.receiver);
                yab.i0(h4cVar.k, null, 0, new g4c(h4cVar, (File) obj, null, 0), 3);
                return sbiVar;
            case 17:
                h4c h4cVar2 = (h4c) ((c2a) this.receiver);
                yab.i0(h4cVar2.k, null, 0, new g4c(h4cVar2, (File) obj, null, 1), 3);
                return sbiVar;
            case 18:
                ((oyg) this.receiver).a.f((Long) obj);
                return sbiVar;
            case 19:
                long jLongValue2 = ((Number) obj).longValue();
                p26 p26Var = (p26) this.receiver;
                p26Var.s.d(Long.valueOf(jLongValue2));
                mjg mjgVar2 = p26Var.r1;
                do {
                    value = mjgVar2.getValue();
                } while (!mjgVar2.h(value, k16.a));
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                long[] jArr = (long[]) obj;
                p26 p26Var2 = (p26) this.receiver;
                xk2 xk2Var = p26Var2.i;
                l8b l8bVar = new l8b(xk2Var.b.size());
                for (vk2 vk2Var : xk2Var.b) {
                    l8bVar.l(vk2Var.getId(), vk2Var);
                }
                ArrayList arrayList5 = new ArrayList(xk2Var.b.size());
                m8b m8bVar = new m8b(jArr.length);
                for (long j2 : jArr) {
                    vk2 vk2Var2 = (vk2) l8bVar.f(j2);
                    if (vk2Var2 != null) {
                        arrayList5.add(vk2Var2);
                        m8bVar.a(j2);
                    }
                }
                for (vk2 vk2Var3 : xk2Var.b) {
                    if (!m8bVar.d(vk2Var3.getId())) {
                        arrayList5.add(vk2Var3);
                    }
                }
                List<vk2> listM1 = ww3.M1(arrayList5, new lv5(15));
                List list2 = xk2Var.b;
                if (listM1.size() != list2.size()) {
                    list = xk2Var.b;
                    if (listM1.size() != list.size()) {
                        z = true;
                    } else {
                        i2 = 0;
                        for (vk2 vk2Var4 : listM1) {
                            if (vk2Var4 instanceof sk2) {
                                while (i2 < list.size() && !(list.get(i2) instanceof sk2)) {
                                    i2++;
                                }
                                if (i2 == list.size() && list.get(i2) == vk2Var4) {
                                    i2++;
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                    xk2Var.b = listM1;
                    mjg mjgVar3 = xk2Var.d;
                    mjgVar3.getClass();
                    mjgVar3.j(null, listM1);
                    if (z) {
                        gg1Var = xk2Var.c;
                        arrayList = new ArrayList(xk2Var.b.size());
                        for (vk2 vk2Var5 : xk2Var.b) {
                            if (vk2Var5 instanceof sk2) {
                                arrayList.add(((sk2) vk2Var5).a);
                            }
                        }
                        if (!((List) gg1Var.e).isEmpty()) {
                            arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Long.valueOf(((lu5) it.next()).a));
                            }
                            gg1Var.d = arrayList2;
                            gg1Var.e = arrayList;
                            arrayList3 = new ArrayList(yw3.W0(arrayList, 10));
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((lu5) it2.next()).b);
                            }
                            y26VarB = gg1.b(arrayList3, (Rect) gg1Var.c, gg1Var.a);
                            gg1Var.f = y26VarB;
                        }
                    }
                } else {
                    int size = listM1.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            if (listM1.get(i7) != list2.get(i7)) {
                                list = xk2Var.b;
                                if (listM1.size() != list.size()) {
                                    z = true;
                                } else {
                                    i2 = 0;
                                    while (r4.hasNext()) {
                                        if (vk2Var4 instanceof sk2) {
                                            while (i2 < list.size()) {
                                                i2++;
                                            }
                                            if (i2 == list.size()) {
                                            }
                                            z = true;
                                        }
                                    }
                                }
                                xk2Var.b = listM1;
                                mjg mjgVar4 = xk2Var.d;
                                mjgVar4.getClass();
                                mjgVar4.j(null, listM1);
                                if (z) {
                                    gg1Var = xk2Var.c;
                                    arrayList = new ArrayList(xk2Var.b.size());
                                    while (r2.hasNext()) {
                                        if (vk2Var5 instanceof sk2) {
                                            arrayList.add(((sk2) vk2Var5).a);
                                        }
                                    }
                                    if (!((List) gg1Var.e).isEmpty()) {
                                        arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(Long.valueOf(((lu5) it.next()).a));
                                        }
                                        gg1Var.d = arrayList2;
                                        gg1Var.e = arrayList;
                                        arrayList3 = new ArrayList(yw3.W0(arrayList, 10));
                                        it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(((lu5) it2.next()).b);
                                        }
                                        y26VarB = gg1.b(arrayList3, (Rect) gg1Var.c, gg1Var.a);
                                        gg1Var.f = y26VarB;
                                    }
                                }
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                if (y26VarB != null) {
                    p26Var2.h.c(p26Var2.c, y26VarB);
                }
                return sbiVar;
            case 21:
                ((ChatsListWidget) ((ok6) this.receiver)).u1(((Number) obj).longValue());
                return sbiVar;
            case 22:
                ((Number) obj).longValue();
                ((ChatsListWidget) ((ok6) this.receiver)).t1().P();
                return sbiVar;
            case 23:
                ((ChatsListWidget) ((ok6) this.receiver)).u1(((Number) obj).longValue());
                return sbiVar;
            case 24:
                ((Number) obj).longValue();
                ((ChatsListWidget) ((ok6) this.receiver)).t1().P();
                return sbiVar;
            case 25:
                long jLongValue3 = ((Number) obj).longValue();
                f37 f37VarP1 = ((FolderEditScreen) ((g27) this.receiver)).p1();
                if (jLongValue3 == 9223372036854775806L) {
                    f37VarP1.x.B(f37VarP1, f37.D[0], yab.h0(f37VarP1.b, ((n0c) f37VarP1.d).a(), 2, new qc5(f37VarP1, (lq4) null, 19)));
                } else if (jLongValue3 == 9223372036854775805L) {
                    a8j.x(f37VarP1.r, l27.a);
                } else if (jLongValue3 == 9223372036854775804L) {
                    f37VarP1.O(false);
                } else if (jLongValue3 == 9223372036854775803L) {
                    f37VarP1.O(true);
                } else {
                    f37VarP1.getClass();
                }
                return sbiVar;
            case 26:
                zmi zmiVar = (zmi) obj;
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
                zv8[] zv8VarArr3 = FoldersListScreen.h;
                foldersListScreen.getClass();
                ymi ymiVar = zmiVar.b;
                r17 r17Var = zmiVar.a;
                int iOrdinal = ymiVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        k57 k57VarO1 = foldersListScreen.o1();
                        if (r17Var == null) {
                            k57VarO1.getClass();
                        } else {
                            ic6 ic6Var = k57VarO1.l;
                            r37 r37Var = r37.b;
                            String str = r17Var.a;
                            r37Var.getClass();
                            bc1.q(":settings/folder/edit?id=".concat(str), ic6Var);
                        }
                    } else if (iOrdinal == 2) {
                        ic6 ic6Var2 = foldersListScreen.o1().l;
                        r37.b.getClass();
                        a8j.x(ic6Var2, new i65(":settings/folder/create"));
                    } else {
                        if (iOrdinal != 3) {
                            ore.o();
                            return null;
                        }
                        k57 k57VarO2 = foldersListScreen.o1();
                        if (r17Var == null) {
                            k57VarO2.getClass();
                        } else {
                            k57VarO2.o.B(k57VarO2, k57.r[0], yab.h0(k57VarO2.b, ((n0c) k57VarO2.d).a(), 2, new je0(k57VarO2, r17Var, null, 2)));
                        }
                        ia8 ia8Var = (ia8) foldersListScreen.c.getAccessor().f();
                        if (ia8Var != null) {
                            ia8Var.f(Collections.singleton(new ha8(fa8.CREATE_FOLDER, 1)), y3f.SETTINGS_FOLDERS);
                        }
                    }
                }
                return sbiVar;
            case 27:
                zmi zmiVar2 = (zmi) obj;
                FoldersPickerScreen foldersPickerScreen = (FoldersPickerScreen) this.receiver;
                zv8[] zv8VarArr4 = FoldersPickerScreen.l;
                foldersPickerScreen.getClass();
                if (t57.$EnumSwitchMapping$0[zmiVar2.b.ordinal()] == 1) {
                    d67 d67VarO1 = foldersPickerScreen.o1();
                    mjg mjgVar5 = d67VarO1.o;
                    r17 r17Var2 = zmiVar2.a;
                    if (r17Var2 != null) {
                        String str2 = r17Var2.a;
                        Set setW1 = ww3.W1((Iterable) mjgVar5.getValue());
                        if (!setW1.remove(str2)) {
                            setW1.add(str2);
                        }
                        mjgVar5.j(null, setW1);
                        mjg mjgVar6 = d67VarO1.j;
                        Set set = (Set) d67VarO1.n.get();
                        qt4.C(set != null ? !set.equals(mjgVar5.getValue()) : false, mjgVar6, null);
                    }
                }
                return sbiVar;
            case 28:
                ((pn7) this.receiver).F0((qn7) obj);
                return sbiVar;
            default:
                xp7 xp7Var = (xp7) this.receiver;
                xp7Var.getClass();
                for (rp7 rp7Var : (List) obj) {
                    if (rp7Var instanceof lp7) {
                        xp7Var.b(((lp7) rp7Var).a);
                    } else if (rp7Var instanceof pp7) {
                        yab.i0(xp7Var.e, null, 4, new qy3((pp7) rp7Var, null, 24), 1);
                    }
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n61(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(int i, Object obj) {
        super(1, 0, c2a.class, obj, "copyOriginalImageToGallery", "copyOriginalImageToGallery(Ljava/io/File;)V");
        this.a = i;
        switch (i) {
            case 17:
                super(1, 0, c2a.class, obj, "copyVideoToGallery", "copyVideoToGallery(Ljava/io/File;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(ChatsListWidget chatsListWidget, int i) {
        super(1, 0, ok6.class, chatsListWidget, "onFakeChatItemClick", "onFakeChatItemClick(J)V");
        this.a = i;
        switch (i) {
            case 24:
                super(1, 0, ok6.class, chatsListWidget, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V");
                break;
            default:
                break;
        }
    }
}
