package one.me.calls.impl.service.telecom;

import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import defpackage.a4c;
import defpackage.af7;
import defpackage.b95;
import defpackage.be1;
import defpackage.c0a;
import defpackage.dz4;
import defpackage.e5d;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hs1;
import defpackage.ifh;
import defpackage.j95;
import defpackage.je9;
import defpackage.llh;
import defpackage.n0c;
import defpackage.ny8;
import defpackage.o02;
import defpackage.os1;
import defpackage.qv1;
import defpackage.re1;
import defpackage.rx8;
import defpackage.t20;
import defpackage.ue1;
import defpackage.wmi;
import defpackage.x02;
import defpackage.xhh;
import defpackage.xni;
import defpackage.y02;
import defpackage.yab;
import defpackage.yvg;
import kotlin.Metadata;
import one.me.calls.impl.service.telecom.TelecomCallService;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class TelecomCallService extends ConnectionService {
    public static final /* synthetic */ int e = 0;
    public final String a = TelecomCallService.class.getName();
    public final ny8 b = rx8.P(3, new yvg(13));
    public final o02 c;
    public final ifh d;

    public TelecomCallService() {
        final int i = 0;
        this.c = new o02(this, rx8.P(3, new af7(this) { // from class: ilh
            public final /* synthetic */ TelecomCallService b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                TelecomCallService telecomCallService = this.b;
                switch (i2) {
                    case 0:
                        int i3 = TelecomCallService.e;
                        return (c95) ((ga2) telecomCallService.b.getValue()).getAccessor().c(734);
                    default:
                        int i4 = TelecomCallService.e;
                        return ((ga2) telecomCallService.b.getValue()).b();
                }
            }
        }));
        final int i2 = 1;
        this.d = new ifh(new af7(this) { // from class: ilh
            public final /* synthetic */ TelecomCallService b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                TelecomCallService telecomCallService = this.b;
                switch (i3) {
                    case 0:
                        int i4 = TelecomCallService.e;
                        return (c95) ((ga2) telecomCallService.b.getValue()).getAccessor().c(734);
                    default:
                        int i5 = TelecomCallService.e;
                        return ((ga2) telecomCallService.b.getValue()).b();
                }
            }
        });
    }

    public final b95 a() {
        return (b95) this.d.getValue();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        gm0.n(this.a, "TelecomCallService onCreate");
        this.c.i();
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        Bundle extras;
        gm0.n(this.a, "onCreateIncomingConnection");
        Bundle extras2 = connectionRequest != null ? connectionRequest.getExtras() : null;
        String string2 = extras2 != null ? extras2.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string2 == null) {
            string2 = "";
        }
        y02 y02VarP = a().p(string2);
        if (y02VarP == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallServiceTag", c0a.o("TelecomCallService onCreateIncomingConnection: no live session (id=", string2, "). cancel creating connection"), null);
                }
            }
            return null;
        }
        ue1 ue1VarH = y02VarP.h();
        o02 o02Var = this.c;
        int i = 0;
        if (connectionRequest != null && (extras = connectionRequest.getExtras()) != null) {
            i = extras.getInt("LOCAL_ACCOUNT_ID", 0);
        }
        o02Var.f = new ha9(i);
        llh llhVar = (llh) ((e5d) ((ifh) y02VarP.k()).getValue()).s().i();
        boolean z = llhVar.a;
        re1 re1Var = new re1(ue1VarH, string2, z);
        if (!ue1VarH.j(re1Var)) {
            gm0.n(this.a, "connection destroyed before fully initialized");
            return null;
        }
        if (z) {
            re1Var.setInitialized();
            re1Var.setAddress(connectionRequest != null ? connectionRequest.getAddress() : null, 1);
            if (llhVar.g && extras2 != null && (string = extras2.getString("extra.DISPLAY_NAME")) != null) {
                re1Var.setCallerDisplayName(string, 1);
            }
            re1Var.setRinging();
            if (llhVar.g) {
                ue1VarH.l();
            }
        }
        ue1VarH.o = new xni(1, this);
        return re1Var;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Bundle extras;
        a4c a4cVar;
        Bundle extras2 = connectionRequest != null ? connectionRequest.getExtras() : null;
        String string = extras2 != null ? extras2.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string == null) {
            string = "";
        }
        y02 y02VarP = a().p(string);
        if (y02VarP == null && (a4cVar = gm0.f) != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", c0a.o("TelecomCallService onCreateIncomingConnectionFailed: no live session (id=", string, "). cancel creating connection"), null);
            }
        }
        ue1 ue1VarH = y02VarP != null ? y02VarP.h() : null;
        TelecomCallServiceException telecomCallServiceException = new TelecomCallServiceException("onCreateIncomingConnectionFailed", null, 2, null);
        gm0.V(this.a, telecomCallServiceException.getMessage(), telecomCallServiceException);
        o02 o02Var = this.c;
        int i = 0;
        if (connectionRequest != null && (extras = connectionRequest.getExtras()) != null) {
            i = extras.getInt("LOCAL_ACCOUNT_ID", 0);
        }
        o02Var.f = new ha9(i);
        if (ue1VarH != null) {
            ue1VarH.k(string);
        }
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        Bundle bundle;
        Bundle extras;
        gm0.n(this.a, "onCreateOutgoingConnection");
        this.c.f = new ha9((connectionRequest == null || (extras = connectionRequest.getExtras()) == null) ? 0 : extras.getInt("LOCAL_ACCOUNT_ID", 0));
        Bundle extras2 = connectionRequest != null ? connectionRequest.getExtras() : null;
        if (extras2 != null && (bundle = extras2.getBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS")) != null) {
            if (!bundle.containsKey("one.me.calls.telecom.EXTRA_SESSION_ID")) {
                bundle = null;
            }
            if (bundle != null) {
                extras2 = bundle;
            }
        }
        String string2 = extras2 != null ? extras2.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string2 == null) {
            string2 = "";
        }
        String str = string2;
        y02 y02VarP = a().p(str);
        if (y02VarP == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallServiceTag", c0a.o("TelecomCallService onCreateOutgoingConnection: no live session (id=", str, "). cancel creating connection"), null);
                }
            }
            return null;
        }
        ue1 ue1VarH = y02VarP.h();
        llh llhVar = (llh) ((e5d) ((ifh) y02VarP.k()).getValue()).s().i();
        boolean z = llhVar.a;
        re1 re1Var = new re1(ue1VarH, str, z);
        if (!ue1VarH.j(re1Var)) {
            gm0.n(this.a, "connection destroyed before fully initialized");
            return null;
        }
        if (z) {
            re1Var.setInitialized();
            re1Var.setAddress(connectionRequest != null ? connectionRequest.getAddress() : null, 1);
            if (llhVar.g && extras2 != null && (string = extras2.getString("extra.DISPLAY_NAME")) != null) {
                re1Var.setCallerDisplayName(string, 1);
            }
            re1Var.setDialing();
            if (llhVar.g) {
                ue1VarH.l();
            }
        }
        x02 x02VarI = a().i(str);
        if (x02VarI == null) {
            x02VarI = (x02) a().i.a.getValue();
        }
        hs1 hs1Var = (hs1) y02VarP.getAccessor().c(729);
        yab.i0((wmi) hs1Var.e.getValue(), ((n0c) ((xhh) hs1Var.f.getValue())).c().S0(), 0, new t20(hs1Var, str, (dz4) x02VarI.z().getValue(), (be1) x02VarI.b().getValue(), new os1(this, ue1VarH, str, 20), null, 4), 2);
        return re1Var;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Bundle extras;
        a4c a4cVar;
        Bundle bundle;
        Bundle extras2 = connectionRequest != null ? connectionRequest.getExtras() : null;
        if (extras2 != null && (bundle = extras2.getBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS")) != null) {
            if (!bundle.containsKey("one.me.calls.telecom.EXTRA_SESSION_ID")) {
                bundle = null;
            }
            if (bundle != null) {
                extras2 = bundle;
            }
        }
        String string = extras2 != null ? extras2.getString("one.me.calls.telecom.EXTRA_SESSION_ID") : null;
        if (string == null) {
            string = "";
        }
        y02 y02VarP = a().p(string);
        if (y02VarP == null && (a4cVar = gm0.f) != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", c0a.o("TelecomCallService onCreateOutgoingConnectionFailed: no live session (id=", string, "). cancel creating connection"), null);
            }
        }
        ue1 ue1VarH = y02VarP != null ? y02VarP.h() : null;
        o02 o02Var = this.c;
        int i = 0;
        if (connectionRequest != null && (extras = connectionRequest.getExtras()) != null) {
            i = extras.getInt("LOCAL_ACCOUNT_ID", 0);
        }
        o02Var.f = new ha9(i);
        String str = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str, qv1.i("onCreateOutgoingConnectionFailed(), localAccountId=", (ha9) this.c.f), null);
            }
        }
        if (ue1VarH != null) {
            ue1VarH.k(string);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.i("TelecomCallService onDestroy(), localAccountId=", (ha9) this.c.f), null);
            }
        }
        this.c.j();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/impl/service/telecom/TelecomCallService$TelecomCallServiceException;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TelecomCallServiceException extends IssueKeyException {
        public /* synthetic */ TelecomCallServiceException(String str, Throwable th, int i, j95 j95Var) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public TelecomCallServiceException(String str, Throwable th) {
            super("48866", str, th);
        }
    }
}
