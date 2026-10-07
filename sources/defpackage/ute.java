package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ute implements j3d {
    public final /* synthetic */ xte a;

    public ute(xte xteVar) {
        this.a = xteVar;
    }

    @Override // defpackage.j3d
    public final void K0(s2d s2dVar) {
        float f = s2dVar.a;
        xte xteVar = this.a;
        if (f == xteVar.x) {
            return;
        }
        xteVar.x = f;
        String str = xteVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "notifyListeners: onPlaybackSpeedChanged", null);
            }
        }
        synchronized (xteVar.i) {
            Iterator it = xteVar.i.iterator();
            while (it.hasNext()) {
                ((tte) it.next()).g();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    @Override // defpackage.j3d
    public final void S(ry9 ry9Var, int i) {
        int iO;
        ry9 ry9VarM;
        this.a.g();
        this.a.i();
        xte xteVar = this.a;
        xteVar.u = ry9Var;
        iu9 iu9Var = xteVar.g;
        xteVar.r = iu9Var != null ? iu9Var.O() : false;
        xte xteVar2 = this.a;
        iu9 iu9Var2 = xteVar2.g;
        xteVar2.v = (iu9Var2 == null || (ry9VarM = iu9Var2.M()) == null) ? null : ry9VarM.d;
        xte xteVar3 = this.a;
        iu9 iu9Var3 = xteVar3.g;
        int iM = -1;
        if (iu9Var3 != null) {
            iu9Var3.U();
            hu9 hu9Var = iu9Var3.d;
            if (hu9Var.isConnected()) {
                iO = hu9Var.O();
            } else {
                iO = -1;
            }
        } else {
            iO = -1;
        }
        xte.a(xteVar3, iO);
        xte xteVar4 = this.a;
        iu9 iu9Var4 = xteVar4.g;
        if (iu9Var4 != null) {
            iu9Var4.U();
            hu9 hu9Var2 = iu9Var4.d;
            if (hu9Var2.isConnected()) {
                iM = hu9Var2.M();
            }
        }
        xte.a(xteVar4, iM);
        iu9 iu9Var5 = this.a.g;
        if (iu9Var5 != null) {
            iu9Var5.N();
        }
        mjg mjgVar = this.a.z;
        Float fValueOf = Float.valueOf(0.0f);
        mjgVar.getClass();
        mjgVar.j(null, fValueOf);
        this.a.b();
        xte xteVar5 = this.a;
        String str = xteVar5.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onMediaItemTransition, reason:" + i + ", isPlaying:" + xteVar5.r, null);
            }
        }
        xte xteVar6 = this.a;
        String str2 = xteVar6.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "notifyListeners: onAudioChanged", null);
            }
        }
        synchronized (xteVar6.i) {
            for (tte tteVar : xteVar6.i) {
                xteVar6.g();
                xteVar6.i();
                tteVar.j();
            }
        }
    }

    @Override // defpackage.j3d
    public final void T(PlaybackException playbackException) {
        xte xteVar = this.a;
        String str = xteVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "notifyListeners: onError", null);
            }
        }
        synchronized (xteVar.i) {
            for (tte tteVar : xteVar.i) {
                xteVar.g();
                xteVar.i();
                tteVar.c(playbackException);
            }
        }
    }

    @Override // defpackage.j3d
    public final void Y0(boolean z) {
        iu9 iu9Var;
        gm0.n(this.a.c, "onIsPlayingChanged");
        xte xteVar = this.a;
        xteVar.q = (z || (iu9Var = xteVar.g) == null || iu9Var.getPlaybackState() != 3) ? false : true;
        iu9 iu9Var2 = this.a.g;
        if (iu9Var2 != null) {
            iu9Var2.N();
        }
        xte xteVar2 = this.a;
        xteVar2.r = z;
        if (z) {
            xteVar2.n();
            xte xteVar3 = this.a;
            String str = xteVar3.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "notifyListeners: onPlay", null);
                }
            }
            synchronized (xteVar3.i) {
                for (tte tteVar : xteVar3.i) {
                    xteVar3.g();
                    xteVar3.i();
                    tteVar.k();
                }
            }
            return;
        }
        if (xteVar2.q) {
            xteVar2.b();
            xte xteVar4 = this.a;
            String str2 = xteVar4.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "notifyListeners: onPause", null);
                }
            }
            synchronized (xteVar4.i) {
                for (tte tteVar2 : xteVar4.i) {
                    xteVar4.g();
                    xteVar4.i();
                    tteVar2.i();
                }
            }
        }
    }

    @Override // defpackage.j3d
    public final void Z(k3d k3dVar, k3d k3dVar2, int i) {
        Object next;
        b0a b0aVar;
        Integer num;
        String str;
        if (i != 1 || k3dVar.b == k3dVar2.b) {
            return;
        }
        ry9 ry9Var = k3dVar.c;
        if (ry9Var != null && (str = ry9Var.a) != null) {
            y5h.C0(str);
        }
        ry9 ry9Var2 = k3dVar.c;
        int iIntValue = (ry9Var2 == null || (b0aVar = ry9Var2.d) == null || (num = b0aVar.H) == null) ? -1 : num.intValue();
        y1 y1Var = new y1(0, ty9.f);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((ty9) next).ordinal() != iIntValue);
        iu9 iu9Var = this.a.g;
        if (iu9Var != null) {
            int i2 = k3dVar.b;
            iu9Var.U();
            hu9 hu9Var = iu9Var.d;
            if (i2 == (hu9Var.isConnected() ? hu9Var.M() : -1)) {
                xte xteVar = this.a;
                String str2 = xteVar.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "notifyListeners: onSkipToNext", null);
                    }
                }
                synchronized (xteVar.i) {
                    Iterator it = xteVar.i.iterator();
                    while (it.hasNext()) {
                        ((tte) it.next()).getClass();
                    }
                }
                return;
            }
        }
        iu9 iu9Var2 = this.a.g;
        if (iu9Var2 != null) {
            int i3 = k3dVar.b;
            iu9Var2.U();
            hu9 hu9Var2 = iu9Var2.d;
            if (i3 == (hu9Var2.isConnected() ? hu9Var2.O() : -1)) {
                xte xteVar2 = this.a;
                String str3 = xteVar2.c;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str3, "notifyListeners: onSkipToPrevious", null);
                    }
                }
                synchronized (xteVar2.i) {
                    Iterator it2 = xteVar2.i.iterator();
                    while (it2.hasNext()) {
                        ((tte) it2.next()).getClass();
                    }
                }
            }
        }
    }

    @Override // defpackage.j3d
    public final void onRepeatModeChanged(int i) {
        xte xteVar = this.a;
        String str = xteVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "notifyListeners: onRepeatModeChanged", null);
            }
        }
        synchronized (xteVar.i) {
            Iterator it = xteVar.i.iterator();
            while (it.hasNext()) {
                ((tte) it.next()).getClass();
            }
        }
    }

    @Override // defpackage.j3d
    public final void u0(l3d l3dVar, i3d i3dVar) {
        cx6 cx6Var = i3dVar.a;
        float fA = l3dVar.a();
        xte xteVar = this.a;
        iu9 iu9Var = xteVar.g;
        if (iu9Var != null) {
            iu9Var.b(fA);
        }
        xteVar.w = l3dVar.getDuration();
        l3dVar.f();
        if (cx6Var.a.get(9)) {
            l3dVar.H();
        }
        if (cx6Var.a.get(8)) {
            l3dVar.getRepeatMode();
        }
    }

    @Override // defpackage.j3d
    public final void w0(b0a b0aVar) {
        xte xteVar = this.a;
        xteVar.v = b0aVar;
        String str = xteVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "notifyListeners: onMetadataChanged", null);
            }
        }
        synchronized (xteVar.i) {
            Iterator it = xteVar.i.iterator();
            while (it.hasNext()) {
                ((tte) it.next()).getClass();
            }
        }
    }

    @Override // defpackage.j3d
    public final void z(int i) {
        ry9 ry9VarM;
        xte xteVar = this.a;
        String str = xteVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                iu9 iu9Var = xteVar.g;
                a4cVar.c(je9Var, str, "onPlaybackStateChanged " + i + ", isPlaying:" + (iu9Var != null ? Boolean.valueOf(iu9Var.O()) : null), null);
            }
        }
        xte xteVar2 = this.a;
        xteVar2.p = i;
        iu9 iu9Var2 = xteVar2.g;
        xteVar2.s = iu9Var2 != null && iu9Var2.getPlaybackState() == 2;
        xte xteVar3 = this.a;
        iu9 iu9Var3 = xteVar3.g;
        xteVar3.r = iu9Var3 != null ? iu9Var3.O() : false;
        iu9 iu9Var4 = this.a.g;
        if (iu9Var4 != null) {
            iu9Var4.getPlaybackState();
        }
        xte xteVar4 = this.a;
        iu9 iu9Var5 = xteVar4.g;
        xteVar4.u = iu9Var5 != null ? iu9Var5.M() : null;
        xte xteVar5 = this.a;
        iu9 iu9Var6 = xteVar5.g;
        xteVar5.v = (iu9Var6 == null || (ry9VarM = iu9Var6.M()) == null) ? null : ry9VarM.d;
        if (i == 1) {
            mjg mjgVar = this.a.z;
            Float fValueOf = Float.valueOf(0.0f);
            mjgVar.getClass();
            mjgVar.j(null, fValueOf);
            xte xteVar6 = this.a;
            xteVar6.q = false;
            xteVar6.b();
            xte xteVar7 = this.a;
            String str2 = xteVar7.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "notifyListeners: onStop", null);
                }
            }
            synchronized (xteVar7.i) {
                for (tte tteVar : xteVar7.i) {
                    xteVar7.g();
                    xteVar7.i();
                    ((Number) xteVar7.m.getValue()).longValue();
                    tteVar.b();
                }
            }
            return;
        }
        if (i == 2) {
            xte xteVar8 = this.a;
            String str3 = xteVar8.c;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var3 = je9.d;
                if (a4cVar3.b(je9Var3)) {
                    a4cVar3.c(je9Var3, str3, "notifyListeners: onBuffering", null);
                }
            }
            synchronized (xteVar8.i) {
                for (tte tteVar2 : xteVar8.i) {
                    xteVar8.g();
                    xteVar8.i();
                    tteVar2.f();
                }
            }
            return;
        }
        if (i == 3) {
            xte xteVar9 = this.a;
            String str4 = xteVar9.c;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null) {
                je9 je9Var4 = je9.d;
                if (a4cVar4.b(je9Var4)) {
                    a4cVar4.c(je9Var4, str4, "notifyListeners: onReady", null);
                }
            }
            synchronized (xteVar9.i) {
                Iterator it = xteVar9.i.iterator();
                while (it.hasNext()) {
                    ((tte) it.next()).a();
                }
            }
            return;
        }
        if (i != 4) {
            return;
        }
        long jG = this.a.g();
        this.a.i();
        this.a.b();
        mjg mjgVar2 = this.a.z;
        Float fValueOf2 = Float.valueOf(1.0f);
        mjgVar2.getClass();
        mjgVar2.j(null, fValueOf2);
        xte xteVar10 = this.a;
        String str5 = xteVar10.c;
        a4c a4cVar5 = gm0.f;
        if (a4cVar5 != null) {
            je9 je9Var5 = je9.d;
            if (a4cVar5.b(je9Var5)) {
                a4cVar5.c(je9Var5, str5, "notifyListeners: onEnd", null);
            }
        }
        synchronized (xteVar10.i) {
            Iterator it2 = xteVar10.i.iterator();
            while (it2.hasNext()) {
                ((tte) it2.next()).d(jG);
            }
        }
    }
}
