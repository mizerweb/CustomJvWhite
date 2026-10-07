package ru.ok.tamtam.android.services;

import android.app.RemoteInput;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import defpackage.a4c;
import defpackage.ae9;
import defpackage.aob;
import defpackage.enb;
import defpackage.ewi;
import defpackage.fnb;
import defpackage.gm0;
import defpackage.gnb;
import defpackage.h5c;
import defpackage.h99;
import defpackage.ha9;
import defpackage.je9;
import defpackage.ouk;
import defpackage.qv1;
import defpackage.qw2;
import defpackage.r3f;
import defpackage.r5h;
import defpackage.r7;
import defpackage.rt2;
import defpackage.s7f;
import defpackage.wmi;
import defpackage.wtc;
import defpackage.xb9;
import defpackage.yab;
import defpackage.ylc;
import defpackage.yob;
import defpackage.zed;
import defpackage.zob;

/* JADX INFO: loaded from: classes3.dex */
public final class RootNotificationService extends Service {
    public static final /* synthetic */ int b = 0;
    public final String a = RootNotificationService.class.getName();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ha9 ha9Var;
        Throwable th;
        String str;
        long j;
        long j2;
        Object obj;
        gnb gnbVar;
        long j3;
        if (intent == null) {
            return 2;
        }
        ha9 ha9Var2 = ha9.b;
        int i3 = 0;
        if (intent.hasExtra("ru.ok.tamtam.extra.LOCAL_ACCOUNT_ID")) {
            ha9Var = new ha9(intent.getIntExtra("ru.ok.tamtam.extra.LOCAL_ACCOUNT_ID", 0));
            String str2 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.c;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.i("handleIntent() localAccountId = ", ha9Var), null);
                }
            }
        } else {
            gm0.V(this.a, "Notification doesn't contains localAccountId", new b());
            ha9Var = ha9Var2;
        }
        r7 r7Var = r7.a;
        r3f r3fVarB = r7.b(ha9Var);
        if (r3fVarB == null) {
            String str3 = this.a;
            a aVar = new a();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str3, "LocalAccountId=" + ha9Var + " not found in scopes", aVar);
                }
            }
            r3fVarB = r7.d(ha9Var2);
        }
        gnb gnbVar2 = (gnb) new wtc(i3, r3fVarB).getAccessor().c(99);
        gnbVar2.getClass();
        je9 je9Var3 = je9.d;
        long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", -1L);
        String action = intent.getAction();
        if (action == null) {
            return 2;
        }
        switch (action.hashCode()) {
            case -929068635:
                Object obj2 = "trid";
                if (action.equals("ru.ok.tamtam.action.DIRECT_REPLY") && longExtra != -1) {
                    long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.PUSH_ID", 0L);
                    String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.EVENT_KEY");
                    intent.getLongExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", -1L);
                    Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                    CharSequence charSequence = resultsFromIntent == null ? null : resultsFromIntent.getCharSequence("ru.ok.tamtam.extra.TEXT_REPLY");
                    CharSequence charSequenceY1 = charSequence != null ? r5h.y1(charSequence) : null;
                    if (charSequenceY1 == null || charSequenceY1.length() == 0) {
                        ((h5c) gnbVar2.b.getValue()).g(longExtra, null);
                        zob zobVarF = ((yob) gnbVar2.g.getValue()).f();
                        String str4 = zobVarF.a;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, str4, ewi.d(longExtra2, "onNotificationQuickRepliedWithEmptyText: pushId=", ", eventKey=", stringExtra), null);
                        }
                        if (stringExtra != null) {
                            ae9.k(zobVarF.b(), "PUSH", "Action", ouk.a(new ylc(obj2, Long.valueOf(longExtra2)), new ylc("eKey", stringExtra), new ylc("p_op", "n_q_rep_empty")), 8);
                        }
                        gm0.Y("gnb", "Early return in directReply cuz of text?.trim().isNullOrEmpty()");
                        break;
                    } else {
                        if (((qw2) gnbVar2.c.getValue()).l) {
                            th = null;
                            CharSequence charSequence2 = charSequence;
                            str = "Action";
                            rt2 rt2VarK = ((qw2) gnbVar2.c.getValue()).K(longExtra);
                            if (rt2VarK != null) {
                                j = longExtra;
                                j2 = rt2VarK.a;
                            } else {
                                j = longExtra;
                                j2 = 0;
                            }
                            obj = "p_op";
                            gnbVar = gnbVar2;
                            j3 = longExtra2;
                            gnb.a(gnbVar, j, charSequence2, j2);
                        } else {
                            yab.i0((wmi) gnbVar2.e.getValue(), null, 0, new h99(gnbVar2, longExtra, charSequence, null, 3), 3);
                            obj = "p_op";
                            stringExtra = stringExtra;
                            str = "Action";
                            obj2 = obj2;
                            th = null;
                            gnbVar = gnbVar2;
                            j3 = longExtra2;
                        }
                        zob zobVarF2 = ((yob) gnbVar.g.getValue()).f();
                        String str5 = zobVarF2.a;
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str5, ewi.d(j3, "onNotificationQuickReplied: chatServerId=", ", lastMessage=", stringExtra), th);
                        }
                        if (stringExtra != null) {
                            ae9.k(zobVarF2.b(), "PUSH", str, ouk.a(new ylc(obj2, Long.valueOf(j3)), new ylc("eKey", stringExtra), new ylc(obj, "n_q_rep")), 8);
                            break;
                        }
                    }
                }
                break;
            case -822886915:
                if (action.equals("ru.ok.tamtam.action.NOTIF_CANCEL_BUNDLED") && longExtra != -1) {
                    long longExtra3 = intent.getLongExtra("ru.ok.tamtam.extra.MARK", -1L);
                    long longExtra4 = intent.getLongExtra("ru.ok.tamtam.extra.PUSH_ID", 0L);
                    String stringExtra2 = intent.getStringExtra("ru.ok.tamtam.extra.EVENT_KEY");
                    ((aob) gnbVar2.i.getValue()).d(longExtra, longExtra3);
                    zob zobVarF3 = ((yob) gnbVar2.g.getValue()).f();
                    String str6 = zobVarF3.a;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var3)) {
                        a4cVar5.c(je9Var3, str6, ewi.d(longExtra4, "onNotificationCancelledBundledChat: pushId=", ", eventKey=", stringExtra2), null);
                    }
                    if (stringExtra2 != null) {
                        ae9.k(zobVarF3.b(), "PUSH", "Action", ouk.a(new ylc("trid", Long.valueOf(longExtra4)), new ylc("eKey", stringExtra2), new ylc("p_op", "n_canceled_ch")), 8);
                    }
                    yab.i0((wmi) gnbVar2.e.getValue(), null, 0, new h99(gnbVar2, longExtra, intent, null, 4), 3);
                }
                break;
            case 426083642:
                if (action.equals("ru.ok.tamtam.action.NOTIF_CANCEL")) {
                    xb9 xb9Var = ((zed) gnbVar2.a.getValue()).a;
                    xb9Var.w.B(xb9Var, s7f.j0[19], Boolean.FALSE);
                    zob zobVarF4 = ((yob) gnbVar2.g.getValue()).f();
                    gm0.n(zobVarF4.a, "onNotificationCancelled");
                    ae9.k(zobVarF4.b(), "PUSH", "Action", ouk.a(new ylc("p_op", "n_canceled")), 8);
                    yab.i0((wmi) gnbVar2.e.getValue(), null, 0, new enb(gnbVar2, longExtra, null, 0), 3);
                }
                break;
            case 1008773314:
                if (action.equals("ru.ok.tamtam.action.MARK_AS_READ") && longExtra != -1) {
                    yab.i0((wmi) gnbVar2.e.getValue(), null, 0, new fnb(gnbVar2, longExtra, intent.getLongExtra("ru.ok.tamtam.extra.MARK", -1L), intent.getLongExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", -1L), ((qw2) gnbVar2.c.getValue()).K(longExtra) == null, intent.getLongExtra("ru.ok.tamtam.extra.PUSH_ID", 0L), intent.getStringExtra("ru.ok.tamtam.extra.EVENT_KEY"), null), 3);
                    yab.i0((wmi) gnbVar2.e.getValue(), null, 0, new enb(gnbVar2, longExtra, null, 1), 3);
                }
                break;
        }
        return 2;
    }
}
