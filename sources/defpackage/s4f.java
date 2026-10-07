package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* JADX INFO: loaded from: classes3.dex */
public final class s4f implements n4f {
    public static final /* synthetic */ zv8[] r;
    public final j52 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ReentrantLock i = new ReentrantLock(true);
    public final mjg j;
    public final mjg k;
    public sgg l;
    public final ifh m;
    public final p3c n;
    public sgg o;
    public final mjg p;
    public final mjg q;

    static {
        z8b z8bVar = new z8b(s4f.class, "loadUserRecordInfoJob", "getLoadUserRecordInfoJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        r = new zv8[]{z8bVar};
    }

    public s4f(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, j52 j52Var, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = j52Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        mjg mjgVarA = p90.a(t4f.e);
        this.j = mjgVarA;
        this.k = mjgVarA;
        this.m = new ifh(new tyd(21));
        this.n = qyj.S();
        mjg mjgVarA2 = p90.a(null);
        this.p = mjgVarA2;
        this.q = mjgVarA2;
    }

    public final RecordManager a() {
        Conversation conversationA = ((ms4) this.b.getValue()).a();
        if (conversationA != null) {
            return conversationA.getRecordManager();
        }
        return null;
    }

    @Override // defpackage.n4f
    public final void c(u4f u4fVar) throws IllegalAccessException, InvocationTargetException {
        Object value;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ScreenRecordControllerTag", "release record state with " + u4fVar, null);
            }
        }
        mjg mjgVar = this.j;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, t4f.a(t4f.e, u4fVar, null, null, 14)));
        sgg sggVar = this.l;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.l = null;
        p3c p3cVar = this.n;
        zv8[] zv8VarArr = r;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.n.B(this, zv8VarArr[0], null);
        sgg sggVar2 = this.o;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        this.o = null;
    }

    @Override // defpackage.n4f
    public final boolean d() {
        ConversationParticipant me2;
        ParticipantId externalId;
        m4f m4fVar = ((t4f) j().getValue()).b;
        if (m4fVar == null) {
            return false;
        }
        fu1 fu1Var = m4fVar.c;
        Conversation conversationA = ((ms4) this.b.getValue()).a();
        return fu1Var.equals((conversationA == null || (me2 = conversationA.getMe()) == null || (externalId = me2.getExternalId()) == null) ? Boolean.FALSE : anc.a(externalId));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    public final void e(u4f u4fVar) {
        mjg mjgVar;
        Object value;
        t4f t4fVar;
        m4f m4fVar;
        RecordDescription recordDescription;
        int i;
        do {
            mjgVar = this.j;
            value = mjgVar.getValue();
            t4fVar = (t4f) value;
            RecordManager recordManagerA = a();
            if (recordManagerA == null || (recordDescription = recordManagerA.getRecordDescription()) == null) {
                m4fVar = null;
            } else {
                int iOrdinal = recordDescription.getType().ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal == 1) {
                    i = 3;
                } else if (iOrdinal != 2) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (i == 1) {
                    m4fVar = null;
                } else {
                    fu1 fu1VarA = anc.a(recordDescription.getInitiator());
                    this.n.B(this, r[0], yab.i0((y82) this.c.getValue(), ((n0c) ((xhh) this.g.getValue())).b(), 0, new f1j(fu1VarA.a, this, null), 2));
                    m4fVar = new m4f(recordDescription.getMovieId(), String.valueOf(recordDescription.getMovieId()), fu1VarA, recordDescription.getStart(), i);
                }
            }
        } while (!mjgVar.h(value, t4f.a(t4fVar, u4fVar, m4fVar, null, 12)));
    }

    @Override // defpackage.n4f
    public final mjg j() {
        return this.k;
    }

    @Override // defpackage.n4f
    public final mjg n() {
        return this.q;
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordDataChanged() {
        gm0.U("ScreenRecordControllerTag", "onRecordDataChanged");
        e(u4f.c);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordError(String str) throws IllegalAccessException, InvocationTargetException {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ScreenRecordControllerTag", qv1.k("onRecordError: ", str), null);
            }
        }
        c(u4f.b);
        c(u4f.c);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStarted() {
        RecordDescription recordDescription;
        s4f s4fVar;
        RecordManager recordManagerA = a();
        if (recordManagerA == null || (recordDescription = recordManagerA.getRecordDescription()) == null) {
            gm0.Y("ScreenRecordControllerTag", "Early return in onRecordStarted cuz of recordDescription is null");
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ScreenRecordControllerTag", "onRecordStarted: data = " + recordDescription, null);
            }
        }
        long start = recordDescription.getStart();
        if (this.l == null) {
            s4fVar = this;
            s4fVar.l = yab.i0((y82) this.c.getValue(), null, 0, new i20(s4fVar, start, (lq4) null, 25), 3);
        } else {
            s4fVar = this;
        }
        s4fVar.e(u4f.a);
        if (s4fVar.d()) {
            return;
        }
        eqe eqeVar = (eqe) s4fVar.h.getValue();
        eqeVar.e = 8;
        sw1 sw1VarA = eqeVar.a();
        sw1VarA.b(sw1VarA.g.h, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStopped(ConversationParticipant conversationParticipant) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        ParticipantId externalId;
        ConversationParticipant me2;
        ParticipantId externalId2;
        a4c a4cVar = gm0.f;
        fu1 fu1VarA = null;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ScreenRecordControllerTag", "onRecordStopped: stoppedBy = " + conversationParticipant, null);
            }
        }
        m4f m4fVar = ((t4f) this.k.getValue()).b;
        fu1 fu1Var = m4fVar != null ? m4fVar.c : null;
        if (fu1Var == null) {
            z = false;
        } else {
            Conversation conversationA = ((ms4) this.b.getValue()).a();
            if (fu1Var.equals((conversationA == null || (me2 = conversationA.getMe()) == null || (externalId2 = me2.getExternalId()) == null) ? null : anc.a(externalId2))) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            if (conversationParticipant != null && (externalId = conversationParticipant.getExternalId()) != null) {
                fu1VarA = anc.a(externalId);
            }
            if (!cqk.d(fu1Var, fu1VarA)) {
                ((ya1) ((da1) this.d.getValue())).s.a(id.a);
            }
        }
        c(u4f.c);
        if (z) {
            return;
        }
        eqe eqeVar = (eqe) this.h.getValue();
        eqeVar.e = 9;
        sw1 sw1VarA = eqeVar.a();
        sw1VarA.b(sw1VarA.g.i, false, 0);
    }

    @Override // defpackage.n4f
    public final void prepare() {
        gm0.U("ScreenRecordControllerTag", "prepare recoding state");
        onRecordStarted();
        ra1 ra1Var = new ra1(17, new ua1(new q8e(((ij4) this.f.getValue()).c), 9));
        ghb ghbVar = ew5.b;
        this.o = e9i.j0(e9i.T(new fz6(new q0d(e9i.R(tre.N(ra1Var, qe7.O(300, lw5.MILLISECONDS), new wf0(22)), new c9(2, null, 19)), this, 12), new tl1(this, (lq4) null, 9), 3), ((n0c) ((xhh) this.g.getValue())).a()), (y82) this.c.getValue());
    }

    @Override // defpackage.n4f
    public final void r() {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.j;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, t4f.a((t4f) value, null, null, null, 11)));
    }

    @Override // defpackage.n4f
    public final void s(RecordManager.StopParams stopParams) {
        gm0.U("ScreenRecordControllerTag", "stopRecordBroadcast");
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            if (((t4f) this.k.getValue()).a != u4f.a) {
                gm0.U("ScreenRecordControllerTag", "startRecordBroadcast already finished");
                return;
            }
            sa2 sa2Var = (sa2) this.e.getValue();
            sa2Var.getClass();
            sa2.c(sa2Var, "CALL_RECORDING", null, null, 0L, null, null, true, null, 374);
            RecordManager recordManagerA = a();
            if (recordManagerA != null) {
                RecordManager.stopRecord$default(recordManagerA, stopParams, new xre(this, 3, stopParams), null, 4, null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.n4f
    public final void u(RecordManager.StartParams startParams) {
        gm0.U("ScreenRecordControllerTag", "startRecordBroadcast");
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            if (((t4f) this.k.getValue()).a == u4f.a) {
                gm0.U("ScreenRecordControllerTag", "startRecordBroadcast already started");
                return;
            }
            sa2 sa2Var = (sa2) this.e.getValue();
            sa2Var.getClass();
            sa2.c(sa2Var, "CALL_RECORDING", null, null, 1L, null, null, true, null, 374);
            RecordManager recordManagerA = a();
            if (recordManagerA != null) {
                RecordManager.startRecord$default(recordManagerA, startParams, null, null, 6, null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
