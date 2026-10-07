package defpackage;

import android.os.OutcomeReceiver;
import android.telecom.CallEndpoint;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class td4 extends iq0 {
    public final ExecutorService f;
    public final sd4 g;

    public td4(ue1 ue1Var, ExecutorService executorService, rd1 rd1Var, b95 b95Var) {
        super(ue1Var, rd1Var, b95Var);
        this.f = executorService;
        this.g = new sd4();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f A[PHI: r9
  0x009f: PHI (r9v2 int) = (r9v1 int), (r9v5 int) binds: [B:19:0x008a, B:21:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.rb0
    public final void b(a80 a80Var) {
        Object next;
        CallEndpoint callEndpointJ;
        Object next2;
        je9 je9Var = je9.d;
        List list = this.a.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            String str = a80Var.b;
            int i = a80Var.a;
            String str2 = a80Var.c;
            String strZ1 = ww3.z1(list, null, null, null, i9.w, 31);
            StringBuilder sbV = qt4.v("setAudioDevice: device=", str, "(type=");
            sbV.append(p.p(i));
            sbV.append(", id=");
            sbV.append(str2);
            sbV.append("), availableEndpoints=[");
            a4cVar.c(je9Var, "CallAudioController", zo5.w(sbV, strZ1, "]"), null);
        }
        int i2 = a80Var.a;
        int i3 = 3;
        if (i2 == 3) {
            String str3 = a80Var.c;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!cqk.d(rh.j(next2).getIdentifier().toString(), str3));
            callEndpointJ = rh.j(next2);
        } else {
            int i4 = b80.$EnumSwitchMapping$0[qt4.D(i2)];
            int i5 = 1;
            if (i4 != 1) {
                i5 = 4;
                if (i4 == 2) {
                    i3 = i5;
                } else if (i4 == 3) {
                    i3 = 2;
                } else if (i4 != 4) {
                    if (i4 != 5) {
                        ore.o();
                        return;
                    }
                    i3 = -1;
                }
            } else {
                i3 = i5;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (rh.j(next).getEndpointType() != i3);
            callEndpointJ = rh.j(next);
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallAudioController", "setAudioDevice: found=" + ((Object) (callEndpointJ != null ? callEndpointJ.getEndpointName() : null)), null);
        }
        if (callEndpointJ == null) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, "CallAudioController", c0a.o("setAudioDevice: no matching endpoint for ", a80Var.b, ", request skipped"), null);
                return;
            }
            return;
        }
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            CharSequence endpointName = callEndpointJ.getEndpointName();
            a4cVar4.c(je9Var, "CallAudioController", "setAudioDevice: requesting endpoint change to " + ((Object) endpointName) + "(type=" + callEndpointJ.getEndpointType() + ")", null);
        }
        ue1 ue1Var = this.a;
        ExecutorService executorService = this.f;
        OutcomeReceiver outcomeReceiverJ = f82.j(this.g);
        re1 re1VarA = ue1Var.a();
        if (re1VarA != null) {
            re1VarA.requestCallEndpointChange(callEndpointJ, executorService, outcomeReceiverJ);
        } else {
            gm0.Y("CallConnectionController", "requestEndpointChange: no active connection");
        }
    }

    @Override // defpackage.rb0
    public final void c(l82 l82Var) {
        ue1 ue1Var = this.a;
        if (l82Var != null) {
            ue1Var.l = new rd4(this, l82Var);
            ue1Var.m = new j22(21, this);
        } else {
            ue1Var.l = null;
            ue1Var.m = null;
        }
    }

    @Override // defpackage.rb0
    public final void d(boolean z) {
        Object next;
        if (f(z)) {
            return;
        }
        Iterator it = this.a.p.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (rh.j(next).getEndpointType() != 4);
        CallEndpoint callEndpointJ = rh.j(next);
        if (callEndpointJ != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallAudioController", zo5.h(callEndpointJ.getEndpointType(), "setSpeakerEnabled(true) via Endpoint: type="), null);
                }
            }
            ue1 ue1Var = this.a;
            ExecutorService executorService = this.f;
            OutcomeReceiver outcomeReceiverJ = f82.j(this.g);
            re1 re1VarA = ue1Var.a();
            if (re1VarA != null) {
                re1VarA.requestCallEndpointChange(callEndpointJ, executorService, outcomeReceiverJ);
            } else {
                gm0.Y("CallConnectionController", "requestEndpointChange: no active connection");
            }
        }
    }

    @Override // defpackage.rb0
    public final Set getAvailableAudioDevices() {
        List list = this.a.p;
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(qwk.e(rh.j(it.next())));
        }
        return linkedHashSet;
    }

    @Override // defpackage.rb0
    public final a80 getCurrentDevice() {
        CallEndpoint callEndpoint = this.a.q;
        return callEndpoint == null ? a80.d : qwk.e(callEndpoint);
    }
}
