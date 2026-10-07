package defpackage;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.pinnedmessage.b;
import one.me.profile.ProfileScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rea extends fg7 implements qf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rea(rre rreVar) {
        super(2, 1, tre.class, rreVar, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.a = 15;
    }

    /* JADX WARN: Code duplicated, block: B:381:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Object objU;
        Object obj3;
        ksj ksjVar;
        Object value;
        Boolean bool;
        Object value2;
        Boolean bool2;
        int iJ = 0;
        switch (this.a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                MessagesListWidget messagesListWidget = ((ata) this.receiver).a;
                zv8[] zv8VarArr = MessagesListWidget.T1;
                jsa jsaVarF1 = messagesListWidget.F1();
                MessageModel messageModelH = ((opa) jsaVarF1.z2.a.getValue()).h(jLongValue);
                u40 u40Var = messageModelH != null ? messageModelH.j : null;
                if (u40Var != null && (u40Var.b instanceof n1h)) {
                    jsaVarF1.p2.B(jsaVarF1, jsa.Z2[6], a8j.t(jsaVarF1, ((n0c) jsaVarF1.j).b(), new h01(jsaVarF1, jLongValue, (lq4) null, 5), 2));
                } else if (jsaVarF1.c0().h()) {
                    jsaVarF1.c0().i(jLongValue);
                } else {
                    if (jsaVarF1.d.i()) {
                        ic6 ic6Var = jsaVarF1.G2;
                        wpa wpaVar = wpa.b;
                        long j = jsaVarF1.c.a;
                        wpaVar.getClass();
                        bc1.q(":chats?id=" + j + "&type=local&message_id=" + jLongValue2, ic6Var);
                    } else {
                        fva fvaVarG0 = jsaVarF1.g0();
                        fvaVarG0.g(yab.h0(fvaVarG0.c, fvaVarG0.b, 2, new c03(fvaVarG0, jLongValue2, false, null, 8)));
                    }
                    messagesListWidget.D.a(jLongValue2);
                }
                return sbi.a;
            case 1:
                wha whaVar = (wha) obj;
                long jLongValue3 = ((Number) obj2).longValue();
                MessagesListWidget messagesListWidget2 = ((ata) this.receiver).a;
                if (whaVar instanceof uha) {
                    zv8[] zv8VarArr2 = MessagesListWidget.T1;
                    jsa jsaVarF2 = messagesListWidget2.F1();
                    uha uhaVar = (uha) whaVar;
                    yab.i0(jsaVarF2.b, ((n0c) jsaVarF2.j).b(), 0, new mra(jsaVarF2, uhaVar.a, uhaVar.b, uhaVar.c, (lq4) null), 2);
                } else {
                    if (!(whaVar instanceof vha)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr3 = MessagesListWidget.T1;
                    jsa jsaVarF3 = messagesListWidget2.F1();
                    long j2 = ((vha) whaVar).a;
                    if (jsaVarF3.c0().h()) {
                        jsaVarF3.c0().i(jLongValue3);
                    } else {
                        jsaVarF3.m0(j2);
                    }
                }
                return sbi.a;
            case 2:
                return ((daf) ((bw7) ((aw7) this.receiver)).a.getValue()).c((String) obj, (List) obj2);
            case 3:
                ((jsa) this.receiver).v0(((Number) obj2).intValue(), (List) obj);
                return sbi.a;
            case 4:
                Set set = (Set) obj;
                long jLongValue4 = ((Number) obj2).longValue();
                jsa jsaVar = (jsa) this.receiver;
                jsaVar.getClass();
                if (!set.isEmpty() && !((Boolean) jsaVar.I2.getValue()).booleanValue()) {
                    s5e s5eVar = (s5e) ww3.q1(set);
                    String strI = ((xm) jsaVar.t1.getValue()).i(s5eVar.a.toString());
                    if (strI != null) {
                        a8j.x(jsaVar.E2, new ob(jLongValue4, s5eVar, strI));
                    }
                }
                return sbi.a;
            case 5:
                ((nxc) this.receiver).T0((xyc) obj, ((Boolean) obj2).booleanValue());
                return sbi.a;
            case 6:
                return Boolean.valueOf(((nxc) this.receiver).S((xyc) obj, ((Boolean) obj2).booleanValue()));
            case 7:
                return ((f9b) this.receiver).emit((Map) obj, (lq4) obj2);
            case 8:
                return ((f9b) this.receiver).emit((List) obj, (lq4) obj2);
            case 9:
                return ((f9b) this.receiver).emit((List) obj, (lq4) obj2);
            case 10:
                return ((f9b) this.receiver).emit((List) obj, (lq4) obj2);
            case 11:
                return b.b((b) this.receiver, (rt2) obj, (lq4) obj2);
            case 12:
                ((q7d) this.receiver).b(((Number) obj).longValue(), (String) obj2);
                return sbi.a;
            case 13:
                ProfileScreen profileScreen = (ProfileScreen) this.receiver;
                ku8 ku8Var = ProfileScreen.B;
                profileScreen.q1((String) obj, (t59) obj2);
                return sbi.a;
            case 14:
                return x6e.a((x6e) this.receiver, (r5b) obj, (lq4) obj2);
            case 15:
                return vd7.i((lq4) obj2, (cf7) obj, (rre) this.receiver);
            case 16:
                rt2 rt2Var = ((f9f) obj2).d;
                ((l8f) this.receiver).getClass();
                rt2 rt2Var2 = ((f9f) obj).d;
                if (rt2Var2 != null && rt2Var != null) {
                    long jX = rt2Var.x();
                    long jX2 = rt2Var2.x();
                    if (rt2Var.y0()) {
                        jX = Long.MAX_VALUE;
                    }
                    if (rt2Var2.y0()) {
                        jX2 = Long.MAX_VALUE;
                    }
                    iJ = cqk.j(jX, jX2);
                } else if (rt2Var2 != null && rt2Var == null) {
                    iJ = -1;
                }
                return Integer.valueOf(iJ);
            case 17:
                return ((f9b) this.receiver).emit((List) obj, (lq4) obj2);
            case 18:
                x6h x6hVar = (x6h) obj;
                int iIntValue = ((Number) obj2).intValue();
                c7h c7hVar = (c7h) this.receiver;
                c7hVar.getClass();
                long j3 = x6hVar.a;
                Long l = c7hVar.l2;
                if (l == null || j3 != l.longValue()) {
                    c7hVar.l2 = Long.valueOf(j3);
                    c7hVar.n2.F(Long.valueOf(j3), true);
                }
                c7hVar.F0(iIntValue);
                p0m.a(c7hVar, kt7.CLOCK_TICK);
                w6h w6hVar = c7hVar.o2;
                if (w6hVar != null) {
                    PhotoEditScreen photoEditScreen = (PhotoEditScreen) ((qyb) w6hVar).b;
                    zv8[] zv8VarArr4 = PhotoEditScreen.s1;
                    photoEditScreen.o1(x6hVar.b[0]);
                    photoEditScreen.y1().B(k11.a);
                }
                return sbi.a;
            case 19:
                return jah.a((jah) this.receiver, (rt2) obj, (lq4) obj2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((zgi) this.receiver).j((vfi) obj, (lq4) obj2);
            case 21:
                return ((zgi) this.receiver).j((vfi) obj, (lq4) obj2);
            case 22:
                kka kkaVar = (kka) obj;
                lq4 lq4Var = (lq4) obj2;
                UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) this.receiver;
                uploadFileAttachWorker.getClass();
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                gm0.m("UploadFileAttachWorker", "onUploadUpdate %s", kkaVar);
                vfi vfiVar = kkaVar.a;
                jji jjiVar = vfiVar.g;
                if (vfiVar.a()) {
                    objU = uploadFileAttachWorker.w(kkaVar, lq4Var);
                    if (objU != hu4Var) {
                        return sbiVar;
                    }
                } else if (jjiVar == jji.UPLOADING) {
                    objU = uploadFileAttachWorker.v(kkaVar, lq4Var);
                    if (objU != hu4Var) {
                        return sbiVar;
                    }
                } else {
                    Throwable th = new Throwable("Internal error. Unknown upload state");
                    gm0.X("UploadFileAttachWorker", th, "onUploadUpdate: failed. Unknown upload state. key=%s, state=%s", uploadFileAttachWorker.p().a, kkaVar);
                    objU = uploadFileAttachWorker.u(th, lq4Var);
                    if (objU != hu4Var) {
                        return sbiVar;
                    }
                }
                return objU;
            case 23:
                View view = (View) obj;
                UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.receiver;
                userStoriesScreen.t1 = (ryg) obj2;
                userStoriesScreen.r1 = view;
                userStoriesScreen.H1().K(5);
                if (userStoriesScreen.getView() != null) {
                    qp4 qp4VarBuild = opl.b(userStoriesScreen, 1).l(xw3.P0(new rp4(R.id.link_context_menu_action_open_link, new tnh(R.string.link_context_menu_action_open_link), Integer.valueOf(R.drawable.icon_external_link), (Integer) null, 20), new rp4(R.id.link_context_menu_action_copy_link, new tnh(R.string.link_context_menu_action_copy_link), Integer.valueOf(R.drawable.icon_copy), (Integer) null, 20))).f(view).b().c().build();
                    qp4VarBuild.u(userStoriesScreen);
                    userStoriesScreen.s1 = qp4VarBuild;
                    p0m.a(view, mt7.LONG_PRESS);
                }
                return sbi.a;
            case 24:
                Object objI = ((xn3) this.receiver).j().i(Collections.singletonList((st2) obj), (lq4) obj2);
                return objI == hu4.a ? objI : sbi.a;
            case 25:
                Object obj4 = (hs8) obj;
                lq4 lq4Var2 = (lq4) obj2;
                ioj iojVar = (ioj) this.receiver;
                iojVar.getClass();
                hu4 hu4Var2 = hu4.a;
                sbi sbiVar2 = sbi.a;
                if (obj4 instanceof fs8) {
                    fs8 fs8Var = (fs8) obj4;
                    iojVar.G(new mnj(fs8Var.a, fs8Var.b, fs8Var.c));
                } else if (obj4 instanceof gs8) {
                    gs8 gs8Var = (gs8) obj4;
                    kqj kqjVar = gs8Var.a;
                    wpj wpjVar = gs8Var.b;
                    String str = kqjVar.a;
                    String str2 = kqjVar.c;
                    StringBuilder sb = new StringBuilder();
                    String str3 = kqjVar.b;
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    if (str2 != null) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(str2);
                    }
                    if (str != null) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(str);
                    }
                    String string = sb.toString();
                    iojVar.G(new tnj(string.length() != 0 ? string : null, wpjVar));
                } else if (obj4 instanceof srj) {
                    mjg mjgVar = iojVar.I;
                    olc olcVar = olc.a;
                    mjgVar.getClass();
                    mjgVar.j(null, olcVar);
                } else if (obj4 instanceof orj) {
                    if (((f5d) iojVar.m).t() && iojVar.c == ((f5d) iojVar.m).d()) {
                        String str4 = iojVar.C;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str4, ewi.d(iojVar.c, "reload instead of closing for digitalId (id=", "), startParam=", iojVar.f), null);
                            }
                        }
                        ioj.P(iojVar, null, null, 3);
                    } else {
                        iojVar.G(new dnj(true));
                    }
                } else if (obj4 instanceof rrj) {
                    qt4.C(((rrj) obj4).a, iojVar.J, null);
                } else if (obj4 instanceof prj) {
                    qt4.C(((prj) obj4).a, iojVar.K, null);
                } else if (obj4 instanceof qrj) {
                    Object objS = iojVar.S((qrj) obj4, lq4Var2);
                    if (objS == hu4Var2) {
                        return objS;
                    }
                } else if (obj4 instanceof bkj) {
                    iojVar.G(new inj(((bkj) obj4).a));
                } else if (obj4 instanceof akj) {
                    iojVar.F.B(iojVar, ioj.V1[1], yab.h0(iojVar.b, ((n0c) iojVar.D()).b(), 2, new oli(iojVar, ((akj) obj4).a, null, 17)));
                } else if (obj4 instanceof mme) {
                    es8 es8Var = (es8) obj4;
                    es8 es8Var2 = iojVar.J1;
                    if (es8Var2 != null) {
                        es8Var2.b(new za9());
                    }
                    iojVar.J1 = es8Var;
                    iojVar.G(snj.a);
                } else if (obj4 instanceof kqg) {
                    Object objO = iojVar.O((kqg) obj4, lq4Var2);
                    if (objO == hu4Var2) {
                        return objO;
                    }
                } else if (obj4 instanceof nx0) {
                    Object objI2 = iojVar.C().i((nx0) obj4, iojVar.r1, lq4Var2);
                    if (objI2 == hu4Var2) {
                        return objI2;
                    }
                } else if (obj4 instanceof dhj) {
                    dhj dhjVar = (dhj) obj4;
                    dq4 dq4Var = iojVar.b;
                    long jHashCode = dhjVar.c.hashCode();
                    if (iojVar.P1.contains(Long.valueOf(jHashCode))) {
                        dhjVar.b(new ghj());
                    } else {
                        if (iojVar.Q1 == null) {
                            iojVar.Q1 = e9i.j0(e9i.T(new fz6(new q8e(((bij) iojVar.y.getValue()).b), new foj(iojVar, null, 1), 3), ((n0c) iojVar.D()).a()), dq4Var);
                        }
                        if (dhjVar.d.length() != 0 && dhjVar.c.length() != 0) {
                            yab.i0(dq4Var, ((n0c) iojVar.D()).b(), 0, new zw9(dhjVar, iojVar, jHashCode, (lq4) null, 13), 2);
                            return sbiVar2;
                        }
                        dhjVar.b(new hhj());
                    }
                } else if (obj4 instanceof ehj) {
                    ehj ehjVar = (ehj) obj4;
                    iojVar.K1 = ehjVar;
                    iojVar.G(new pnj(ehjVar.c, ehjVar.d));
                } else if (obj4 instanceof ggj) {
                    ggj ggjVar = (ggj) obj4;
                    mjg mjgVar2 = iojVar.X;
                    do {
                        value2 = mjgVar2.getValue();
                        ((Boolean) value2).getClass();
                        bool2 = Boolean.TRUE;
                    } while (!mjgVar2.h(value2, bool2));
                    ggjVar.a(bool2);
                } else if (obj4 instanceof hgj) {
                    hgj hgjVar = (hgj) obj4;
                    mjg mjgVar3 = iojVar.X;
                    do {
                        value = mjgVar3.getValue();
                        ((Boolean) value).getClass();
                        bool = Boolean.FALSE;
                    } while (!mjgVar3.h(value, bool));
                    hgjVar.a(bool);
                } else if (obj4 instanceof rpj) {
                    rpj rpjVar = (rpj) obj4;
                    rpj rpjVar2 = iojVar.L1;
                    if (rpjVar2 != null) {
                        rpjVar2.b(new za9());
                    }
                    iojVar.L1 = rpjVar;
                    iojVar.G(new rnj(ioj.B(rpjVar.c, rpjVar.d)));
                } else if (obj4 instanceof qpj) {
                    qpj qpjVar = (qpj) obj4;
                    sgg sggVarI0 = yab.i0(iojVar.b, null, 2, new oli(iojVar, qpjVar, null, 18), 1);
                    p3c p3cVar = iojVar.t1;
                    zv8[] zv8VarArr5 = ioj.V1;
                    p3cVar.B(iojVar, zv8VarArr5[2], sggVarI0);
                    iojVar.M1 = qpjVar;
                    vo8 vo8Var = (vo8) p3cVar.m(iojVar, zv8VarArr5[2]);
                    if (vo8Var != null) {
                        vo8Var.Y(new pni(5, iojVar));
                    }
                } else if (obj4 instanceof wij) {
                    wij wijVar = (wij) obj4;
                    if (!((Vibrator) iojVar.w.getValue()).hasVibrator() || (!((Vibrator) iojVar.w.getValue()).hasAmplitudeControl() && wijVar.f())) {
                        wijVar.b(zij.c);
                    } else {
                        if (wijVar instanceof tij) {
                            int i = lsj.$EnumSwitchMapping$0[((tij) wijVar).d.ordinal()];
                            if (i == 1) {
                                ksjVar = ksj.IMPACT_LIGHT;
                            } else if (i == 2) {
                                ksjVar = ksj.IMPACT_MEDIUM;
                            } else if (i == 3) {
                                ksjVar = ksj.IMPACT_HEAVY;
                            } else if (i == 4) {
                                ksjVar = ksj.IMPACT_RIGID;
                            } else {
                                if (i != 5) {
                                    ore.o();
                                    return null;
                                }
                                ksjVar = ksj.IMPACT_SOFT;
                            }
                        } else if (wijVar instanceof uij) {
                            int i2 = lsj.$EnumSwitchMapping$1[((uij) wijVar).d.ordinal()];
                            if (i2 == 1) {
                                ksjVar = ksj.NOTIFICATION_ERROR;
                            } else if (i2 == 2) {
                                ksjVar = ksj.NOTIFICATION_SUCCESS;
                            } else {
                                if (i2 != 3) {
                                    ore.o();
                                    return null;
                                }
                                ksjVar = ksj.NOTIFICATION_WARNING;
                            }
                        } else {
                            if (!(wijVar instanceof vij)) {
                                ore.o();
                                return null;
                            }
                            ksjVar = ksj.SELECTION_CHANGE;
                        }
                        ((Vibrator) iojVar.w.getValue()).vibrate((VibrationEffect) iojVar.R1.computeIfAbsent(ksjVar, new am(25, new aoj(iojVar, 0, ksjVar))));
                        wijVar.a(sbiVar2);
                    }
                } else if (obj4 instanceof pgj) {
                    pgj pgjVar = (pgj) obj4;
                    iojVar.N1 = pgjVar;
                    iojVar.G(new jnj(pgjVar.c));
                } else if (obj4 instanceof bsj) {
                    iojVar.u1.B(iojVar, ioj.V1[3], yab.h0(iojVar.b, ((n0c) iojVar.D()).a(), 2, new rjj(iojVar, (bsj) obj4, null, 5)));
                } else if (obj4 instanceof qgb) {
                    skj skjVar = (skj) iojVar.F1.getValue();
                    Object obj5 = (qgb) obj4;
                    String str5 = iojVar.r1;
                    klj kljVar = klj.OPEN_SYSTEM_SETTINGS;
                    klj kljVar2 = klj.EMULATE_NFC_TAG;
                    if (obj5 instanceof ngb) {
                        ngb ngbVar = (ngb) obj5;
                        if (!skjVar.b(ngbVar.c, str5)) {
                            ngbVar.b(new blj(kljVar2));
                        }
                        if (((NfcAdapter) skjVar.a.a.getValue()) != null) {
                            NfcAdapter nfcAdapter = (NfcAdapter) skjVar.a.a.getValue();
                            if (nfcAdapter == null || !nfcAdapter.isEnabled()) {
                                ngbVar.b(new alj());
                            } else {
                                skjVar.f = (es8) obj5;
                                mjg mjgVar4 = skjVar.a.b;
                                Boolean bool3 = Boolean.TRUE;
                                mjgVar4.getClass();
                                mjgVar4.j(null, bool3);
                                skjVar.a.d.set(ngbVar.d.getBytes(pt2.a));
                            }
                        } else {
                            ngbVar.b(new clj(kljVar2));
                        }
                    } else if (obj5 instanceof ogb) {
                        ogb ogbVar = (ogb) obj5;
                        if (skjVar.b(ogbVar.c, str5)) {
                            skjVar.a();
                        } else {
                            ogbVar.b(new blj(kljVar2));
                        }
                    } else if (obj5 instanceof pgb) {
                        pgb pgbVar = (pgb) obj5;
                        if (!skjVar.b(pgbVar.c, str5)) {
                            pgbVar.b(new blj(kljVar));
                        } else if (((NfcAdapter) skjVar.a.a.getValue()) != null) {
                            NfcAdapter nfcAdapter2 = (NfcAdapter) skjVar.a.a.getValue();
                            if (nfcAdapter2 == null || !nfcAdapter2.isEnabled()) {
                                pgbVar.a(sbiVar2);
                                Object objEmit = skjVar.d.emit(rkj.a, lq4Var2);
                                if (objEmit == hu4Var2) {
                                    obj3 = objEmit;
                                }
                                if (obj3 == hu4Var2) {
                                    return obj3;
                                }
                            } else {
                                pgbVar.b(new zkj());
                            }
                        } else {
                            pgbVar.b(new clj(kljVar));
                        }
                    } else {
                        if (!(obj5 instanceof mgb)) {
                            skjVar.getClass();
                            ore.o();
                            return null;
                        }
                        mgb mgbVar = (mgb) obj5;
                        if (skjVar.b(mgbVar.c, str5)) {
                            boolean z = ((NfcAdapter) skjVar.a.a.getValue()) != null;
                            NfcAdapter nfcAdapter3 = (NfcAdapter) skjVar.a.a.getValue();
                            mgbVar.a(new ugb(z, nfcAdapter3 != null && nfcAdapter3.isEnabled()));
                        } else {
                            mgbVar.b(new blj(klj.GET_INFO));
                        }
                    }
                    obj3 = sbiVar2;
                    if (obj3 == hu4Var2) {
                        return obj3;
                    }
                } else if (obj4 instanceof lm7) {
                    es8 es8Var3 = (es8) obj4;
                    es8 es8Var4 = iojVar.O1;
                    if (es8Var4 != null) {
                        es8Var4.b(new za9());
                    }
                    iojVar.O1 = es8Var3;
                    iojVar.G(enj.a);
                } else if (obj4 instanceof jl7) {
                    ((es8) obj4).a(new by8(coj.$EnumSwitchMapping$0[iojVar.d.ordinal()] == 10 ? 1 : 2));
                } else if (obj4 instanceof es8) {
                    ((es8) obj4).b(new za9());
                }
                return sbiVar2;
            case 26:
                g9 g9Var = (g9) obj;
                long jLongValue5 = ((Number) obj2).longValue();
                g9Var.getClass();
                h9 h9Var = (h9) this.receiver;
                h9Var.getClass();
                h9Var.a.d("codec_usage", EventItemValueKt.toEventItemValue(jLongValue5), new EventItemsMap((Map<String, ? extends EventItemValue>) Collections.singletonMap("codec_implementation", EventItemValueKt.toEventItemValue(g9Var.b))));
                return sbi.a;
            default:
                qhk qhkVar = (qhk) this.receiver;
                yab.i0(qhkVar.d, null, 0, new b2f((Activity) obj, qhkVar, (lq4) null, 12), 3);
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rea(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rea(UploadFileAttachWorker uploadFileAttachWorker) {
        super(2, 0, UploadFileAttachWorker.class, uploadFileAttachWorker, "onUploadUpdate", "onUploadUpdate(Lru/ok/tamtam/upload/messages/MessageUploadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.a = 22;
    }
}
