package defpackage;

import java.util.Iterator;
import java.util.Set;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iq0 implements rb0 {
    public final ue1 a;
    public final rd1 b;
    public final b95 c;
    public boolean d;
    public a80 e = a80.d;

    public iq0(ue1 ue1Var, rd1 rd1Var, b95 b95Var) {
        this.a = ue1Var;
        this.b = rd1Var;
        this.c = b95Var;
    }

    @Override // defpackage.rb0
    public final void a(CallsAudioManager.State state) {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallAudioController", "changeAudioState(" + state + "), conversationStateHandled=" + this.d, null);
        }
        if (state != CallsAudioManager.State.CONVERSATION || this.d) {
            return;
        }
        this.d = true;
        boolean zC = this.b.c();
        a80 currentDevice = getCurrentDevice();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallAudioController", "changeAudioState: isVideo=" + zC + ", currentDevice=" + currentDevice.b + "(type=" + p.p(currentDevice.a) + ")", null);
        }
        if (zC) {
            int i = currentDevice.a;
            if (i == 1 || i == 2) {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, "CallAudioController", "changeAudioState: video call with built-in device, enabling speaker", null);
                }
                d(true);
            }
        }
    }

    public final void e(Set set) {
        Set set2;
        Object next;
        je9 je9Var = je9.d;
        a80 currentDevice = getCurrentDevice();
        boolean z = this.b.c() || ((enc) ((x02) this.c.i.a.getValue()).getParticipants().a().getValue()).h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            set2 = set;
            String strZ1 = ww3.z1(set2, null, null, null, i9.g, 31);
            String str = currentDevice.b;
            int i = currentDevice.a;
            StringBuilder sbQ = qv1.q("onAvailableDevicesChanged: available=[", strZ1, "], current=", str, "(type=");
            sbQ.append(p.p(i));
            sbQ.append("), hasVideo=");
            sbQ.append(z);
            a4cVar.c(je9Var, "CallAudioController", sbQ.toString(), null);
        } else {
            set2 = set;
        }
        if (!set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                int i2 = ((a80) it.next()).a;
                if (i2 != 1 && i2 != 2) {
                    return;
                }
            }
        }
        if (currentDevice.a == 5) {
            return;
        }
        int i3 = z ? 2 : 1;
        Iterator it2 = set2.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((a80) next).a != i3);
        a80 a80Var = (a80) next;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallAudioController", "selectPreferredBuiltInDevice: hasVideo=" + z + " -> selected=" + (a80Var != null ? a80Var.b : null), null);
        }
        if (a80Var == null || a80Var.equals(currentDevice)) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallAudioController", nbh.w("onAvailableDevicesChanged: no switch needed (best=", a80Var != null ? a80Var.b : null, ", current=", currentDevice.b, ")"), null);
                return;
            }
            return;
        }
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, "CallAudioController", qv1.l("onAvailableDevicesChanged: switching ", currentDevice.b, " -> ", a80Var.b), null);
        }
        b(a80Var);
    }

    public final boolean f(boolean z) {
        int i;
        a80 currentDevice = getCurrentDevice();
        if (!z || (i = currentDevice.a) == 1 || i == 2) {
            return false;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                String str = currentDevice.b;
                int i2 = currentDevice.a;
                StringBuilder sbV = qt4.v("setSpeakerEnabled: skip auto-speaker, current=", str, "(type=");
                sbV.append(p.p(i2));
                sbV.append(") is external");
                a4cVar.c(je9Var, "CallAudioController", sbV.toString(), null);
            }
        }
        return true;
    }

    @Override // defpackage.rb0
    public final void release() {
        this.d = false;
        this.e = a80.d;
        ue1 ue1Var = this.a;
        ue1Var.l = null;
        ue1Var.m = null;
        ue1Var.n = null;
        gm0.n("CallAudioController", "BaseConnectionRouteDelegate released");
    }
}
