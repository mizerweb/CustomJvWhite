package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.ImageCaptureException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import one.me.sdk.media.transformer.MediaTransformException;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nb implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nb(c2f c2fVar, String str, Long l, Object obj) {
        this.a = 5;
        this.c = c2fVar;
        this.b = str;
        this.d = obj;
        this.e = l;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.a) {
            case 0:
                return AddParticipantsCommands.addParticipantByLink$lambda$0((String) this.b, (sg4) this.c, (Runnable) this.d, (AddParticipantsCommands) this.e, (q4g) obj);
            case 1:
                bo boVar = (bo) this.b;
                gf1 gf1Var = (gf1) this.c;
                os1 os1Var = (os1) this.d;
                w14 w14Var = (w14) this.e;
                AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj).setOpponentId(anc.b(boVar.b));
                String str = boVar.c;
                if (str != null) {
                    opponentId.setConversationParams(str);
                }
                return opponentId.setConversationId(boVar.a).setMyId(anc.b(gf1Var.e())).setEventListener((ConversationEventsListener) gf1Var.b.getValue()).setOnPrepared((cf7) os1Var).setOnError((cf7) w14Var).build();
            case 2:
                p4c p4cVar = (p4c) this.b;
                j7c j7cVar = (j7c) this.c;
                zxd zxdVar = (zxd) this.d;
                Context context = (Context) this.e;
                xcd xcdVarK = p4cVar.k((String) obj);
                return new xcd(j7c.e(pq3.j.e(context).m(), xcdVarK, j7cVar.a(xcdVarK.a.toString(), zxdVar.b)), xcdVarK.b);
            case 3:
                r6a r6aVar = (r6a) this.b;
                d0c d0cVar = (d0c) this.c;
                n6a n6aVar = (n6a) this.d;
                k84 k84Var = (k84) this.e;
                ii5 ii5Var = (ii5) obj;
                je9 je9Var = je9.d;
                String str2 = (String) r6aVar.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "executeWithDetachableLooper", null);
                }
                String str3 = ((w5a) r6aVar.a).c;
                g2i g2iVarW = r6aVar.w(d0cVar.f((Context) r6aVar.c, n6aVar), d0cVar, new q6a(n6aVar, r6aVar, ii5Var, 0));
                ifh ifhVar = ii5.c;
                Handler handler = new Handler(ii5Var.b, null);
                w5a w5aVar = (w5a) r6aVar.a;
                j6a j6aVar = new j6a(handler, g2iVarW, w5aVar.n, w5aVar.o, w5aVar.m);
                try {
                    g2iVarW.h(k84Var, str3);
                    j6aVar.b();
                    String str4 = (String) r6aVar.b;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str4, "executeWithDetachableLooper, starting loop ...", null);
                    }
                    if (!cqk.d(ii5Var.b.getThread(), Thread.currentThread())) {
                        throw new IllegalStateException("Illegal thread");
                    }
                    Looper.loop();
                    String str5 = (String) r6aVar.b;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str5, "executeWithDetachableLooper, loop completed", null);
                    }
                    return sbi.a;
                } catch (Throwable th) {
                    try {
                        n6aVar.b(new MediaTransformException("Media transform failed (detachable_looper)", th));
                        r6aVar.r(g2iVarW);
                    } finally {
                        r6aVar.s(g2iVarW);
                        j6aVar.a();
                    }
                }
                break;
            case 4:
                rt2 rt2Var = (rt2) this.b;
                rt2 rt2Var2 = (rt2) this.c;
                sfa sfaVar = (sfa) this.d;
                c cVar = (c) this.e;
                lm9 lm9Var = (lm9) obj;
                lm9Var.a = rt2Var;
                lm9Var.b = rt2Var2;
                lm9Var.d = sfaVar;
                lm9Var.f = cVar;
                return sbi.a;
            case 5:
                c2f c2fVar = (c2f) this.c;
                String str6 = (String) this.b;
                Object obj2 = this.d;
                Long l = (Long) this.e;
                String str7 = c2fVar.g;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar4.b(je9Var2)) {
                        a4cVar4.c(je9Var2, str7, "schedule: run for owner=" + str6 + ", value=" + obj2 + ", scheduledValues=[" + c2fVar.j.keySet() + "]", null);
                    }
                }
                sgg sggVarI0 = yab.i0(c2fVar.a, null, 0, new b2f(c2fVar, l, obj2, (lq4) null), 3);
                sggVarI0.Y(new os1(c2fVar, str6, obj2, 18));
                return sggVarI0;
            case 6:
                return SessionRoomAdminCommandExecutorImpl.moveParticipant$lambda$0((SessionRoomAdminCommandExecutorImpl) this.b, (MoveParticipantParams) this.c, (af7) this.d, (cf7) this.e, (yt1) obj);
            default:
                dqg dqgVar = (dqg) this.b;
                xf5 xf5Var = (xf5) this.c;
                bqg bqgVar = (bqg) this.d;
                kli kliVar = (kli) this.e;
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof ImageCaptureException) && ((ImageCaptureException) th2).a == 3) {
                    yab.i0(dqgVar.b.f, null, 0, new hki(dqgVar, kliVar, bqgVar, (lq4) null, 6), 3);
                } else {
                    i64 i64Var = bqgVar.d;
                    if (th2 == null) {
                        i64Var.Q(xf5Var.l());
                    } else if (th2 instanceof CancellationException) {
                        i64Var.r((CancellationException) th2);
                    } else {
                        i64Var.j0(th2);
                    }
                }
                return sbi.a;
        }
    }

    public /* synthetic */ nb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
