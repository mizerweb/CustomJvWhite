package defpackage;

import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class xf2 implements sb5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sb5
    public final void onResume(g19 g19Var) {
        switch (this.a) {
            case 0:
                yf2 yf2Var = (yf2) this.b;
                rd1 rd1Var = (rd1) yf2Var.b;
                MainActivity mainActivity = ((ym1) ((p3c) yf2Var.c).b).n;
                if ((mainActivity != null ? mainActivity.isInPictureInPictureMode() : false) && yf2Var.a && !rd1Var.c()) {
                    rd1Var.d(true);
                    gm0.n((String) yf2Var.d, "onResume, cameraController.isVideoEnabled = true");
                    break;
                }
                break;
            default:
                gue gueVar = (gue) this.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "gue", "onResume, owner=" + g19Var + ", isAppVisible=" + gueVar.f + ", isScreenOn=" + gueVar.g, null);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sb5
    public final void onStart(g19 g19Var) {
        switch (this.a) {
            case 0:
                yf2 yf2Var = (yf2) this.b;
                rd1 rd1Var = (rd1) yf2Var.b;
                if (((ym1) ((p3c) yf2Var.c).b).f() && !rd1Var.c() && yf2Var.a) {
                    rd1Var.d(true);
                    gm0.n((String) yf2Var.d, "onStart, cameraController.isVideoEnabled = true");
                    break;
                }
                break;
            default:
                gue gueVar = (gue) this.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "gue", "onStart, owner=" + g19Var + ", isAppVisible=" + gueVar.f + ", isScreenOn=" + gueVar.g, null);
                    }
                }
                if (!((gue) this.b).f) {
                    ((gue) this.b).f = true;
                    if (((gue) this.b).g) {
                        ((gue) this.b).b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sb5
    public final void onStop(g19 g19Var) {
        switch (this.a) {
            case 0:
                yf2 yf2Var = (yf2) this.b;
                String str = (String) yf2Var.d;
                rd1 rd1Var = (rd1) yf2Var.b;
                if (!((ym1) ((p3c) yf2Var.c).b).f() || !rd1Var.c()) {
                    if (yf2Var.a && !rd1Var.c()) {
                        yf2Var.a = false;
                        gm0.n(str, "Resetting isVideoEnabled cuz of possible screen share");
                        break;
                    }
                } else {
                    yf2Var.a = true;
                    rd1Var.d(false);
                    gm0.n(str, "onStop, cameraController.isVideoEnabled = false, isVideoEnabled = true");
                    break;
                }
                break;
            default:
                gue gueVar = (gue) this.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "gue", "onStop, owner=" + g19Var + ", isAppVisible=" + gueVar.f + ", isScreenOn=" + gueVar.g, null);
                    }
                }
                if (((gue) this.b).f) {
                    ((gue) this.b).f = false;
                    ((gue) this.b).a();
                    break;
                }
                break;
        }
    }
}
