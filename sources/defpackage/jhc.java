package defpackage;

import android.app.AlarmManager;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import one.me.messages.list.loader.MessageModel;
import one.me.webview.FaqWebViewWidget;
import one.video.calls.audio.opus.FileWriter;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;
import ru.ok.tamtam.upload.workers.DownloadFileWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class jhc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhc(yk4 yk4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 21;
        int i = i7c.b;
        this.f = yk4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new jhc((khc) obj2, lq4Var, 0);
            case 1:
                return new jhc((y) obj2, lq4Var, 1);
            case 2:
                return new jhc((zk7) obj2, lq4Var, 2);
            case 3:
                return new jhc((j9) obj2, lq4Var, 3);
            case 4:
                return new jhc((lv) obj2, lq4Var, 4);
            case 5:
                return new jhc((AtomicInteger) obj2, lq4Var, 5);
            case 6:
                return new jhc((g90) obj2, lq4Var, 6);
            case 7:
                return new jhc((t90) obj2, lq4Var, 7);
            case 8:
                return new jhc((AlarmManager) obj2, lq4Var, 8);
            case 9:
                return new jhc((uo0) obj2, lq4Var, 9);
            case 10:
                return new jhc((jp0) obj2, lq4Var, 10);
            case 11:
                return new jhc((ym4) obj2, lq4Var, 11);
            case 12:
                return new jhc((ya1) obj2, lq4Var, 12);
            case 13:
                return new jhc((as1) obj2, lq4Var, 13);
            case 14:
                return new jhc((kt1) obj2, lq4Var, 14);
            case 15:
                return new jhc((zm2) obj2, lq4Var, 15);
            case 16:
                return new jhc((wq2) obj2, lq4Var, 16);
            case 17:
                return new jhc((ns2) obj2, lq4Var, 17);
            case 18:
                return new jhc((wf3) obj2, lq4Var, 18);
            case 19:
                return new jhc((xn3) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new jhc((y34) obj2, lq4Var, 20);
            case 21:
                int i2 = i7c.b;
                return new jhc((yk4) obj2, lq4Var);
            case 22:
                return new jhc((rc5) obj2, lq4Var, 22);
            case 23:
                return new jhc(lq4Var, (fg5) obj2);
            case 24:
                return new jhc((fl5) obj2, lq4Var, 24);
            case 25:
                return new jhc((er5) obj2, lq4Var, 25);
            case 26:
                return new jhc((DownloadFileFromWebAppWorker) obj2, lq4Var, 26);
            case 27:
                return new jhc((DownloadFileWorker) obj2, lq4Var, 27);
            case 28:
                return new jhc((FaqWebViewWidget) obj2, lq4Var, 28);
            default:
                return new jhc((ix6) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return Boolean.TRUE;
            case 3:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                ((jhc) create((qtc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                ((jhc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                ((jhc) create((dj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((jhc) create((t4f) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((jhc) create((enc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((jhc) create((l8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((jhc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01fb A[LOOP:0: B:55:0x01ba->B:67:0x01fb, LOOP_END] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        boolean z;
        Float f;
        Object value3;
        i94 i94Var;
        int i = 0;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                try {
                    khc khcVar = (khc) this.f;
                    zv8[] zv8VarArr = khc.y;
                    lhc lhcVar = (lhc) khcVar.g.getValue();
                    FileWriter fileWriter = lhcVar.c;
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    lhcVar.c = null;
                    break;
                } catch (Exception e) {
                    ghc ghcVar = new ghc("Couldn't stop native writer", e);
                    gm0.V(((khc) this.f).a, ghcVar.getMessage(), ghcVar);
                }
                return sbi.a;
            case 1:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                y yVar = (y) this.f;
                rt2 rt2VarO = yVar.d.o(((Number) yVar.c.l.a(e5d.S6[3]).i()).longValue());
                if (rt2VarO == null || !rt2VarO.W()) {
                    yVar.C();
                } else {
                    a8j.x(yVar.g, new v(sbiVar));
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                gm0.x("ExecutorsState", ww3.z1(((zk7) this.f).a(), null, null, null, new vi2(5), 31), null);
                return Boolean.TRUE;
            case 3:
                ch3.d0(obj);
                List listF = ((g5c) ((j9) this.f).a.getValue()).f(((v4c) ((j9) this.f).b.getValue()).i);
                List listF2 = ((g5c) ((j9) this.f).a.getValue()).f(((v4c) ((j9) this.f).b.getValue()).h);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        int size = listF.size();
                        int size2 = listF2.size();
                        String strZ1 = ww3.z1(listF, null, null, null, i9.b, 31);
                        String strZ2 = ww3.z1(listF2, "\n", null, null, null, 62);
                        StringBuilder sbP = qv1.p("ActiveNotifications group count: ", size, ", \n                        |chats count: ", size2, ",\n                        |groups notifs ids: ");
                        sbP.append(strZ1);
                        sbP.append(",\n                        |chats notifs: ");
                        sbP.append(strZ2);
                        sbP.append(",\n                        |");
                        a4cVar.c(je9Var, "ActiveNotificationsDeveloperTools", s5h.y0(sbP.toString()), null);
                    }
                }
                return sbi.a;
            case 4:
                ch3.d0(obj);
                tw2 tw2Var = new tw2();
                tw2Var.e = Collections.singletonMap(new Long(1L), new Long(1L));
                return ((ny2) ((lv) this.f).g.getValue()).a(0L, 2L, new nx2(tw2Var), null, null, null, null);
            case 5:
                ch3.d0(obj);
                ((AtomicInteger) this.f).incrementAndGet();
                return sbi.a;
            case 6:
                sbi sbiVar2 = sbi.a;
                ch3.d0(obj);
                g90 g90Var = (g90) this.f;
                zv8[] zv8VarArr2 = g90.i;
                long jG = g90Var.g().a.g();
                Long l = ((g90) this.f).f;
                if (l != null && jG == l.longValue()) {
                    boolean zM = ((g90) this.f).g().a.m();
                    g90 g90Var2 = (g90) this.f;
                    mjg mjgVar = g90Var2.g;
                    if (zM) {
                        do {
                            value3 = mjgVar.getValue();
                        } while (!mjgVar.h(value3, new c89(null, false)));
                    } else {
                        do {
                            value2 = mjgVar.getValue();
                            c89 c89Var = (c89) value2;
                            z = g90Var2.g().a.r;
                            f = c89Var.a;
                            c89Var.getClass();
                        } while (!mjgVar.h(value2, new c89(f, z)));
                    }
                } else {
                    mjg mjgVar2 = ((g90) this.f).g;
                    do {
                        value = mjgVar2.getValue();
                        ((c89) value).getClass();
                    } while (!mjgVar2.h(value, new c89(null, false)));
                }
                return sbiVar2;
            case 7:
                ch3.d0(obj);
                t90 t90Var = (t90) this.f;
                String str = t90Var.f;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        ry9 ry9Var = t90Var.g;
                        a4cVar2.c(je9Var2, str, c0a.o("MediaItem(", ry9Var != null ? ry9Var.a : null, "): onFirstBytes"), null);
                    }
                }
                t90 t90Var2 = (t90) this.f;
                if (t90Var2.g == null) {
                    String str2 = t90Var2.f;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar3.b(je9Var3)) {
                            ry9 ry9Var2 = t90Var2.g;
                            a4cVar3.c(je9Var3, str2, c0a.o("MediaItem(", ry9Var2 != null ? ry9Var2.a : null, "): MediaItem is null! Skip handling"), null);
                        }
                    }
                } else {
                    EnumSet enumSet = t90Var2.k;
                    s90 s90Var = s90.a;
                    if (!enumSet.contains(s90Var)) {
                        t90Var2.k.add(s90Var);
                        t90Var2.i = false;
                        String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - t90Var2.j);
                        ul9 ul9Var = new ul9();
                        ul9Var.putAll(t90Var2.h);
                        wd4 wd4Var = (wd4) t90Var2.d.getValue();
                        ul9Var.put("connection_type", new Integer(wd4Var.h() ? wd4Var.a().a : 1));
                        ul9Var.put("param", strValueOf);
                        t90Var2.g("first_bytes", ul9Var.b());
                    }
                }
                return sbi.a;
            case 8:
                ch3.d0(obj);
                return Boolean.valueOf(((AlarmManager) this.f).canScheduleExactAlarms());
            case 9:
                ch3.d0(obj);
                uo0 uo0Var = (uo0) this.f;
                uo0Var.a.registerActivityLifecycleCallbacks(uo0Var.f);
                return sbi.a;
            case 10:
                ch3.d0(obj);
                return Boolean.valueOf(((Number) ch3.G(((sse) ((vc5) ((jp0) this.f).c.getValue()).a.getValue()).b().a, true, false, new pyb(16))).longValue() == 0);
            case 11:
                ch3.d0(obj);
                ym4 ym4Var = (ym4) this.f;
                switch (ym4Var.a) {
                    case 0:
                        i94Var = ym4Var.c;
                        break;
                    case 1:
                        i94Var = ym4Var.c;
                        break;
                    default:
                        i94Var = ym4Var.c;
                        break;
                }
                return Boolean.valueOf(!((Boolean) i94Var.invoke()).booleanValue());
            case 12:
                ch3.d0(obj);
                ya1 ya1Var = (ya1) this.f;
                zv8[] zv8VarArr3 = ya1.w;
                ya1Var.w();
                return sbi.a;
            case 13:
                ch3.d0(obj);
                a8j.x(((as1) this.f).k, wx1.F);
                return sbi.a;
            case 14:
                ch3.d0(obj);
                kt1 kt1Var = (kt1) this.f;
                yab.i0(kt1Var.b, ((n0c) kt1Var.c).f(), 0, new in1(kt1Var, kt1Var.n, null, 2), 2);
                return sbi.a;
            case 15:
                ch3.d0(obj);
                ((zm2) this.f).m(true);
                return sbi.a;
            case 16:
                ch3.d0(obj);
                wq2 wq2Var = (wq2) this.f;
                ((xn3) wq2Var.e.getValue()).u(wq2Var.c);
                return sbi.a;
            case 17:
                ch3.d0(obj);
                ns2 ns2Var = (ns2) this.f;
                m8b m8bVar = ns2Var.e;
                m8bVar.o(ns2Var.d);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ns2 ns2Var2 = (ns2) this.f;
                long[] jArr = m8bVar.b;
                long[] jArr2 = m8bVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr2[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = i; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    MessageModel messageModel = (MessageModel) ns2Var2.f.f(jArr[(i2 << 3) + i4]);
                                    if (messageModel != null) {
                                        linkedHashSet.add(messageModel);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                    i = 0;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                            i = 0;
                        }
                    }
                }
                ((ns2) this.f).f.a();
                String str3 = ((ns2) this.f).g;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar4.b(je9Var4)) {
                        a4cVar4.c(je9Var4, str3, nbh.u("submit ", m8bVar.d, " viewed messages (", linkedHashSet.size(), ")"), null);
                    }
                }
                ((ns2) this.f).c.y0(linkedHashSet);
                ((ns2) this.f).d.b(m8bVar);
                return sbi.a;
            case 18:
                ch3.d0(obj);
                wf3 wf3Var = (wf3) this.f;
                AtomicLong atomicLong = wf3Var.t;
                pvb pvbVar = (pvb) wf3Var.f.getValue();
                atomicLong.set(pvb.s(pvbVar, new jr2(pvbVar.u().a.g(), wf3Var.y, wf3Var.z)));
                return sbi.a;
            case 19:
                ch3.d0(obj);
                return ((xn3) this.f).j().E();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ch3.d0(obj);
                y34 y34Var = (y34) this.f;
                y34Var.l.B(y34Var, y34.m[0], yab.i0(y34Var.k, null, 2, new qy3(y34Var, null, 3), 1));
                return sbi.a;
            case 21:
                yk4 yk4Var = (yk4) this.f;
                ch3.d0(obj);
                long j2 = i7c.a;
                if (j2 == j2) {
                    zu6 zu6Var = (zu6) yk4Var.r.getValue();
                    String str4 = (String) yk4Var.y.h.a.getValue();
                    if (str4 == null) {
                        str4 = "";
                    }
                    ylc ylcVarA = zu6Var.a(str4);
                    if (ylcVarA != null) {
                        a8j.x(yk4Var.B, new f8f((String) ylcVarA.a, (String) ylcVarA.b));
                    }
                }
                return sbi.a;
            case 22:
                ch3.d0(obj);
                ((svb) ((rc5) this.f).i.getValue()).d(true);
                return sbi.a;
            case 23:
                ch3.d0(obj);
                uli uliVar = ((fg5) this.f).c;
                if (uliVar != null) {
                    uliVar.close();
                }
                return sbi.a;
            case 24:
                ch3.d0(obj);
                fl5 fl5Var = (fl5) this.f;
                zv8[] zv8VarArr4 = fl5.i;
                ny8 ny8Var = fl5Var.d;
                i = ((nni) ny8Var.getValue()).i() != 1 ? 1 : 0;
                String str5 = i != 1 ? "ON" : "OFF";
                ((nni) ny8Var.getValue()).p(i);
                pvb pvbVar2 = (pvb) fl5Var.c.getValue();
                ini iniVar = new ini();
                iniVar.c = str5;
                pvbVar2.q(new lni(iniVar));
                fl5Var.f.setValue(fl5Var.B());
                return sbi.a;
            case 25:
                ch3.d0(obj);
                return ((er5) this.f).k();
            case 26:
                ch3.d0(obj);
                DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = (DownloadFileFromWebAppWorker) this.f;
                return ((ju6) ((rs6) downloadFileFromWebAppWorker.r.getValue())).k(downloadFileFromWebAppWorker.o().d);
            case 27:
                ch3.d0(obj);
                DownloadFileWorker downloadFileWorker = (DownloadFileWorker) this.f;
                return ((ju6) ((rs6) downloadFileWorker.q.getValue())).k(downloadFileWorker.o().c);
            case 28:
                ch3.d0(obj);
                return Boolean.valueOf(((svb) ((FaqWebViewWidget) this.f).a.getAccessor().c(100)).b());
            default:
                ch3.d0(obj);
                x58 x58Var = ((ix6) this.f).h;
                if (x58Var != null) {
                    x58Var.clear();
                }
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: ScreenFlash.clear() invoked");
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhc(lq4 lq4Var, fg5 fg5Var) {
        super(2, lq4Var);
        this.e = 23;
        this.f = fg5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jhc(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
    }
}
