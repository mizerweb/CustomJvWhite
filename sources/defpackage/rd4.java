package defpackage;

import android.telecom.CallEndpoint;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rd4 implements cf7 {
    public final /* synthetic */ td4 a;
    public final /* synthetic */ l82 b;

    public /* synthetic */ rd4(td4 td4Var, l82 l82Var) {
        this.a = td4Var;
        this.b = l82Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        td4 td4Var = this.a;
        l82 l82Var = this.b;
        je9 je9Var = je9.d;
        a80 currentDevice = td4Var.getCurrentDevice();
        a80 a80VarE = qwk.e((CallEndpoint) obj);
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            String str = currentDevice.b;
            int i = currentDevice.a;
            String str2 = a80VarE.b;
            int i2 = a80VarE.a;
            StringBuilder sbV = qt4.v("Endpoint changed: ", str, "(type=");
            sbV.append(p.p(i));
            sbV.append(") -> ");
            sbV.append(str2);
            sbV.append("(type=");
            sbV.append(p.p(i2));
            sbV.append(")");
            a4cVar.c(je9Var, "CallAudioController", sbV.toString(), null);
        }
        a80 a80Var = td4Var.e;
        td4Var.e = a80VarE;
        boolean z = td4Var.b.c() || ((enc) ((x02) td4Var.c.i.a.getValue()).getParticipants().a().getValue()).h;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            String str3 = a80Var.b;
            int i3 = a80Var.a;
            String str4 = a80VarE.b;
            int i4 = a80VarE.a;
            StringBuilder sbV2 = qt4.v("onEndpointChanged: ", str3, "(");
            sbV2.append(p.p(i3));
            sbV2.append(") -> ");
            sbV2.append(str4);
            sbV2.append("(");
            sbV2.append(p.p(i4));
            sbV2.append("), hasVideo=");
            sbV2.append(z);
            a4cVar2.c(je9Var, "CallAudioController", sbV2.toString(), null);
        }
        if (a80Var.a == 5 && a80VarE.a == 1 && z) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallAudioController", "onEndpointChanged: video call with earpiece, switching to speakerphone", null);
            }
            td4Var.d(false);
        }
        l82Var.a(currentDevice, a80VarE);
        return sbi.a;
    }
}
