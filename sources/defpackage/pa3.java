package defpackage;

import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pa3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ pa3(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        lmc lmcVar;
        rt2 rt2Var;
        int i = this.a;
        a8g a8gVar = pq3.j;
        int i2 = 1;
        sbi sbiVar = sbi.a;
        ChatScreen chatScreen = this.b;
        switch (i) {
            case 0:
                ou7 ou7Var = ChatScreen.L1;
                if (chatScreen.O1() != y3f.CHAT) {
                    lve lveVar = (lve) ww3.D1(chatScreen.getRouter().e());
                    Object obj = lveVar != null ? lveVar.a : null;
                    if (obj == null || obj.equals(chatScreen) || !(obj instanceof obb)) {
                        obj = null;
                    }
                    obb obbVar = obj instanceof obb ? (obb) obj : null;
                    return obbVar != null ? obbVar.u0() : lmc.h;
                }
                rt2 rt2Var2 = (rt2) chatScreen.k2().G1.a.getValue();
                if (rt2Var2 == null) {
                    return lmc.h;
                }
                if (rt2Var2.b0()) {
                    vg4 vg4VarW = rt2Var2.w();
                    lmcVar = new lmc(null, 0, rdg.DIALOG_BOT_ID, vg4VarW != null ? Long.valueOf(vg4VarW.v()) : null, null, null, 115);
                } else {
                    if (!rt2Var2.h0()) {
                        return new lmc(null, 0, rdg.CHAT_ID, Long.valueOf(rt2Var2.A()), null, null, 115);
                    }
                    vg4 vg4VarW2 = rt2Var2.w();
                    lmcVar = new lmc(null, 0, rdg.DIALOG_USER_ID, vg4VarW2 != null ? Long.valueOf(vg4VarW2.v()) : null, null, null, 115);
                }
                return lmcVar;
            case 1:
                h hVar = chatScreen.f;
                return new as9(chatScreen.k2().G1, sol.b(chatScreen.d), hVar.getAccessor().d(136), hVar.getAccessor().d(783), hVar.getAccessor().d(1062), hVar.b(), hVar.getAccessor().d(97), hVar.getAccessor().d(18), hVar.getAccessor().d(54), hVar.getAccessor().d(26), new pa3(chatScreen, 14), new pa3(chatScreen, 15));
            case 2:
                ou7 ou7Var2 = ChatScreen.L1;
                return a8gVar.e(chatScreen.getContext()).m();
            case 3:
                ou7 ou7Var3 = ChatScreen.L1;
                r8e r8eVar = chatScreen.k2().G1;
                t73 t73VarB = sol.b(chatScreen.d);
                h hVar2 = chatScreen.f;
                ifh ifhVarD = hVar2.getAccessor().d(146);
                ifh ifhVarD2 = hVar2.getAccessor().d(144);
                ifh ifhVarD3 = hVar2.getAccessor().d(219);
                ifh ifhVarD4 = hVar2.getAccessor().d(561);
                ifh ifhVarD5 = hVar2.getAccessor().d(134);
                ifh ifhVarD6 = hVar2.getAccessor().d(23);
                ifh ifhVarD7 = hVar2.getAccessor().d(101);
                ifh ifhVarD8 = hVar2.getAccessor().d(325);
                ifh ifhVarD9 = hVar2.getAccessor().d(353);
                ifh ifhVarD10 = hVar2.getAccessor().d(133);
                pa3 pa3Var = chatScreen.D;
                return new x9h(r8eVar, t73VarB, ifhVarD5, pa3Var, new fik(pa3Var), ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD6, ifhVarD7, ifhVarD8, ifhVarD9, ifhVarD10, (t51) hVar2.getAccessor().d(116).getValue());
            case 4:
                h hVar3 = chatScreen.f;
                return ((fz9) hVar3.getAccessor().c(354)).a((vw8) hVar3.getAccessor().c(361));
            case 5:
                ou7 ou7Var4 = ChatScreen.L1;
                return chatScreen.O1();
            case 6:
                ou7 ou7Var5 = ChatScreen.L1;
                rt2 rt2Var3 = (rt2) chatScreen.k2().G1.a.getValue();
                if (rt2Var3 != null) {
                    return yql.a(rt2Var3);
                }
                return null;
            case 7:
                ou7 ou7Var6 = ChatScreen.L1;
                MessageWriteWidget messageWriteWidgetV1 = chatScreen.V1();
                if (messageWriteWidgetV1 == null || messageWriteWidgetV1.getViewLifecycleOwner().f().d.compareTo(n09.d) < 0) {
                    return null;
                }
                return messageWriteWidgetV1;
            case 8:
                ou7 ou7Var7 = ChatScreen.L1;
                nma.L(chatScreen.U1(), false, 1);
                chatScreen.F1();
                return sbiVar;
            case 9:
                ou7 ou7Var8 = ChatScreen.L1;
                return chatScreen.getRouter();
            case 10:
                return (iva) chatScreen.f.getAccessor().c(UploadConfig.DEFAULT_MAX_EVENT_COUNT);
            case 11:
                return (n34) chatScreen.f.getAccessor().c(801);
            case 12:
                return (t40) chatScreen.f.getAccessor().c(805);
            case 13:
                ou7 ou7Var9 = ChatScreen.L1;
                qx2 qx2VarI2 = chatScreen.i2();
                vv vvVar = chatScreen.q;
                zv8 zv8Var = ChatScreen.M1[0];
                long jLongValue = ((Number) vvVar.a(chatScreen)).longValue();
                h hVar4 = chatScreen.f;
                r8f r8fVar = new r8f(hVar4.getAccessor().d(116), hVar4.getAccessor().d(23));
                q73 q73Var = new q73(new jz(chatScreen.k2().G1, 13), (pvb) hVar4.getAccessor().d(146).getValue(), ((n0c) ((xhh) hVar4.getAccessor().d(23).getValue())).c());
                ifh ifhVarD11 = hVar4.getAccessor().d(221);
                ifh ifhVarD12 = hVar4.getAccessor().d(85);
                xhh xhhVar = (xhh) ((ifh) hVar4.b()).getValue();
                yt4 yt4Var = (yt4) hVar4.getAccessor().c(48);
                ifh ifhVarD13 = hVar4.getAccessor().d(639);
                ifh ifhVarD14 = hVar4.getAccessor().d(1058);
                o73 o73Var = new o73();
                o73Var.a = q73Var;
                o73Var.b = xhhVar;
                lk9 lk9VarS0 = ((n0c) xhhVar).c().S0();
                lk9VarS0.getClass();
                o73Var.c = cqk.a(lvb.x0(lk9VarS0, yt4Var));
                o73Var.d = ifhVarD11;
                o73Var.e = ifhVarD12;
                o73Var.f = ifhVarD13;
                o73Var.g = ifhVarD14;
                mjg mjgVarA = p90.a(n9f.a);
                o73Var.h = mjgVarA;
                o73Var.j = new r8e(mjgVarA);
                mjg mjgVarA2 = p90.a(null);
                o73Var.i = mjgVarA2;
                o73Var.k = new r8e(mjgVarA2);
                return new u8f(r8fVar, jLongValue, qx2VarI2, o73Var);
            case 14:
                ou7 ou7Var10 = ChatScreen.L1;
                return chatScreen.U1().F();
            case 15:
                ou7 ou7Var11 = ChatScreen.L1;
                return chatScreen.U1().J();
            case 16:
                ou7 ou7Var12 = ChatScreen.L1;
                return a8gVar.k(chatScreen.getContext()).b;
            case 17:
                ou7 ou7Var13 = ChatScreen.L1;
                int iOrdinal = chatScreen.i2().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    i2 = 2;
                }
                r8e r8eVar2 = chatScreen.k2().G1;
                vv vvVar2 = chatScreen.q;
                zv8 zv8Var2 = ChatScreen.M1[0];
                return new kzc(r8eVar2, Long.valueOf(((Number) vvVar2.a(chatScreen)).longValue()), i2, sol.d(chatScreen.d));
            case 18:
                ou7 ou7Var14 = ChatScreen.L1;
                if (chatScreen.getView() != null && !chatScreen.g2().b()) {
                    xd3 xd3VarK2 = chatScreen.k2();
                    if (!xd3VarK2.c.i() && (rt2Var = (rt2) xd3VarK2.G1.a.getValue()) != null) {
                        a8j.t(xd3VarK2, ((n0c) xd3VarK2.H()).c().S0(), new k23(rt2Var, xd3VarK2, null, 12), 2);
                    }
                }
                return sbiVar;
            case 19:
                ou7 ou7Var15 = ChatScreen.L1;
                return new qbe(new pa3(chatScreen, 6), chatScreen.k2().G1);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return vd7.o(chatScreen.g, new ifh(new pa3(chatScreen, 9)), chatScreen);
            case 21:
                return (ia8) chatScreen.f.getAccessor().f();
            default:
                if (((Boolean) ((e5d) chatScreen.m.getValue()).Q6.a(e5d.S6[412]).i()).booleanValue()) {
                    return new tgd();
                }
                return null;
        }
    }
}
