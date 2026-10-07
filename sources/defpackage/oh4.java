package defpackage;

import android.view.View;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oh4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph4 b;

    public /* synthetic */ oh4(ph4 ph4Var, int i) {
        this.a = i;
        this.b = ph4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.a;
        ph4 ph4Var = this.b;
        switch (i) {
            case 0:
                xva xvaVar = ph4Var.B;
                if (xvaVar != null) {
                    long j = ph4Var.D;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) xvaVar.b;
                    er3 er3Var = CallHistoryPageScreen.l;
                    if (!((o5b) callHistoryPageScreen.r1().h.b.a.getValue()).a) {
                        kl1 kl1VarS1 = callHistoryPageScreen.s1();
                        yw7 yw7VarD = kl1VarS1.D(j);
                        pw7 pw7Var = pw7.a;
                        if (yw7VarD != null) {
                            qw7 qw7Var = yw7VarD.k;
                            if (!qw7Var.equals(pw7Var)) {
                                ae9 ae9Var = (ae9) ((xl1) kl1VarS1.p.getValue()).a.getValue();
                                ul9 ul9Var = new ul9();
                                int i2 = wl1.$EnumSwitchMapping$1[qt4.D(yw7VarD.j)];
                                if (i2 == 1) {
                                    str = MediaStreamTrack.AUDIO_TRACK_KIND;
                                } else if (i2 != 2) {
                                    ore.o();
                                } else {
                                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                                }
                                ul9Var.put("callType", str);
                                String strA = xl1.a(qw7Var);
                                if (strA != null) {
                                    ul9Var.put("dialogType", strA);
                                }
                                ul9Var.put("isMissed", Integer.valueOf(yw7VarD.h ? 1 : 0));
                                ae9Var.g("OPEN_CALL_INFO", ul9Var.b());
                            }
                        }
                        qw7 qw7Var2 = yw7VarD != null ? yw7VarD.k : null;
                        if (qw7Var2 instanceof ow7) {
                            ow7 ow7Var = (ow7) qw7Var2;
                            kl1VarS1.F(ow7Var.b, ow7Var.f, ow7Var.c, ow7Var.d);
                            break;
                        } else if (qw7Var2 instanceof lw7) {
                            lw7 lw7Var = (lw7) qw7Var2;
                            kl1VarS1.F(lw7Var.b, lw7Var.g, lw7Var.d, lw7Var.f);
                            break;
                        } else if (qw7Var2 instanceof nw7) {
                            nw7 nw7Var = (nw7) qw7Var2;
                            a8j.x(kl1VarS1.z, new qk1(nw7Var.d, nw7Var.c, nw7Var.a));
                            break;
                        } else if (!cqk.d(qw7Var2, pw7Var) && qw7Var2 != null) {
                            ore.o();
                            break;
                        }
                    } else {
                        CallHistoryPageScreen.o1(callHistoryPageScreen, j);
                    }
                }
                break;
            case 1:
                xva xvaVar2 = ph4Var.B;
                if (xvaVar2 != null) {
                    xvaVar2.F(ph4Var.D, false);
                }
                break;
            default:
                xva xvaVar3 = ph4Var.B;
                if (xvaVar3 != null) {
                    xvaVar3.F(ph4Var.D, true);
                }
                break;
        }
    }
}
